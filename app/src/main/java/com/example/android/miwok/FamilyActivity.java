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
        ArrayList<StringTuple> numberStrings = new ArrayList<StringTuple>();

        numberStrings.add(new StringTuple("pita", "father",R.drawable.family_father));
        numberStrings.add(new StringTuple("mata", "mother",R.drawable.family_mother));
        numberStrings.add(new StringTuple("putr/beta", "son",R.drawable.family_son));
        numberStrings.add(new StringTuple("putri/beti", "daughter",R.drawable.family_daughter));
        numberStrings.add(new StringTuple("bada bhai", "older brother",R.drawable.family_older_brother));
        numberStrings.add(new StringTuple("chota bhai", "younger brother",R.drawable.family_younger_brother));
        numberStrings.add(new StringTuple("badi didi", "older sister",R.drawable.family_older_sister));
        numberStrings.add(new StringTuple("choti bahan", "younger sister",R.drawable.family_younger_sister));
        numberStrings.add(new StringTuple("dadi", "grandmother",R.drawable.family_grandmother));
        numberStrings.add(new StringTuple("dada", "grandfather",R.drawable.family_grandfather));

        StringTupleAdapter itemsAdapter = new StringTupleAdapter(this, numberStrings, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);

    }
}
