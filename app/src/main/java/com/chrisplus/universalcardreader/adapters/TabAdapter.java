package com.chrisplus.universalcardreader.adapters;

import com.chrisplus.universalcardreader.fragments.BalanceFragment;
import com.chrisplus.universalcardreader.fragments.CardInfoFragment;
import com.chrisplus.universalcardreader.fragments.LogFragment;

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
        fragments.add(new CardInfoFragment());
        fragments.add(new BalanceFragment());
        fragments.add(new LogFragment());
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
