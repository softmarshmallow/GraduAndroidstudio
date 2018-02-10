package com.indiepopcorn.gradu.Views.Main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

public class MainPagerAdapter extends FragmentStatePagerAdapter
{

        private static final String TAG = "MainPagerAdapter";

        public MainPagerAdapter(FragmentManager fm) {
                super(fm);
        }


        @Override
        public int getCount() {
                return MainTabsType.values().length;
        }
        
        Fragment homeTabFragment = new Fragment();
        Fragment searchTabFragment = new  Fragment();
        Fragment mypageFragment = new  Fragment();
        Fragment moreTabFragment = new  Fragment();


        @Override
        public Fragment getItem(int position) {
                MainTabsType tabType = MainTabsType.MainTabsPositionMapping.get(position);
                Log.d(TAG, "tab == null : " + (tabType  == null));
                Log.d(TAG, "position : " + position + ", tab : " + tabType);


                switch (tabType)
                {
                        case Home:
                                     return homeTabFragment;
                        case Search:
                                return searchTabFragment;
                        case MyPage:
                                return mypageFragment;
                        case More:
                                return moreTabFragment;
                        default:
                                return null;
                }
        }


}
