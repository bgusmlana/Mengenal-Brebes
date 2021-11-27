package com.bagusm.mengenalbrebes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;

public class Wilayah2 extends AppCompatActivity {
    
    String text1 ="<div style=\"text-align: justify;\">\n" +
            "Kabupaten Brebes terletak di bagian Utara paling Barat Provinsi Jawa Tengah, berbatasan langsung dengan wilayah Provinsi Jawa Barat. Penduduk Kabupaten Brebes mayoritas menggunakan bahasa Jawa yang yang mempunyai ciri khas yang tidak dimiliki oleh daerah lain, biasanya disebut dengan Bahasa Jawa Brebes. Namun terdapat Kenyataan pula bahwa sebagian penduduk Kabupaten Brebes juga bertutur dalam bahasa Sunda dan banyak nama tempat yang dinamai dengan bahasa Sunda menunjukan bahwa pada masa lalu wilayah ini adalah bagian dari wilayah Sunda. Daerah yang masyarakatnya sebagian besar menggunakan bahasa Sunda atau biasa disebut dengan Bahasa Sunda Brebes, adalah meliputi Kecamatan Salem, Banjarharjo,dan Bantarkawung, dan sebagian lagi ada di beberapa desa di Kecamatan Losari, Tanjung, Kersana, Ketanggungan dan Larangan.</div>\n" +
            "<div style=\"text-align: justify;\">\n" +
            "<br /></div>\n" +
            "<div style=\"text-align: justify;\">\n" +
            "Berdasarkan naskah kuno primer Bujangga Manik (yang menceriterakan perjalanan Prabu Bujangga Manik, seorang pendeta Hindu Sunda yang mengunjungi tempat-tempat suci agama Hindu di pulau Jawa dan Bali pada awal abad ke-16), yang saat ini disimpan pada Perpustakaan Boedlian, Oxford University, Inggris sejak tahun 1627, batas Kerajaan Sunda di sebelah timur adalah Ci Pamali (sekarang disebut sebagai Kali Brebes atau Kali Pemali yang melintasi pusat kota Brebes) dan Ci Serayu (yang saat ini disebut Kali Serayu) di Provinsi Jawa Tengah.</div>\n" +
            "<div style=\"text-align: justify;\">\n" +
            "<br /></div>\n" +
            "<div style=\"text-align: justify;\">\n" +
            "Ibukota kabupaten Brebes terletak di bagian timur laut wilayah kabupaten. Kota Brebes bersebelahan dengan Kota Tegal, sehingga kedua kota ini dapat dikatakan \"menyatu\".</div>\n" +
            "<div style=\"text-align: justify;\">\n" +
            "<br /></div>\n" +
            "<div style=\"text-align: justify;\">\n" +
            "Brebes merupakan kabupaten yang cukup luas di Provinsi Jawa Tengah. Sebagian besar wilayahnya adalah dataran rendah. Bagian barat daya merupakan dataran tinggi (dengan puncaknya Gunung Pojoktiga dan Gunung Kumbang), sedangkan bagian tenggara terdapat pegunungan yang merupakan bagian dari Gunung Slamet.</div>\n" +
            "<div style=\"text-align: justify;\">\n" +
            "<br /></div>\n" +
            "<div style=\"text-align: justify;\">\n" +
            "Dengan iklim tropis, curah hujan rata-rata 18,94 mm per bulan. Kondisi itu menjadikan kawasan tesebut sangat potensial untuk pengembangan produk pertanian seperti tanaman padi, hortikultura, perkebunan, perikanan, peternakan dan sebagainya.</div>\n";
    String text2 = "<div>\n" +
            "<b>1) Kecamatan Banjarharjo</b></div>\n" +
            "<div>\n" +
            "Bandungsari , Banjar Lor , Banjarharjo , Blandongan , Ciawi , Cibendung , Cibuniwangi , Cigadung , Cihaur , Cikakak , Cikuya , Cimunding , Cipajang , Dukuhjeruk , Karangmaja , Kertasari , Kubangjero , Malahayu , Parireja , Penanggapan , Pende , Sindangheula , Sukareja , Tegalreja , Tiwulandu</div>\n" +
            "<div>\n" +
            "<br /></div>\n" +
            "<div>\n" +
            "<b>2) Bantarkawung</b></div>\n" +
            "<div>\n" +
            "Bangbayang , Banjarsari , Bantarkawung , Bantarwaru , Cibentang , Cinanas , Ciomas , Jipang , Karangpari , Kebandungan , Legok , Pangebatan , Pakiringan , Pengarasan , Sindangwangi , Tambakserang , Telaga , Terlaya , Waru</div>\n" +
            "<div>\n" +
            "<br /></div>\n" +
            "<div>\n" +
            "<b>3) Kecamatan Brebes</b></div>\n" +
            "<div>\n" +
            "Pasarbatang , Brebes , Pulosari , Padasugih , Wangandalem , Gandasuli , Banjaranyar , Kaligangsa Kulon , Kaligangsa Wetan , Limbangan Wetan , Kalimati , Kaliwlingi , Kedunguter , Krasak , Lembarawa , Limbangan Kulon , Pagejugan , Pemaron , Randusanga Kulon , Randusanga Wetan , Sigambir , Tengki , Terlangu</div>\n" +
            "<div>\n" +
            "<br /></div>\n" +
            "<div>\n" +
            "<b>4) Kecamatan Bulakamba</b></div>\n" +
            "<div>\n" +
            "Bangsri , Banjaratma , Bulakamba , Bulakparen , Bulusari , Cimohong , Cipelem , Dukuhlo , Grinting , Jubang , Karangsari , Kluwut , Luwungragi , Pakijangan , Petunjungan , Pulogading , Rancawuluh , Siwuluh , Tegalglagah</div>\n" +
            "<div>\n" +
            "<br /></div>\n" +
            "<div>\n" +
            "<b>5) Kecamatan Bumiayu</b></div>\n" +
            "<div>\n" +
            "Adisana , Bumiayu , Dukuhturi , Jatisawit , Kalierang , Kalilangkap , Kalinusu , Kalisumur , Kaliwadas , Langkap , Laren , Negaradaha , Pamijen , Panggarutan , Pruwatan</div>\n" +
            "<div>\n" +
            "<b><br /></b></div>\n" +
            "<div>\n" +
            "<b>6) Kecamatan Jatibarang</b></div>\n" +
            "<div>\n" +
            "Bojong , Buaran , Janegara , Jatibarang Kidul , Jatibarang Lor , Kalialang , Kalipucang , Karanglo , Kebogadung , Kebonagung , Kedungtukang , Kemiriamba , Kendawa , Kertasinduyasa , Klampis , Klikiran , Kramat , Pamengger , Pedeslohor , Rengasbandung , Tegalwulung , Tembelang</div>\n" +
            "<div>\n" +
            "<br /></div>\n" +
            "<div>\n" +
            "<b>7) Kecamatan Kersana</b></div>\n" +
            "<div>\n" +
            "Ciampel , Cigedog , Cikandang , Jagapura , Kemukten , Kersana , Kradenan , Kramatsampang , Kubangpari , Limbangan , Pende , Sindangjaya , Sutamaja</div>\n" +
            "<div>\n" +
            "<b><br /></b></div>\n" +
            "<div>\n" +
            "<b>8) Kecamatan Ketanggungan</b></div>\n" +
            "<div>\n" +
            "Baros , Buara , Bulakelor , Ciduwet , Cikeusal Kidul , Cikeusal Lor , Ciseureuh , Dukuhtengah , Dukuhbadag , Dukuhturi , Jemasih , Karangbandung , Karangmalang , Ketanggungan , Kubangjati , Kubangsari , Kubangwungu , Padakaton , Pamedaran , Sindangjaya , Tanggungsari</div>\n" +
            "<div>\n" +
            "<br /></div>\n" +
            "<div>\n" +
            "<b>9) Kecamatan Larangan</b></div>\n" +
            "<div>\n" +
            "Kamal , Karangbale , Kedungbokor , Larangan , Luwunggede , Pamulihan , Rengaspendawa , Siandong , Sitanggal , Slatri , Wlahar , Poncol</div>\n" +
            "<div>\n" +
            "<br /></div>\n" +
            "<div>\n" +
            "<b>10) Kecamatan Losari</b></div>\n" +
            "<div>\n" +
            "Babakan , Blubuk , Bojongsari , Dukuhsalam , Jati Sawit , Kalibuntu , Karangdempel , Karangjunti , Karangsambung , Kecipir , Kedungneng , Limbangan , Losari Kidul , Losari Lor , Negla , Pekauman , Pengabean , Prapag Kidul , Prapag Lor , Radegan , Randusari , Rungkang</div>\n" +
            "<div>\n" +
            "<br /></div>\n" +
            "<div>\n" +
            "<b>11) Kecamatan Paguyangan</b></div>\n" +
            "<div>\n" +
            "Cilibur , Cipetung , Kedungoleng , Kretek , Pagojengan , Paguyangan , Pakujati , Pandansari , Ragatunjung , Taraban , Wanatirta , Winduaji</div>\n" +
            "<div>\n" +
            "<br /></div>\n" +
            "<div>\n" +
            "<b>12) Kecamatan Salem</b></div>\n" +
            "<div>\n" +
            "Banjaran , Bentar , Bentarsari , Capar , Ciputih , Citimbang , Gandoang , Ganggawang , Gunung Larang , Gunung Sugih , Gunung Tajem , Indrajaya , Kadumanis , Pabuaran , Pasir Panjang , Salem , Tembongraja , Gunung Jaya , Wanoja , Windu Sakti , Winduasri</div>\n" +
            "<div>\n" +
            "<br /></div>\n" +
            "<div>\n" +
            "<b>13) Kecamatan Sirampog</b></div>\n" +
            "<div>\n" +
            "Batursari , Benda , Buniwah , Dawuhan , Igirklanceng , Kaligiri , Kaliloka , Manggis , Mendala , Mlayang , Plompong , Sridadi , Wanareja</div>\n" +
            "<div>\n" +
            "<br /></div>\n" +
            "<div>\n" +
            "<b>14) Kecamatan Songgom</b></div>\n" +
            "<div>\n" +
            "Cenang , Dukuhmaja , Gegerkunci , Jatimakmur , Jatirokeh , Karangsembung , Songgom , Songgom Lor , Wanacala , Wanatawang</div>\n" +
            "<div>\n" +
            "<br /></div>\n" +
            "<div>\n" +
            "<b>15) Kecamatan Tanjung</b></div>\n" +
            "<div>\n" +
            "Karangreja , Kedawung , Kemurang Kulon , Kemurang Wetan , Krakahan , Kubangputat , Lemah Abang , Luwung Gede , Luwungbata , Mundu , Pejagan , Pengaradan , Sarireja , Sengon , Sidakaton , Tanjung , Tegongan , Tengguli</div>\n" +
            "<div>\n" +
            "<br /></div>\n" +
            "<div>\n" +
            "<b>16) Kecamatan Tonjong</b></div>\n" +
            "<div>\n" +
            "Galuh Timur , Kalijurang , Karangjongkeng , Kutamendala , Kutayu , Linggapura , Negarayu , Pepedan , Purbayasa , Purwodadi , Rajawetan , Tanggeran , Tonjong , Watujaya</div>\n" +
            "<div>\n" +
            "<br /></div>\n" +
            "<div>\n" +
            "<b>17) Kecamatan Wanasari</b></div>\n" +
            "<div>\n" +
            "Pesantunan , Pebatan , Dukuhwringin , Dumeling , Glonggong , Jagalempeni , Keboledan , Kertabesuki , Klampok , Kupu , Lengkong , Sawojajar , Siasem , Sidamulya , Sigentong , Sisalam , Siwungkuk , Tanjungsari , Tegalgandu , Wanasari</div>\n";
    String text3 = "<div>\n" +
            "<ol>\n" +
            "<li>Sungai Kaligangsa</li>\n" +
            "<li>Sungai Pemali</li>\n" +
            "<li>Sungai Balaikambang</li>\n" +
            "<li>Sungai Luwungmalang</li>\n" +
            "<li>Sungai Bangsri</li>\n" +
            "<li>Sungai Pakijangan</li>\n" +
            "<li>Sungai Kluwut</li>\n" +
            "<li>Sungai Babakan</li>\n" +
            "<li>Sungai Buntiris</li>\n" +
            "<li>Sungai Kebuyutan</li>\n" +
            "<li>Sungai Sinung</li>\n" +
            "<li>Sungai Tanjung</li>\n" +
            "<li>Sungai Bancang</li>\n" +
            "<li>Sungai Cisanggarung</li>\n" +
            "<li>Sungai Cikeruh</li>\n" +
            "<li>Sungai Erang</li>\n" +
            "<li>Sungai Pedes</li>\n" +
            "<li>Sungai Ciegelagah</li>\n" +
            "<li>Sungai Cigunung</li>\n" +
            "<li>Sungai Cilakart</li>\n" +
            "<li>Sungai Ciraja</li>\n" +
            "<li>Sungai Cigunung</li>\n" +
            "<li>Sungai Rambatan</li>\n" +
            "</ol>\n" +
            "</div>\n";

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    WebView wv1 = findViewById(R.id.WV1);
                    wv1.loadData(text1, "text/html", "UTF-8");
                    setTitle("Wilayah Brebes");
                    return true;

                case R.id.navigation_dashboard:
                    WebView wv2 = findViewById(R.id.WV1);
                    wv2.loadData(text2, "text/html", "UTF-8");
                    setTitle("Daftar Kecamatan & Desa");
                    return true;

                case R.id.navigation_notifications:
                    WebView wv3 = findViewById(R.id.WV1);
                    wv3.loadData(text3, "text/html", "UTF-8");
                    setTitle("Daftar Sungai");
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wilayah2);
        WebView wv1 = findViewById(R.id.WV1);
        wv1.loadData(text1, "text/html", "UTF-8");
        setTitle("Wilayah Brebes");

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
