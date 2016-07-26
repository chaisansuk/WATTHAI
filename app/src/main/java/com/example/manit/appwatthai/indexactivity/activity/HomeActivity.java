package com.example.manit.appwatthai.indexactivity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TabWidget;

import com.example.manit.appwatthai.R;
import com.example.manit.appwatthai.indexactivity.map.MapsActivity;
import com.example.manit.appwatthai.indexactivity.page.WatbangnamchonActivity;
import com.example.manit.appwatthai.indexactivity.page.WatbangsachaenaiActivity;
import com.example.manit.appwatthai.indexactivity.page.WatbangsachaenorkActivity;
import com.example.manit.appwatthai.indexactivity.page.WatbangsaikaiActivity;
import com.example.manit.appwatthai.indexactivity.page.WatbukkarowActivity;
import com.example.manit.appwatthai.indexactivity.page.WatbuppharhrmActivity;
import com.example.manit.appwatthai.indexactivity.page.WatdowkanorngActivity;
import com.example.manit.appwatthai.indexactivity.page.WatgheycheesuphanActivity;
import com.example.manit.appwatthai.indexactivity.page.WathiranrugeActivity;
import com.example.manit.appwatthai.indexactivity.page.WatintararmvoraviharnActivity;
import com.example.manit.appwatthai.indexactivity.page.WatjantarrarmvoraviharnActivity;
import com.example.manit.appwatthai.indexactivity.page.WatkajubphinijActivity;
import com.example.manit.appwatthai.indexactivity.page.WatkanrayanamitActivity;
import com.example.manit.appwatthai.indexactivity.page.WatkanthatarararmActivity;
import com.example.manit.appwatthai.indexactivity.page.WatkrangdowActivity;
import com.example.manit.appwatthai.indexactivity.page.WatmaiyueynuiActivity;
import com.example.manit.appwatthai.indexactivity.page.WatphadittharramActivity;
import com.example.manit.appwatthai.indexactivity.page.WatphonimitsatitmaharsremararmActivity;
import com.example.manit.appwatthai.indexactivity.page.WatprayutrawongsarvarsvoraviharnActivity;
import com.example.manit.appwatthai.indexactivity.page.WatrajakruvoraviharnActivity;
import com.example.manit.appwatthai.indexactivity.page.WatrajwarinActivity;
import com.example.manit.appwatthai.indexactivity.page.WatsantithammararmActivity;
import com.example.manit.appwatthai.indexactivity.page.WatsuttharwharsActivity;
import com.example.manit.appwatthai.indexactivity.page.WatwararmartayaphanthasarrararmActivity;
import com.example.manit.appwatthai.indexactivity.page.WatweyrurachinActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });

        TabHost tabHost = (TabHost) this.findViewById ( R.id.tabhost ); //tabhost
        tabHost.setup ( );

        TabHost.TabSpec tab_watrat = tabHost.newTabSpec ( "WATRAT" );
        tab_watrat.setIndicator ( "วัดราษฏร์" );
        tab_watrat.setContent ( R.id.watrat );
        tabHost.addTab ( tab_watrat );

        TabHost.TabSpec tab_phaaramluang = tabHost.newTabSpec ( "PHAARAMLUANG" );
        tab_phaaramluang.setIndicator ( "พระอารามหลวง" );
        tab_phaaramluang.setContent ( R.id.phaaramluang );
        tabHost.addTab ( tab_phaaramluang );

        TabWidget tabWidget = tabHost.getTabWidget ( );
        tabWidget.setEnabled ( true );//endtabhost

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

        //clicktomapwatrat
        ImageButton btn_watgheycheesuphanmap = (ImageButton) findViewById(R.id.btn_watgheycheesuphanmap);
        ImageButton btn_watbangsaikaimap = (ImageButton) findViewById(R.id.btn_watbangsaikaimap);
        ImageButton btn_watkajubphinijmap = (ImageButton) findViewById(R.id.btn_watkajubphinijmap);
        ImageButton btn_watkrangdowmap = (ImageButton) findViewById(R.id.btn_watkrangdowmap);
        ImageButton btn_watkanthatarararmmap = (ImageButton) findViewById(R.id.btn_watkanthatarararmmap);
        ImageButton btn_watdowkanorngmap = (ImageButton) findViewById(R.id.btn_watdowkanorngmap);
        ImageButton btn_watbangnamchonmap = (ImageButton) findViewById(R.id.btn_watbangnamchonmap);
        ImageButton btn_watbangsachaenorkmap = (ImageButton) findViewById(R.id.btn_watbangsachaenorkmap);
        ImageButton btn_watbangsachaenaimap = (ImageButton) findViewById(R.id.btn_watbangsachaenaimap);
        ImageButton btn_watbukkarowmap = (ImageButton) findViewById(R.id.btn_watbukkarowmap);
        ImageButton btn_watphadittharrammap = (ImageButton) findViewById(R.id.btn_watphadittharrammap);
        ImageButton btn_watrajwarinmap = (ImageButton) findViewById(R.id.btn_watrajwarinmap);
        ImageButton btn_watwararmartayaphanthasarrararmmap = (ImageButton) findViewById(R.id.btn_watwararmartayaphanthasarrararmmap);
        ImageButton btn_watsantithammararmmap = (ImageButton) findViewById(R.id.btn_watsantithammararmmap);
        ImageButton btn_watsuttharwharsmap = (ImageButton) findViewById(R.id.btn_watsuttharwharsmap);
        ImageButton btn_watmaiyueynuimap = (ImageButton) findViewById(R.id.btn_watmaiyueynuimap);

        //Start click Go to location pagemap watrat
        btn_watgheycheesuphanmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.719178);
                i.putExtra("Lng", 100.485974);
                i.putExtra("Title", "วัดใหญ่ศรีสุพรรณ");
                i.putExtra("Detail", "วัดราษฏร์,13.719178, 100.485974");
                startActivity(i);
            }
        });
        btn_watbangsaikaimap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.719178);
                i.putExtra("Lng", 100.485974);
                i.putExtra("Title", "วัดใหญ่ศรีสุพรรณ");
                i.putExtra("Detail", "วัดราษฏร์,13.719178, 100.485974");
                startActivity(i);
            }
        });
        btn_watkajubphinijmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.715359);
                i.putExtra("Lng", 100.486108);
                i.putExtra("Title", "วัดกระจับพินิจ");
                i.putExtra("Detail", "วัดราษฏร์,13.715359, 100.486108");
                startActivity(i);
            }
        });
        btn_watkrangdowmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.696599);
                i.putExtra("Lng", 100.488186);
                i.putExtra("Title", "วัดกลางดาวคนอง");
                i.putExtra("Detail", "วัดราษฏร์,13.696599, 100.488186");
                startActivity(i);
            }
        });
        btn_watkanthatarararmmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.718941);
                i.putExtra("Lng", 100.479304);
                i.putExtra("Title", " วัดกันตทาราราม");
                i.putExtra("Detail", "วัดราษฏร์, 13.718941, 100.479304");
                startActivity(i);
            }
        });
        btn_watdowkanorngmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.695921);
                i.putExtra("Lng", 100.488491);
                i.putExtra("Title", "วัดดาวคนอง");
                i.putExtra("Detail", "วัดราษฏร์, 13.695921, 100.488491");
                startActivity(i);
            }
        });
        btn_watbangnamchonmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.704214);
                i.putExtra("Lng", 100.490526);
                i.putExtra("Title", "วัดบางน้ำชน");
                i.putExtra("Detail", "วัดราษฏร์,13.704214, 100.490526");
                startActivity(i);
            }
        });
        btn_watbangsachaenorkmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.717944);
                i.putExtra("Lng", 100.474997);
                i.putExtra("Title", "วัดบางสะแกนอก");
                i.putExtra("Detail", "วัดราษฏร์, 13.717944, 100.474997");
                startActivity(i);
            }
        });
        btn_watbangsachaenaimap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.711757);
                i.putExtra("Lng", 100.475893);
                i.putExtra("Title", "วัดบางสะแกใน");
                i.putExtra("Detail", "วัดราษฏร์, 13.711757, 100.475893");
                startActivity(i);
            }
        });
        btn_watbukkarowmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.718941);
                i.putExtra("Lng", 100.479304);
                i.putExtra("Title", "วัดบุคคโล");
                i.putExtra("Detail", "วัดราษฏร์, 13.699800, 100.488770");
                startActivity(i);
            }
        });
        btn_watphadittharrammap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.718941);
                i.putExtra("Lng", 100.479304);
                i.putExtra("Title", "วัดประดิษฐาราม");
                i.putExtra("Detail", "วัดราษฏร์, 13.734278, 100.488092");
                startActivity(i);
            }
        });
        btn_watrajwarinmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.708958);
                i.putExtra("Lng", 100.491758);
                i.putExtra("Title", "วัดราชวรินทร์");
                i.putExtra("Detail", "วัดราษฏร์, 13.708958, 100.491758");
                startActivity(i);
            }
        });
        btn_watwararmartayaphanthasarrararmmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.719772);
                i.putExtra("Lng", 100.470898);
                i.putExtra("Title", "วัดวรามาตยภัณฑสาราราม");
                i.putExtra("Detail", "วัดราษฏร์, 13.719772, 100.470898");
                startActivity(i);
            }
        });
        btn_watsantithammararmmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.706977);
                i.putExtra("Lng", 100.488643);
                i.putExtra("Title", "วัดสันติธรรมาราม");
                i.putExtra("Detail", "วัดราษฏร์, 13.706977, 100.488643");
                startActivity(i);
            }
        });
        btn_watsuttharwharsmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.707980);
                i.putExtra("Lng", 100.482146);
                i.putExtra("Title", "วัดสุทธาวาส");
                i.putExtra("Detail", "วัดราษฏร์, 13.707980, 100.482146");
                startActivity(i);
            }
        });
        btn_watmaiyueynuimap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("Lat", 13.711961);
                i.putExtra("Lng", 100.468449);
                i.putExtra("Title", "วัดใหม่ยายนุ้ย");
                i.putExtra("Detail", "วัดราษฏร์, 13.711961, 100.468449");
                startActivity(i);
            }
        });
        //End click Go to location pagemap watrat

        //Start click Go to location pagemap phaaramluang
        //End click Go to location pagemap phaaramluang

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
    }
}//main
