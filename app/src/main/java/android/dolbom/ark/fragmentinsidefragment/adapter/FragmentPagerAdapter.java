package android.dolbom.ark.fragmentinsidefragment.adapter;

import android.dolbom.ark.fragmentinsidefragment.fragments.inner_fragments.FirstInnerFragment;
import android.dolbom.ark.fragmentinsidefragment.fragments.inner_fragments.FourthInnerFragment;
import android.dolbom.ark.fragmentinsidefragment.fragments.inner_fragments.SecondInnerFragment;
import android.dolbom.ark.fragmentinsidefragment.fragments.inner_fragments.ThirdInnerFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by samsung on 2017-06-06.
 */

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public FragmentPagerAdapter(FragmentManager fragmentManager, int tabCount){
        super(fragmentManager);
        this.tabCount = tabCount;
    }
    @Override
    public Fragment getItem(int position) {
        if(position > tabCount){
            position = 0;
        }
        switch (position){
            case 0:
                return new FirstInnerFragment();

            case 1:
                return new SecondInnerFragment();

            case 2:
                return new ThirdInnerFragment();

            case 3:
                return new FourthInnerFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.tabCount;
    }
}
