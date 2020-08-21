package com.example.home2home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MakeADonation extends AppCompatActivity {
    Button donateNextB;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_a_donation);

        donateNextB=(Button)findViewById(R.id.donateNextButton);
        donateNextB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(MakeADonation.this, MakeADonation2.class);
                startActivity(intent);
            }
        });
    }
}
