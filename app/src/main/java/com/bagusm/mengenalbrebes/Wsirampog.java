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

public class Wsirampog extends AppCompatActivity {
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private static final Integer[] IMAGES= {R.drawable.w_sirampog,R.drawable.w_sirampog2};
    private ArrayList<Integer> ImagesArray = new ArrayList<Integer>();

    Button btn_navigasi;
    String goolgeMap = "com.google.android.apps.maps";
    Uri gmmIntentUri;
    Intent mapIntent;
    String lok = "-7.230516,109.127806";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wsirampog);

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
                    Toast.makeText(Wsirampog.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });

        String text = "<div style=\"text-align: justify;\">\n" +
                "Bukit Panenjoan adalah bukit yang mempunyai pemandangan indah yang berlokasi di Dukuh Babakan, Wanoja, Salem, Wanoja, Salem, Gunung,Hutan, Wanoja, Salem, Kabupaten Brebes, Jawa Tengah 52275</div>\n" +
                "<br />\n" +
                "<div>\n" +
                "Buka : Setiap hari<br />\n" +
                "Waktu : 24 jam</div>\n" +
                "<div>\n" +
                "Harga tiket : Rp6000 / orang</div>";
        WebView wv1 = findViewById(R.id.wv);
        wv1.loadData(text, "text/html", "UTF-8");

        init();
    }
    private void init() {
        for(int i=0;i<IMAGES.length;i++)
            ImagesArray.add(IMAGES[i]);

        mPager = (ViewPager) findViewById(R.id.pager);


        mPager.setAdapter(new Slide_adapter(Wsirampog.this,ImagesArray));


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