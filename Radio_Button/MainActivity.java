package com.example.radiobutton;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        radioButton5 = findViewById(R.id.radioButton5);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String message;
                switch (checkedId) {
                    case R.id.radioButton1:
                        message = "Radio Button 1 selected";
                        break;
                    case R.id.radioButton2:
                        message = "Radio Button 2 selected";
                        break;
                    case R.id.radioButton3:
                        message = "Radio Button 3 selected";
                        break;
                    case R.id.radioButton4:
                        message = "Radio Button 4 selected";
                        break;
                    case R.id.radioButton5:
                        message = "Radio Button 5 selected";
                        break;
                    default:
                        message = "No radio button selected";
                        break;
                }
                showToast(message);
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
