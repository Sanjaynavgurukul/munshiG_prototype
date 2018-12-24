package com.kirana.munshig.munshig_prototye.Functions;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.kirana.munshig.munshig_prototye.R;

public class FragmentFunction{

    /**
     * This function is responsible for changing different fragment inside the PhoneActivity.
     * @param activity
     * @param fragment
     */

    public static void loadFragment(FragmentActivity activity, Fragment fragment) {
        // load fragment
        FragmentManager fragmentManager =activity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


}
