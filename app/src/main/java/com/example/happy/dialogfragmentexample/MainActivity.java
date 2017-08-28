package com.example.happy.dialogfragmentexample;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
        Dialog dialog = new Dialog();
//        fragmentTransaction.add(dialog,"dialog1");


        dialog.show(fragmentTransaction,"dialog1");
//        fragmentTransaction.commit();
    }
}
