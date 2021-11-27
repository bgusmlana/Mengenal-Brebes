package com.bagusm.mengenalbrebes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Sejarah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);

        String text = "<p style=\"text-align:justify;\">\n" +
                "Ada beberapa pendapat mengenai asal usul nama Brebes. Salah satu pendapat menyatakan bahwa nama Brebes berasal dari kata \"Bara\" dan \"Basah\", bara berarti hamparan tanah luas dan basah berarti banyak mengandung air. Keduanya cocok dengan keadaan daerah Brebes yang merupakan dataran luas yang berair. Karena perkataan bara di ucapkan bere sedangkan basah di ucapkan besah maka untuk mudahnya di ucapkan Brebes. Dalam Bahasa Jawa perkataan Brebes atau mbrebes berarti tansah metu banyune yang berarti selalu keluar airnya.\n" +
                "<br/><br/>\n" +
                "Nama Brebes muncul sejak zaman Mataram. Kota ini berderet dengan kota-kota tepi pantai lainnya seperti Pekalongan, Pemalang, dan Tegal. Brebes pada saat itu merupakan bagian dari wilayah Kabupaten Tegal.\n" +
                "<br/><br/>\n" +
                "Pada tanggal 17 Januari 1678 di Jepara diadakan pertemuan Adipati Kerajaan Mataram se Jawa Tengah, termasuk Arya Martalaya, Adipati Tegal dan Arya Martapura, Adipati Jepara. Karena tidak setuju dengan acara penandatanganan naskah kerjasama antara Amangkurat Admiral dengan Belanda terutama dalam menumpas pemberontakan Trunajaya dengan imbalan tanah-tanah milik Kerajaan Mataram, maka terjadi perang tanding antara kedua adipati tersebut. Peristiwa berdarah ini merupakan awal mula terjadinya Kabupaten Brebes dengan Bupati berwenang .Sehari setelah peristiwa berdarah tersebut yaitu tanggal 18 Januari 1678, Sri Amangkurat II yang berada di Jepara mengangkat beberapa Adipati/ Bupati sebagai pengagganti Adipati-adipati yang gugur. Untuk kabupaten Brebes di jadikan kabupaten mandiri dengan adipati Arya Suralaya yang merupakan adik dari Arya Martalaya. Pengangkatan Arya Suralaya sekaligus titimangsa pemecahan Kadipaten Tegal menjadi dua bagian yaitu Timur tetap disebut Kadipaten Tegal dan bagian barat di sebut Kabupaten Brebes.\n" +
                "<p/>";
        WebView wv1 = findViewById(R.id.wv_artikel1);
        wv1.loadData(text, "text/html", "UTF-8");
    }
}
