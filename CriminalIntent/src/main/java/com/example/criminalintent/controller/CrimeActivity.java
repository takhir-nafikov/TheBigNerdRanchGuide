package com.example.criminalintent.controller;

import android.support.v4.app.Fragment;

import com.example.criminalintent.base.SingleFragmentActivity;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
