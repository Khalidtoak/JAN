package com.jan.janhackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();
    }

    public void goToSignInPage(View view) {
        startActivity(new Intent(SignUpActivity.this, SignUpWithEmail.class));
    }

    public void goToPreviousActivity(View view) {
        onBackPressed();
    }

    public void goToSignUpPage(View view) {
        startActivity(new Intent(SignUpActivity.this, SignUpWithEmail.class));
    }
}
