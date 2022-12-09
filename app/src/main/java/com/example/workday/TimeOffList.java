package com.example.workday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class TimeOffList extends AppCompatActivity {

    ListView listView;
    static ArrayList<TimeOffDates> timeOffLists = new ArrayList<>();
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_off_list);

        Intent intent = getIntent();
        String date = intent.getStringExtra("Date");

        timeOffLists.add(new TimeOffDates(date));


        listView = findViewById(R.id.time_off_dialog_lv);
        adapter = new MyAdapter(this, R.layout.time_off_date, timeOffLists);
        listView.setAdapter(adapter);

    }
}