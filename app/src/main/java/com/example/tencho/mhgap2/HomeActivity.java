package com.example.tencho.mhgap2;

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
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    private long back_pressed =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        btn1=(Button)findViewById(R.id.depression);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,Depression1.class);
                startActivity(intent);
            }
        });

        btn2=(Button)findViewById(R.id.psy);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,psychoses.class);
                startActivity(intent);
            }
        });


        btn3=(Button)findViewById(R.id.Epilipsy);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,epilipsy.class);
                startActivity(intent);
            }
        });


        btn4=(Button)findViewById(R.id.Disorder);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,behavioural.class);
                startActivity(intent);
            }
        });

        btn5=(Button)findViewById(R.id.Dementia);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,dementia.class);
                startActivity(intent);
            }
        });


        btn6=(Button)findViewById(R.id.Substance);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,substance.class);
                startActivity(intent);
            }
        });



        btn7=(Button)findViewById(R.id.SUICIDE);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,suicide.class);
                startActivity(intent);
            }
        });


        btn8=(Button)findViewById(R.id.OTH);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,other.class);
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
            if (back_pressed + 2000 > System.currentTimeMillis()) {
                finishAffinity();
            } else {
                Toast.makeText(getBaseContext(), "Press once again to exit",
                        Toast.LENGTH_SHORT).show();
                back_pressed = System.currentTimeMillis();
            }
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
            Intent intent=new Intent(HomeActivity.this,Essential.class);
            startActivity(intent);

        } else if (id == R.id.master) {
            Intent intent=new Intent(HomeActivity.this,master.class);
            startActivity(intent);

        }else if (id == R.id.glossery) {
            Intent intent=new Intent(HomeActivity.this,Glossery.class);
            startActivity(intent);

        }
        else if (id == R.id.help) {
            Intent intent=new Intent(HomeActivity.this,help.class);
            startActivity(intent);

        }
        else if (id == R.id.contact) {
            Intent intent=new Intent(HomeActivity.this,Contactus.class);
            startActivity(intent);

        }
        else if (id == R.id.Aboutus) {
            Intent intent=new Intent(HomeActivity.this,Aboutus.class);
            startActivity(intent);
                    }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}