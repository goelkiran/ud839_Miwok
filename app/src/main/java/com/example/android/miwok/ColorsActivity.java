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

        numberStrings.add(new StringTouple("laal", "red"));
        numberStrings.add(new StringTouple("hara", "green"));
        numberStrings.add(new StringTouple("bhura", "brown"));
        numberStrings.add(new StringTouple("peela", "yellow"));
        numberStrings.add(new StringTouple("safaed", "white"));
        numberStrings.add(new StringTouple("gulabi", "pink"));
        numberStrings.add(new StringTouple("kala", "black"));
        numberStrings.add(new StringTouple("narangi", "orange"));
        numberStrings.add(new StringTouple("neela", "blue"));
        numberStrings.add(new StringTouple("jamuni", "purple"));

        StringToupleAdapter itemsAdapter = new StringToupleAdapter(this, numberStrings);
        ListView listView = (ListView) findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);

    }
}
