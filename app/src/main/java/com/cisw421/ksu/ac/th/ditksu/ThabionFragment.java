package com.cisw421.ksu.ac.th.ditksu;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThabionFragment extends Fragment {


    public ThabionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated (savedInstanceState);
        Button button = getView ( ).findViewById (R.id.button);
        button.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String url = "https://www.ksu.ac.th/th/สำหรับนักศึกษา/";

                Intent i = new Intent (Intent.ACTION_VIEW);
                i.setData (Uri.parse (url));
                startActivity (i);
            }
        });
        createToolbar();
    }

    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.thabion);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("งานทะเบียนนักศึกษา");
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
        return inflater.inflate(R.layout.fragment_thabion, container, false);
    }

}
