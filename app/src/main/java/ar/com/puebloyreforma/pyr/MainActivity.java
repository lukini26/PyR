package ar.com.puebloyreforma.pyr;

import android.content.Intent;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.google.firebase.messaging.FirebaseMessaging;




public class MainActivity extends AppCompatActivity {



    private static int SPLASH_TIME_OUT  = 2000 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseMessaging.getInstance().subscribeToTopic("PYR_NOT");
        setContentView(R.layout.activity_main);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent hola = new Intent(MainActivity.this, PermissionActivity.class);
                    startActivity(hola);
                    finish();
                }
                }  ,SPLASH_TIME_OUT) ; } }
