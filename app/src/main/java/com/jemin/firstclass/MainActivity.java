package com.jemin.firstclass;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // activity_main.xml 파일에서 만든 객체에 접근
        Button firstBtn = (Button) findViewById(R.id.first_first_btn);
        Button secondBtn = (Button) findViewById(R.id.first_second_btn);
        Button thirdBtn = (Button) findViewById(R.id.first_third_btn);

        // '1번 버튼' 클릭 시
        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "1번 버튼을 눌렀어요", Toast.LENGTH_SHORT).show();
            }
        });

        // '2번 버튼' 클릭 시
        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "2번 버튼을 눌렀어요", Toast.LENGTH_SHORT).show();
            }
        });

        // '3번 버튼' 클릭 시
        thirdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "3번 버튼을 눌렀어요", Toast.LENGTH_SHORT).show();
            }
        });
    }
}