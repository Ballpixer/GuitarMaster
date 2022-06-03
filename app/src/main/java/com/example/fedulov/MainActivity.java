package com.example.fedulov;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Button to_next_activity = findViewById(R.id.main_menu_button);
        to_next_activity.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(() -> {
                    startActivity(new Intent(MainActivity.this, SelectActivity.class));
                }, 1000);
            }
        }));
    }

}