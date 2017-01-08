package com.example.sharvari.learnmarathi;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red","lal",R.drawable.color_red));
        words.add(new Word("green","hirava",R.drawable.color_green));
        words.add(new Word("brown","tapkiri",R.drawable.color_brown));
        words.add(new Word("gray","karada",R.drawable.color_gray));
        words.add(new Word("black","kala",R.drawable.color_black));
        words.add(new Word("white","pandhara",R.drawable.color_white));
        words.add(new Word("yellow","piwala",R.drawable.color_mustard_yellow));

        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.category_colors);

        // ListView listView = (ListView) findViewById(R.id.list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }

}
