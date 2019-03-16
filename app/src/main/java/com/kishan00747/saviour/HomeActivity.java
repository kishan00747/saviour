package com.kishan00747.saviour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button accidentbtn, chronicbtn, consultbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        accidentbtn = (Button) findViewById(R.id.btn_1);
        chronicbtn = (Button) findViewById(R.id.btn_2);
        consultbtn = (Button) findViewById(R.id.btn_3);

        accidentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,AccidentActivity.class);
                startActivity(i);
            }
        });

        chronicbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, AccidentActivity.class);
                startActivity(i);
            }
        });

        consultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,AccidentActivity.class);
                startActivity(i);
            }
        });
    }
}
