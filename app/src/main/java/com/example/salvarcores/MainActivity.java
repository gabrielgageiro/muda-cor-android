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
            TextView quadradoTres = findViewById(R.id.quadrado_tres);
            String s = Utils.randomColor();
            Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            quadradoTres.setBackgroundColor(Color.parseColor(Utils.randomColor()));
        });


        btnTrocar.setOnClickListener(o ->{

        });
    }
}
