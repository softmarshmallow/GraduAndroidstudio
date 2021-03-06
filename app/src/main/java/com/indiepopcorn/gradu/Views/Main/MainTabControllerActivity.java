package com.indiepopcorn.gradu.Views.Main;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Message;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.indiepopcorn.gradu.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import devlight.io.library.ntb.NavigationTabBar;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainTabControllerActivity extends AppCompatActivity
{
        public static MainTabControllerActivity instance;
        
        @BindView(R.id.pager)
        public ViewPager viewPager;
        
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                instance = this;
                
                
                setTheme(R.style.AppTheme_NoActionBar);
                setContentView(R.layout.activity_main_tab_controller);
                ButterKnife.bind(this);
                
                
                InitTabBar();
        }
      
        private void InitTabBar() {
                PagerAdapter adapter = new MainPagerAdapter(getSupportFragmentManager());
                viewPager.setAdapter(adapter);
                
                final String[] colors = getResources().getStringArray(R.array.default_preview);
                
                final NavigationTabBar navigationTabBar = (NavigationTabBar) findViewById(
                        R.id.ntb_horizontal);
                
                final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
                models.add(
                        new NavigationTabBar.Model.Builder(
                                getResources().getDrawable(R.drawable.icon),
                                Color.parseColor(colors[0]))
                                .title("Home")
                                .badgeTitle("New")
                                .build()
                );
                models.add(
                        new NavigationTabBar.Model.Builder(
                                getResources().getDrawable(R.drawable.icon),
                                Color.parseColor(colors[0]))
                                
                                .title("Search")
                                // .badgeTitle("with")
                                .build()
                );
                models.add(
                        
                        new NavigationTabBar.Model.Builder(
                                getResources().getDrawable(R.drawable.icon),
                                Color.parseColor(colors[0]))
                                .title("프로필")
                                // .badgeTitle("state")
                                .build()
                );
                models.add(
                        new NavigationTabBar.Model.Builder(
                                getResources().getDrawable(R.drawable.icon),
                                Color.parseColor(colors[0]))
//                        .selectedIcon(getResources().getDrawable(R.drawable.ic_eighth))
                                .title("더보기")
                                // .badgeTitle("icon")
                                .build()
                );
                
                
                navigationTabBar.setModels(models);
                navigationTabBar.setViewPager(viewPager);
                navigationTabBar.setIsBadged(true);
                navigationTabBar.setBehaviorEnabled(true);
                
                
                navigationTabBar.setOnPageChangeListener(new ViewPager.OnPageChangeListener()
                {
                        @Override
                        public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {
                        
                        }
                        
                        @Override
                        public void onPageSelected(final int position) {
                                navigationTabBar.getModels()
                                        .get(position)
                                        .hideBadge();
                        }
                        
                        @Override
                        public void onPageScrollStateChanged(final int state) {
                        
                        }
                });
                
                navigationTabBar.postDelayed(new Runnable()
                {
                        @Override
                        public void run() {
                                for (int i = 0; i < navigationTabBar.getModels()
                                        .size(); i++) {
                                        final NavigationTabBar.Model model = navigationTabBar.getModels()
                                                .get(i);
                                        navigationTabBar.postDelayed(new Runnable()
                                        {
                                                @Override
                                                public void run() {
                                                        model.showBadge();
                                                }
                                        }, i * 100);
                                }
                        }
                }, 500);
        }
        
        public void FocusOnTab(MainTabsType tabType) {
                viewPager.setCurrentItem((tabType.getValue()), true);
        }
        
        
        @Override
        protected void attachBaseContext(Context newBase) {
                super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
        }
        
        
        
        void SetTabIconAsSelected(TabLayout.Tab tab) {
                int tabIconColor = (ContextCompat.getColor(getApplicationContext(),
                        R.color.tabUnselectedIconColor));
                tab.getIcon()
                        .setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
        }
        
        
        void SetTabIconAsUnSelected(TabLayout.Tab tab) {
                int tabIconColor = (ContextCompat.getColor(getApplicationContext(),
                        R.color.tabUnselectedIconColor));
                tab.getIcon()
                        .setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
        }
        
        
        //endregion
        
        
        //region confirm exit app
        
        
        @Override
        public void onBackPressed() {
                AskIfQuitApp();
        }
        
        void AskIfQuitApp(){
                AlertDialog alert = new AlertDialog.Builder(this).create();
                alert.setTitle(getString(R.string.quit_app_title));
                alert.setMessage(getString(R.string.quit_app_content));
//                alert.setCancelMessage(new Message().setR.string.quit_app_cancel);
                alert.setOnCancelListener(new DialogInterface.OnCancelListener() {
                                @Override
                                public void onCancel(DialogInterface dialogInterface) {
                                        dialogInterface.cancel();
                                }
                        });
                        
                        /*.setConfirmText(getString(R.string.quit_app_confirm))
                        .setConfirmClickListener (new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                        sDialog.dismissWithAnimation();
                                        finish();
                                }
                        })*/
                alert.show();
        }
        
        @Override
        public void onActivityResult(int requestCode, int resultCode, Intent data) {

        }

}
