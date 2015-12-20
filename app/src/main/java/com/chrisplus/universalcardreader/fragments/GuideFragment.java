package com.chrisplus.universalcardreader.fragments;

import com.chrisplus.universalcardreader.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Chrisplus on 20/12/15.
 */
public class GuideFragment extends Fragment {

    public static final String KEY_TYPE = GuideFragment.class.getName() + ".key.type";

    public enum GuideFragmentType {
        NO_CARD_DETECT,
        NO_BALANCE_READ,
        NO_LOG_RECORD
    }

    private ImageView guideImageView;

    private TextView guideTextView;

    private GuideFragmentType fragmentType;


    public static Fragment newInstance(GuideFragmentType type) {
        Fragment fragment = new GuideFragment();
        Bundle args = new Bundle();
        args.putString(KEY_TYPE, type.name());
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        Bundle bundle = getArguments();
        if (bundle != null) {
            fragmentType = GuideFragmentType.valueOf(bundle.getString(KEY_TYPE));
        } else {
            fragmentType = GuideFragmentType.NO_CARD_DETECT;
        }

        View view = inflater.inflate(R.layout.fragment_guide, container, false);
        guideImageView = (ImageView) view.findViewById(R.id.guide_image);
        guideTextView = (TextView) view.findViewById(R.id.guide_text);

        switch (fragmentType) {
            case NO_CARD_DETECT:
                guideTextView.setText(R.string.guide_no_card);
                guideImageView.setImageResource(R.drawable.ic_card);
                break;
            case NO_BALANCE_READ:
                guideTextView.setText(R.string.guide_no_transaction);
                guideImageView.setImageResource(R.drawable.ic_transaction);
                break;
            case NO_LOG_RECORD:
                guideTextView.setText(R.string.guide_no_log);
                guideImageView.setImageResource(R.drawable.ic_log);
                break;
        }
        return view;
    }
}
