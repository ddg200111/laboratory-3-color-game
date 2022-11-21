package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {
    Button again, exit;
    TextView result, points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        again=findViewById(R.id.button3);
        exit=findViewById(R.id.button5);
        result=findViewById(R.id.textView4);
        points=findViewById(R.id.textView7);
        addListenerOnButton();
        Intent intent = getIntent();
        points.setText(intent.getStringExtra("result"));
    }

    void addListenerOnButton(){
        again.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(result.this, MainActivity.class);
                        finish();
                        startActivity(intent);
                    }
                }
        );
        exit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                }
        );
    }

    static public Intent createIntent(Context context, CharSequence result){
        Intent i = new Intent(context, result.class);
        i.putExtra("result", result);
        return i;
    }
}