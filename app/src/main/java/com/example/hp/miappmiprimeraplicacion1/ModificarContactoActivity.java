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
    private ArrayList<Contacto> mList;
    private playersAdapter mAdapter;
    int img ;

    private ArrayList<String> contactos;

    public ModificarContactoActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_modificar_contacto);
//------------------------------------------------------------------------------

        initList();
        Spinner spinnerCountries = findViewById(id.spinner_players);

        mAdapter = new playersAdapter(this, mList);
        spinnerCountries.setAdapter(mAdapter);

        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Contacto clickedItem = (Contacto) parent.getItemAtPosition(position);
                String clickedCountryName = clickedItem.getNombre();
                int imag=clickedItem.getImgContacto();
                img=imag;
                Toast.makeText(ModificarContactoActivity.this, clickedCountryName + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

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

    private void initList() {
        mList = new ArrayList<>();
        mList.add(new Contacto("Pulido", drawable.pulido));
        mList.add(new Contacto("Mier", drawable.mier));
        mList.add(new Contacto("Gudiño", drawable.gudino));
        mList.add(new Contacto("Brizuela", drawable.conejo));
        mList.add(new Contacto("Carlos", drawable.carlos));
        mList.add(new Contacto("Javier", drawable.chifis));
    }}

