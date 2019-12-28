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
        ArrayList<StringTuple> numberStrings = new ArrayList<StringTuple>();

        numberStrings.add(new StringTuple("ek", "one", R.drawable.number_one));
        numberStrings.add(new StringTuple("do", "two",R.drawable.number_two));
        numberStrings.add(new StringTuple("teen", "three",R.drawable.number_three));
        numberStrings.add(new StringTuple("char", "four",R.drawable.number_four));
        numberStrings.add(new StringTuple("panch", "five",R.drawable.number_five));
        numberStrings.add(new StringTuple("chae", "six",R.drawable.number_seven));
        numberStrings.add(new StringTuple("saat", "seven",R.drawable.number_seven));
        numberStrings.add(new StringTuple("aath", "eight",R.drawable.number_eight));
        numberStrings.add(new StringTuple("nou", "nine",R.drawable.number_nine));
        numberStrings.add(new StringTuple("dus", "ten",R.drawable.number_ten));

        StringTupleAdapter itemsAdapter = new StringTupleAdapter(this, numberStrings, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);
        }
}
