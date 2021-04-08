package com.example.huandog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class TimelinePager extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        ViewGroup viewGroup = (ViewGroup)inflater.inflate(R.layout.home_timeline,container,false);

        return viewGroup;
    }
}
