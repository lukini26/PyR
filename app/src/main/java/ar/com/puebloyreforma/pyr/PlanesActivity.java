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
                    String url = "http://puebloyreforma.com.ar/academicas/planes/ISI.pdf";
                    Intent i = new Intent(Intent.ACTION_VIEW );
                    i.setData(Uri.parse(url));
                    startActivity(i);



                } } );


            analista = findViewById(R.id.analista) ;
             analista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                String url = "http://puebloyreforma.com.ar/academicas/planes/ISI-AUS.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW );
                i.setData(Uri.parse(url));
                startActivity(i);



            } } );




            mecanica = findViewById(R.id.mecanica) ;
        mecanica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                String url = "http://puebloyreforma.com.ar/academicas/planes/IM.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW );
                i.setData(Uri.parse(url));
                startActivity(i);



            } } );

        electrica = findViewById(R.id.electrica) ;
        electrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                String url = "http://puebloyreforma.com.ar/academicas/planes/IE.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW );
                i.setData(Uri.parse(url));
                startActivity(i);



            } } );

        civil = findViewById(R.id.civil) ;
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                String url = "http://puebloyreforma.com.ar/academicas/planes/IC.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW );
                i.setData(Uri.parse(url));
                startActivity(i);



            } } );






        quimica = findViewById(R.id.quimica) ;
        quimica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                String url = "http://puebloyreforma.com.ar/academicas/planes/IQ.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW );
                i.setData(Uri.parse(url));
                startActivity(i);



            } } );



































        ;}}



