package com.example.hp.miappmiprimeraplicacion1;

import android.content.Context;
import android.graphics.Typeface;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.entidades.Contacto;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>  {
private ArrayList<Contacto>contactos ;
private Context context;
    public CustomAdapter(ArrayList<Contacto> contactos, Context context) {
        this.contactos = contactos;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view =LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.row,viewGroup, false);
        return new MyViewHolder(view);

    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        final  Contacto contacto=(Contacto) contactos.get(i);
        myViewHolder.tvNombre.setText(contacto.getNombre());

        myViewHolder.tvNumeroMovil.setText(contacto.getNueroMovil());
        myViewHolder.tvnumeroPrincipal.setText(contacto.getNumeorprincipal());
        myViewHolder.imagContacto.setImageResource(contacto.getImgContacto());


     // aqui se puede agregar eventos al componente listaview
        myViewHolder.cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "seleccion de "+contacto.getNombre()
                                , Toast.LENGTH_SHORT).show();

        }
});


    }

    @Override
    public int getItemCount() {

        return this.contactos.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNombre,tvNumeroMovil,tvnumeroPrincipal;
        ImageView imagContacto;
        CardView cont;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvNombre=itemView.findViewById(R.id.tvnombre);
            this.tvNumeroMovil=itemView.findViewById(R.id.tvnumeromovil);
            this.tvnumeroPrincipal=itemView.findViewById(R.id.tvnumeroprincipal);
            this.imagContacto=itemView.findViewById(R.id.ivContacto);
        this.cont=itemView.findViewById(R.id.Contendor);
        }
        }
    }

