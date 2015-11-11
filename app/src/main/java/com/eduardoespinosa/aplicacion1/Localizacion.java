package com.eduardoespinosa.aplicacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Localizacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button bSobre = (Button) findViewById(R.id.botonAcerca);
        bSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarSobre(null);
            }
        });
    }

    public void lanzarSobre(View view) {
        Intent i = new Intent(this, Sobre.class);
        startActivity(i);
    }
}
