package com.example.fajar.remedies;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView planets_list;
    RecyclerView.LayoutManager layout_manager;
    ProfileAdapter adapter;
    CollapsingToolbarLayout collapsing_container;
    FloatingActionButton Fab;
    String data[] = new String[7];
    ImageView imgToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = (Toolbar) findViewById(R.id.technique_four_toolbar);
        planets_list = (RecyclerView) findViewById(R.id.days_list_4);
        collapsing_container = (CollapsingToolbarLayout) findViewById(R.id.collapsing_container);
        imgToolbar = (ImageView) findViewById(R.id.imgToolbar);

        layout_manager = new LinearLayoutManager(this);
        planets_list.setLayoutManager(layout_manager);

        GetData();

        setSupportActionBar(toolbar);
//        collapsing_container.setTitle( + "");

        Fab = (FloatingActionButton) findViewById(R.id.fab);

        Fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    private void GetData() {
        data[0] = "Allergy";
        data[1] = "Antisocial personality disorder";
        data[3] = "Acne";
        data[2] = "Altitude sickness";
        data[4] = "Asthma";
        data[5] = "Back Pain";
        data[6] = "Autism";
        Names(data);

    }

    private void Names(String data[]) {
        adapter = new ProfileAdapter(data,this);
        planets_list.setAdapter(adapter);
    }

}
