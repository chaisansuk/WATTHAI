package com.example.manit.appwatthai.indexactivity.page;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.manit.appwatthai.R;
import com.example.manit.appwatthai.indexactivity.map.MapsActivity;

public class WatwararmartayaphanthasarrararmActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watwararmartayaphanthasarrararm_layout);
        ImageButton back = (ImageButton) findViewById(R.id.back);
        ImageButton btn_location12 = (ImageButton) findViewById(R.id.btn_location12);

        WebView webView = (WebView) findViewById(R.id.webViewn12);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://watthaiapp.6te.net/watvoramatayaphan.html");

        //Go to location pagemap
        btn_location12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching Screen
                Intent i = new Intent(getApplicationContext(), WatwararmartayaphanthasarrararmActivity.class);
                startActivity(i);
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