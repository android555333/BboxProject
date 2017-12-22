package com.example.bobobox.bobobox;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by clown on 12/21/2017.
 */

public class Main extends AppCompatActivity{

    private Button btnToSignIn;
    private Button btnToSignUp;
    private Button btnFacebook;
    private Button btnGmail;

    private Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        btnToSignIn = (Button) findViewById(R.id.btnToSignIn);
        btnToSignUp = (Button) findViewById(R.id.btnToSignUp);
//        btnFacebook = (Button) findViewById(R.id.btnSignInFacebook);
//        btnGmail    = (Button) findViewById(R.id.btnSignInGmail);

        btnToSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Main.this, SignIn.class);
                startActivity(intent);
            }
        });

        btnToSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Main.this, SignUp.class);
                startActivity(intent);
            }
        });
    }
}
