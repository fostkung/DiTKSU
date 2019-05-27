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
public class TecherFragment extends Fragment {
    ImageView imageView;

    public TecherFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


//        tech1
        ImageView img1 = getView ( ).findViewById (R.id.img1);
        img1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                getActivity ( ).getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.contentMainFragment,
                        new Techer_1fragment ( )).addToBackStack (null).commit ( );
            }
        });
//        tech2
        ImageView img2 = getView ( ).findViewById (R.id.img2);
        img2.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                getActivity ( ).getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.contentMainFragment,
                        new Techer_2fragment ( )).addToBackStack (null).commit ( );
            }
        });
        //        tech3
        ImageView img3 = getView ( ).findViewById (R.id.img3);
        img3.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                getActivity ( ).getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.contentMainFragment,
                        new Techer_3fragment ( )).addToBackStack (null).commit ( );
            }
        });
        //        tech4
        ImageView img4 = getView ( ).findViewById (R.id.img4);
        img4.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                getActivity ( ).getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.contentMainFragment,
                        new Techer_4fragment ( )).addToBackStack (null).commit ( );
            }
        });
        //image 1
        imageView = getView().findViewById(R.id.img1);
        String url = "https://firebasestorage.googleapis.com/v0/b/ditksu-870e7.appspot.com/o/image.png?alt=media&token=e5031875-b0ca-4f9c-86ca-9ec04483edb3";
        Glide.with(getActivity()).load(url).into (imageView);
        //image 2
        imageView = getView().findViewById(R.id.img2);
        String url1 = "https://firebasestorage.googleapis.com/v0/b/ditksu-870e7.appspot.com/o/image.png?alt=media&token=e5031875-b0ca-4f9c-86ca-9ec04483edb3";
        Glide.with(getActivity()).load(url1).into (imageView);
        //image 3
        imageView = getView().findViewById(R.id.img3);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/ditksu-870e7.appspot.com/o/image.png?alt=media&token=e5031875-b0ca-4f9c-86ca-9ec04483edb3";
        Glide.with(getActivity()).load(url2).into (imageView);
        //image
        imageView = getView().findViewById(R.id.img4);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/ditksu-870e7.appspot.com/o/image.png?alt=media&token=e5031875-b0ca-4f9c-86ca-9ec04483edb3";
        Glide.with(getActivity()).load(url3).into (imageView);

        createToolbar();
    }

    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.techer);
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
        return inflater.inflate(R.layout.fragment_techer, container, false);
    }

}
