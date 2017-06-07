package android.dolbom.ark.fragmentinsidefragment.adapter;


import android.dolbom.ark.fragmentinsidefragment.fragments.FirstFragment;
import android.dolbom.ark.fragmentinsidefragment.fragments.FourthFragment;
import android.dolbom.ark.fragmentinsidefragment.fragments.SecondFragment;
import android.dolbom.ark.fragmentinsidefragment.fragments.ThirdFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by samsung on 2017-06-06.
 */

public class ToolBarTabPagerAdapter extends FragmentStatePagerAdapter{

    private int tabCount;

    public ToolBarTabPagerAdapter(FragmentManager fragmentManager, int tabCount){
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
                return new FirstFragment();

            case 1:
                return new SecondFragment();

            case 2:
                return new ThirdFragment();

            case 3:
                return new FourthFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
