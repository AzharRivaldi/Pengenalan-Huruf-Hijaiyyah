package com.azhar.hurufhijaiyyah.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.azhar.hurufhijaiyyah.R;

public class FragmentKasrah extends Fragment {
    public FragmentKasrah(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kasrah, container, false);

        return view;
    }
}