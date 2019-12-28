package com.example.android.miwok;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PharsesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.string_touples);

        //String[] NumberStrings = new String[10];
        ArrayList<StringTuple> numberStrings = new ArrayList<StringTuple>();

        numberStrings.add(new StringTuple("tum kanha ja rahe ho?", "where are you going?"));
        numberStrings.add(new StringTuple("aapka naam kya hai?", "what is your name?"));
        numberStrings.add(new StringTuple("mera naam ... hai.", "my name is ..."));
        numberStrings.add(new StringTuple("aapko kaisa lag raha hai?", "how are you feeling?"));
        numberStrings.add(new StringTuple("mujhe achchha lag raha hai", "I am feeling good"));
        numberStrings.add(new StringTuple("kya aap aa rahe ho?", "are you coming?"));
        numberStrings.add(new StringTuple("haan, main aa raha hun", "yes, I am coming."));
        numberStrings.add(new StringTuple("main aa raha hun", "I am coming."));
        numberStrings.add(new StringTuple("chalo chalen", "lets go."));
        numberStrings.add(new StringTuple("yanha aao", "come here"));

        StringTupleAdapter itemsAdapter = new StringTupleAdapter(this, numberStrings, R.color.category_phrases);
        ListView listView = findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);

    }
}
