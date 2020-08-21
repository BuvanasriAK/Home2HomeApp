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

public class Adopt2 extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt2);

        radioGroup = findViewById(R.id.radioGroup);
        //textView = findViewById(R.id.text_view_selected);

        Button buttonNext = findViewById(R.id.button_next);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int radioId = radioGroup.getCheckedRadioButtonId();

                //radioButton = findViewById(radioId);

                //textView.setText("Your choice: " + radioButton.getText());

                Intent intent = new Intent(Adopt2.this, Adopt3.class);
                startActivity(intent);
            }
        });
    }

    public void checkButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

        Toast.makeText(this, "Selected Radio Button " + radioButton.getText(),
                Toast.LENGTH_SHORT).show();


    }
}