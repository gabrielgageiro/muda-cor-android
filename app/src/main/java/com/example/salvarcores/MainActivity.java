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
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSalvar = findViewById(R.id.btn_salvar);
        btnTrocar = findViewById(R.id.btn_trocar);

        btnSalvar.setOnClickListener(o ->{

        });


        btnTrocar.setOnClickListener(o ->{
            TextView quadradoUm = findViewById(R.id.quadrado_um);
            TextView quadradoDois = findViewById(R.id.quadrado_dois);
            TextView quadradoTres = findViewById(R.id.quadrado_tres);
            TextView quadradoQuatro = findViewById(R.id.quadrado_quatro);
            TextView quadradoCinco = findViewById(R.id.quadrado_cinco);
            quadradoUm.setBackgroundColor(Color.parseColor(Utils.randomColor()));
            quadradoDois.setBackgroundColor(Color.parseColor(Utils.randomColor()));
            quadradoTres.setBackgroundColor(Color.parseColor(Utils.randomColor()));
            quadradoQuatro.setBackgroundColor(Color.parseColor(Utils.randomColor()));
            quadradoCinco.setBackgroundColor(Color.parseColor(Utils.randomColor()));
        });
    }
}
