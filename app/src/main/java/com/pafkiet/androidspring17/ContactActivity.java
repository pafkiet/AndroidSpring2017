package com.pafkiet.androidspring17;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactActivity extends Activity {
    EditText mEditTextName;
    EditText mEditTextPhone;
    EditText mEditTextMessage;
    SharedPreferences mSharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        init();
        populate();
    }

    private void init() {
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences
                (this);
        mEditTextName = (EditText) findViewById(R.id.order_editText_name);
        mEditTextPhone = (EditText) findViewById(R.id.order_editText_phone);
        mEditTextMessage = (EditText) findViewById(R.id.order_editText_message);
    }

    private void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void populate() {
        String strName = mSharedPreferences.getString("key_name", "");
        String strPhone = mSharedPreferences.getString("key_phone", "");
        String strMessage = mSharedPreferences.getString("key_message", "");
        mEditTextName.setText(strName);
        mEditTextPhone.setText(strPhone);
        mEditTextMessage.setText(strMessage);
    }

    public void onClick_send(View v) {
        savePreferences();
        Intent mIntent = new Intent(this, ThanksActivity.class);
        startActivity(mIntent);
        finish();

    }

    private boolean isValidate() {
        if (mEditTextName.getText().toString().equalsIgnoreCase("")) {
            showMessage("Please give your name");
            return false;
        } else if (mEditTextPhone.getText().toString().equalsIgnoreCase("")) {
            showMessage("Please give your phone number");
            return false;
        } else if (mEditTextMessage.getText().toString().equalsIgnoreCase("")) {
            showMessage("Please give your message");
            return false;
        }
        return true;
    }

    private void savePreferences() {
        if (isValidate()) {
            SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putString("key_name", mEditTextName.getText().toString());
            editor.putString("key_phone", mEditTextPhone.getText().toString());
            editor.putString("key_message", mEditTextMessage.getText().toString());
            editor.commit();
        }
    }
}























