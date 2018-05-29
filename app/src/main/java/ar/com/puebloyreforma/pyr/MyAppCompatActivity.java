package ar.com.puebloyreforma.pyr;

import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;


public abstract class MyAppCompatActivity extends AppCompatActivity {





    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        CoordinatorLayout activityParentBase = (CoordinatorLayout) getLayoutInflater().inflate(R.layout.activity_navigation_drawer, null);
        RelativeLayout content = (RelativeLayout) activityParentBase.findViewById(R.id.content);
        setContentView(activityParentBase);
        getLayoutInflater().inflate(layoutResID, content, true);
        super.setContentView(activityParentBase);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Pueblo Y Reforma");
        setSupportActionBar(toolbar);



        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                MyAppCompatActivity.this, drawer, toolbar, R.string.open, R.string.close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {









            @Override
            public boolean onNavigationItemSelected(@NonNull final MenuItem item) { new Thread(new Runnable() {
                public void run() { int id = item.getItemId();

                    switch (id) {
                        case R.id.calendario:
                            //Toast.makeText(MyAppCompatActivity.this,"elegiste calendario ", Toast.LENGTH_SHORT).show();
                            Intent movef = new Intent (MyAppCompatActivity.this,CalendarActivity.class);
                            startActivity(movef);
                            break;
                        case R.id.sysacad:
                            Intent movefa = new Intent (MyAppCompatActivity.this,SysacadActivity.class);
                            startActivity(movefa);
                            break;
                        case R.id.aulas:
                            //Toast.makeText(MyAppCompatActivity.this, "elegiste ", Toast.LENGTH_SHORT).show();
                            Intent movefew = new Intent (MyAppCompatActivity.this,InformacionActivity.class);
                            startActivity(movefew);
                            break;
                        case R.id.contacto:
                            Intent tuvieja = new Intent (MyAppCompatActivity.this,ContactoActivity.class);
                            startActivity(tuvieja);
                            break;
                        case R.id.noticias:
                            //Toast.makeText(MainActivity.this, "El tac se la come", Toast.LENGTH_SHORT).show();
                            Intent hola = new Intent (MyAppCompatActivity.this,PermissionActivity.class);
                            startActivity(hola);
                            break;

                        case R.id.reglamento:
                            //Toast.makeText(MainActivity.this, "El tac se la come", Toast.LENGTH_SHORT).show();
                            Intent sobamela = new Intent (MyAppCompatActivity.this,PdfsActivity.class);
                            startActivity(sobamela);
                            break;


                        case R.id.planes:
                            //Toast.makeText(MainActivity.this, "El tac se la come", Toast.LENGTH_SHORT).show();
                            Intent sobamxla = new Intent (MyAppCompatActivity.this,PlanesActivity.class);
                            startActivity(sobamxla);
                            break;



                        case R.id.hora:
                            Toast.makeText(MyAppCompatActivity.this, "Proximamente...!", Toast.LENGTH_SHORT).show();
                            /*Intent soba4mxla = new Intent (MyAppCompatActivity.this,CustomscheActivity.class);
                            startActivity(soba4mxla);*/
                            break;


                    }  }
            }).start();



                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);

                return true;
            }
        });
    }


        }
