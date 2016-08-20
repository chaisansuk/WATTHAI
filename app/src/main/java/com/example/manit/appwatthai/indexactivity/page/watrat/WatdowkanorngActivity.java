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

public class WatdowkanorngActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watdowkanorng_layout);
        ImageButton back = (ImageButton) findViewById(R.id.back);
        //tabhost
        TabHost tabHost = (TabHost) this.findViewById (R.id.tabhost);
        tabHost.setup ( );

        TabHost.TabSpec tab_detail = tabHost.newTabSpec ("DEATAIL");
        tab_detail.setIndicator ("ความเป็นมา");
        tab_detail.setContent (R.id.detail5);
        tabHost.addTab (tab_detail);
        WebView webView = (WebView) findViewById(R.id.webViewn5);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://watthaiapp.6te.net/watdowkanorng1.html");

        TabHost.TabSpec tab_map = tabHost.newTabSpec ("MAP");
        tab_map.setIndicator ("แผนที่");
        tab_map.setContent (R.id.map5);
        tabHost.addTab (tab_map);

        TabWidget tabWidget = tabHost.getTabWidget ();
        tabWidget.setEnabled (true);//endtabhost

        ImageButton btn_watdowkanorngmap = (ImageButton) findViewById(R.id.btn_watdowkanorngmap);
        ImageButton btn_watdowkanorngmaplocation = (ImageButton) findViewById(R.id.btn_watdowkanorngmaplocation);

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
        btn_watdowkanorngmaplocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String lat = "13.695921";
                String lng = "100.488491";
                String strUri = "http://maps.google.com/maps?q=loc:" + lat + "," + lng + " (" + "วัดดาวคนอง" + ")";
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
