package com.proz.loginapp.loginapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pedrorafante.loginapp.R;

public class Treino extends AppCompatActivity {
    AppCompatButton voltar;
    ImageView img;
    TextView text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treino);
        Intent it = getIntent();
        String nomeFicha = it.getStringExtra("ficha");
        int imgFicha =it.getIntExtra("img",R.drawable.image_not_found);

        img = findViewById(R.id.imageWhatsAppImage);
        text = findViewById(R.id.txtLanguage);
        if (nomeFicha.equals("")){
            img.setImageResource(R.drawable.image_not_found);
        }else {
            text.setText(nomeFicha);
            img.setImageResource(imgFicha);
        }

        voltar = findViewById(R.id.btnVoltar);
        voltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PrincipalActivity.class);
                startActivity(intent);
            }
        });
    }
}