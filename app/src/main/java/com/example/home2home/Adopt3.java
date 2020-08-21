package com.example.home2home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Adopt3 extends AppCompatActivity {
    Button updatedb;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt3);
        updatedb=(Button)findViewById(R.id.updatedb1);
        updatedb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(Adopt3.this, Homepage.class);
                startActivity(intent);
            }
        });
    }
}