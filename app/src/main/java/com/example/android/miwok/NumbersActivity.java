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

        numberStrings.add(new StringTouple("ek", "one", R.drawable.number_one));
        numberStrings.add(new StringTouple("do", "two",R.drawable.number_two));
        numberStrings.add(new StringTouple("teen", "three",R.drawable.number_three));
        numberStrings.add(new StringTouple("char", "four",R.drawable.number_four));
        numberStrings.add(new StringTouple("panch", "five",R.drawable.number_five));
        numberStrings.add(new StringTouple("chae", "six",R.drawable.number_seven));
        numberStrings.add(new StringTouple("saat", "seven",R.drawable.number_seven));
        numberStrings.add(new StringTouple("aath", "eight",R.drawable.number_eight));
        numberStrings.add(new StringTouple("nou", "nine",R.drawable.number_nine));
        numberStrings.add(new StringTouple("dus", "ten",R.drawable.number_ten));

        StringToupleAdapter itemsAdapter = new StringToupleAdapter(this, numberStrings, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);
        }
}
