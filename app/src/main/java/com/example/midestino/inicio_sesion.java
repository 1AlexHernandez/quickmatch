package com.example.midestino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inicio_sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
      ;
    }

    public void irface(View view) {

            Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                    Uri.parse("https://es-la.facebook.com/"));
            startActivity(i);
        }

    }

