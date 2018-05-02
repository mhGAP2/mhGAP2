package com.example.tencho.mhgap2;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import java.util.List;

public class Aboutus extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    RelativeLayout r1,r2,r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        r1 = (RelativeLayout) findViewById(R.id.emailLayout);
        r2 = (RelativeLayout) findViewById(R.id.rateLayout);
        r3 = (RelativeLayout) findViewById(R.id.moreLayout);

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }

        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + com.example.tencho.mhgap2.Aboutus.this.getPackageName())));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + Aboutus.this.getPackageName())));
                }
            }

        });

        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Abhi+Android")));
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
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.essentials) {
            Intent intent=new Intent(Aboutus.this,Essential.class);
            startActivity(intent);

        } else if (id == R.id.master) {
            Intent intent=new Intent(Aboutus.this,master.class);
            startActivity(intent);

        }else if (id == R.id.glossery) {
            Intent intent=new Intent(Aboutus.this,Glossery.class);
            startActivity(intent);

        }
        else if (id == R.id.help) {
            Intent intent=new Intent(Aboutus.this,help.class);
            startActivity(intent);

        }
        else if (id == R.id.contact) {
            Intent intent=new Intent(Aboutus.this,Contactus.class);
            startActivity(intent);

        }
        else if (id == R.id.Aboutus) {
            Intent intent=new Intent(Aboutus.this,Aboutus.class);
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
