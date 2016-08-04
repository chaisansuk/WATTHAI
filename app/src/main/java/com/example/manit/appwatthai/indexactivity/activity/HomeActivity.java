package com.example.manit.appwatthai.indexactivity.activity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TabWidget;

import com.example.manit.appwatthai.R;
import com.example.manit.appwatthai.indexactivity.map.MapsActivity;
import com.example.manit.appwatthai.indexactivity.page.WebhelpMapActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatbangnamchonActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatbangsachaenaiActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatbangsachaenorkActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatbangsaikaiActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatbukkarowActivity;
import com.example.manit.appwatthai.indexactivity.page.phaaramluang.WatbuppharhrmActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatdowkanorngActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatgheycheesuphanActivity;
import com.example.manit.appwatthai.indexactivity.page.phaaramluang.WathiranrugeActivity;
import com.example.manit.appwatthai.indexactivity.page.phaaramluang.WatintararmvoraviharnActivity;
import com.example.manit.appwatthai.indexactivity.page.phaaramluang.WatjantarrarmvoraviharnActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatkajubphinijActivity;
import com.example.manit.appwatthai.indexactivity.page.phaaramluang.WatkanrayanamitActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatkanthatarararmActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatkrangdowActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatmaiyueynuiActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatphadittharramActivity;
import com.example.manit.appwatthai.indexactivity.page.phaaramluang.WatphonimitsatitmaharsremararmActivity;
import com.example.manit.appwatthai.indexactivity.page.phaaramluang.WatprayutrawongsarvarsvoraviharnActivity;
import com.example.manit.appwatthai.indexactivity.page.phaaramluang.WatrajakruvoraviharnActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatrajwarinActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatsantithammararmActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatsuttharwharsActivity;
import com.example.manit.appwatthai.indexactivity.page.watrat.WatwararmartayaphanthasarrararmActivity;
import com.example.manit.appwatthai.indexactivity.page.phaaramluang.WatweyrurachinActivity;

public class HomeActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageButton back = (ImageButton) findViewById(R.id.back);
        ImageButton help = (ImageButton) findViewById(R.id.help);

        help.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching Screen
                Intent i = new Intent(getApplicationContext(), WebhelpMapActivity.class);
                startActivity(i);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
        //tabhost
        TabHost tabHost = (TabHost) this.findViewById (R.id.tabhost);
        tabHost.setup ( );

        TabHost.TabSpec tab_watrat = tabHost.newTabSpec ("WATRAT");
        tab_watrat.setIndicator ("วัดราษฏร์");
        tab_watrat.setContent (R.id.watrat);
        tabHost.addTab (tab_watrat);

        TabHost.TabSpec tab_phaaramluang = tabHost.newTabSpec ("PHAARAMLUANG");
        tab_phaaramluang.setIndicator ("พระอารามหลวง");
        tab_phaaramluang.setContent (R.id.phaaramluang);
        tabHost.addTab (tab_phaaramluang);

        TabWidget tabWidget = tabHost.getTabWidget ();
        tabWidget.setEnabled (true);//endtabhost

        // watrat
        ImageButton btn_watgheycheesuphan = (ImageButton) findViewById(R.id.btn_watgheycheesuphan);
        ImageButton btn_watbangsaikai = (ImageButton) findViewById(R.id.btn_watbangsaikai);
        ImageButton btn_watkajubphinij = (ImageButton) findViewById(R.id.btn_watkajubphinij);
        ImageButton btn_watkrangdow = (ImageButton) findViewById(R.id.btn_watkrangdow);
        ImageButton btn_watkanthatarararm = (ImageButton) findViewById(R.id.btn_watkanthatarararm);
        ImageButton btn_watdowkanorng = (ImageButton) findViewById(R.id.btn_watdowkanorng);
        ImageButton btn_watbangnamchon = (ImageButton) findViewById(R.id.btn_watbangnamchon);
        ImageButton btn_watbangsachaenork = (ImageButton) findViewById(R.id.btn_watbangsachaenork);
        ImageButton btn_watbangsachaenai = (ImageButton) findViewById(R.id.btn_watbangsachaenai);
        ImageButton btn_watbukkarow = (ImageButton) findViewById(R.id.btn_watbukkarow);
        ImageButton btn_watphadittharram = (ImageButton) findViewById(R.id.btn_watphadittharram);
        ImageButton btn_watrajwarin = (ImageButton) findViewById(R.id.btn_watrajwarin);
        ImageButton btn_watwararmartayaphanthasarrararm = (ImageButton) findViewById(R.id.btn_watwararmartayaphanthasarrararm);
        ImageButton btn_watsantithammararm = (ImageButton) findViewById(R.id.btn_watsantithammararm);
        ImageButton btn_watsuttharwhars = (ImageButton) findViewById(R.id.btn_watsuttharwhars);
        ImageButton btn_watmaiyueynui= (ImageButton) findViewById(R.id.btn_watmaiyueynui);


        //phaaramluang
        ImageButton btn_watbuppharhrm = (ImageButton) findViewById(R.id.btn_watbuppharhrm);
        ImageButton btn_watkanrayanamit = (ImageButton) findViewById(R.id.btn_watkanrayanamit);
        ImageButton btn_wathiranruge = (ImageButton) findViewById(R.id.btn_wathiranruge);
        ImageButton btn_watjantarrarmvoraviharn = (ImageButton) findViewById(R.id.btn_watjantarrarmvoraviharn);
        ImageButton btn_watprayutrawongsarvarsvoraviharn = (ImageButton) findViewById(R.id.btn_watprayutrawongsarvarsvoraviharn);
        ImageButton btn_watphonimitsatitmaharsremararm = (ImageButton) findViewById(R.id.btn_watphonimitsatitmaharsremararm);
        ImageButton btn_watrajakruvoraviharn = (ImageButton) findViewById(R.id.btn_watrajakruvoraviharn);
        ImageButton btn_watweyrurachin = (ImageButton) findViewById(R.id.btn_watweyrurachin);
        ImageButton btn_watintararmvoraviharn = (ImageButton) findViewById(R.id.btn_watintararmvoraviharn);

        //click to map phaaramluang
        ImageButton btn_watbuppharhrmmap = (ImageButton) findViewById(R.id.btn_watbuppharhrmmap);

        ImageButton btn_wathiranrugemap = (ImageButton) findViewById(R.id.btn_wathiranrugemap);
        ImageButton btn_watjantarrarmvoraviharnmap = (ImageButton) findViewById(R.id.btn_watjantarrarmvoraviharnmap);
        ImageButton btn_watprayutrawongsarvarsvoraviharnmap = (ImageButton) findViewById(R.id.btn_watprayutrawongsarvarsvoraviharnmap);
        ImageButton btn_watphonimitsatitmaharsremararmmap = (ImageButton) findViewById(R.id.btn_watphonimitsatitmaharsremararmmap);
        ImageButton btn_watrajakruvoraviharnmap = (ImageButton) findViewById(R.id.btn_watrajakruvoraviharnmap);
        ImageButton btn_watweyrurachinmap = (ImageButton) findViewById(R.id.btn_watweyrurachinmap);
        ImageButton btn_watintararmvoraviharnmap = (ImageButton) findViewById(R.id.btn_watintararmvoraviharnmap);

        //click to navi phaaramluang
        ImageButton btn_watbuppharhrmmaplocation = (ImageButton) findViewById(R.id.btn_watbuppharhrmmaplocation);

        ImageButton btn_wathiranrugemaplocation = (ImageButton) findViewById(R.id.btn_wathiranrugemaplocation);
        ImageButton btn_watjantarrarmvoraviharnmaplocation = (ImageButton) findViewById(R.id.btn_watjantarrarmvoraviharnmaplocation);
        ImageButton btn_watprayutrawongsarvarsvoraviharnmaplocation = (ImageButton) findViewById(R.id.btn_watprayutrawongsarvarsvoraviharnmaplocation);
        ImageButton btn_watphonimitsatitmaharsremararmmaplocation = (ImageButton) findViewById(R.id.btn_watphonimitsatitmaharsremararmmaplocation);
        ImageButton btn_watrajakruvoraviharnmaplocation = (ImageButton) findViewById(R.id.btn_watrajakruvoraviharnmaplocation);
        ImageButton btn_watweyrurachinmaplocation = (ImageButton) findViewById(R.id.btn_watweyrurachinmaplocation);
        ImageButton btn_watintararmvoraviharnmaplocation = (ImageButton) findViewById(R.id.btn_watintararmvoraviharnmaplocation);

        //click watratdetail
        btn_watgheycheesuphan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching Screen
                Intent i = new Intent(getApplicationContext(), WatgheycheesuphanActivity.class);
                startActivity(i);
            }
        });
        btn_watbangsaikai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatbangsaikaiActivity.class);
                startActivity(i);
            }
        });
        btn_watkajubphinij.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatkajubphinijActivity.class);
                startActivity(i);
            }
        });
        btn_watkrangdow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatkrangdowActivity.class);
                startActivity(i);
            }
        });
        btn_watkanthatarararm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatkanthatarararmActivity.class);
                startActivity(i);
            }
        });
        btn_watdowkanorng.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatdowkanorngActivity.class);
                startActivity(i);
            }
        });
        btn_watbangnamchon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatbangnamchonActivity.class);
                startActivity(i);
            }
        });
        btn_watbangsachaenork.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatbangsachaenorkActivity.class);
                startActivity(i);
            }
        });
        btn_watbangsachaenai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatbangsachaenaiActivity.class);
                startActivity(i);
            }
        });
        btn_watbukkarow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatbukkarowActivity.class);
                startActivity(i);
            }
        });
        btn_watphadittharram.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatphadittharramActivity.class);
                startActivity(i);
            }
        });
        btn_watrajwarin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatrajwarinActivity.class);
                startActivity(i);
            }
        });
        btn_watwararmartayaphanthasarrararm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatwararmartayaphanthasarrararmActivity.class);
                startActivity(i);
            }
        });
        btn_watsantithammararm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatsantithammararmActivity.class);
                startActivity(i);
            }
        });
        btn_watsuttharwhars.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatsuttharwharsActivity.class);
                startActivity(i);
            }
        });
        btn_watmaiyueynui.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatmaiyueynuiActivity.class);
                startActivity(i);
            }
        });
        //end clickwatratdetail


        //click phaaramluangdetail
        btn_watbuppharhrm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatbuppharhrmActivity.class);
                startActivity(i);
            }
        });
        btn_watkanrayanamit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatkanrayanamitActivity.class);
                startActivity(i);
            }
        });
        btn_wathiranruge.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WathiranrugeActivity.class);
                startActivity(i);
            }
        });
        btn_watjantarrarmvoraviharn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatjantarrarmvoraviharnActivity.class);
                startActivity(i);
            }
        });
        btn_watprayutrawongsarvarsvoraviharn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatprayutrawongsarvarsvoraviharnActivity.class);
                startActivity(i);
            }
        });
        btn_watphonimitsatitmaharsremararm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatphonimitsatitmaharsremararmActivity.class);
                startActivity(i);
            }
        });
        btn_watrajakruvoraviharn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatrajakruvoraviharnActivity.class);
                startActivity(i);
            }
        });
        btn_watweyrurachin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatweyrurachinActivity.class);
                startActivity(i);
            }
        });
        btn_watintararmvoraviharn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WatintararmvoraviharnActivity.class);
                startActivity(i);
            }
        });
        //end clickphaaramluangdetail

        //Start click Go to location pagemap phaaramluang

        btn_watjantarrarmvoraviharnmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.722384);
                i.putExtra("Lng", 100.481108);
                i.putExtra("Title", "วัดจันทารามวรวิหาร");
                i.putExtra("Detail", "พระอารามหลวง, 13.722384, 100.481108");
                startActivity(i);
            }
        });
        btn_watbuppharhrmmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.735798);
                i.putExtra("Lng", 100.492341);
                i.putExtra("Title", "วัดบุปผารามวรวิหาร");
                i.putExtra("Detail", "พระอารามหลวง, 13.735798, 100.492341");
                startActivity(i);
            }
        });
        btn_watprayutrawongsarvarsvoraviharnmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.737324);
                i.putExtra("Lng", 100.495369);
                i.putExtra("Title", "วัดประยุรวงศาวาสวรวิหาร");
                i.putExtra("Detail", "พระอารามหลวง, 13.737324, 100.495369");
                startActivity(i);
            }
        });
        btn_watphonimitsatitmaharsremararmmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.720930);
                i.putExtra("Lng", 100.484056);
                i.putExtra("Title", "วัดโพธินิมิตสถิตมหาสีมาราม");
                i.putExtra("Detail", "พระอารามหลวง, 13.720930, 100.484056");
                startActivity(i);
            }
        });
        btn_watrajakruvoraviharnmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.721798);
                i.putExtra("Lng", 100.479666);
                i.putExtra("Title", "วัดราชคฤห์วรวิหาร");
                i.putExtra("Detail", "พระอารามหลวง, 13.721798, 100.479666");
                startActivity(i);
            }
        });
        btn_watweyrurachinmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.725190);
                i.putExtra("Lng", 100.486169);
                i.putExtra("Title", "วัดเวฬุราชิณ");
                i.putExtra("Detail", "พระอารามหลวง, 13.725190, 100.486169");
                startActivity(i);
            }
        });
        btn_wathiranrugemap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.728924);
                i.putExtra("Lng", 100.490469);
                i.putExtra("Title", "วัดหิรัญรูจีวรวิหาร");
                i.putExtra("Detail", "พระอารามหลวง, 13.728924, 100.490469");
                startActivity(i);
            }
        });
        btn_watintararmvoraviharnmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.722727);
                i.putExtra("Lng", 100.483277);
                i.putExtra("Title", "วัดอินทารามวรวิหาร");
                i.putExtra("Detail", "พระอารามหลวง, 13.722727, 100.483277");
                startActivity(i);
            }
        });
        //End click Go to location pagemap phaaramluang

        //Start click Go to navi phaaramluang

        btn_watjantarrarmvoraviharnmaplocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String lat = "13.722384";
                String lng = "100.481108";
                String strUri = "http://maps.google.com/maps?q=loc:" + lat + "," + lng + " (" + "วัดจันทารามวรวิหาร" + ")";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(intent);
            }
        });
        btn_watbuppharhrmmaplocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String lat = "13.73579";
                String lng = "100.492341";
                String strUri = "http://maps.google.com/maps?q=loc:" + lat + "," + lng + " (" + "วัดบุปผารามวรวิหาร" + ")";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(intent);
            }
        });
        btn_watprayutrawongsarvarsvoraviharnmaplocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String lat = "13.737324";
                String lng = "100.495369";
                String strUri = "http://maps.google.com/maps?q=loc:" + lat + "," + lng + " (" + "วัดประยุรวงศาวาสวรวิหาร" + ")";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(intent);
            }
        });
        btn_watphonimitsatitmaharsremararmmaplocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String lat = "13.720930";
                String lng = "100.484056";
                String strUri = "http://maps.google.com/maps?q=loc:" + lat + "," + lng + " (" + "วัดโพธินิมิตสถิตมหาสีมาราม" + ")";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(intent);
            }
        });
        btn_watrajakruvoraviharnmaplocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String lat = "13.721798";
                String lng = "100.479666";
                String strUri = "http://maps.google.com/maps?q=loc:" + lat + "," + lng + " (" + "วัดราชคฤห์วรวิหาร" + ")";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(intent);
            }
        });
        btn_watweyrurachinmaplocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String lat = "13.725190";
                String lng = "100.486169";
                String strUri = "http://maps.google.com/maps?q=loc:" + lat + "," + lng + " (" + "วัดเวฬุราชิณ" + ")";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(intent);
            }
        });
        btn_wathiranrugemaplocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String lat = "13.728924";
                String lng = "100.490469";
                String strUri = "http://maps.google.com/maps?q=loc:" + lat + "," + lng + " (" + "วัดหิรัญรูจีวรวิหาร" + ")";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(intent);
            }
        });
        btn_watintararmvoraviharnmaplocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String lat = "13.722727";
                String lng = "100.483277";
                String strUri = "http://maps.google.com/maps?q=loc:" + lat + "," + lng + " (" + "วัดอินทารามวรวิหาร" + ")";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(intent);
            }
        });
        //End click Go to navi phaaramluang
    }
}//main
