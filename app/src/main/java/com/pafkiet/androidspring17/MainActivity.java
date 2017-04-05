package com.pafkiet.androidspring17;

import android.content.Intent;
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


    public void onClick_about(View v) {

    }

    public void onClick_map(View v) {
        Intent intent = new Intent(this, BranchActivity.class);
        startActivity(intent);
    }

    public void onClick_contact(View v) {
        Intent intent = new Intent(this, ContactActivity.class);
        startActivity(intent);
    }

    public void onClick_products(View v) {
        Intent intent = new Intent(this, ProductListActivity.class);
        startActivity(intent);
    }
}
