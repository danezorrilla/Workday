package com.example.workday;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity {

    CalendarView calendarView;
    Button timeOffButton;
    String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = findViewById(R.id.calendar_view);
        timeOffButton = findViewById(R.id.view_TO_button);

        calendarView.setOnDateChangeListener((calendarView, year, month, dayOfMonth) -> {
            date = "" + (month + 1) + "/" + dayOfMonth + "/" + year;
        });

        timeOffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeOffList();
            }
        });
    }

    private void openTimeOffList(){
        Intent intent = new Intent(this, TimeOffList.class);
        intent.putExtra("Date", date);
        startActivity(intent);
    }
}