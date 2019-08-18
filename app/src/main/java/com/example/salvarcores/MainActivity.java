package com.example.salvarcores;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
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

        Integer color = Utils.getInt(this, Integer.toString(quadradoUm.getId()));
        quadradoUm.setBackgroundColor(Color.parseColor(color));


        btnSalvar.setOnClickListener(o ->{
            ColorDrawable viewColor = (ColorDrawable) quadradoUm.getBackground();

            Toast.makeText(this, Integer.toString(viewColor.getColor()),Toast.LENGTH_SHORT).show();

            Utils.putInt(this, Integer.toString(quadradoUm.getId()), viewColor.getColor());
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
