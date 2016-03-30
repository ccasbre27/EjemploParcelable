package com.example.itadmin.ejemploparcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // creamos la instancia de la clase Persona
        final Persona persona = new Persona(1,"Carlos","Castro",9);

        // obtenemos la referencia del objeto
        Button button = (Button) findViewById(R.id.btn);

        // establecemos el onClickListener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Creamos el intent para navegar a la segunda Activity
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);

                // se envía el objeto con la llave de "Persona"
                intent.putExtra("Persona",persona);

                // iniciamos el intent
                startActivity(intent);

            }
        });
    }
}
