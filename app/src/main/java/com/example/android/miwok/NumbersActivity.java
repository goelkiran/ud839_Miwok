package com.example.android.miwok;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

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


        LinearLayout llNumbers = (LinearLayout) findViewById(R.id.root_view_numbers);

        int ii = 0;
        while (ii < numberStrings.size()) {
            TextView numberWord = new TextView(this);
            numberWord.setText(numberStrings.get(ii));
            llNumbers.addView(numberWord);

            Log.v("MiWok Number Activity", "Word at index [" + ii + "] = " + numberStrings.get(ii));

            ii++;
        }

    }
}
