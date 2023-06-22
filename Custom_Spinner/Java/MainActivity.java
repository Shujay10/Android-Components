package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<AlgorithmItem> algorithmItems;
    AlgorithmAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
        Spinner spinner = findViewById(R.id.spinner_algorithm);
        adapter = new AlgorithmAdapter(this, algorithmItems);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                    {
                        AlgorithmItem clickedItem = (AlgorithmItem)
                                parent.getItemAtPosition(position);
                        String name = clickedItem.getAlgorithmName();
                        Toast.makeText(MainActivity.this, name + " selected", Toast.LENGTH_SHORT).show();
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent)
                    {
                    }
                });
    }
    private void initList()
    {
        algorithmItems = new ArrayList<>();
        algorithmItems.add(new AlgorithmItem("Option 1"));
        algorithmItems.add(new AlgorithmItem("Option 2"));
        algorithmItems.add(new AlgorithmItem("Option 3"));
        algorithmItems.add(new AlgorithmItem("Option 4"));
        algorithmItems.add(new AlgorithmItem("Option 5"));
    }
}
