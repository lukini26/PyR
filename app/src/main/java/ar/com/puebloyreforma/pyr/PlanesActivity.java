package ar.com.puebloyreforma.pyr;

import android.content.Intent;
import android.net.Uri;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class PlanesActivity extends MyAppCompatActivity {



    View view;

    Button sistemas, analista , quimica , mecanica , electrica , civil ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_planes) ;


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("ChildNavigationActivity");

            sistemas = findViewById(R.id.sistemas) ;
            sistemas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view1) {
                    String url = "https://firebasestorage.googleapis.com/v0/b/pueblo-y-reforma.appspot.com/o/ISI.pdf?alt=media&token=208552e0-b685-417b-a002-f62fe5553027";
                    Intent i = new Intent(Intent.ACTION_VIEW );
                    i.setData(Uri.parse(url));
                    startActivity(i);



                } } );


            analista = findViewById(R.id.analista) ;
             analista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                String url = "https://docs.google.com/uc?export=download&id=0BzI9Fwark4aiQXRGQXJyN0ItTHc";
                Intent i = new Intent(Intent.ACTION_VIEW );
                i.setData(Uri.parse(url));
                startActivity(i);



            } } );




            mecanica = findViewById(R.id.mecanica) ;
        mecanica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                String url = "https://firebasestorage.googleapis.com/v0/b/pueblo-y-reforma.appspot.com/o/IM.pdf?alt=media&token=a1d8aa9d-fa7d-4707-833c-9a406ed426d5";
                Intent i = new Intent(Intent.ACTION_VIEW );
                i.setData(Uri.parse(url));
                startActivity(i);



            } } );

        electrica = findViewById(R.id.electrica) ;
        electrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                String url = "https://firebasestorage.googleapis.com/v0/b/pueblo-y-reforma.appspot.com/o/IE.pdf?alt=media&token=aa4d0bae-b0eb-4944-9008-aecd8eb9c5e3";
                Intent i = new Intent(Intent.ACTION_VIEW );
                i.setData(Uri.parse(url));
                startActivity(i);



            } } );

        civil = findViewById(R.id.civil) ;
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                String url = "https://firebasestorage.googleapis.com/v0/b/pueblo-y-reforma.appspot.com/o/IC.pdf?alt=media&token=a70be070-5e9e-40d7-a6fc-dcc56a5ffafc";
                Intent i = new Intent(Intent.ACTION_VIEW );
                i.setData(Uri.parse(url));
                startActivity(i);



            } } );






        quimica = findViewById(R.id.quimica) ;
        quimica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                String url = "https://firebasestorage.googleapis.com/v0/b/pueblo-y-reforma.appspot.com/o/IQ.pdf?alt=media&token=f1f00e12-d412-4242-9669-6a480d51d0e3";
                Intent i = new Intent(Intent.ACTION_VIEW );
                i.setData(Uri.parse(url));
                startActivity(i);



            } } );



































        ;}}



