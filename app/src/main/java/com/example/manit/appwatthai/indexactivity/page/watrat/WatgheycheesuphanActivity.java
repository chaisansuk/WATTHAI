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


public class WatgheycheesuphanActivity extends Activity{
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watgheycheesuphan_layout);
        ImageButton back = (ImageButton) findViewById(R.id.back);

        //tabhost
        TabHost tabHost = (TabHost) this.findViewById (R.id.tabhost);
        tabHost.setup ( );

        TabHost.TabSpec tab_detail = tabHost.newTabSpec ("DEATAIL");
        tab_detail.setIndicator ("ความเป็นมา");
        tab_detail.setContent (R.id.detail0);
        tabHost.addTab (tab_detail);
        WebView webView = (WebView) findViewById(R.id.webViewn0);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://watthaiapp.6te.net/watgheysresuphan1.html");

        TabHost.TabSpec tab_map = tabHost.newTabSpec ("MAP");
        tab_map.setIndicator ("แผนที่");
        tab_map.setContent (R.id.map0);
        tabHost.addTab (tab_map);

        TabWidget tabWidget = tabHost.getTabWidget ();
        tabWidget.setEnabled (true);//endtabhost

        ImageButton btn_watgheycheesuphanmap = (ImageButton) findViewById(R.id.btn_watgheycheesuphanmap);
        ImageButton btn_watgheycheesuphanmaplocation = (ImageButton) findViewById(R.id.btn_watgheycheesuphanmaplocation);

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

        btn_watgheycheesuphanmaplocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lat = "13.719178";
                String lng = "100.485974";
                String strUri = "http://maps.google.com/maps?q=loc:" + lat + "," + lng + " (" + "วัดใหญ่ศรีสุพรรณ" + ")";
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
