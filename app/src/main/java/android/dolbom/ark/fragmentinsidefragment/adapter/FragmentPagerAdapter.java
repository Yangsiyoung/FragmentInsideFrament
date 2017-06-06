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
        switch (position){
            case 0:
                FirstInnerFragment firstInnerFragment = new FirstInnerFragment();
                return firstInnerFragment;

            case 1:
                SecondInnerFragment secondInnerFragment = new SecondInnerFragment();
                return secondInnerFragment;

            case 2:
                ThirdInnerFragment thirdInnerFragment = new ThirdInnerFragment();
                return thirdInnerFragment;

            case 3:
                FourthInnerFragment fourthInnerFragment = new FourthInnerFragment();
                return fourthInnerFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.tabCount;
    }
}
