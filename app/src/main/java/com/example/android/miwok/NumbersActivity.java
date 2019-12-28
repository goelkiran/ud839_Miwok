package com.example.android.miwok;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //String[] NumberStrings = new String[10];
        ArrayList<StringTouple> numberStrings = new ArrayList<StringTouple>();

        numberStrings.add(new StringTouple("miwok", "one"));
        numberStrings.add(new StringTouple("miwok", "two"));
        numberStrings.add(new StringTouple("miwok", "three"));
        numberStrings.add(new StringTouple("miwok", "four"));
        numberStrings.add(new StringTouple("miwok", "five"));
        numberStrings.add(new StringTouple("miwok", "six"));
        numberStrings.add(new StringTouple("miwok", "seven"));
        numberStrings.add(new StringTouple("miwok", "eight"));
        numberStrings.add(new StringTouple("miwok", "nine"));
        numberStrings.add(new StringTouple("miwok", "ten"));

        ArrayAdapter<StringTouple> itemsAdapter = new StringToupleAdapter(this, numberStrings);
        ListView listView = (ListView) findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);

    }
}
