package com.example.aplication2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Ajuste para barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//Correcion esteticas
        // Inicialización de vistas y lógica de la aplicación
        EditText edad = findViewById(R.id.edadedit);
        TextView resul = findViewById(R.id.resultadotext);
        Button boton = findViewById(R.id.boton);

        // Evento de click para el botón
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edadtxt = edad.getText().toString();
                try {
                    int edadInt = Integer.parseInt(edadtxt);
                    int resull = edadInt * 7;
                    String resulstring = "Si fueras perrillo tuvieras " + resull + " años";
                    resul.setText(resulstring);
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this,"Por favor ingresa un número válido",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}


// Holahsasadsd
