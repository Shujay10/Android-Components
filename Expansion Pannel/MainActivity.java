package com.example.expansionpannel;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private MaterialButton toggleButton;
    private LinearLayout contentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toggleButton);
        contentLayout = findViewById(R.id.contentLayout);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleExpansion();
            }
        });
    }

    private void toggleExpansion() {
        if (contentLayout.getVisibility() == View.VISIBLE) {
            contentLayout.setVisibility(View.GONE);
            toggleButton.setText("Expand");
        } else {
            contentLayout.setVisibility(View.VISIBLE);
            toggleButton.setText("Collapse");
        }
    }
}
