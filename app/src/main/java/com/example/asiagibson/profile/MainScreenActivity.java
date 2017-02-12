package com.example.asiagibson.profile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

import static com.example.asiagibson.profile.R.array.list_items;

/**
 * Created by asiagibson on 2/12/17.
 */

public class MainScreenActivity extends ActionBarActivity {
    ActionBarDrawerToggle mDrawerToggle;

    NavViewAdapter adapter;
    DrawerLayout drawerLayout;
    ListView listView;

    String iconText[] = {"Button 1", "Button 2", "Button 3", "Button 4"};
    int iconList[] = {R.drawable.heart, R.drawable.email,
            R.drawable.addressbook, R.drawable.logout};

    ImageView heartB, emailB, addressbkB, logoutB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        heartB = (ImageView) findViewById(R.id.iv_heart);
        emailB = (ImageView) findViewById(R.id.iv_email);
        addressbkB = (ImageView) findViewById(R.id.iv_address_bk);
        logoutB = (ImageView) findViewById(R.id.iv_logout);

        heartB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(heartB.getContext(), "Selected Heart Activity", Toast.LENGTH_SHORT).show();
            }
        });

        emailB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(emailB.getContext(), "Selected Message Activity", Toast.LENGTH_SHORT).show();
            }
        });

        addressbkB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
          //          intent = new Intent(MainScreenActivity.this, .class);
          //          startActivity(intent);

                }
        });

        logoutB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Toast.makeText(emailB.getContext(), "Selected Logout", Toast.LENGTH_SHORT).show();

            }
        });

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        listView = (ListView) findViewById(R.id.drawerlist);
        adapter = new NavViewAdapter(getApplicationContext(), iconList, iconText);
        listView.setAdapter(adapter);

    }

}


