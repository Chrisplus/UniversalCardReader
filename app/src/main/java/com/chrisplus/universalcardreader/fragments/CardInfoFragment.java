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
public class CardInfoFragment extends Fragment {
    private ImageView noCardImageView;
    private TextView noCardTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_guide, container, false);
        noCardImageView = (ImageView) view.findViewById(R.id.guide_image);
        noCardTextView = (TextView) view.findViewById(R.id.guide_text);

        noCardImageView.setImageResource(R.drawable.ic_card);
        noCardTextView.setText(R.string.guide_no_card);
        return view;
    }
}
