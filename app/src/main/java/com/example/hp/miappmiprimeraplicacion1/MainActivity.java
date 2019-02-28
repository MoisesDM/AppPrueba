package com.example.hp.miappmiprimeraplicacion1;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.calculadora.Suma;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.time.Instant;

public class MainActivity extends AppCompatActivity {
    private EditText EtNumeroOne, EtNumeroTwo;
    private Button btnCalcular;
    private TextView tvResultado;
    private Typeface dbz_ttf;
private Button btnActividaddos;
private Button btnMedia;
private Button btnContactos;
MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.dbz_ttf=Typeface.createFromAsset(this.getAssets(), "font/saiyan.ttf");




        this.EtNumeroOne = findViewById(R.id.EtNumeroOne);
        this.EtNumeroOne.setTypeface(this.dbz_ttf);
        this.EtNumeroTwo = findViewById(R.id.EtNumeroTwo);
        this.EtNumeroTwo.setTypeface(this.dbz_ttf);
        this.btnCalcular = findViewById(R.id.btnSumar);
        this.tvResultado=findViewById(R.id.tvResultado);
        this.btnActividaddos=findViewById(R.id.BtnRunActivity);
        this.btnMedia=findViewById(R.id.BtnMedia);
        this.btnContactos=findViewById(R.id.btnContactos);


             this.btnCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
               public void onClick(View v) {
                    Suma s = new Suma();
                    s.setNumberone(
                            Double.parseDouble(
                                    EtNumeroOne.getText().toString()));
                    s.setNumbertwo(Double.parseDouble(EtNumeroTwo.getText().toString()));
                    String Resultado=String.valueOf(s.getSuma());
                    tvResultado.setText(Resultado);
                //    Toast.makeText(getApplicationContext(), "Resultado".concat(String.valueOf(s.getSuma())), Toast.LENGTH_SHORT).show();

               }
           });
             mp=MediaPlayer.create(this,R.raw.mar);
           this.btnMedia.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (mp.isPlaying()){
                       mp.pause();
                       btnMedia.setBackgroundResource(R.drawable.botonpay);
                       Toast.makeText(MainActivity.this, "pausa",Toast.LENGTH_SHORT).show();

                   }
                   else {
                       mp.start();
                       btnMedia.setBackgroundResource(R.drawable.botonpausa);
                       Toast.makeText(MainActivity.this, "reproduciendo",Toast.LENGTH_SHORT).show();

                   }
               }
           });

        this.btnContactos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(
                    getApplicationContext(),ContactosActivity.class

                );
                startActivity(intent);
            }
        });


                     this.btnActividaddos.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Intent intent= new Intent(
                             getApplicationContext(),
                             ActividadDosActivity.class
                     );
                     startActivity(intent);
                 }
             });
              }
     /**   public void RealizarOperacion (View view  ){
            Suma s = new Suma();
            s.setNumberone(
                    Double.parseDouble(
                            this.EtNumeroOne.getText().toString()));
            s.setNumbertwo(Double.parseDouble(this.EtNumeroTwo.getText().toString()));
            Toast.makeText(this, "Resultado".concat(String.valueOf(s.getSuma())), Toast.LENGTH_SHORT).show();
        }**/

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Saliste de la primer fase", Toast.LENGTH_SHORT).show();
           this.mp.stop();
            }


    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Regresarete a la primer fase", Toast.LENGTH_SHORT).show();
        try {
            this.mp.prepare();
            this.mp.start();
            btnMedia.setBackgroundResource(R.drawable.botonpausa);
        }catch (IOException e ) {
            e.printStackTrace();
            Log.e("Song",e.getMessage());
        }

    }



}

