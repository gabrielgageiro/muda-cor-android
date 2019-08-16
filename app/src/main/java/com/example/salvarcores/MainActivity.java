package com.example.salvarcores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnSalvar;
    private Button btnTrocar;
    private TextView quadradoUm;
    private TextView quadradoDois;
    private TextView quadradoTres;
    private TextView quadradoQuatro;
    private TextView quadradoCinco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSalvar = findViewById(R.id.btn_salvar);
        btnTrocar = findViewById(R.id.btn_trocar);

        quadradoUm = findViewById(R.id.quadrado_um);
        quadradoDois = findViewById(R.id.quadrado_dois);
        quadradoTres = findViewById(R.id.quadrado_tres);
        quadradoQuatro = findViewById(R.id.quadrado_quatro);
        quadradoCinco = findViewById(R.id.quadrado_cinco);

        quadradoUm.setBackgroundColor(Color.parseColor(Utils.getString(this,Integer.toString(quadradoUm.getId()))));

        btnSalvar.setOnClickListener(o ->{
            Toast.makeText(this, quadradoUm.getBackground().toString(),Toast.LENGTH_SHORT).show();

            Utils.putString(this, Integer.toString(quadradoUm.getId()), quadradoUm.getBackground().toString());
        });


        btnTrocar.setOnClickListener(o ->{
            quadradoUm.setBackgroundColor(Color.parseColor(Utils.randomColor()));
            quadradoDois.setBackgroundColor(Color.parseColor(Utils.randomColor()));
            quadradoTres.setBackgroundColor(Color.parseColor(Utils.randomColor()));
            quadradoQuatro.setBackgroundColor(Color.parseColor(Utils.randomColor()));
            quadradoCinco.setBackgroundColor(Color.parseColor(Utils.randomColor()));
        });
    }
}
