package com.gokay.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    final List<Animal> animals=new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_custom_adapter);
        animals.add(new Animal("Ant",R.mipmap.ant));
        animals.add(new Animal("Bear",R.mipmap.bear));
        animals.add(new Animal("Bird", R.mipmap.bird));
        animals.add(new Animal("Cat",R.mipmap.cat));
        animals.add(new Animal("Dog",R.mipmap.dog));
        animals.add(new Animal("Donkey",R.mipmap.donkey));
        animals.add(new Animal("Elephant",R.mipmap.elephant));
        animals.add(new Animal("Giraffe",R.mipmap.giraffe));
        animals.add(new Animal("Goat",R.mipmap.goat));
        animals.add(new Animal("Monkey",R.mipmap.monkey));
        animals.add(new Animal("Pig",R.mipmap.pig));
        animals.add(new Animal("Rat",R.mipmap.rat));

        final ListView listView= (ListView) findViewById(R.id.listview);
        AnimalAdapter adapter=new AnimalAdapter(this, animals);
        listView.setAdapter(adapter);
    }
}