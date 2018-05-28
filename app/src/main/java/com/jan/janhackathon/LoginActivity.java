package com.jan.janhackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_student);
        getSupportActionBar().hide();
    }

    public void goToSignUpPage(View view) {
        startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
    }

    public void goToMainActivity(View view) {
        onBackPressed();
    }

}

