package ar.com.puebloyreforma.pyr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PdfsActivity extends AppCompatActivity {
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
        Button tt , tm , tn, reg ;
        tt = (Button)this.findViewById(R.id.tt);
        tm = (Button)this.findViewById(R.id.tm);
        tn = (Button)this.findViewById(R.id.tn);
        reg = (Button)this.findViewById(R.id.reg);

        final String pdfs[] = {"tm" ,
                "tt" ,
                "tn",
                "Ord1549"
        } ;

        tm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setTarget(pdfs[0]);
                Intent hola = new Intent (PdfsActivity.this,ReglamentoActivity.class);
                hola.putExtra("TARGET", getTarget());
                startActivity(hola);
            }
        });



        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setTarget(pdfs[1]);
                Intent hola = new Intent (PdfsActivity.this,ReglamentoActivity.class);
                hola.putExtra("TARGET", getTarget());
                startActivity(hola);
            }
        });

        tn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setTarget(pdfs[2]);
                Intent hola = new Intent (PdfsActivity.this,ReglamentoActivity.class);
                hola.putExtra("TARGET", getTarget());
                startActivity(hola);
            }
        });
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
