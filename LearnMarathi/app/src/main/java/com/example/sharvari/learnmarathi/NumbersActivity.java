package com.example.sharvari.learnmarathi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import  java.util.*;

public class NumbersActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);




        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "ek", R.drawable.number_one));
        words.add(new Word("two", "don", R.drawable.number_two));
        words.add(new Word("three", "tIn", R.drawable.number_three));
        words.add(new Word("four", "chAr", R.drawable.number_four));
        words.add(new Word("five", "pAch", R.drawable.number_five));
        words.add(new Word("six", "sahA", R.drawable.number_six));
        words.add(new Word("seven", "sAt", R.drawable.number_seven));
        words.add(new Word("eight", "AaTh", R.drawable.number_eight));
        words.add(new Word("nine", "naU", R.drawable.number_nine));
        words.add(new Word("ten", "dahA", R.drawable.number_ten));



        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
