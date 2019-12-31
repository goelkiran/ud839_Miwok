package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mClipPlayer;
    private MediaPlayer.OnCompletionListener mOnCompleteListner = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.string_touples);

        //String[] NumberStrings = new String[10];
        final ArrayList<StringTuple> numberStrings = new ArrayList<StringTuple>();

        numberStrings.add(new StringTuple(R.raw.family_father, "pita", "father", R.drawable.family_father));
        numberStrings.add(new StringTuple(R.raw.family_mother, "mata", "mother", R.drawable.family_mother));
        numberStrings.add(new StringTuple(R.raw.family_son, "putr/beta", "son", R.drawable.family_son));
        numberStrings.add(new StringTuple(R.raw.family_daughter, "putri/beti", "daughter", R.drawable.family_daughter));
        numberStrings.add(new StringTuple(R.raw.family_older_brother, "bada bhai", "older brother", R.drawable.family_older_brother));
        numberStrings.add(new StringTuple(R.raw.family_younger_brother, "chota bhai", "younger brother", R.drawable.family_younger_brother));
        numberStrings.add(new StringTuple(R.raw.family_older_sister, "badi didi", "older sister", R.drawable.family_older_sister));
        numberStrings.add(new StringTuple(R.raw.family_younger_sister, "choti bahan", "younger sister", R.drawable.family_younger_sister));
        numberStrings.add(new StringTuple(R.raw.family_grandmother, "dadi", "grandmother", R.drawable.family_grandmother));
        numberStrings.add(new StringTuple(R.raw.family_grandfather, "dada", "grandfather", R.drawable.family_grandfather));

        StringTupleAdapter itemsAdapter = new StringTupleAdapter(this, numberStrings, R.color.category_family);
        ListView listView = findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long list_id) {
                releaseMediaPlayer();
                mClipPlayer = MediaPlayer.create(FamilyActivity.this, numberStrings.get(pos).getAudioClipId());

                mClipPlayer.start();
                //Toast.makeText(FamilyActivity.this, numberStrings.get(pos).getEnglishTranslation(), Toast.LENGTH_SHORT).show();
                mClipPlayer.setOnCompletionListener(mOnCompleteListner);


            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mClipPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mClipPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mClipPlayer = null;
        }
    }
}
