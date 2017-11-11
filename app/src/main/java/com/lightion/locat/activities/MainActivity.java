package com.lightion.locat.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.lightion.locat.R;
import com.lightion.locat.fragments.AskFragment;
import com.lightion.locat.fragments.ChatListFragment;
import com.lightion.locat.fragments.DiscussionFragment;
import com.lightion.locat.fragments.GroupFragment;
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
        ChatListFragment gf=(ChatListFragment) fm.findFragmentById(R.id.container_main);
        if(gf==null){
            gf=new ChatListFragment();
            fm.beginTransaction().add(R.id.container_main, gf).commit();
        }
        bottomNavigationView.setSelectedItemId(R.id.chat);
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
                    case R.id.pin:
                        GroupFragment gf = new GroupFragment();
                        transaction.replace(R.id.container_main,gf);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        return true;
                    case R.id.chat:
                        ChatListFragment cf = new ChatListFragment();
                        transaction.replace(R.id.container_main, cf);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        return true;
                    case R.id.discuss:
                        AskFragment af= new AskFragment();
                        transaction.replace(R.id.container_main, af);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        return true;
                    default:
                        AskFragment acf= new AskFragment();
                        transaction.replace(R.id.container_main, acf);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                }
                return true;
            }
        });
    }
}
