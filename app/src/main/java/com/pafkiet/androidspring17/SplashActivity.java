package com.pafkiet.androidspring17;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class SplashActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new asyncTask_waitAndGo().execute();
    }

    private class asyncTask_waitAndGo extends AsyncTask<Void, Integer, Void> {
        ProgressBar mProgress;

        @Override
        protected void onPreExecute() {
            mProgress = (ProgressBar) findViewById(R.id.splash_progressBar);
            mProgress.setVisibility(View.VISIBLE);
            mProgress.setMax(10);
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... arg0) {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(500);
                    publishProgress(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            mProgress.setProgress(values[0]);
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Void result) {
            mProgress.setVisibility(View.GONE);
            Intent mIntent = new Intent();
            mIntent.setClass(SplashActivity.this, MainActivity.class);
            startActivity(mIntent);
            finish();
            super.onPostExecute(result);
        }
    }
}
