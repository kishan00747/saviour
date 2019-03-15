package com.kishan00747.saviour;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private ProgressBar mProgressbar;

    private int mProgressStatus = 0;

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);




        mProgressbar = (ProgressBar)findViewById(R.id.pb1);
        final MediaPlayer SoundMediaPlayer = MediaPlayer.create(this, R.raw.intro);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mProgressStatus < 100) {
                    mProgressStatus++;
                    android.os.SystemClock.sleep(50);
                    SoundMediaPlayer.start();
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mProgressbar.setProgress(mProgressStatus);
                        }
                    });
                }



                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        Intent mainIntent = new Intent(SplashActivity.this, HomeActivity.class);
                        startActivity(mainIntent);
                        finish();

                    }
                }) ;
            }

        }).start();
    }
}
