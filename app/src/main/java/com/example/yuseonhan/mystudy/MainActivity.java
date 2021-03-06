package com.example.yuseonhan.mystudy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showFragment(FragmentItemList.getFragment());
    }

    public void showFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.main_container, fragment, null);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void setSubTitle(CharSequence subTitle) {
        getSupportActionBar().setSubtitle(subTitle);
    }
}
