package com.example.sharvari.learnmarathi;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("What is your name?","Tuz naav kay aahe?"));
        words.add(new Word("My name is...","Maz naav ..."));
        words.add(new Word("Hello","Namaste"));
        words.add(new Word("Thank you","Dhanyawad"));
        words.add(new Word("Are you coming?","tu yet ahes ka?"));
        words.add(new Word("Yes.","ho"));
        words.add(new Word("I’m coming.","mi yet ahe"));
        words.add(new Word("Let’s go.","chala jauya"));
        words.add(new Word("Come here.","ekade ye."));

        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.category_phrases);

        // ListView listView = (ListView) findViewById(R.id.list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }

}
