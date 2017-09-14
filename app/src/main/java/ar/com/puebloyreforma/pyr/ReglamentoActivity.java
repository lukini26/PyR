package ar.com.puebloyreforma.pyr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Target;

import com.github.barteksc.pdfviewer.PDFView;

public class ReglamentoActivity extends AppCompatActivity {
 PDFView pdfView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglamento);
        String target = getIntent().getStringExtra("TARGET");


        pdfView = (PDFView)findViewById(R.id.pdfView) ;
        pdfView.fromAsset( target +".pdf").load();

    }
}
