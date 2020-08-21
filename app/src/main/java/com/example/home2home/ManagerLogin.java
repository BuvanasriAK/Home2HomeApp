package com.example.home2home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ManagerLogin extends AppCompatActivity {
    EditText userEdiit,passEdit;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_login);
        userEdiit= (EditText) findViewById(R.id.adminusername);
        passEdit= (EditText) findViewById(R.id.adminpassword);
        loginButton= (Button) findViewById(R.id.adminlogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userEdiit.getText().toString().length() > 0 && passEdit.getText().toString().length() > 0) {
                    if (userEdiit.getText().toString().equals("admin") && passEdit.getText().toString().equals("admin")) {
                        Intent in = new Intent(ManagerLogin.this, ManagerHome.class);
                        startActivity(in);
                        userEdiit.setText("");
                        passEdit.setText("");
                    } else {
                        Toast.makeText(ManagerLogin.this, "Enter fields", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(ManagerLogin.this, "Enter fields", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        userEdiit.setText("");
        passEdit.setText("");
    }
}
