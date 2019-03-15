package com.kishan00747.saviour;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    ViewPager mViewPager;
    PagerAdapter pagerAdapter;
    TabLayout tabLayout;

    private static final int NUM_PAGES = 2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new ScreenSlideAdapter(getSupportFragmentManager());
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(mViewPager);

    }

    private class ScreenSlideAdapter extends FragmentPagerAdapter
    {
        private String[] tabTitles = new String[]{"General", "Personal"};
        // overriding getPageTitle()
        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];
        }

        public ScreenSlideAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position)
            {
                case 0:
                {
                    return new SignUp1();
                }
                case 1:
                {
                    return new SignUp2();
                }
                default:
                {
                    return new SignUp1();
                }
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
