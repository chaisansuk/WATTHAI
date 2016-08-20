package com.example.manit.appwatthai.indexactivity.page.watrat;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TabWidget;

import com.example.manit.appwatthai.R;
import com.example.manit.appwatthai.indexactivity.map.MapsActivity;


public class WatkajubphinijActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watkajubphinij_layout);
        ImageButton back = (ImageButton) findViewById(R.id.back);
        //tabhost
        TabHost tabHost = (TabHost) this.findViewById (R.id.tabhost);
        tabHost.setup ( );

        TabHost.TabSpec tab_detail = tabHost.newTabSpec ("DEATAIL");
        tab_detail.setIndicator ("ความเป็นมา");
        tab_detail.setContent (R.id.detail2);
        tabHost.addTab (tab_detail);
        WebView webView = (WebView) findViewById(R.id.webViewn2);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://watthaiapp.6te.net/watkrajub1.html");

        TabHost.TabSpec tab_map = tabHost.newTabSpec ("MAP");
        tab_map.setIndicator ("แผนที่");
        tab_map.setContent (R.id.map2);
        tabHost.addTab (tab_map);

        TabWidget tabWidget = tabHost.getTabWidget ();
        tabWidget.setEnabled (true);//endtabhost

        ImageButton btn_watkajubphinijmap = (ImageButton) findViewById(R.id.btn_watkajubphinijmap);
        ImageButton btn_watkajubphinijmaplocation = (ImageButton) findViewById(R.id.btn_watkajubphinijmaplocation);

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
        btn_watkajubphinijmaplocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String lat = "13.715359";
                String lng = "100.486108";
                String strUri = "http://maps.google.com/maps?q=loc:" + lat + "," + lng + " (" + "วัดกระจับพินิจ" + ")";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
