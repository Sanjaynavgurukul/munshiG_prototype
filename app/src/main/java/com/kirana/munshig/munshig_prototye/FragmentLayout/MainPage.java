package com.kirana.munshig.munshig_prototye.FragmentLayout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.kirana.munshig.munshig_prototye.Functions.FragmentFunction;
import com.kirana.munshig.munshig_prototye.PhoneActivity.PhoneActivity;
import com.kirana.munshig.munshig_prototye.R;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.kirana.munshig.munshig_prototye.Functions.FragmentFunction.loadFragment;

/**
 * This is the main page...
 * All internal pages connected through this page
 * Open Customer account page onClick account section on the toolbar.
 * Open setting page onClick setting button on top of the toolBar.
 * open Insights page onClick logo of munshiG head and label.
 * Open Purchase page onClick bottom left card.
 * Open Inventory page onClick bottom center card.
 * Open Sales (Customer) page onClick Bottom Right card..
 */

public class MainPage extends Fragment {
//    All Local Variables...
    CircleImageView circleImageView;
    LinearLayout linearLayout;
    ImageView setting;
    LinearLayout ln;


//    MainPage Fragment Constructor...
    public MainPage() {
    }
    public static MainPage newInstance(String param1, String param2) {
        MainPage fragment = new MainPage();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

//    OnCreate method...
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_page, container, false);

//        initializing all views...
        circleImageView = view.findViewById(R.id.toolBarPicture);
        linearLayout = view.findViewById(R.id.profile_layout);
        setting = view.findViewById(R.id.setting);
        ln = view.findViewById(R.id.ll_logo);


//        OnClick Listener for User profile pictire...
        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Replacing with Account fragment ...
                loadFragment(getActivity(),new Account());
            }
        });
//        OnClick listener for user datails...
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(getActivity(),new Account());
            }
        });
//        OnClick Listener for ettong Button...
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(getActivity(),new AppSetting());
            }
        });
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(getActivity(),new Insights()
                );
            }
        });



        return view;
    }
}
