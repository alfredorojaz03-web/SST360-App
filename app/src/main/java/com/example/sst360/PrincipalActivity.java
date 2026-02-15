package com.example.sst360;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        // ===== BOTON INSPECCIONES =====
        LinearLayout btnInspecciones = findViewById(R.id.btnInspecciones);

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
        // ===== BOTON INCIDENTES =====
        LinearLayout btnIncidentes = findViewById(R.id.btnIncidentes);

        btnIncidentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        PrincipalActivity.this,
                        IncidentesActivity.class
                );

                startActivity(intent);
            }
        });
        // BOTON CAPACITACIONES
        LinearLayout btnCapacitaciones = findViewById(R.id.btnCapacitaciones);

        btnCapacitaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        PrincipalActivity.this,
                        CapacitacionesActivity.class
                );

                startActivity(intent);
            }
        });
        // ===== BOTÓN SALIR =====
        LinearLayout btnSalir = findViewById(R.id.btnSalir);

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Cierra la app completamente
                finishAffinity();

                // Opcional: mata el proceso
                System.exit(0);
            }
        });

    }
}