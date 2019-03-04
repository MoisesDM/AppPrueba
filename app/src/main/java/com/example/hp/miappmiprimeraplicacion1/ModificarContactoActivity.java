package com.example.hp.miappmiprimeraplicacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.entidades.Contacto;

import java.util.ArrayList;

import static com.example.hp.miappmiprimeraplicacion1.R.*;

public class ModificarContactoActivity extends AppCompatActivity {
    public static int position;
    TextView nombre, movil, principal;
    ImageView imag;
    Button cancelar, btnGuardar;
    int img = ContactosActivity.contactos.get(position).getImgContacto();

    private ArrayList<String> contactos;

    public ModificarContactoActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_modificar_contacto);
//------------------------------------------------------------------------------



//------------------------------------------------------------------------------


        this.nombre = findViewById(id.PtNombre);
        this.imag = findViewById(id.iVimagen);
        this.movil = findViewById(id.ptMovil);
        this.principal = findViewById(id.ptPrincipal);
        this.cancelar = findViewById(id.btncancelar);
        this.btnGuardar = findViewById(id.btnGuardar);
        Intent intent = getIntent();
        this.nombre.setText(intent.getExtras().getString("nombre"));
        this.movil.setText(intent.getExtras().getString("movil"));
        this.principal.setText(intent.getExtras().getString("principal"));
        //  this.imag.setImageResource(intent.getExtras().getInt("imagen"));
        this.imag.setImageResource(img);


        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
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
                Intent intent = new Intent(
                        getApplicationContext(),
                        ContactosActivity.class
                );
                startActivity(intent);

            }
        });
        }
}
