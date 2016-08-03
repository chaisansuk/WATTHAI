package com.example.manit.appwatthai.indexactivity.page.phaaramluang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.manit.appwatthai.R;
import com.example.manit.appwatthai.indexactivity.map.MapsActivity;

/**
 * Created by Manit on 6/3/2559.
 */
public class WatphonimitsatitmaharsremararmActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watphonimitsatitmaharsremararm_layout);
        ImageButton back = (ImageButton) findViewById(R.id.back);

        WebView webView = (WebView) findViewById(R.id.webViewn20);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://watthaiapp.6te.net/watphonimit.html");

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
