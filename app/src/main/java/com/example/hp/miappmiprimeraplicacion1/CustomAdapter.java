package com.example.hp.miappmiprimeraplicacion1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hp.entidades.Contacto;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
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
     // aqui se puede agregar eventos al componente listaview

    }

    @Override
    public int getItemCount() {

        return this.contactos.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNombre,tvNumeroMovil,tvnumeroPrincipal;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvNombre=itemView.findViewById(R.id.tvnombre);
            this.tvNumeroMovil=itemView.findViewById(R.id.tvnumeromovil);
            this.tvnumeroPrincipal=itemView.findViewById(R.id.tvnumeroprincipal);
        }
    }
}
