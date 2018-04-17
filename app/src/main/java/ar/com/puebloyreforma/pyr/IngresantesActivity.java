package ar.com.puebloyreforma.pyr;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class IngresantesActivity  extends MyAppCompatActivity {


    private TabLayout tabLayout  ;
    private AppBarLayout appBarLayout ;
    private ViewPager viewPager ;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_informacion);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("ChildNavigationActivity");
        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout)findViewById(R.id.appbarid) ;
        viewPager  = (ViewPager) findViewById(R.id.ViewPager_info);
        ViewPagerPdfsAdapter adapter = new ViewPagerPdfsAdapter(getSupportFragmentManager());
        //agregar fragmentos
        adapter.AddFragment(new FragmentHorarios(),"Oficinas");
        adapter.AddFragment(new FragmentMesas(),"Plano facu");
        adapter.AddFragment(new FragmentHorarios(),"Biblioteca");
        //adapter.AddFragment(new FragmentReglamento(),"Fotocopiadora");

        //configuracion
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }}