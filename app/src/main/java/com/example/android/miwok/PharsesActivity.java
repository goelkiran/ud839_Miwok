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
        ArrayList<StringTouple> numberStrings = new ArrayList<StringTouple>();

        numberStrings.add(new StringTouple("tum kanha ja rahe ho?", "where are you going?"));
        numberStrings.add(new StringTouple("aapka naam kya hai?", "what is your name?"));
        numberStrings.add(new StringTouple("mera naam ... hai.", "my name is ..."));
        numberStrings.add(new StringTouple("aapko kaisa lag raha hai?", "how are you feeling?"));
        numberStrings.add(new StringTouple("mujhe achchha lag raha hai", "I am feeling good"));
        numberStrings.add(new StringTouple("kya aap aa rahe ho?", "are you coming?"));
        numberStrings.add(new StringTouple("haan, main aa raha hun", "yes, I am coming."));
        numberStrings.add(new StringTouple("main aa raha hun", "I am coming."));
        numberStrings.add(new StringTouple("chalo chalen", "lets go."));
        numberStrings.add(new StringTouple("yanha aao", "come here"));

        StringToupleAdapter itemsAdapter = new StringToupleAdapter(this, numberStrings, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);

    }
}
