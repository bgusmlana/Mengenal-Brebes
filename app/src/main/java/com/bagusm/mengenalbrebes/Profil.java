package com.bagusm.mengenalbrebes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.support.v7.widget.Toolbar;

public class Profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        String text1 = "Kabupaten Brebes adalah salah satu Kabupaten di Provinsi Jawa Tengah, Indonesia. Luas wilayahnya 1.902,37 km², jumlah penduduknya sekitar 1.732.719 jiwa (2010). Ibukotanya ada di Kecamatan Brebes. Brebes merupakan kabupaten dengan jumlah penduduk paling banyak di Jawa Tengah, dan paling luas di Jawa Tengah ke-2 setelah Kabupaten Cilacap.";
        WebView wv1 = findViewById(R.id.wv_artikel1);
        wv1.loadData("<p style=\'text-align:justify\'>"+ text1 + "</p>", "text/html", "UTF-8");

        String text2= "<p style=\"text-align:justify;\">\n" +
                "Adapun tentang Arti Logo Lambang Kabupaten Brebes ini memiliki makna yang penting sebagai berikut:<br/><br/>\n" +
                "Keterangan :<br/>\n" +
                "Makna Lambang Daerah :<br/><br/>\n" +
                "<b>Makna Bentuk dan Motif dalam Lambang :</b><br/><br/>\n" +
                "<b>1. Daun lambang daerah yang berbentuk Dasar Segi Lima</b><br/>\n" +
                "Melambangkan Dasar Falsafah Negara yaitu Pancasila, sedangkan Warna Biru menunjukan  adanya Daerah Pantai dan Pegunungan. Puncak Segi Lima menunjukan puncak gunung  sedangkan lengkung-lengkungnya menunjukan gelombang lautan.<br/><br/>\n" +
                "<b>2. Makna dan motif – motif didalam lambang</b><br/>\n" +
                "<b>a. Bintang</b><br/>\n" +
                "Bintang bersudut lima berwarna kuning emas melambangkan bahwa masyarakat Brebes  adalah makluk yang berKetuhanan Yang Maha Esa.<br/><br/>\n" +
                "<b>b. Kapas dan Padi</b><br/>\n" +
                "Melambangkan Sandang Pangan<br/><br/>\n" +
                "<b>c. Bentuk Bulat Telur serta Gambar Bawang Merah</b><br/>\n" +
                "Melambangkan bahwa Telur Asin serta gambar Bawang Merah merupakan hasil spesifik  daerah.<br/><br/>\n" +
                "<b>d. Lima Akar</b><br/>\n" +
                "Melambangkan bahwa rakyat dan Pemerintahan Daerah adalah Pelaksana Demokrasi  Pancasila.<br/><br/>\n" +
                "<b>e. Perpaduan antara Tujuh Belas Butir Padi, Delapan Buah Kapas Empat Puluh Lima Mata  Rantai</b><br/>\n" +
                "Melambangkan titi mangsa Proklamasi Kemerdekaan Bangsa Indonesia 17 Agustus  1945.<br/><br/>\n" +
                "<b>f. Perpaduan Tiga Umbi Bawang Merah dan Lima Akar yang berwarna hitam, puncak  bawang yang merupakan nyala api yang tak kunjung padam berjumlah lima.</b><br/>\n" +
                "Melambangkan kehidupan Demokrasi (Legislatif, Eksekutif, Yudikatif) yang harus  dilaksanakan secara dinamis dalam bentuk Demokrasi Pancasila.<br/><br/>\n" +
                "<b>g.</b> Sebuah Pita Putih bergaris tepi Hitam yang menyambungkan padi dan kapas  ditengahnya bertuliskan : <b style\"color:blue;>Mangesti Wicara Ebahing Praja</b> dengan warna hitam yang  menunjukan bahwa Rakyat Brebes bertekad untuk membangun daerahnya guna  mewujudkan kesejahteraan bersama dalam rangka membagun Bangsa dan Negara  Kesatuan republik Indonesia yang berdasarkan Pancasila dan UUD 1945.\n" +
                "</p>";
        WebView wv2 = findViewById(R.id.wv_artikel2);
        wv2.loadData(text2, "text/html", "UTF-8");
    }
}
