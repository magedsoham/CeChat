package com.logica_itech.seshat;

import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    PhaseManager phaseManager;
    ScoreTracker scoreTracker;
    MediaPlayer mediaPlayer;
    SharedPreferences sharedPreferences_words = null;
    SharedPreferences.Editor sharedPreferences_words_editor = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phaseManager = new PhaseManager(R.id.fragment_replacement, this, whereAmI);
    }

}
