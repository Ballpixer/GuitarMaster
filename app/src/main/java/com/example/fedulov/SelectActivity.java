package com.example.fedulov;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_activity);
    }

    protected void onResume() {
        super.onResume();
        Button to_metronome = findViewById(R.id.select_metronome);
        Button to_chord_lib = findViewById(R.id.select_chord_library);
        Button to_guide = findViewById(R.id.select_guide_button);


        to_metronome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(() -> {
                    startActivity(new Intent(SelectActivity.this, MetronomeActivity.class));
                }, 1000);
            }
        });

        to_chord_lib.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(() -> {
                    startActivity(new Intent(SelectActivity.this, ChordActivity.class));
                }, 1000);
            }
        });

        to_guide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(() -> {
                    startActivity(new Intent(SelectActivity.this, GuideActivity.class));
                }, 1000);
            }
        });
    }


}
