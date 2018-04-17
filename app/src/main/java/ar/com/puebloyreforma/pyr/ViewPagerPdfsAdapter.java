package ar.com.puebloyreforma.pyr;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 14/01/2018.
 */

public class ViewPagerPdfsAdapter extends FragmentPagerAdapter  {

    private final List<android.support.v4.app.Fragment> fragmentList = new ArrayList<>() ;
    private final List<String> FragmeListTitles = new ArrayList<>() ;




    public ViewPagerPdfsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return FragmeListTitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return FragmeListTitles.get(position);
    }

    public void AddFragment (android.support.v4.app.Fragment fragment , String Title){
        fragmentList.add(fragment) ;
        FragmeListTitles.add(Title) ;



    }
}
