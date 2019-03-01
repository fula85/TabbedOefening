package be.ehb.tabbedoefening.utilities;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class BillTabAdapter extends FragmentPagerAdapter {


    public BillTabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "SPLIT IT";
            case 1: return "ABOUT";
        }
        return "amount"+position;
    }

    @Override
    public Fragment getItem(int i) {
        //TODO eigen fragmenten in tabs
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
