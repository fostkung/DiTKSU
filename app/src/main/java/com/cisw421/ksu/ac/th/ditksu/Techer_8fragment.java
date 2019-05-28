package com.cisw421.ksu.ac.th.ditksu;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


/**
 * A simple {@link Fragment} subclass.
 */
public class Techer_8fragment extends Fragment {
    ImageView imageView;

    public Techer_8fragment() {
        // Required empty public constructor
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //image 1
        imageView = getView().findViewById(R.id.img1);
        String url = "https://firebasestorage.googleapis.com/v0/b/ditksu-870e7.appspot.com/o/udom.png?alt=media&token=47e9359a-4b41-4098-a7bf-5b692a335f21";
        Glide.with(getActivity()).load(url).into (imageView);

        createToolbar();

    }

    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.techer8);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("อาจารย์ในสาขา");
        ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_techer_8fragment, container, false);
    }

}
