package com.pafkiet.androidspring17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

//        Button mButtonAbout = (Button) findViewById(R.id.main_button_about);
//        mButtonAbout.setText("PAF Button");
    }


    public void onClick_about(View v){

    }
}
