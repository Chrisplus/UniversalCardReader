package com.chrisplus.universalcardreader.fragments;

import com.chrisplus.universalcardreader.R;
import com.vinaygaba.creditcardview.CreditCardView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Chrisplus on 20/12/15.
 */
public class CardInfoFragment extends Fragment {

    private CreditCardView cardView;
    private TextView cardIDTextView;
    private TextView cardTypeTextView;
    private TextView cardApplicationTextView;
    private TextView cardProtocolTextView;
    private TextView cardRFTextView;
    private TextView cardManuTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_card_info, container, false);

        cardView = (CreditCardView) view.findViewById(R.id.card_preview);
        cardIDTextView = (TextView) view.findViewById(R.id.card_info_id);
        cardTypeTextView = (TextView) view.findViewById(R.id.card_info_type);
        cardApplicationTextView = (TextView) view.findViewById(R.id.card_info_application);
        cardProtocolTextView = (TextView) view.findViewById(R.id.card_info_protocol);
        cardRFTextView = (TextView) view.findViewById(R.id.card_info_rf);
        cardManuTextView = (TextView) view.findViewById(R.id.card_info_manu);

        return view;
    }
}
