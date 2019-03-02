package com.example.hp.miappmiprimeraplicacion1;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ModificarContactoActivity extends AppCompatActivity {

    TextView nombre,movil,principal;
    ImageView imag;
    Button cancelar,btnGuardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_contacto);
this.nombre=findViewById(R.id.Nombre);
this.imag=findViewById(R.id.image);
this.movil=findViewById(R.id.Movil);
this.principal=findViewById(R.id.Principal);
this.cancelar=findViewById(R.id.btncancelar);
this.btnGuardar=findViewById(R.id.btnGuardar);
Intent intent= getIntent();
this.nombre.setText(intent.getExtras().getString("nombre"));
        this.movil.setText(intent.getExtras().getString("movil"));
        this.principal.setText(intent.getExtras().getString("principal"));
        this.imag.setImageResource(intent.getExtras().getInt("imagen"));

this.btnGuardar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

    }
});


        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(
                        getApplicationContext(),
                        ContactosActivity.class
                );
                startActivity(intent);
            }
        });

    }


public void guardardatos(View view){


}
}
