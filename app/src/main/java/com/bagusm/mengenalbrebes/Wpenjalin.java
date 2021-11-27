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

public class Wpenjalin extends AppCompatActivity {
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private static final Integer[] IMAGES= {R.drawable.w_penjalin};
    private ArrayList<Integer> ImagesArray = new ArrayList<Integer>();

    Button btn_navigasi;
    String goolgeMap = "com.google.android.apps.maps";
    Uri gmmIntentUri;
    Intent mapIntent;
    String lok = "-7.328897,109.055674";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wpenjalin);

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
                    Toast.makeText(Wpenjalin.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });


        String text = "<div style=\"text-align: justify;\">\n" +
                "Waduk Penjalin adalah sebuah waduk yang berada di Kecamatan Paguyangan, Kabupaten Brebes, Jawa Tengah, atau sekitar 12 Km dari Bumiayu. Penjalin dalam Bahasa Jawa berati rotan. Waduk ini dibangun tahun 1930 oleh pemerintah kolonial Belanda bersamaan dengan Waduk Malahayu. Waduk Penjalin terletak perbatasan Kabupaten Banyumas dan Kabupaten Brebes. Air waduk ini dipersiapkan untuk menyuplai irigasi Sungai Pemali bawah dan areal persawahan.</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br /></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "Buka : Setiap hari</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "Waktu : 24 Jam</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "Harga tiket : Rp5.000</div>";
        WebView wv1 = findViewById(R.id.wv);
        wv1.loadData(text, "text/html", "UTF-8");

        init();
    }
    private void init() {
        for(int i=0;i<IMAGES.length;i++)
            ImagesArray.add(IMAGES[i]);

        mPager = (ViewPager) findViewById(R.id.pager);


        mPager.setAdapter(new Slide_adapter(Wpenjalin.this,ImagesArray));


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