package ar.com.puebloyreforma.pyr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class PdfsActivity extends MyAppCompatActivity {
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String target ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_pdfs);

            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("ChildNavigationActivity");






        Button  reg ;

        reg = (Button)this.findViewById(R.id.reg);

        final String pdfs[] = {"tm" ,
                "tt" ,
                "tn",
                "Ord1549"
        } ;


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setTarget(pdfs[3]);
                Intent hola = new Intent (PdfsActivity.this,ReglamentoActivity.class);
                hola.putExtra("TARGET", getTarget());
                startActivity(hola);
            }
        });





    }





}
