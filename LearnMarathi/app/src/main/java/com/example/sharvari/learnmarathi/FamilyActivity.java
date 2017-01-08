package com.example.sharvari.learnmarathi;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import  java.util.*;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father","baba",R.drawable.family_father));
        words.add(new Word("mother","aai",R.drawable.family_mother));
        words.add(new Word("son","mulaga",R.drawable.family_son));
        words.add(new Word("daughter","mulagi",R.drawable.family_daughter));
        words.add(new Word("older brother","dada",R.drawable.family_older_brother));
        words.add(new Word("brother","bhau",R.drawable.family_younger_brother));
        words.add(new Word("older sister","tai",R.drawable.family_older_sister));
        words.add(new Word("sister","bahin",R.drawable.family_younger_sister));
        words.add(new Word("grandmother","aaji",R.drawable.family_grandmother));
        words.add(new Word("grandfather","aajoba",R.drawable.family_grandfather));

        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.category_family);

        // ListView listView = (ListView) findViewById(R.id.list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }


}


