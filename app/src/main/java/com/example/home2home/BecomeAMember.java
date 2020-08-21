package com.example.home2home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BecomeAMember extends AppCompatActivity {
    Button memberNextB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_become_a_member);

        memberNextB=(Button)findViewById(R.id.memberNextButton);
        memberNextB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(BecomeAMember.this, BecomeAMember2.class);
                startActivity(intent);
            }
        });
    }
}

