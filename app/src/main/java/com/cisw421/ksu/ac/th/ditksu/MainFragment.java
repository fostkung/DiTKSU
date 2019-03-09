package com.cisw421.ksu.ac.th.ditksu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    public MainFragment() {
        // Required empty public constructor


    }

    // Ctrl+o choose onActivityCreated Enter
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated (savedInstanceState);
//        กิจกรรม
        ImageView img1 = getView ( ).findViewById (R.id.img1);
        img1.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                getActivity ( ).getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.contentMainFragment,
                        new KidjakumFragment ( )).addToBackStack (null).commit ( );
            }
        });
//        ข่าวสาร
        ImageView img2 = getView ( ).findViewById (R.id.img2);
        img2.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                getActivity ( ).getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.contentMainFragment,
                        new NewsFragment ( )).addToBackStack (null).commit ( );
            }

        });
//        ตารางเรียน
        ImageView img3 = getView ( ).findViewById (R.id.img3);
        img3.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                getActivity ( ).getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.contentMainFragment,
                        new TableFragment ( )).addToBackStack (null).commit ( );
            }

        });
//        แผนที่
        ImageView img4 = getView ( ).findViewById (R.id.img4);
        img4.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                getActivity ( ).getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.contentMainFragment,
                        new MapFragment ( )).addToBackStack (null).commit ( );
            }

        });
//        ผลงานสาขา
        ImageView img5 = getView ( ).findViewById (R.id.img5);
        img5.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                getActivity ( ).getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.contentMainFragment,
                        new PortfolioFragment ( )).addToBackStack (null).commit ( );
            }

        });
//        ข้อมูลอาจารย์
        ImageView img6 = getView ( ).findViewById (R.id.img6);
        img6.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                getActivity ( ).getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.contentMainFragment,
                        new TecherFragment ( )).addToBackStack (null).commit ( );
            }

        });
//        ทะเบียน
        ImageView img7 = getView ( ).findViewById (R.id.img7);
        img7.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                getActivity ( ).getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.contentMainFragment,
                        new ThabionFragment ( )).addToBackStack (null).commit ( );
//                String url = "https://www.ksu.ac.th/th/สำหรับนักศึกษา/";
//
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(url));
//                startActivity(i);
            }
        });
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate (R.layout.fragment_main, container, false);

    }

}


