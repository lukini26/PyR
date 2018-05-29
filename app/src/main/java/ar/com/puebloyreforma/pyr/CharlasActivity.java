package ar.com.puebloyreforma.pyr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CharlasActivity extends AppCompatActivity {





    @Override
    public void onBackPressed()
    {

        // Go to the previous web page.
    }







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charlas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("ChildNavigationActivity");



        WebView webView = (WebView) findViewById(R.id.webview);

        webView.setWebViewClient(new WebViewClient());
        webView .getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView .getSettings().setDomStorageEnabled(true);

        webView.loadUrl("https://docs.google.com/forms/d/1c505kLK1XJdPHJXXGQq55WmVrd6RtZ9r22Q9JqLbX5Q/");

    }





}
