package com.margsapp.namesofallah;

import android.app.AlertDialog;
import android.content.DialogInterface;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.LayoutManager mLayoutManager;
    private static final String TAG = "MainActivity";
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.re);
        mLayoutManager = new LinearLayoutManager(MainActivity.this);
       /* RecyclerView.LayoutManager la = new StaggeredGridLayoutManager(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS, StaggeredGridLayoutManager.VERTICAL);*/
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        ArrayList<NameModel> arrayList=new ArrayList<NameModel>();
        arrayList.add(new NameModel("الله","‌","The almighty","Allah",R.raw.allah));
        arrayList.add(new NameModel("الرحمن ","","The Most or Entirely Merciful","1.Ar-Rahman",R.raw.rahman));
        arrayList.add(new NameModel("الرحيم","","The Most Merciful","2.Ar-Rahim",R.raw.rahim));
        arrayList.add(new NameModel("الملك","","The King","3.Al-Malik",R.raw.malik));
        arrayList.add(new NameModel("القدوس","","Sacred","4.Al-Quddus",R.raw.quddus));
        arrayList.add(new NameModel("السلام","","The Giver of Peace","5.As-Salam",R.raw.salam));
        arrayList.add(new NameModel("المؤمن","","The Giver","6.Al-Mu'min",R.raw.mumin));
        arrayList.add(new NameModel("المهيمن","","Guardian Over All","7.Al-Muhaymin",R.raw.muhaimin));
        arrayList.add(new NameModel("العزيز","","Powerful","8.Al-Aziz",R.raw.aziz));
        arrayList.add(new NameModel("الجبار","","Supreme Power","9.Al-Jabbar",R.raw.jabbar));
        arrayList.add(new NameModel("المتكبر","","Supreme","10.Al-Mutakabbir",R.raw.mutakabbir));
        arrayList.add(new NameModel("الخالق","","The Creator","11.Al-Khaliq",R.raw.khaliq));
        arrayList.add(new NameModel("البارئ","","The Initiator","12.Al-Bari'",R.raw.bari));
        arrayList.add(new NameModel("المصور","","The Fashioner","13.Al-Musawwir",R.raw.musawwir));
        arrayList.add(new NameModel("الغفار","","Absolute Forgiver","14.Al-Ghaffar",R.raw.ghaffar));
        arrayList.add(new NameModel("القهار","","Overcomer","15.Al-Qahhar",R.raw.qahhar));
        arrayList.add(new NameModel("الوهاب","","Great Donor","16.Al-Wahhab",R.raw.wahhab));
        arrayList.add(new NameModel("الرزاق","","The Provider","17.Ar-Razzaq",R.raw.razzaq));
        arrayList.add(new NameModel("الفتاح","","The Victory Giver","18.Al-Fattah",R.raw.fattah));
        arrayList.add(new NameModel("العليم","","All-Knower","19.Al-`Alim",R.raw.alim));
        arrayList.add(new NameModel("القابض","","The Restrainer","20.Al-Qabid",R.raw.qabid));
        arrayList.add(new NameModel("الباسط","","Generous Provider","21.Al-Basit",R.raw.basit));
        arrayList.add(new NameModel("الخافض","","The Abaser","22.Al-Khafid",R.raw.khafid));
        arrayList.add(new NameModel("الرافع","","The Exalter","23.Ar-Rafi",R.raw.rafi));
        arrayList.add(new NameModel("المقيت","","Feeder","24.Al-Muqit",R.raw.muqit));
        arrayList.add(new NameModel("المذل","","The Giver of Dishonor","25.Al-Mudhill",R.raw.mudhill));
        arrayList.add(new NameModel("السميع","","The Hearing","26.As-Sami",R.raw.sami));
        arrayList.add(new NameModel("البصير","","The All-Seeing","27.Al-Basir",R.raw.basir));
        arrayList.add(new NameModel("الحكم","","Arbitrator","28.Al-Hakam",R.raw.hakam));
        arrayList.add(new NameModel("العدل","","The Just","29.Al-`Adl",R.raw.adl));
        arrayList.add(new NameModel("اللطيف","","The Gentle","30.Al-Latif",R.raw.latif));
        arrayList.add(new NameModel("الكبير","","Most Great","31.Al-Kabir",R.raw.kabir));
        arrayList.add(new NameModel("الحليم","","The Forbearing","32.Al-Halim",R.raw.halim));
        arrayList.add(new NameModel("العظيم","","Most Supreme","33.Al-Azim",R.raw.azim));
        arrayList.add(new NameModel("الغفور","","The Ever-Forgiving","34.Al-Ghafur",R.raw.ghafur));
        arrayList.add(new NameModel("الشكور","","The Grateful","35.Ash-Shakur",R.raw.shakur));
        arrayList.add(new NameModel("العلي","","Most High","36.Al-Ali",R.raw.ali));
        arrayList.add(new NameModel("الخبير","","The All-Aware","37.Al-Khabir",R.raw.khabir));
        arrayList.add(new NameModel("الحفيظ","","The Preserver","38.Al-Hafiz",R.raw.hafiz));
        arrayList.add(new NameModel("المعيد","","The Restorer","39.Al-Mu'id",R.raw.muid));//Doubt
        arrayList.add(new NameModel("الحسيب","","The Bringer of Judgment","40.Al-Hasib",R.raw.hasib));
        arrayList.add(new NameModel("الجليل","","The Majestic","41.Al-Jalil",R.raw.jalil));
        arrayList.add(new NameModel("الكريم","","Generous","42.Al-Karim",R.raw.karim));
        arrayList.add(new NameModel("الرقيب","","Observer","43.Ar-Raqib",R.raw.raqib));
        arrayList.add(new NameModel("المجيب","","The Responsive","44.Al-Mujib",R.raw.mujib));
        arrayList.add(new NameModel("الواسع"," ","All-Embracing","45.Al-Wasi",R.raw.wasi));
        arrayList.add(new NameModel("الحكيم"," ","The Wise","46.Al-Hakim",R.raw.hakim));
        arrayList.add(new NameModel("الودود","","The Affectionate","47.Al-Wadud",R.raw.wadud));
        arrayList.add(new NameModel("المجيد","","The All-Glorious","48.Al-Majid",R.raw.majeed));
        arrayList.add(new NameModel("الباعث","","Awakener","49.Al-Ba'ith",R.raw.baith));
        arrayList.add(new NameModel("الشهيد","","The Witness","50.Ash-Shahid",R.raw.shahid));
        arrayList.add(new NameModel("الحق","","The Truth","51.Al-Haqq",R.raw.haqq));
        arrayList.add(new NameModel("الوكيل","","The Advocate","52.Al-Wakil",R.raw.wakil));
        arrayList.add(new NameModel("القوى","","The Strong","53.Al-Qawiyy",R.raw.qawi));
        arrayList.add(new NameModel("المتين","","The Firm","54.Al-Matin",R.raw.matin));
        arrayList.add(new NameModel("الولى","","Helper ","55.Al-Waliyy",R.raw.wali));
        arrayList.add(new NameModel("الحميد","","The All Praiseworthy","56.Al-Hamid",R.raw.hamid));
        arrayList.add(new NameModel("المحصى"," ","The Accounter","57.Al-Muhsi",R.raw.muhsi));
        arrayList.add(new NameModel("المبدئ"," ","The Producer","58.Al-Mubdi'",R.raw.mubdi));
        arrayList.add(new NameModel("المعيد"," ","The Restorer","59.Al-Mu'id",R.raw.muid));
        arrayList.add(new NameModel("المحيى"," ","The Giver of Life","60.Al-Muhyi",R.raw.muhyi));
        arrayList.add(new NameModel("المميت","","The Bringer of Death","61.Al-Mumit",R.raw.mumit));
        arrayList.add(new NameModel("الحي","","The Living","62.Al-Hayy",R.raw.hayy));
        arrayList.add(new NameModel("القيوم","","The Independent","63.Al-Qayyum",R.raw.qayyum));
        arrayList.add(new NameModel("الواجد","","The Perceiver","64.Al-Wajid",R.raw.wajid));
        arrayList.add(new NameModel("المجيد","","The Illustrious","65.Al-Majid",R.raw.majid));
        arrayList.add(new NameModel("الواحد"," ","The Single","66.Al-Wahid",R.raw.wahid));
        arrayList.add(new NameModel("ٱلْأَحَد","","The Unique","67.Al-Ahad",R.raw.ahad));
        arrayList.add(new NameModel("الصمد","","The Eternal","68.As-Samad",R.raw.samad));
        arrayList.add(new NameModel("القادر"," ","The All-Powerful","69.Al-Qadir",R.raw.qadir));
        arrayList.add(new NameModel("المقتدر","","The Determiner","70.Al-Muqtadir",R.raw.muqtadir));
        arrayList.add(new NameModel("المقدم"," ","The Expediter","71.Al-Muqaddim",R.raw.muqaddim));
        arrayList.add(new NameModel("المؤخر","","The Delayer","72.Al-Mu'akhkhir",R.raw.muakhkhir));
        arrayList.add(new NameModel("الأول","","The First","73.Al-Awwal",R.raw.awwal));
        arrayList.add(new NameModel("الأخر","","The Last","74.Al-Akhir",R.raw.akhir));
        arrayList.add(new NameModel("الظاهر","","The Manifest","75.Az-Zahir",R.raw.zahir));
        arrayList.add(new NameModel("الباطن","","The Hidden","76.Al-Batin",R.raw.batin));
        arrayList.add(new NameModel("الوالي","","The Patron","77.Al-Wali",R.raw.waliy));
        arrayList.add(new NameModel("المتعالي","","The Most High","78.Al-Muta'ali",R.raw.muta_ali));
        arrayList.add(new NameModel("البر","","The Good","79.Al-Barr",R.raw.barr));
        arrayList.add(new NameModel("التواب","","The Ever-Returning","80.At-Tawwab",R.raw.tawwab));
        arrayList.add(new NameModel("المنتقم","","The Avenger","81.Al-Muntaqim",R.raw.muntaqim));
        arrayList.add(new NameModel("العفو"," ","The Pardoner","82.Al-'Afuww",R.raw.afuw));
        arrayList.add(new NameModel("الرؤوف","","The Kind","83.Ar-Ra'uf",R.raw.rauf));
        arrayList.add(new NameModel("مالك الملك"," ","The Owner of all Sovereignty","84.Malik-al-Mulk",R.raw.malik_ul_mulk));
        arrayList.add(new NameModel(" الجلال والإكرام"," ","Lord of Majesty and Honour","85.Dhu-al-Jalal wa-al-Ikram",R.raw.dhu_l_jalali_wal_ikram));
        arrayList.add(new NameModel("المقسط","","The Equitable","86.Al-Muqsit",R.raw.muqsit));
        arrayList.add(new NameModel("الجامع","","The Gatherer","87.Al-Jami'",R.raw.jami));
        arrayList.add(new NameModel("الغني","","The Rich","88.Al-Ghani",R.raw.ghaniy));
        arrayList.add(new NameModel("المغني","","The Enricher","89.Al-Mughni",R.raw.mughni));
        arrayList.add(new NameModel("المانع","","The Defender","90.Al-Mani'",R.raw.mani));
        arrayList.add(new NameModel("الضار","","The Afflictor","91.Ad-Darr",R.raw.darr));
        arrayList.add(new NameModel("النافع","","The Source of Good","92.An-Nafi'",R.raw.nafi));
        arrayList.add(new NameModel("النور","","The Light","93.An-Nur",R.raw.nur));
        arrayList.add(new NameModel("الهادي","","The Guide","94.Al-Hadi",R.raw.hadi));
        arrayList.add(new NameModel("البديع","","The Beautiful","95.Al-Badi",R.raw.badi));
        arrayList.add(new NameModel("الباقي","","The Everlasting","96.Al-Baqi",R.raw.baqi));
        arrayList.add(new NameModel("الوارث"," ","The Heir","97.Al-Warith",R.raw.warith));
        arrayList.add(new NameModel("الرشيد","","The Guide to the Right Path","98.Ar-Rashid",R.raw.rashid));
        arrayList.add(new NameModel("الصبور","","The Patient","99.As-Sabur",R.raw.sabur));










        arrayList.add(new NameModel("Thank you for using our app","","","",R.raw.thankyou));



        RecyclerAdapter adapter=new RecyclerAdapter(MainActivity.this,arrayList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder =
                new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(" 99 Names Of Allah ");
        builder.setMessage("Do you want to exit the app?");


        builder.setPositiveButton(" Yes ",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int id)
            {
                MainActivity.this.finish();
            }

        });
        builder.setNegativeButton(" No ",null);

        builder.show();
    }
}
