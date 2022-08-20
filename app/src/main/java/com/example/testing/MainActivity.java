package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        Button loginButton = (Button) findViewById(R.id.loginButton);
//        Button signupButton = (Button) findViewById(R.id.signupButton);
        Button gotoRegisterButton = (Button) findViewById(R.id.gotoRegisterButton);
//        Button gotoSigninButton = (Button) findViewById(R.id.gotoSigninButton);
//        Button logoutButton = (Button) findViewById(R.id.logoutButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HomePageActivity.class));
            }
        });

//        signupButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                setContentView(R.layout.homepage);
//            }
//        });
//
        gotoRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SignupActivity.class));
            }
        });

    }
}