package com.example.tencho.mhgap2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Glossery extends AppCompatActivity {

    ListView lv;
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayTerm;
    //String []meaning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glossery);

      //  meaning=getResources().getStringArray(R.array.glossary_meaning);

        lv=(ListView)findViewById(R.id.listviewterm);
        arrayTerm=new ArrayList<>();
        arrayTerm.addAll(Arrays.asList(getResources().getStringArray(R.array.glossary)));

        adapter=new ArrayAdapter<>(
                Glossery.this,
                android.R.layout.simple_list_item_1,
                arrayTerm);

        lv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_search,menu);
        MenuItem item=menu.findItem(R.id.menuSearch);
        SearchView searchView=(SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}
