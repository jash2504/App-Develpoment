package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Scientist> scientistList=new ArrayList<>();

    private void loadData()
    {
        scientistList.add(new Scientist("Jash","1"));
        scientistList.add(new Scientist("Riya","2"));
        scientistList.add(new Scientist("Mom","3"));
        scientistList.add(new Scientist("Dhairya","4"));
        scientistList.add(new Scientist("Dhruv","5"));
        scientistList.add(new Scientist("Meet","6"));
        scientistList.add(new Scientist("Hetvi","7"));
        scientistList.add(new Scientist("Mom","8"));
        scientistList.add(new Scientist("Dad","9"));
        scientistList.add(new Scientist("Jal","10"));
        scientistList.add(new Scientist("Raj","11"));
        scientistList.add(new Scientist("Jash","1"));
        scientistList.add(new Scientist("Jash","1"));
    }

    ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
        listView =findViewById(R.id.lv);


        ScientistAdapter adapter=new ScientistAdapter(this,scientistList);
        listView.setAdapter(adapter);


    }
}