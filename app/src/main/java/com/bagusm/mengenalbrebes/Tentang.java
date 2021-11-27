package com.bagusm.mengenalbrebes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Tentang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        String text = "<div style=\"text-align: justify;\">\n" +
                "<div style=\"text-align: center;\">\n" +
                "<b><span style=\"font-size: large;\">Mengenal Brebes v.1.0&nbsp;</span></b></div>\n" +
                "<br />\n" +
                "<b>Bagus Maulana</b><br />\n" +
                "16.12.0172<br />\n" +
                "6.bagus@gmail.com<br />\n" +
                "<br />\n" +
                "<br />\n" +
                "SI16B<br />\n" +
                "STMIK AMIKOM PURWOKERTO<br />\n" +
                "<br />\n" +
                "<br />\n" +
                "&copy; 2018 Bagus Maulana</div>\n";

        WebView wv1 = findViewById(R.id.wv);
        wv1.loadData(text, "text/html", "UTF-8");

    }
}
