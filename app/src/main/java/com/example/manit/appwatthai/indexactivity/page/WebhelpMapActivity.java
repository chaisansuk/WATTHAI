package com.example.manit.appwatthai.indexactivity.page;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;


import com.example.manit.appwatthai.R;

public class WebhelpMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_help_map);
        ImageButton back = (ImageButton) findViewById(R.id.back);

        WebView webView = (WebView) findViewById(R.id.webViewhelp);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://watthaiapp.6te.net/map.html");

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
