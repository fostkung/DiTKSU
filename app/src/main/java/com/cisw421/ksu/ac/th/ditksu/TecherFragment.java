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
        ImageView img1 = getView().findViewById(R.id.img1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment,
                        new Techer_1fragment()).addToBackStack(null).commit();
            }
        });
//        tech2
        ImageView img2 = getView().findViewById(R.id.img2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment,
                        new Techer_2fragment()).addToBackStack(null).commit();
            }
        });
        //        tech3
        ImageView img3 = getView().findViewById(R.id.img3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment,
                        new Techer_3fragment()).addToBackStack(null).commit();
            }
        });
        //        tech4
        ImageView img4 = getView().findViewById(R.id.img4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment,
                        new Techer_4fragment()).addToBackStack(null).commit();
            }
        });
        //        tech5
        ImageView img5 = getView().findViewById(R.id.img5);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment,
                        new Techer_5fragment()).addToBackStack(null).commit();
            }
        });
        //        tech6
        ImageView img6 = getView().findViewById(R.id.img6);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment,
                        new Techer_6fragment()).addToBackStack(null).commit();
            }
        });
        //        tech7
        ImageView img7 = getView().findViewById(R.id.img7);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment,
                        new Techer_7fragment()).addToBackStack(null).commit();
            }
        });
        //        tech8
        ImageView img8 = getView().findViewById(R.id.img8);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment,
                        new Techer_8fragment()).addToBackStack(null).commit();
            }
        });
        //        tech9
        ImageView img9 = getView().findViewById(R.id.img9);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment,
                        new Techer_9fragment()).addToBackStack(null).commit();
            }
        });
        //image 1
        imageView = getView().findViewById(R.id.img1);
        String url = "https://firebasestorage.googleapis.com/v0/b/ditksu-870e7.appspot.com/o/kamonwan.png?alt=media&token=15a40c02-6f69-4aab-b4da-6dbf3d9ccce8";
        Glide.with(getActivity()).load(url).into(imageView);
        //image 2
        imageView = getView().findViewById(R.id.img2);
        String url1 = "https://firebasestorage.googleapis.com/v0/b/ditksu-870e7.appspot.com/o/napatwarun.png?alt=media&token=53d9e549-5d3e-4c06-b02e-a707abc447bb";
        Glide.with(getActivity()).load(url1).into(imageView);
        //image 3
        imageView = getView().findViewById(R.id.img3);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/ditksu-870e7.appspot.com/o/sakonwan.png?alt=media&token=92d5150f-a303-48df-a91f-c4ef86a35fc1";
        Glide.with(getActivity()).load(url2).into(imageView);
        //image 4
        imageView = getView().findViewById(R.id.img4);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/ditksu-870e7.appspot.com/o/sirion.png?alt=media&token=2f3ac675-2a1e-46fb-9f5f-f20fe71c78ee";
        Glide.with(getActivity()).load(url3).into(imageView);
        //image 5
        imageView = getView().findViewById(R.id.img5);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/ditksu-870e7.appspot.com/o/sukaun.png?alt=media&token=7e65e746-a61c-4ac0-b2b9-5691b1ca3da3";
        Glide.with(getActivity()).load(url4).into(imageView);
        //image 6
        imageView = getView().findViewById(R.id.img6);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/ditksu-870e7.appspot.com/o/tanachapong.png?alt=media&token=c4fc2c47-e155-400e-88e6-7fe48a7a7f30";
        Glide.with(getActivity()).load(url5).into(imageView);
        //image 7
        imageView = getView().findViewById(R.id.img7);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/ditksu-870e7.appspot.com/o/thammarat.png?alt=media&token=ad1f81d7-f891-4b5d-86e1-7c203e785a46";
        Glide.with(getActivity()).load(url6).into(imageView);
        //image 8
        imageView = getView().findViewById(R.id.img8);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/ditksu-870e7.appspot.com/o/udom.png?alt=media&token=47e9359a-4b41-4098-a7bf-5b692a335f21";
        Glide.with(getActivity()).load(url7).into(imageView);
        //image 9
//        imageView = getView().findViewById(R.id.img9);
//        String url8 = "";
//        Glide.with(getActivity()).load(url8).into(imageView);

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
