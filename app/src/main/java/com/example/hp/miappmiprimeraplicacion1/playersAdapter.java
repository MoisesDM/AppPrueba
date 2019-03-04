package com.example.hp.miappmiprimeraplicacion1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.entidades.Contacto;

import java.util.ArrayList;

public class playersAdapter extends ArrayAdapter {
    public playersAdapter(Context context, ArrayList<Contacto> playersList) {
        super(context, 0, playersList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.players_row, parent, false
            );
        }

        ImageView imageViewFlag = convertView.findViewById(R.id.ivPlayer);
        TextView textViewName = convertView.findViewById(R.id.tvSNombre);

        Contacto currentItem = (Contacto) getItem(position);

        if (currentItem != null) {
            imageViewFlag.setImageResource(currentItem.getImgContacto());
            textViewName.setText(currentItem.getNombre());
        }

        return convertView;

    }
}
