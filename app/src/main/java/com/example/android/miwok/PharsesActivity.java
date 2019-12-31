package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PharsesActivity extends AppCompatActivity {
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

        numberStrings.add(new StringTuple(R.raw.phrase_where_are_you_going, "tum kanha ja rahe ho?", "where are you going?"));
        numberStrings.add(new StringTuple(R.raw.phrase_what_is_your_name, "aapka naam kya hai?", "what is your name?"));
        numberStrings.add(new StringTuple(R.raw.phrase_my_name_is, "mera naam ... hai.", "my name is ..."));
        numberStrings.add(new StringTuple(R.raw.phrase_how_are_you_feeling, "aapko kaisa lag raha hai?", "how are you feeling?"));
        numberStrings.add(new StringTuple(R.raw.phrase_im_feeling_good, "mujhe achchha lag raha hai", "I am feeling good"));
        numberStrings.add(new StringTuple(R.raw.phrase_are_you_coming, "kya aap aa rahe ho?", "are you coming?"));
        numberStrings.add(new StringTuple(R.raw.phrase_yes_im_coming, "haan, main aa raha hun", "yes, I am coming."));
        numberStrings.add(new StringTuple(R.raw.phrase_im_coming, "main aa raha hun", "I am coming."));
        numberStrings.add(new StringTuple(R.raw.phrase_lets_go, "chalo chalen", "lets go."));
        numberStrings.add(new StringTuple(R.raw.phrase_come_here, "yanha aao", "come here"));

        StringTupleAdapter itemsAdapter = new StringTupleAdapter(this, numberStrings, R.color.category_phrases);
        ListView listView = findViewById(R.id.root_view_numbers);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long list_id) {
                releaseMediaPlayer();
                mClipPlayer = MediaPlayer.create(PharsesActivity.this, numberStrings.get(pos).getAudioClipId());

                mClipPlayer.start();
                //Toast.makeText(PharsesActivity.this, numberStrings.get(pos).getEnglishTranslation(), Toast.LENGTH_SHORT).show();
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
