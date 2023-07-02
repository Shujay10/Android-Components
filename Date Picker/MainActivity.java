package com.example.datepicker;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private Button datePickerButton;
    private TextView selectedDateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePickerButton = findViewById(R.id.datePickerButton);
        selectedDateTextView = findViewById(R.id.selectedDateTextView);
        datePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                                selectedDateTextView.setText(selectedDate);
                            }
                        }, year, month, dayOfMonth);
                datePickerDialog.show();
            }
        });
    }
}
