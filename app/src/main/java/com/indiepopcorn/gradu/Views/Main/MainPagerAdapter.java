package com.indiepopcorn.gradu.Views.Main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.indiepopcorn.gradu.Views.HomeTab.HomeTabFragment;
import com.indiepopcorn.gradu.Views.MoreTab.MoreTabFragment;
import com.indiepopcorn.gradu.Views.MypageTab.MypageTabFragment;
import com.indiepopcorn.gradu.Views.SearchTab.SearchTabFragment;

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
        
        Fragment homeTabFragment = new HomeTabFragment();
        Fragment searchTabFragment = new SearchTabFragment();
        Fragment mypageFragment = new MypageTabFragment();
        Fragment moreTabFragment = new MoreTabFragment();


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
