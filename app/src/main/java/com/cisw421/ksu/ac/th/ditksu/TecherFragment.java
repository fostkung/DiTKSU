package com.cisw421.ksu.ac.th.ditksu;


import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
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
        imageView = getView().findViewById(R.id.img1);

        String url = "https://firebasestorage.googleapis.com/v0/b/ditksu-870e7.appspot.com/o/image.png?alt=media&token=e5031875-b0ca-4f9c-86ca-9ec04483edb3";

        Glide.with(getActivity()).load(url).into (imageView);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_techer, container, false);
    }

}
