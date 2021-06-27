package com.example.mailapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import andriod.wiget.button;
import andriod.content.Intent;
import andriod.view.View;

public class Login extends AppCompatActivity {
  public button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = (button) findViewById(R.id.btn_login);

        button.setOnClickListener(new View.OnClickListener()) {
            @Override
               public void onClick(View V){
                   Intent intent= new Intent(Login.this.User.class);
                   startActivity(intent);
            }

        }
    }
}
