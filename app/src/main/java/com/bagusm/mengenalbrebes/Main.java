package com.bagusm.mengenalbrebes;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Main extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageButton profil,wilayah,sejarah,seni,wisata,kuliner;
    ImageView bg,logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        profil = findViewById(R.id.btnprofil);
        wilayah = findViewById(R.id.btnwilayah);
        sejarah = findViewById(R.id.btnsejarah);
        seni = findViewById(R.id.btnseni);
        wisata = findViewById(R.id.btnwisata);
        kuliner = findViewById(R.id.btnkuliner);
        bg = findViewById(R.id.gbrheader);
        logo = findViewById(R.id.gbrlogo);

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iprofil = new Intent(getApplicationContext(), Profil.class);
                startActivity(iprofil);
            }
        });

        wilayah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iwil = new Intent(getApplicationContext(), Wilayah2.class);
                startActivity(iwil);
            }
        });

        sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent isej = new Intent(getApplicationContext(), Sejarah.class);
                startActivity(isej);
            }
        });

        seni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iseni = new Intent(getApplicationContext(), Senibudaya.class);
                startActivity(iseni);
            }
        });

        wisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iwis = new Intent(getApplicationContext(), Wisata.class);
                startActivity(iwis);
            }
        });

        kuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ikul = new Intent(getApplicationContext(), Kuliner.class);
                startActivity(ikul);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.tentang) {
            Intent i = new Intent(getApplicationContext(), Tentang.class);
            startActivity(i);
        } else if (id == R.id.keluar) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(false);
            builder.setMessage("Apakah Anda ingin keluar?");
            builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
            });
            builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alert = builder.create();
            alert.show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
