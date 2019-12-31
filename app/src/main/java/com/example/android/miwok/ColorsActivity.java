package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
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

        numberStrings.add(new StringTuple(R.raw.color_red, "लाल", "red", R.drawable.color_red));
        numberStrings.add(new StringTuple(R.raw.color_green, "hara", "green", R.drawable.color_green));
        numberStrings.add(new StringTuple(R.raw.color_brown, "bhura", "brown", R.drawable.color_brown));
        numberStrings.add(new StringTuple(R.raw.color_dusty_yellow, "matmaila", "dusty yellow", R.drawable.color_dusty_yellow));
        numberStrings.add(new StringTuple(R.raw.color_white, "safaed", "white", R.drawable.color_white));
        numberStrings.add(new StringTuple(R.raw.color_mustard_yellow, "gulabi", "mustered yellow", R.drawable.color_mustard_yellow));
        numberStrings.add(new StringTuple(R.raw.color_black, "kala", "black", R.drawable.color_black));
        numberStrings.add(new StringTuple(R.raw.color_gray, "salati", "gray", R.drawable.color_gray));

        StringTupleAdapter itemsAdapter = new StringTupleAdapter(this, numberStrings, R.color.category_colors);
        ListView listView = findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long list_id) {
                mClipPlayer = MediaPlayer.create(ColorsActivity.this, numberStrings.get(pos).getAudioClipId());
                releaseMediaPlayer();
                mClipPlayer.start();
                //Toast.makeText(ColorsActivity.this, numberStrings.get(pos).getEnglishTranslation(), Toast.LENGTH_SHORT).show();

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
