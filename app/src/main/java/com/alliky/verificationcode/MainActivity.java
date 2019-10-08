package com.alliky.verificationcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    VerificationCode mVerificationCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mVerificationCode = findViewById(R.id.mVerificationCode);
        mVerificationCode.setOnInputListener(new VerificationCode.OnInputListener() {
            @Override
            public void onFinish(String code) {
                Toast.makeText(MainActivity.this,code,Toast.LENGTH_LONG).show();
            }
        });

    }
}
