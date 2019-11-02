package com.utilone.tarea01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActAlpha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_alpha);
    }

    public void goMain(View view) {
        Intent tvMain = new Intent(this, MainActivity.class);
        startActivity(tvMain);
        //Toast.makeText(this, "Go to Activity 1", Toast.LENGTH_SHORT).show();
        finish();
    }
}
