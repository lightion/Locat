package com.lightion.locat.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.lightion.locat.R;
import com.lightion.locat.fragments.DiscussionFragment;
import com.lightion.locat.fragments.SettingFragment;
import com.lightion.locat.helper.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fm;
    private BottomNavigationView bottomNavigationView;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottom_navigation_bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        fm=getSupportFragmentManager();
        DiscussionFragment df=(DiscussionFragment)fm.findFragmentById(R.id.container_main);
        if(df==null){
            df=new DiscussionFragment();
            fm.beginTransaction().add(R.id.container_main, df).commit();
        }
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                transaction=fm.beginTransaction();
                switch (id){
                    case R.id.settings:
                        SettingFragment sf = new SettingFragment();
                        transaction.replace(R.id.container_main, sf);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        return true;
                    default:
                        DiscussionFragment df = new DiscussionFragment();
                        transaction.replace(R.id.container_main, df);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                }
                return true;
            }
        });
    }
}
