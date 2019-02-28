package com.example.hp.miappmiprimeraplicacion1;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ModificarContactoActivity extends AppCompatActivity {
    private static  final String TAG="ContactoM";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_contacto);

        Log.d(TAG,"onCreate: started.");


    }
}
