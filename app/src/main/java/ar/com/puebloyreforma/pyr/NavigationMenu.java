package ar.com.puebloyreforma.pyr;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class NavigationMenu extends AppCompatActivity {
    private DrawerLayout mDL ;
    private ActionBarDrawerToggle mT  ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_menu);
        mDL = (DrawerLayout) findViewById(R.id.drawer) ;
        mT = new ActionBarDrawerToggle(this  , mDL ,R.string.open , R.string.close) ;
        mDL.addDrawerListener(mT);
        mT.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mT.onOptionsItemSelected(item)){
            return true ;
        }
        return super.onOptionsItemSelected(item);
    }
}
