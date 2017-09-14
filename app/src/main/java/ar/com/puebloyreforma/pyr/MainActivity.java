package ar.com.puebloyreforma.pyr;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessaging;
import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    String arrayName[] = {"Calendario" ,
                            "Sysacad" ,
                            "Reglamento",
                            "frepi" ,
                            "caro" ,
                            "galaxia" ,
                            "cami"
                                } ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseMessaging.getInstance().subscribeToTopic("PYR_NOT");
        CircleMenu circleMenu = (CircleMenu)findViewById(R.id.circle_menu) ;
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.galaxia ,R.drawable.grepi)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.cami)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.facu)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.rafa)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.li)
                .addSubMenu(Color.parseColor("#1a237e"),R.drawable.caro)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.facebook)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        //Toast.makeText(MainActivity.this, "elegiste "+ arrayName[index],Toast.LENGTH_SHORT).show();
                        //Intent movef = new Intent (MainActivity.this,CalendarActivity.class);
                        //startActivity(movef);

                        switch (index) {
                            case 0:
                                Toast.makeText(MainActivity.this,"elegiste "+ arrayName[index], Toast.LENGTH_SHORT).show();
                                Intent movef = new Intent (MainActivity.this,CalendarActivity.class);
                                startActivity(movef);
                                break;
                            case 1:
                                Toast.makeText(MainActivity.this, "elegiste "+ arrayName[index], Toast.LENGTH_SHORT).show();
                                Intent movefa = new Intent (MainActivity.this,SysacadActivity.class);
                                startActivity(movefa);
                                break;
                            case 2:
                                Toast.makeText(MainActivity.this, "elegiste "+ arrayName[index], Toast.LENGTH_SHORT).show();
                                Intent movefew = new Intent (MainActivity.this,PdfsActivity.class);
                                startActivity(movefew);
                                break;
                            case 3:
                                Intent tuvieja = new Intent (MainActivity.this,ContactoActivity.class);
                                startActivity(tuvieja);
                                break;
                            case 4:
                                //Toast.makeText(MainActivity.this, "El tac se la come", Toast.LENGTH_SHORT).show();
                                Intent hola = new Intent (MainActivity.this,PermissionActivity.class);
                                startActivity(hola);
                                break;
                        }





                    }
                });



        } ;

}
