package com.chrisplus.universalcardreader;

import com.astuetz.PagerSlidingTabStrip;
import com.chrisplus.universalcardreader.adapters.TabAdapter;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewpager;

    private PagerSlidingTabStrip tabStrip;

    private TabAdapter adapter;

    private SystemBarTintManager tintManager;

    private Toolbar toolBar;

    private final ViewPager.OnPageChangeListener onPageChangeListener
            = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            switch (position) {
                case 0:
                    changeColor(getResources().getColor(R.color.color_card_info));
                    break;
                case 1:
                    changeColor(getResources().getColor(R.color.color_transaction));
                    break;
                case 2:
                    changeColor(getResources().getColor(R.color.color_log));
                    break;
                default:
                    changeColor(getResources().getColor(R.color.color_card_info));
                    break;
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager = (ViewPager) findViewById(R.id.viewpager);
        tabStrip = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        toolBar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolBar);
        tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);

        adapter = new TabAdapter(getSupportFragmentManager());

        viewpager.setAdapter(adapter);
        tabStrip.setViewPager(viewpager);
        tabStrip.setOnPageChangeListener(onPageChangeListener);

        changeColor(getResources().getColor(R.color.color_card_info));
    }

    private void changeColor(int newColor) {
        tabStrip.setBackgroundColor(newColor);
        tintManager.setTintColor(newColor);

        Drawable colorDrawable = new ColorDrawable(newColor);
        Drawable bottomDrawable = new ColorDrawable(
                getResources().getColor(android.R.color.transparent));
        LayerDrawable ld = new LayerDrawable(new Drawable[]{colorDrawable, bottomDrawable});
        if (getSupportActionBar() != null) {
            getSupportActionBar().setBackgroundDrawable(ld);
        }
    }
}
