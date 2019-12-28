package com.example.android.miwok;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.string_touples);

        //String[] NumberStrings = new String[10];
        ArrayList<StringTouple> numberStrings = new ArrayList<StringTouple>();

        numberStrings.add(new StringTouple("pita", "father"));
        numberStrings.add(new StringTouple("mata", "mother"));
        numberStrings.add(new StringTouple("putr/beta", "son"));
        numberStrings.add(new StringTouple("putri/beti", "daughter"));
        numberStrings.add(new StringTouple("bada bhai", "older brother"));
        numberStrings.add(new StringTouple("chota bhai", "younger brother"));
        numberStrings.add(new StringTouple("badi didi", "older sister"));
        numberStrings.add(new StringTouple("choti bahan", "younger sister"));
        numberStrings.add(new StringTouple("dadi", "grandmother"));
        numberStrings.add(new StringTouple("dada", "grandfather"));

        StringToupleAdapter itemsAdapter = new StringToupleAdapter(this, numberStrings);
        ListView listView = (ListView) findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);

    }
}
