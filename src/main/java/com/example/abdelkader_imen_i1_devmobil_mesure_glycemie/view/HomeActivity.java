package com.example.abdelkader_imen_i1_devmobil_mesure_glycemie.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.abdelkader_imen_i1_devmobil_mesure_glycemie.R;

public class HomeActivity extends AppCompatActivity {
    private Button btnConsultation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        btnConsultation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent explicite
                //home activity est le contexte car AppCompatActivity herite d'Activity qui lui meme herite de Contexte
                Intent intent= new Intent(HomeActivity.this,MainActivity.class);
                //Intent intent2= new Intent(getApplicationContext(),MainActivity.class);
                //Naviguer vers MainActivity sans possibilité de retourner en arrière en utilisant la méthode startActivity().
                startActivity(intent);//démarer l'activity MainActivity
                //On utilise finish() si et seulement si on ne souhaite pas retourner vers HomeActivity.
                finish();
            }
        });

    }
    private void  init(){
        btnConsultation= findViewById(R.id.btnConsulter);
    }
}