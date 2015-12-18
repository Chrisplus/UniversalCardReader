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
public class LogFragment extends Fragment {
    private ImageView noLogImageView;
    private TextView noLogTextView;

    public LogFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_guide, container, false);
        noLogImageView = (ImageView) view.findViewById(R.id.guide_image);
        noLogTextView = (TextView) view.findViewById(R.id.guide_text);

        noLogImageView.setImageResource(R.drawable.ic_log);
        noLogTextView.setText(R.string.guide_no_log);
        return view;
    }
}
