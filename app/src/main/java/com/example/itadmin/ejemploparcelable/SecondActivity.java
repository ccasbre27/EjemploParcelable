package com.example.itadmin.ejemploparcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // obtenemos el objeto que se ha enviado
        Persona persona  = (Persona) getIntent().getParcelableExtra("Persona");

        // obtenemos la referencia al TextView
        TextView textView = (TextView) findViewById(R.id.txtvSecondActivity);

        // establecemos como texto del TextView el nombre que viene en el objeto enviado
        textView.setText(persona.nombre);
    }
}
