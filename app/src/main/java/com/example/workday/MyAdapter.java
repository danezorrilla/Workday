package com.example.workday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter<TimeOffDates> {

    public MyAdapter(@NonNull Context context, int resource, @NonNull List<TimeOffDates> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.time_off_date,
                    parent, false);
        }

        TimeOffDates timeOffDates = getItem(position);
        TextView textView = convertView.findViewById(R.id.time_off_date_tv);

        textView.setText(timeOffDates.getDate());

        return convertView;
    }
}
