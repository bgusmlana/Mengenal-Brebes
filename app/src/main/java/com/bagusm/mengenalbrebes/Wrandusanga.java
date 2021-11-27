package com.bagusm.mengenalbrebes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Wrandusanga extends AppCompatActivity {
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private static final Integer[] IMAGES= {R.drawable.w_randusanga,R.drawable.w_randusanga3};
    private ArrayList<Integer> ImagesArray = new ArrayList<Integer>();

    Button btn_navigasi;
    String goolgeMap = "com.google.android.apps.maps";
    Uri gmmIntentUri;
    Intent mapIntent;
    String lok = "-6.825915,109.086510";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrandusanga);

        btn_navigasi    = (Button) findViewById(R.id.btn_navigasi);
        btn_navigasi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                gmmIntentUri = Uri.parse("google.navigation:q=" + lok);

                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);


                mapIntent.setPackage(goolgeMap);

                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(Wrandusanga.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });

        String text = "<div style=\"text-align: justify;\">\n" +
                "Pantai Randusanga atau yang sekarang lebih dikenal dengan Pantai Randusanga Indah (Parin) berlokasi di Randusanga Kulon sekitar 7 KM ke arah utara dari jalan raya Pantura kota Brebes. Objek wisata ini sedang dikembangkan oleh Pemerintah Kabupaten Brebes yang dibangun sekitar tahun 2001, dan untuk saat ini keberadaannya dikelola oleh Kantor Pariwisata Kabupaten Brebes. Di sepanjang jalan menuju pantai Randusanga akan banyak ditemui perkebunan bawang merah yang terhampar luas, sedangkan mendekati lokasi pantai, akan banyak di temui tambak- tambak yang umumnya digunakan untuk budidaya bandeng dan rumput laut. Alamat&nbsp;Pantai Indah Randusanga, Randusanga Wetan, Kecamatan Brebes, Krajan, Randusanga Wetan, Kec. Brebes, Kabupaten Brebes, Jawa Tengah 52219</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br /></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "Buka : Setiap hari</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "Waktu : 24 Jam</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "Harga tiket : Rp10.000</div>\n";

        WebView wv1 = findViewById(R.id.wv);
        wv1.loadData(text, "text/html", "UTF-8");

        init();
    }
    private void init() {
        for(int i=0;i<IMAGES.length;i++)
            ImagesArray.add(IMAGES[i]);

        mPager = (ViewPager) findViewById(R.id.pager);


        mPager.setAdapter(new Slide_adapter(Wrandusanga.this,ImagesArray));


        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES =IMAGES.length;

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });

    }

}