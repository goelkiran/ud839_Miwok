package com.example.android.miwok;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.string_touples);

        //String[] NumberStrings = new String[10];
        ArrayList<StringTouple> numberStrings = new ArrayList<StringTouple>();

        numberStrings.add(new StringTouple("ek", "one"));
        numberStrings.add(new StringTouple("do", "two"));
        numberStrings.add(new StringTouple("teen", "three"));
        numberStrings.add(new StringTouple("char", "four"));
        numberStrings.add(new StringTouple("panch", "five"));
        numberStrings.add(new StringTouple("chae", "six"));
        numberStrings.add(new StringTouple("saat", "seven"));
        numberStrings.add(new StringTouple("aath", "eight"));
        numberStrings.add(new StringTouple("nou", "nine"));
        numberStrings.add(new StringTouple("dus", "ten"));

        StringToupleAdapter itemsAdapter = new StringToupleAdapter(this, numberStrings);
        ListView listView = (ListView) findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);

    }
}
