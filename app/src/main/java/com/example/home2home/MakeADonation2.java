package com.example.home2home;

//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MakeADonation2 extends AppCompatActivity {

    RadioGroup radioGroup2;
    RadioButton radioButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_a_donation2);

        radioGroup2 = findViewById(R.id.radioGroup2);
        Button buttonApply2 = findViewById(R.id.button_apply2);
        buttonApply2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MakeADonation2.this, Googlepay.class);
                startActivity(intent);
            }
        });
    }

    public void checkButton(View v) {
        int radioId = radioGroup2.getCheckedRadioButtonId();

        radioButton2 = findViewById(radioId);

        Toast.makeText(this, "Selected Orphanage: " + radioButton2.getText(),
                Toast.LENGTH_SHORT).show();


    }
}