package com.example.challengetest01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view){
        EditText fn=findViewById(R.id.firstName);
        EditText ln=findViewById(R.id.lastName);
        EditText ml=findViewById(R.id.mail);

        TextView fd=findViewById(R.id.firstDisplay);
        TextView ld=findViewById(R.id.lastDisplay);
        TextView md=findViewById(R.id.mailDisplay);

        fd.setText("First Name :: "+ fn.getText().toString());
        ld.setText("Last Name :: "+ ln.getText().toString());
        md.setText("Email :: "+ ml.getText().toString());
    }
}