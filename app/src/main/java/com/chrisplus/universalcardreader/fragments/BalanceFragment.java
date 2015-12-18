package com.chrisplus.universalcardreader.fragments;

import com.chrisplus.universalcardreader.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by chrisplus on 18/12/15.
 */
public class BalanceFragment extends Fragment {

    private ImageView noBalanceImageView;
    private TextView noBalanceTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_guide, container, false);
        noBalanceImageView = (ImageView) view.findViewById(R.id.guide_image);
        noBalanceTextView = (TextView) view.findViewById(R.id.guide_text);

        noBalanceImageView.setImageResource(R.drawable.ic_transaction);
        noBalanceTextView.setText(R.string.guide_no_transaction);
        return view;
    }
}
