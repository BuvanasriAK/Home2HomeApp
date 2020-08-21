package com.example.home2home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class BecomeAMember2 extends AppCompatActivity {

    Button memberReturnB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_become_a_member2);

        memberReturnB=(Button)findViewById(R.id.memberReturnButtton);
        memberReturnB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(BecomeAMember2.this, Homepage.class);
                startActivity(intent);
            }
        });
    }
}
