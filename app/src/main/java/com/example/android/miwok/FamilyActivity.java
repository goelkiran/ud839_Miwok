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

        numberStrings.add(new StringTouple("pita", "father",R.drawable.family_father));
        numberStrings.add(new StringTouple("mata", "mother",R.drawable.family_mother));
        numberStrings.add(new StringTouple("putr/beta", "son",R.drawable.family_son));
        numberStrings.add(new StringTouple("putri/beti", "daughter",R.drawable.family_daughter));
        numberStrings.add(new StringTouple("bada bhai", "older brother",R.drawable.family_older_brother));
        numberStrings.add(new StringTouple("chota bhai", "younger brother",R.drawable.family_younger_brother));
        numberStrings.add(new StringTouple("badi didi", "older sister",R.drawable.family_older_sister));
        numberStrings.add(new StringTouple("choti bahan", "younger sister",R.drawable.family_younger_sister));
        numberStrings.add(new StringTouple("dadi", "grandmother",R.drawable.family_grandmother));
        numberStrings.add(new StringTouple("dada", "grandfather",R.drawable.family_grandfather));

        StringToupleAdapter itemsAdapter = new StringToupleAdapter(this, numberStrings);
        ListView listView = (ListView) findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);

    }
}
