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

import com.example.hp.entidades.Contacto;

import java.security.Principal;
import java.util.ArrayList;

public class ModificarContactoActivity extends AppCompatActivity {
    public static int position;
    TextView nombre,movil,principal;
    ImageView imag;
    Button cancelar,btnGuardar;
    int img=ContactosActivity.contactos.get(position).getImgContacto();

    private ArrayList<String> contactos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_contacto);



         this.nombre=findViewById(R.id.PtNombre);
         this.imag=findViewById(R.id.iVimagen);
         this.movil=findViewById(R.id.ptMovil);
         this.principal=findViewById(R.id.ptPrincipal);
         this.cancelar=findViewById(R.id.btncancelar);
         this.btnGuardar=findViewById(R.id.btnGuardar);
Intent intent= getIntent();
this.nombre.setText(intent.getExtras().getString("nombre"));
        this.movil.setText(intent.getExtras().getString("movil"));
        this.principal.setText(intent.getExtras().getString("principal"));
      //  this.imag.setImageResource(intent.getExtras().getInt("imagen"));
           this.imag.setImageResource(img);



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
        Log.e("POSITION", String.valueOf(position));


        this.btnGuardar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ContactosActivity.contactos.
                set(
                        position,
                        new
                                Contacto(
                                        nombre.getText().toString(),
                                        movil.getText().toString(),
                                        principal.getText().toString(),
                                        img
                        ));
        Intent intent= new Intent(
                getApplicationContext(),
                ContactosActivity.class
        );
        startActivity(intent);

    }
});



    }


}
