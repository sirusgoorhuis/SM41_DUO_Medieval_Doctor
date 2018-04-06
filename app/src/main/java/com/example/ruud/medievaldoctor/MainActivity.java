package com.example.ruud.medievaldoctor;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer player = MediaPlayer.create(this, R.raw.background_music);
        player.setLooping(true);
        player.start();

    }

    public void GoToLogin(View view){
        startActivity(new Intent(MainActivity.this, login.class));
        startService(new Intent(this, MusicService.class));
    }
}
