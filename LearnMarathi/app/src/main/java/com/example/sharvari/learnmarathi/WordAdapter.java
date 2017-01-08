package com.example.sharvari.learnmarathi;

/**
 * Created by Sharvari on 1/4/2017.
 */

import android.content.Context;
import android.provider.UserDictionary;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import android.app.Activity;
import android.widget.Toast;


import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    // private int mAudioId;

    public WordAdapter(Activity context, ArrayList<Word> words, int ColorResourceId) {
        super(context, 0, words);
        mColorResourceId = ColorResourceId;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ItemlistView = convertView;
        if(ItemlistView == null){
            ItemlistView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        Word CurrentWord = getItem(position);

        TextView defalultnumber = (TextView) ItemlistView.findViewById(R.id.default_text_view);
        defalultnumber.setText(CurrentWord.getDefaultTranslation());


        TextView miwoknumber = (TextView) ItemlistView.findViewById(R.id.marathi_text_view);
        miwoknumber.setText(CurrentWord.getMiwokTranslation());

        ImageView iconView = (ImageView) ItemlistView.findViewById(R.id.image_view);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(CurrentWord.getimageSourceId());


        View textContainer = ItemlistView.findViewById(R.id.text_contaoner);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);



        return ItemlistView;
    }
}
