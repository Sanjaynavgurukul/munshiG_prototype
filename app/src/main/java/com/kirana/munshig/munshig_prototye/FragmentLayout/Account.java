package com.kirana.munshig.munshig_prototye.FragmentLayout;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.telephony.mbms.MbmsErrors;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.support.v7.widget.Toolbar;

import com.kirana.munshig.munshig_prototye.PhoneActivity.PhoneActivity;
import com.kirana.munshig.munshig_prototye.R;

public class Account extends Fragment {



//    Local Variable...
    private Toolbar toolbar;
    RelativeLayout logOut;


    View view;
    public Account() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_account, container, false);
        toolbar = view.findViewById(R.id.toolbar);

//        Initializing all Views...
        logOut = view.findViewById(R.id.account_rl_7);


//        SetOnClick Listener for logout...
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = onCreateDialog();
                dialog.show();
            }
        });



        return view;
    }


//    Dialog box for logout button......
    public Dialog onCreateDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        LayoutInflater inflater = this.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.dialog_logout, null))
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });
        return builder.create();
    }
//    End of dialog box.....

}
