package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mClipPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.string_touples);

        //String[] NumberStrings = new String[10];
        ArrayList<StringTuple> numberStrings = new ArrayList<StringTuple>();

        numberStrings.add(new StringTuple(R.raw.number_one, "ek", "one", R.drawable.number_one));
        numberStrings.add(new StringTuple(R.raw.number_two, "do", "two", R.drawable.number_two));
        numberStrings.add(new StringTuple(R.raw.number_three, "teen", "three", R.drawable.number_three));
        numberStrings.add(new StringTuple(R.raw.number_four, "char", "four", R.drawable.number_four));
        numberStrings.add(new StringTuple(R.raw.number_five, "panch", "five", R.drawable.number_five));
        numberStrings.add(new StringTuple(R.raw.number_six, "chae", "six", R.drawable.number_seven));
        numberStrings.add(new StringTuple(R.raw.number_seven, "saat", "seven", R.drawable.number_seven));
        numberStrings.add(new StringTuple(R.raw.number_eight, "aath", "eight", R.drawable.number_eight));
        numberStrings.add(new StringTuple(R.raw.number_nine, "nou", "nine", R.drawable.number_nine));
        numberStrings.add(new StringTuple(R.raw.number_ten, "dus", "ten", R.drawable.number_ten));

        final StringTupleAdapter itemsAdapter = new StringTupleAdapter(this, numberStrings, R.color.category_numbers);
        ListView listView = findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mClipPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_one);
                mClipPlayer.start();
                //Toast.makeText(NumbersActivity.this, "Testing" , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
