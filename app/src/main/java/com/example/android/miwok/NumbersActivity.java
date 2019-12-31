package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

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
        final ListView listView = findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long list_id) {

                Log.v("Number Activity", "Current tuple = " + numberStrings.get(pos));
                releaseMediaPlayer();
                mClipPlayer = MediaPlayer.create(NumbersActivity.this, numberStrings.get(pos).getAudioClipId());
                mClipPlayer.start();
                //Toast.makeText(NumbersActivity.this, numberStrings.get(pos).getEnglishTranslation(), Toast.LENGTH_SHORT).show();
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
