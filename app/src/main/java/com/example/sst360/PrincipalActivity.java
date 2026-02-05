package com.example.sst360;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Button btnInspecciones = findViewById(R.id.btnInspecciones);

        btnInspecciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        PrincipalActivity.this,
                        InspeccionesActivity.class
                );
                startActivity(intent);
            }
        });
    }
}