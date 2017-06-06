package android.dolbom.ark.fragmentinsidefragment.fragments;


import android.dolbom.ark.fragmentinsidefragment.R;
import android.dolbom.ark.fragmentinsidefragment.adapter.FragmentPagerAdapter;
import android.dolbom.ark.fragmentinsidefragment.adapter.ImageSlidePagerAdapter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by samsung on 2017-06-06.
 */

public class FirstFragment extends Fragment{

    private TabLayout innerFragmentTabLayout;
    private ViewPager innerFragmentViewPager;

    private FragmentPagerAdapter fragmentPagerAdapter;

    private ViewPager imgViewPager;

    private ImageSlidePagerAdapter imageSlidePagerAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.firist_fragment, parent, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        innerFragmentTabLayout = (TabLayout) view.findViewById(R.id.innerFragmentTabLayout);
        innerFragmentViewPager = (ViewPager) view.findViewById(R.id.innerFragmentViewPager);

        innerFragmentTabLayout.addTab(innerFragmentTabLayout.newTab().setText("1"));
        innerFragmentTabLayout.addTab(innerFragmentTabLayout.newTab().setText("2"));
        innerFragmentTabLayout.addTab(innerFragmentTabLayout.newTab().setText("3"));
        innerFragmentTabLayout.addTab(innerFragmentTabLayout.newTab().setText("4"));
        innerFragmentTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        fragmentPagerAdapter = new FragmentPagerAdapter(getActivity().getSupportFragmentManager(), innerFragmentTabLayout.getTabCount());
        innerFragmentViewPager.setAdapter(fragmentPagerAdapter);
        innerFragmentViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(innerFragmentTabLayout));

        innerFragmentTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                innerFragmentViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        imgViewPager = (ViewPager) view.findViewById(R.id.imgViewPager);
        imageSlidePagerAdapter = new ImageSlidePagerAdapter(getActivity().getSupportFragmentManager(), 4);
        imgViewPager.setAdapter(imageSlidePagerAdapter);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
}
