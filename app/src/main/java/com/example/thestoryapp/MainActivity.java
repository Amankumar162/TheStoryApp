package com.example.thestoryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] titles =getResources().getStringArray(R.array.stories_titles);
        String [] contents =getResources().getStringArray(R.array.story_content);

        recyclerView =findViewById(R.id.storiesListsView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter= new Adapter(this,titles,contents); //our adapter takes two string array
        recyclerView.setAdapter(adapter);



    }
}