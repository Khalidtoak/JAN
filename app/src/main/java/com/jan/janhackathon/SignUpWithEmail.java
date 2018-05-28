package com.jan.janhackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUpWithEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_with_email);
        getSupportActionBar().hide();
    }

    public void goToPreviousActivity(View view) {
        onBackPressed();
    }
}
