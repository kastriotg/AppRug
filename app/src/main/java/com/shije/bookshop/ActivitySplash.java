package com.shije.bookshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Window;
import android.view.WindowManager;

public class ActivitySplash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //No title in layer
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);

        //activity Fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //set layout for activity
        setContentView(R.layout.rugova_splash);

        //create a countdown timer,expire after 500 ms
        new CountDownTimer(500,100){

            @Override
            public void onFinish() {
                //intent to start new activity -MainActivity
                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onTick(long millisUntilFinished) {

            }
        }.start();

    }
}
