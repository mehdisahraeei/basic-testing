package com.my.testing.Fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.my.testing.Computers.apple;
import com.my.testing.R;

public class First extends Fragment {

    private TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_first, container, false);
        textView=view.findViewById(R.id.oneF);


        textView.setText(new apple().companyName("apple"));

        return view;
    }
}