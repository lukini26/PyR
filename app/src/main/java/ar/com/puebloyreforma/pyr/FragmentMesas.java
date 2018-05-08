package ar.com.puebloyreforma.pyr;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;




/**
 * Created by lucas on 14/01/2018.
 */

public class FragmentMesas  extends android.support.v4.app.Fragment implements View.OnClickListener {



    public String[] dia={ "lunes" , "martes" ,"mierco " ,"jueves" , "viernes" ,"asd"  } ;
    String finale = "" ;
     String[] direc ={ "lunes" , "martes" ,"mierco " ,"jueves" , "viernes", "asd"   } ;
     //esto esta asi porque soy un villero y copipasteo para inicilizar un array pero me la re banco vieja

    private FirebaseDatabase database;
    DatabaseReference myRef;


    View view;
    public FragmentMesas() { }












    @Override
    public void onClick(final View v) {
        new Thread(new Runnable() {
            public void run() {



        switch (v.getId()) {

            case R.id.lunes:
                finale = direc[0] ;
                break;

            case R.id.martes:
                finale = direc[1] ;
                break;

            case R.id.mierco:
                finale = direc[2] ;
                break;



            case R.id.jueves:
                finale = direc[3] ;
                break;



            case R.id.viernes:
                finale = direc[4] ;
                break;

            case R.id.asd:
                finale = direc[5] ;
                break;

            default:
                break;
        }  }
        }).start();


        String url = finale;
        Intent i = new Intent(Intent.ACTION_VIEW );
        i.setData(Uri.parse(url));
        try {  startActivity(i);
           
        } catch(ActivityNotFoundException activityNotFound) {

            Toast.makeText(getActivity(), "Aun no esta disponible desde bedelia",
                    Toast.LENGTH_LONG).show();
        }
      



    }






    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.mesas_fragment , container, false) ;
        Button lunes, martes, mierco, jueves, viernes, asd;
        lunes = (Button)view.findViewById(R.id.lunes);
        lunes.setOnClickListener(this);
        martes = (Button)view.findViewById(R.id.martes);
        martes.setOnClickListener(this);
        mierco = (Button)view.findViewById(R.id.mierco);
        mierco.setOnClickListener(this);
        jueves = (Button)view.findViewById(R.id.jueves);
        jueves.setOnClickListener(this);
        viernes = (Button)view.findViewById(R.id.viernes) ;
             viernes.setOnClickListener(this);

        asd = (Button)view.findViewById(R.id.asd) ;
        asd.setOnClickListener(this);






        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Pdfs") ;

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange( DataSnapshot dataSnapshot) {
                downloadPdf(dataSnapshot);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        }) ;



        return view;

}

    private void downloadPdf(final DataSnapshot dataSnapshot) {
        new Thread(new Runnable() {
            public void run() {



                for (int u=0; u<6; u++){
        String downlo   = String.valueOf(dataSnapshot.child(dia[u]).child("url").getValue())  ;
            direc[u]= downlo;}

            }
        }).start();
    }


    }




