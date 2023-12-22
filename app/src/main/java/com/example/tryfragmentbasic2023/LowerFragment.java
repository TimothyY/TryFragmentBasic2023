package com.example.tryfragmentbasic2023;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textservice.SentenceSuggestionsInfo;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class LowerFragment extends Fragment {

    // Required empty public constructor
    public LowerFragment() {}

    TextView tvLowerFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_lower, container, false);
        tvLowerFragment = (TextView) rootView.findViewById(R.id.tvLowerFragment);
        return rootView;
    }

    public void updateSentence(String newSentence){
        tvLowerFragment.setText(newSentence);
    }
}