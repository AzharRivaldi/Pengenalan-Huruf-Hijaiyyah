package com.azhar.hurufhijaiyyah.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.azhar.hurufhijaiyyah.R;

public class FragmentDhomah extends Fragment {
    public FragmentDhomah(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dhomah, container, false);

        return view;
    }
}