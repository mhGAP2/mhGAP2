package com.example.tencho.mhgap2;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class master extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener {
    TextView t1,t2,t3,t4,t5,t6,t7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        t1 =(TextView)findViewById(R.id.dep);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(master.this,Depression1.class);
                startActivity(intent);
            }
        });
        t2 =(TextView)findViewById(R.id.Psyo);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(master.this,psychoses.class);
                startActivity(intent);
            }
        });
        t3 =(TextView)findViewById(R.id.EPILEPSY);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(master.this,epilipsy.class);
                startActivity(intent);
            }
        });
        t4 =(TextView)findViewById(R.id.DISORDER);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(master.this,behavioural.class);
                startActivity(intent);
            }
        });
        t5 =(TextView)findViewById(R.id.DEMENTIA);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(master.this,dementia.class);
                startActivity(intent);
            }
        });
        t6 =(TextView)findViewById(R.id.SUBSTANCEUSE);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(master.this,substance.class);
                startActivity(intent);
            }
        });
        t7 =(TextView)findViewById(R.id.SUICIDE);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(master.this,suicide.class);
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
        getMenuInflater().inflate(R.menu.home1, menu);
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

        if (id == R.id.essentials) {
            Intent intent=new Intent(master.this,Essential.class);
            startActivity(intent);

        } else if (id == R.id.master) {
            Intent intent=new Intent(master.this,master.class);
            startActivity(intent);

        }else if (id == R.id.glossery) {
            Intent intent=new Intent(master.this,Glossery.class);
            startActivity(intent);

        }
        else if (id == R.id.help) {
            Intent intent=new Intent(master.this,help.class);
            startActivity(intent);

        }
        else if (id == R.id.contact) {
            Intent intent=new Intent(master.this,Contactus.class);
            startActivity(intent);

        }
        else if (id == R.id.Aboutus) {
            Intent intent=new Intent(master.this,Aboutus.class);
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

