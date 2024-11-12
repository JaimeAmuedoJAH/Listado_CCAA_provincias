package com.jah.listado_ccaa_provincias;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class wikipediaProvincia extends AppCompatActivity {

    String url;
    WebView wvWikipedia;
    Bundle bundle;
    WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_wikipedia_provincia);
        initComponents();

        //Cargamos la pagina web.
        wvWikipedia.loadUrl(url);
    }
    //Iniciamos componentes.
    private void initComponents() {
        bundle =getIntent().getExtras();
        assert bundle != null;
        url = bundle.getString("url");

        wvWikipedia = findViewById(R.id.wvWikipedia);
        wvWikipedia.setWebViewClient(new WebViewClient());
        wvWikipedia.setWebChromeClient(new WebChromeClient());

        webSettings = wvWikipedia.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}