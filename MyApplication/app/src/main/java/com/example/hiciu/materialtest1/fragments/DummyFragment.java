package com.example.hiciu.materialtest1.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.hiciu.materialtest1.R;

public class DummyFragment extends Fragment {
    public static final String ARG_SCROLL_Y = "ARG_SCROLL_Y";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_dummy, container, false);

        for (int i = 0; i < 45; i++) {
            TextView textView = new TextView(getContext());
            textView.setText("new text ba...." + i);
            ((LinearLayout) layout.findViewById(R.id.cont)).addView(textView);
        }


        return layout;
    }


}
