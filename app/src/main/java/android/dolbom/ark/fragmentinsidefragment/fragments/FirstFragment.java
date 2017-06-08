package android.dolbom.ark.fragmentinsidefragment.fragments;


import android.content.res.Configuration;
import android.dolbom.ark.fragmentinsidefragment.R;
import android.dolbom.ark.fragmentinsidefragment.adapter.FragmentPagerAdapter;
import android.dolbom.ark.fragmentinsidefragment.adapter.ImageSlidePagerAdapter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by samsung on 2017-06-06.
 */

public class FirstFragment extends Fragment{

    private TabLayout innerFragmentTabLayout;
    private ViewPager innerFragmentViewPager;

    private FragmentPagerAdapter fragmentPagerAdapter;

    private ViewPager imgViewPager;

    private ImageSlidePagerAdapter imageSlidePagerAdapter;

    private Toolbar toolbar;
    private CollapsingToolbarLayout collapsingToolbarLayout;

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    private Button btnShowNavigationDrawer;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.firist_fragment, parent, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        toolbar = (Toolbar) view.findViewById(R.id.toolBar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(R.id.collapseToolbarLayout);
        collapsingToolbarLayout.setTitle("Hello");

        innerFragmentTabLayout = (TabLayout) view.findViewById(R.id.innerFragmentTabLayout);
        innerFragmentViewPager = (ViewPager) view.findViewById(R.id.innerFragmentViewPager);

        innerFragmentTabLayout.addTab(innerFragmentTabLayout.newTab().setText("1"));
        innerFragmentTabLayout.addTab(innerFragmentTabLayout.newTab().setText("2"));
        innerFragmentTabLayout.addTab(innerFragmentTabLayout.newTab().setText("3"));
        innerFragmentTabLayout.addTab(innerFragmentTabLayout.newTab().setText("4"));
        innerFragmentTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        fragmentPagerAdapter = new FragmentPagerAdapter(getChildFragmentManager(), innerFragmentTabLayout.getTabCount());
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
        imageSlidePagerAdapter = new ImageSlidePagerAdapter(getChildFragmentManager(), 4);
        imgViewPager.setAdapter(imageSlidePagerAdapter);

       // btnShowNavigationDrawer = (Button) view.findViewById(R.id.btnShowNavigationDrawer);
       // btnShowNavigationDrawer.setOnClickListener(onClickListener);

        drawerLayout = (DrawerLayout) view.findViewById(R.id.drawerLayout);
        actionBarDrawerToggle = setUpActionBarToggle();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        navigationView = (NavigationView) view.findViewById(R.id.navigationView);

    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnShowNavigationDrawer:
                    drawerLayout.openDrawer(GravityCompat.START);
                    break;
            }
        }
    };

    private ActionBarDrawerToggle setUpActionBarToggle(){
        return new ActionBarDrawerToggle(getActivity(), drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    }
}
