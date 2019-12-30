package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class StringTupleAdapter extends ArrayAdapter<StringTuple> {

    private int mBackgroundColor;
    private MediaPlayer mClipPlayer;

    public StringTupleAdapter(@NonNull Context context, ArrayList<StringTuple> st, int backgroundColor) {
        super(context, 0, st);
        mBackgroundColor = backgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        final StringTuple currentTouple = getItem(position);

        TextView mainTextView = listItemView.findViewById(R.id.txt_vw_main);
        mainTextView.setText(currentTouple.getMiWokTranslation());
        mainTextView.setBackgroundColor(ContextCompat.getColor(getContext(), mBackgroundColor));

        TextView subTextView = listItemView.findViewById(R.id.txt_vw_sub);
        subTextView.setText(currentTouple.getDefaultTranslation());
        subTextView.setBackgroundColor(ContextCompat.getColor(getContext(), mBackgroundColor));

        ImageView iconView = listItemView.findViewById(R.id.img_vw_icon);

        if (currentTouple.isImageAvailable()) {
            iconView.setImageResource(currentTouple.getImageID());
            iconView.setVisibility(View.VISIBLE);
        } else {
            iconView.setVisibility(View.GONE);
        }

        ImageButton playButton = listItemView.findViewById(R.id.imgbtn_vw);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(), currentTouple.getEnglishTranslation(), Toast.LENGTH_SHORT).show();
                mClipPlayer = MediaPlayer.create(getContext(),currentTouple.getAudioClipId());
                mClipPlayer.start();
            }
        });
        return listItemView;

    }
}
