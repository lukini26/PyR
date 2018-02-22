package ar.com.puebloyreforma.pyr;


import java.util.Calendar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class CalendarActivity extends MyAppCompatActivity {
    ViewPager viewPager ;
    ViewPagerAdapter adapter ;
        private  Integer[] images = {R.drawable.referencias01 ,
                 R.drawable.marzo180101, R.drawable.abril18 , R.drawable.mayo1801
                ,R.drawable.junio1801 , R.drawable.julio01 ,R.drawable.agosto180101
                ,R.drawable.septiembre1801 , R.drawable.octubre1801 , R.drawable.noviembre01
                ,R.drawable.diciembre1801 ,R.drawable.febrero1901 , R.drawable.marzo1901

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
