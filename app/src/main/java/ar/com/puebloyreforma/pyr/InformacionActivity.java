package ar.com.puebloyreforma.pyr;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Adapter;

public class InformacionActivity extends MyAppCompatActivity {


    private TabLayout tabLayout  ;
    private AppBarLayout appBarLayout ;
    private ViewPager viewPager ;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_informacion);
        new Thread(new Runnable() {
            public void run() {


                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("ChildNavigationActivity");
        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout)findViewById(R.id.appbarid) ;
        viewPager  = (ViewPager) findViewById(R.id.ViewPager_info);
        ViewPagerPdfsAdapter adapter = new ViewPagerPdfsAdapter(getSupportFragmentManager());
        //agregar fragmentos
        adapter.AddFragment(new FragmentHorarios(),"Aulas");
        adapter.AddFragment(new FragmentMesas(),"Mesas");
        //adapter.AddFragment(new FragmentReglamento(),"reglamento");

        //configuracion
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
            }
        }).start();


    }}
