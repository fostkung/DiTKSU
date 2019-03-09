package com.cisw421.ksu.ac.th.ditksu;


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
public class PortfolioFragment extends Fragment {

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated (savedInstanceState);
//
//        //        ผลงานที่ 1
//        ImageView imageView2 = getView().findViewById(R.id.imageView2);
//        imageView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment,
//                        new Portfolio_1Fragment()).addToBackStack(null).commit();
//            }
//        });
//        //        ผลงานที่ 2
//        ImageView imageView3 = getView().findViewById(R.id.imageView3);
//        imageView3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment,
//                        new Portfolio_2Fragment()).addToBackStack(null).commit();
//            }
//
//        });
//        //        ผลงานที่ 3
//        ImageView imageView4 = getView().findViewById(R.id.imageView4);
//        imageView4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment,
//                        new Portfolio_3Fragment()).addToBackStack(null).commit();
//            }
//
//        });
//    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portfolio, container, false);
    }

}
