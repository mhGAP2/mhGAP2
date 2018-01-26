package com.example.tencho.mhgap2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static com.example.tencho.mhgap2.R.array.depcontent;
import static com.example.tencho.mhgap2.R.array.depcontent_meaning;
import static com.example.tencho.mhgap2.R.string.dep;
import static com.example.tencho.mhgap2.R.string.i;

public class master extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener {


    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> stringListH,stringListC,listDataHeader,listMeaning1,listMeaning2,listMeaning3,listMeaning4,listMeaning5,listMeaning6,listMeaning7;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.jamlist);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);



    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

    NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
}

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        stringListH=new ArrayList<String>();
        stringListC=new ArrayList<String>();
        listMeaning1 = new ArrayList<String>();
        listMeaning2 = new ArrayList<String>();
        listMeaning3 = new ArrayList<String>();
        listMeaning4 = new ArrayList<String>();
        listMeaning5 = new ArrayList<String>();
        listMeaning6 = new ArrayList<String>();
        listMeaning7 = new ArrayList<String>();
        stringListH.addAll(Arrays.asList(getResources().getStringArray(R.array.depcontent)));
        stringListC.addAll(Arrays.asList(getResources().getStringArray(R.array.depcontent_meaning)));
        listDataChild = new HashMap<String, List<String>>();

            listDataHeader.add(stringListH.get(0));
            listDataHeader.add(stringListH.get(1));
            listDataHeader.add(stringListH.get(2));
            listDataHeader.add(stringListH.get(3));
            listDataHeader.add(stringListH.get(4));
            listDataHeader.add(stringListH.get(5));
            listDataHeader.add(stringListH.get(6));

        // Adding child data
        listMeaning1.add(stringListC.get(0));
        listMeaning1.add(stringListC.get(1));
        listMeaning1.add(stringListC.get(2));
        listMeaning1.add(stringListC.get(3));

        listMeaning2.add(stringListC.get(4));
        listMeaning2.add(stringListC.get(5));
        listMeaning2.add(stringListC.get(6));
        listMeaning2.add(stringListC.get(7));
        listMeaning2.add(stringListC.get(8));

        listMeaning3.add(stringListC.get(9));
        listMeaning3.add(stringListC.get(10));
        listMeaning3.add(stringListC.get(11));

        listMeaning4.add(stringListC.get(12));
        listMeaning4.add(stringListC.get(13));
        listMeaning4.add(stringListC.get(14));
        listMeaning4.add(stringListC.get(15));
        listMeaning4.add(stringListC.get(16));
        listMeaning4.add(stringListC.get(17));
        listMeaning4.add(stringListC.get(18));
        listMeaning4.add(stringListC.get(19));
        listMeaning4.add(stringListC.get(20));

        listMeaning5.add(stringListC.get(21));
        listMeaning5.add(stringListC.get(22));
        listMeaning5.add(stringListC.get(23));

        listMeaning6.add(stringListC.get(24));
        listMeaning6.add(stringListC.get(25));
        listMeaning6.add(stringListC.get(26));
        listMeaning6.add(stringListC.get(27));
        listMeaning6.add(stringListC.get(28));
        listMeaning6.add(stringListC.get(29));
        listMeaning6.add(stringListC.get(30));

        listMeaning7.add(stringListC.get(31));
        listMeaning7.add(stringListC.get(32));
        listMeaning7.add(stringListC.get(33));

        listDataChild.put(listDataHeader.get(0), listMeaning1);
        listDataChild.put(listDataHeader.get(1), listMeaning2);
        listDataChild.put(listDataHeader.get(2), listMeaning3);
        listDataChild.put(listDataHeader.get(3), listMeaning4);
        listDataChild.put(listDataHeader.get(4), listMeaning5);
        listDataChild.put(listDataHeader.get(5), listMeaning6);
        listDataChild.put(listDataHeader.get(6), listMeaning7);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent=new Intent(master.this,HomeActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.symbols) {

        } else if (id == R.id.essentials) {
            Intent intent = new Intent(master.this, Essential.class);
            startActivity(intent);

        } else if (id == R.id.master) {
            Intent intent = new Intent(master.this, master.class);
            startActivity(intent);

        } else if (id == R.id.glossery) {
            Intent intent = new Intent(master.this, Glossery.class);
            startActivity(intent);

        } else if (id == R.id.contact) {
            Intent intent = new Intent(master.this, Contactus.class);
            startActivity(intent);

        } else if (id == R.id.Aboutus) {
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;




    }
}

