package com.bagusm.mengenalbrebes;


import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class Wisata extends AppCompatActivity {


    ImageButton kaligua,sirampog,panenjoan,ranto,malahayu,penjalin,randu9,mangrove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        kaligua = (ImageButton) findViewById(R.id.wisata1);
        sirampog = (ImageButton) findViewById(R.id.wisata2);
        panenjoan = (ImageButton) findViewById(R.id.wisata3);
        ranto = (ImageButton) findViewById(R.id.wisata4);
        malahayu = (ImageButton) findViewById(R.id.wisata5);
        penjalin = (ImageButton) findViewById(R.id.wisata6);
        randu9 = (ImageButton) findViewById(R.id.wisata7);
        mangrove = (ImageButton) findViewById(R.id.wisata8);

        kaligua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Wkaligua.class);
                startActivity(i);
            }
        });

        sirampog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Wsirampog.class);
                startActivity(i);
            }
        });

        panenjoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Wpanenjoan.class);
                startActivity(i);
            }
        });

        ranto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Wranto.class);
                startActivity(i);
            }
        });

        malahayu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Wmalahayu.class);
                startActivity(i);
            }
        });

        penjalin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Wpenjalin.class);
                startActivity(i);
            }
        });

        randu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Wrandusanga.class);
                startActivity(i);
            }
        });

        mangrove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Wmangrove.class);
                startActivity(i);
            }
        });

    }
}
