package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class start extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        Button start_btn = (Button) findViewById(R.id.button6);
        Button leave_btn = (Button) findViewById(R.id.button7);
        start_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(start.this, MainActivity.class);
                        //finish();
                        startActivity(intent);
                    }
                }
        );
        leave_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(start.this, login.class);
                        //finish();
                        startActivity(intent);

                    }
                }
        );
    }
}