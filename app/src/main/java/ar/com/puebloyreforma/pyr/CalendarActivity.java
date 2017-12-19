package ar.com.puebloyreforma.pyr;


import java.util.Calendar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class CalendarActivity extends MyAppCompatActivity {
    ViewPager viewPager ;
    ViewPagerAdapter adapter ;
        private  Integer[] images = {R.drawable.ref ,
                 R.drawable.marzo17, R.drawable.abril17 , R.drawable.mayo17
                ,R.drawable.junio17 , R.drawable.julio17 ,R.drawable.agosto17
                ,R.drawable.septiembre17 , R.drawable.octubre17 , R.drawable.noviembre17
                ,R.drawable.diciembre17 ,R.drawable.febrero18 , R.drawable.marzo18

        };
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("ChildNavigationActivity");
       viewPager = (ViewPager)findViewById(R.id.ViewPager);
        adapter = new ViewPagerAdapter(CalendarActivity.this,images);
        viewPager.setAdapter(adapter) ;
        Calendar calendar = Calendar.getInstance() ;
        int thisMonth = calendar.get(Calendar.MONTH);
        viewPager.setCurrentItem(thisMonth-1);
    }
}
