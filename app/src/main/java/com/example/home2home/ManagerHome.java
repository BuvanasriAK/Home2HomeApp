package com.example.home2home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManagerHome extends AppCompatActivity {

    Button managerHomeReturnB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_home);

        managerHomeReturnB=(Button)findViewById(R.id.managerHomeReturnButton);
        managerHomeReturnB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(ManagerHome.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
