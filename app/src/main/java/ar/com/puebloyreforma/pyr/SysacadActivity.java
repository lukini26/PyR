package ar.com.puebloyreforma.pyr;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SysacadActivity extends MyAppCompatActivity {




    @Override
    public void onBackPressed()
    {

        // Go to the previous web page.
    }







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customsche);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("ChildNavigationActivity");



        WebView webView = (WebView) findViewById(R.id.webview);

        webView.setWebViewClient(new WebViewClient());
        webView .getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView .getSettings().setDomStorageEnabled(true);

        webView.loadUrl("https://alumnos.frro.utn.edu.ar/");

    }








}
