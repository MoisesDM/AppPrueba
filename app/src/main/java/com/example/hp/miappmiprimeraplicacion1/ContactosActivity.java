package com.example.hp.miappmiprimeraplicacion1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hp.entidades.Contacto;

import java.util.ArrayList;
import java.util.Arrays;

public class ContactosActivity extends AppCompatActivity {
    private ArrayList<Contacto> contactos;

    public ContactosActivity() {
       this.contactos = new ArrayList<>(
                Arrays.asList(
                        new Contacto("pepe", "5555555", "999999"),
                        new Contacto("Gabriel", "552345555", "9999239"),
                        new Contacto("Karlos ", "77345617", "99013424"),
                        new Contacto("feregrino ", "17236871", "95532771409"),
                        new Contacto("Bonifacio", "592836291", "2782552")
                ));
    }


    private RecyclerView rvContacto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
        this.rvContacto=findViewById(R.id.rvContactos);
        this.rvContacto.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        this.rvContacto.setAdapter(new CustomAdapter(this.contactos,this));

    }
}
