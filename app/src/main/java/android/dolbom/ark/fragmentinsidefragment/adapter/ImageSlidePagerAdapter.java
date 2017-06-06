package android.dolbom.ark.fragmentinsidefragment.adapter;

import android.dolbom.ark.fragmentinsidefragment.fragments.inner_fragments.img_slide_fragments.FirstImageSlideFragment;
import android.dolbom.ark.fragmentinsidefragment.fragments.inner_fragments.img_slide_fragments.FourthImageSlideFragment;
import android.dolbom.ark.fragmentinsidefragment.fragments.inner_fragments.img_slide_fragments.SecondImageSlideFragment;
import android.dolbom.ark.fragmentinsidefragment.fragments.inner_fragments.img_slide_fragments.ThirdImageSlideFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by samsung on 2017-06-06.
 */

public class ImageSlidePagerAdapter extends FragmentStatePagerAdapter {

    private int imageSlideCount;

    public ImageSlidePagerAdapter(FragmentManager fragmentManager, int imageSlideCount){
        super(fragmentManager);
        this.imageSlideCount = imageSlideCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FirstImageSlideFragment firstImageSlideFragment = new FirstImageSlideFragment();
                return firstImageSlideFragment;
            case 1:
                SecondImageSlideFragment secondImageSlideFragment = new SecondImageSlideFragment();
                return secondImageSlideFragment;
            case 2:
                ThirdImageSlideFragment thirdImageSlideFragment = new ThirdImageSlideFragment();
                return thirdImageSlideFragment;
            case 3:
                FourthImageSlideFragment fourthImageSlideFragment = new FourthImageSlideFragment();
                return fourthImageSlideFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.imageSlideCount;
    }
}
