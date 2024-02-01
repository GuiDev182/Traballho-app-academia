package com.proz.loginapp.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.pedrorafante.loginapp.R;


public class PrincipalActivity extends AppCompatActivity {

    LinearLayout kratos;
    LinearLayout naruto;
    LinearLayout goku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        kratos = findViewById(R.id.kratos);
        naruto = findViewById(R.id.naruto);
        goku = findViewById(R.id.goku);

        kratos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Treino.class);
                intent.putExtra("ficha","kratos");
                intent.putExtra("img",R.drawable.img_image2);
                startActivity(intent);
            }
        });
        naruto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Treino.class);
                intent.putExtra("ficha","naruto");
                intent.putExtra("img",R.drawable.img_whatsappimage_421x341);
                startActivity(intent);
            }
        });
        goku.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Treino.class);
                intent.putExtra("ficha","goku");
                intent.putExtra("img",R.drawable.img_whatsappimage);
                startActivity(intent);
            }
        });

    }
}