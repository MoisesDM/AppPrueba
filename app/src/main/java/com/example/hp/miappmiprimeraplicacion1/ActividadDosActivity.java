package com.example.hp.miappmiprimeraplicacion1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ActividadDosActivity extends AppCompatActivity {

    private ImageView ivImageOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_dos);
        this.ivImageOne=findViewById(R.id.ivImageOne);
        this.ivImageOne.setImageDrawable(getDrawable(R.drawable.pikachu));

    }
}
