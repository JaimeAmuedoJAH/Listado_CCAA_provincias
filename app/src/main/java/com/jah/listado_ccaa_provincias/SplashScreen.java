package com.jah.listado_ccaa_provincias;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent main = new Intent().setClass(SplashScreen.this, MainActivity.class);
                startActivity(main);
                finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, 3000);

    }
}