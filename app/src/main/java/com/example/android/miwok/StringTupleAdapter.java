package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class StringTupleAdapter extends ArrayAdapter<StringTuple> {

    private int mBackgroundColor;

    public StringTupleAdapter(@NonNull Context context, ArrayList<StringTuple> st, int backgroundColor) {
        super(context, 0, st);
        mBackgroundColor = backgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final StringTuple currentTouple = getItem(position);

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        ImageView iconView = listItemView.findViewById(R.id.img_vw_icon);

        if (currentTouple.isImageAvailable()) {
            iconView.setImageResource(currentTouple.getImageID());
            iconView.setVisibility(View.VISIBLE);
        } else {
            iconView.setVisibility(View.GONE);
        }

        LinearLayout llTextBoxes = listItemView.findViewById(R.id.ll_text_boxes);
        llTextBoxes.setBackgroundColor(ContextCompat.getColor(getContext(), mBackgroundColor));

        TextView mainTextView = listItemView.findViewById(R.id.txt_vw_main);
        mainTextView.setText(currentTouple.getMiWokTranslation());

        TextView subTextView = listItemView.findViewById(R.id.txt_vw_sub);
        subTextView.setText(currentTouple.getDefaultTranslation());

        return listItemView;
    }


}
