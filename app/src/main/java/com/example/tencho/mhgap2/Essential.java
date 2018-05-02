package com.example.tencho.mhgap2;

import android.content.Intent;
import android.net.Uri;
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

public class Essential extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essential);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        btn1=(Button)findViewById(R.id.b1);
        btn2=(Button)findViewById(R.id.b2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Essential.this,Essentail1.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Essential.this,Essential2.class);
                startActivity(intent);
            }
        });
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
        getMenuInflater().inflate(R.menu.share, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menuShare) {
            Intent share=new Intent(Intent.ACTION_SEND);
            share.setType("text/*");
            share.putExtra(Intent.EXTRA_TEXT,"www.google.com");
            startActivity(Intent.createChooser(share,"Share Using"));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.essentials) {
            Intent intent=new Intent(Essential.this,Essential.class);
            startActivity(intent);

        } else if (id == R.id.master) {
            Intent intent=new Intent(Essential.this,master.class);
            startActivity(intent);

        }else if (id == R.id.glossery) {
            Intent intent=new Intent(Essential.this,Glossery.class);
            startActivity(intent);

        }
        else if (id == R.id.help) {
            Intent intent=new Intent(Essential.this,help.class);
            startActivity(intent);

        }
        else if (id == R.id.contact) {
            Intent intent=new Intent(Essential.this,Contactus.class);
            startActivity(intent);

        }
        else if (id == R.id.Aboutus) {
            Intent intent=new Intent(Essential.this,Aboutus.class);
            startActivity(intent);
        }
        else if (id == R.id.feedback) {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setType("text/plain");
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Subject");
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Body");
            emailIntent.setData(Uri.parse("mailto:tenzincho74@gmail.com"));
            emailIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(emailIntent);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}