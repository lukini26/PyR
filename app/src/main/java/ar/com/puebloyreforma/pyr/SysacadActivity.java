package ar.com.puebloyreforma.pyr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SysacadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sysacad);

        WebView webView = new WebView(this) ;
        setContentView(webView);
        webView.loadUrl("http://www.alumnos.frro.utn.edu.ar/");
    }
}
