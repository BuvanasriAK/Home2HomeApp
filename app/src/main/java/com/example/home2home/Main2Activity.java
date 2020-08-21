package com.example.home2home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button managerButton, individualButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        managerButton=(Button)findViewById(R.id.manager);
        individualButton = (Button) findViewById(R.id.individual);

        managerButton.setOnClickListener(this);
        individualButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.manager) {
            Intent in = new Intent(Main2Activity.this, ManagerLogin.class);
            startActivity(in);
        } else if (id == R.id.individual) {
            Intent in = new Intent(Main2Activity.this, IndividualLogin.class);
            startActivity(in);
        }
    }
}
