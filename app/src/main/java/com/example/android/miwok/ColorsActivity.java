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
        ArrayList<StringTuple> numberStrings = new ArrayList<StringTuple>();

        numberStrings.add(new StringTuple("लाल", "red", R.drawable.color_red));
        numberStrings.add(new StringTuple("hara", "green", R.drawable.color_green));
        numberStrings.add(new StringTuple("bhura", "brown", R.drawable.color_brown));
        numberStrings.add(new StringTuple("matmaila", "dusty yellow", R.drawable.color_dusty_yellow));
        numberStrings.add(new StringTuple("safaed", "white", R.drawable.color_white));
        numberStrings.add(new StringTuple("gulabi", "sarson peela", R.drawable.color_mustard_yellow));
        numberStrings.add(new StringTuple("kala", "black", R.drawable.color_black));
        numberStrings.add(new StringTuple("salati", "gray", R.drawable.color_gray));

        StringTupleAdapter itemsAdapter = new StringTupleAdapter(this, numberStrings, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);

    }
}
