package com.kirana.munshig.munshig_prototye.FragmentLayout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kirana.munshig.munshig_prototye.R;

public class AppSetting extends Fragment {
    View view;

    public AppSetting() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_app_setting, container, false);
        return view;
    }

}
