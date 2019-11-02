package com.utilone.tarea01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goAlpha(View view) {
        Intent tvAlpha = new Intent(this, ActAlpha.class);
        startActivity(tvAlpha);
        Toast.makeText(this, "Ir a la Actividad\n" +
                "Dos", Toast.LENGTH_SHORT).show();
        finish();
    }
}
