package com.example.android.miwok;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.string_touples);

        //String[] NumberStrings = new String[10];
        ArrayList<StringTouple> numberStrings = new ArrayList<StringTouple>();

        numberStrings.add(new StringTouple("लाल", "red", R.drawable.color_red));
        numberStrings.add(new StringTouple("hara", "green", R.drawable.color_green));
        numberStrings.add(new StringTouple("bhura", "brown", R.drawable.color_brown));
        numberStrings.add(new StringTouple("matmaila", "dusty yellow", R.drawable.color_dusty_yellow));
        numberStrings.add(new StringTouple("safaed", "white", R.drawable.color_white));
        numberStrings.add(new StringTouple("gulabi", "sarson peela", R.drawable.color_mustard_yellow));
        numberStrings.add(new StringTouple("kala", "black", R.drawable.color_black));
        numberStrings.add(new StringTouple("salati", "gray", R.drawable.color_gray));

        StringToupleAdapter itemsAdapter = new StringToupleAdapter(this, numberStrings);
        ListView listView = (ListView) findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);

    }
}
