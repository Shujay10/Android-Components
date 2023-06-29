package com.example.stepper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView stepText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stepText = findViewById(R.id.stepText);
    }
    public void onStepClick(View view) {
        String step = "";
        switch (view.getId()) {
            case R.id.step1:
                step = "Step 1";
                break;
            case R.id.step2:
                step = "Step 2";
                break;
            case R.id.step3:
                step = "Step 3";
                break;
        }
        stepText.setText("Selected Step: " + step);
        showToast("Step selected: " + step);
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}