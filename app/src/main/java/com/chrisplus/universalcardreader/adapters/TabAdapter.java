package com.chrisplus.universalcardreader.adapters;

import com.chrisplus.universalcardreader.fragments.GuideFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chrisplus on 18/12/15.
 */
public class TabAdapter extends FragmentPagerAdapter {

    public static final int COUNT = 3;
    public static final String[] FRAGMENT_TITLES = {"CARD INFO", "Transactions", "LOGS"};


    private List<Fragment> fragments;

    public TabAdapter(FragmentManager fm) {
        super(fm);
        initFragments();
    }

    @Override
    public Fragment getItem(int position) {
        if (fragments != null) {
            return fragments.get(position);
        }
        return null;
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return FRAGMENT_TITLES[position];
    }


    private void initFragments() {
        fragments = new ArrayList<>();
        fragments.add(GuideFragment.newInstance(GuideFragment.GuideFragmentType.NO_CARD_DETECT));
        fragments.add(GuideFragment.newInstance(GuideFragment.GuideFragmentType.NO_BALANCE_READ));
        fragments.add(GuideFragment.newInstance(GuideFragment.GuideFragmentType.NO_LOG_RECORD));
    }

    private Fragment getCardInfoFragment() {
        if (fragments != null) {
            return fragments.get(0);
        }
        return null;
    }

    private Fragment getBalanceFragment() {
        if (fragments != null) {
            return fragments.get(1);
        }
        return null;
    }

    private Fragment getLogFragment() {
        if (fragments != null) {
            return fragments.get(2);
        }
        return null;
    }
}
