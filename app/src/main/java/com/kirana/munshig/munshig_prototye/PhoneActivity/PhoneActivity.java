package com.kirana.munshig.munshig_prototye.PhoneActivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.kirana.munshig.munshig_prototye.FragmentLayout.Account;
import com.kirana.munshig.munshig_prototye.FragmentLayout.Insights;
import com.kirana.munshig.munshig_prototye.FragmentLayout.MainPage;
import com.kirana.munshig.munshig_prototye.R;

/**
 * This is the mobile layout.
 * And it is responsible for Display all fragment.
 */

public class PhoneActivity extends AppCompatActivity {
   public static PhoneActivity phoneActivity;
//    Local Variable...
    FrameLayout mFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        phoneActivity=this;
//      Initializing all Views...
        mFrameLayout = findViewById(R.id.fragmentContainer);

//      loading default MainPage fragment in the Frame Layout...
        loadFragment(new MainPage());

    }


    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, fragment);
        transaction.commit();
    }
}
