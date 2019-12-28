package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class StringToupleAdapter extends ArrayAdapter<StringTouple> {


    public StringToupleAdapter(@NonNull Context context, ArrayList<StringTouple> st) {
        super(context, 0, st);
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

        // Get the {@link AndroidFlavor} object located at this position in the list
        StringTouple currentTouple = getItem(position);

        TextView mainTextView = (TextView) listItemView.findViewById(R.id.txt_vw_main);
        mainTextView.setText(currentTouple.getMiWokTranslation());

        TextView subTextView = (TextView) listItemView.findViewById(R.id.txt_vw_sub);
        subTextView.setText(currentTouple.getDefaultTranslation());

        //ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        //iconView.setImageResource(currentTouple.getImageResourceId());

        return listItemView;

    }
}
