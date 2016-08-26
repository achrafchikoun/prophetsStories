package com.example.ultrapc.prophetsstories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    Timer t;
    int sec = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
                                  @Override
                                  public void run() {
                                      runOnUiThread(new Runnable() {

                                          @Override
                                          public void run() {
                                              if (sec == 3) {
                                                t.cancel();
                                                  Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                                  startActivity(intent);
                                              }
                                              sec += 1;
                                          }

                                      });
                                  }
                              },
                0,
                1000);
    }
}
