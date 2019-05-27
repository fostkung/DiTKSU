package com.cisw421.ksu.ac.th.ditksu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

//        Add Fragment to Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.contentMainFragment,
                    new MainFragment ( )).commit ( );
        }
    }
}
