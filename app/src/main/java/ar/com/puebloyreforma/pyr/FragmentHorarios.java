package ar.com.puebloyreforma.pyr;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by lucas on 13/01/2018.
 */

public class FragmentHorarios extends android.support.v4.app.Fragment {
    View view;
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String target ;
    Button tt, tm , tn ;

    final String pdfs[] = {"tm" ,
            "tt" ,
            "tn",

    } ;



    public FragmentHorarios() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.horarios_fragment , container, false) ;




        tt = (Button)view.findViewById(R.id.ttn);
        tm = (Button)view.findViewById(R.id.tmn);
        tn = (Button)view.findViewById(R.id.tnn);



        tm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setTarget(pdfs[0]);
                Intent hola = new Intent ((getActivity()),ReglamentoActivity.class);
                hola.putExtra("TARGET", getTarget());
                startActivity(hola);
            }
        });



        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setTarget(pdfs[1]);
                Intent hola = new Intent ((getActivity()),ReglamentoActivity.class);
                hola.putExtra("TARGET", getTarget());
                startActivity(hola);
            }
        });

        tn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setTarget(pdfs[2]);
                Intent hola = new Intent (getActivity(),ReglamentoActivity.class);
                hola.putExtra("TARGET", getTarget());
                startActivity(hola);
            }
        });








        return view;

    }












}
