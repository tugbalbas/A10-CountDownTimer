package com.tugbaalbas.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        //implement methods yaptık
        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long millisUntilFinished) { //her saniyede bir, kaçıncı saniyedeyiz onu yazdırmak istiyorum
                textView.setText("Left: " + millisUntilFinished / 1000); //milisaniye olduğu için bölü 1000 yaptık
            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(),"Done!",Toast.LENGTH_LONG).show();
                textView.setText("Finished!");
            }
        }.start();
    }
}