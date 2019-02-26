package com.example.hp.miappmiprimeraplicacion1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.hp.entidades.Contacto;

import java.util.ArrayList;
import java.util.Arrays;

public class ContactosActivity extends AppCompatActivity {
    private ArrayList<Contacto> contactos;
    private RecyclerView rvContacto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
        this.rvContacto=findViewById(R.id.rvContactos);
        this.rvContacto.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        this.rvContacto.setAdapter(new CustomAdapter(this.contactos,this));
    }

    public ContactosActivity() {
       contactos = new ArrayList<>(
                Arrays.asList(
                        new Contacto("Pulido", "5555555", "999999",R.drawable.pulido),
                        new Contacto("Mier", "552345555", "9999239",R.drawable.mier),
                        new Contacto("Gudiño", "77345617", "99013424",R.drawable.gudino),
                        new Contacto("Brizuela", "17236871", "95532771409",R.drawable.conejo),
                        new Contacto("Carlos", "17236871", "95532771409",R.drawable.carlos),
                        new Contacto("Javier ", "17236871", "95532771409",R.drawable.chifis)

                ));

    }








}
