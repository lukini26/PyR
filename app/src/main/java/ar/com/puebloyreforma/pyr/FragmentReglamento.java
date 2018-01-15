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
 * Created by lucas on 14/01/2018.
 */

public class FragmentReglamento extends android.support.v4.app.Fragment {
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String target ;

    View view;
    public FragmentReglamento() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.reglamento_fragment , container, false) ;
        Button regla ;
        regla = (Button)view.findViewById(R.id.regla)  ;






        regla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setTarget("Ord1549");
                Intent hola = new Intent ((getActivity()),ReglamentoActivity.class);
                hola.putExtra("TARGET", getTarget());
                startActivity(hola);
            }
        });








        return view;


}}
