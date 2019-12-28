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
        ArrayList<String> numberStrings = new ArrayList<String>();

        numberStrings.add("one");
        numberStrings.add("two");
        numberStrings.add("three");
        numberStrings.add("four");
        numberStrings.add("five");
        numberStrings.add("six");
        numberStrings.add("seven");
        numberStrings.add("eight");
        numberStrings.add("nine");
        numberStrings.add("ten");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numberStrings);

        ListView listView = (ListView) findViewById(R.id.root_view_numbers);

        listView.setAdapter(itemsAdapter);


    }
}
