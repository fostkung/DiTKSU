package com.cisw421.ksu.ac.th.ditksu;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {



    public NewsFragment() {
        // Required empty public constructor
    }

    @Override

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        WebView webView2 = getView().findViewById(R.id.wv2);
        webView2.setWebViewClient(new WebViewClient());
        webView2.loadUrl("https://m.facebook.com/citksu/posts/?ref=page_internal&mt_nav=0");

        WebView webView1 = getView().findViewById(R.id.wv1);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl("https://m.facebook.com/citksu/posts/?ref=page_internal&mt_nav=0");

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false);
    }

}
