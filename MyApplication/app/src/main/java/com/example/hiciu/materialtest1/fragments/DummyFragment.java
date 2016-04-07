package com.example.hiciu.materialtest1.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hiciu.materialtest1.R;

public class DummyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate( R.layout.fragment_dummy,container,false);
        ((TextView) layout.findViewById(R.id.theText)).setText("ACEASTA ESTE pagina" + Integer.toString(getArguments().getInt("position")));
        return layout;
    }


}
