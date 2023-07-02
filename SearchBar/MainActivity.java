package com.example.searchbar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    private TextView searchResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchResultTextView = findViewById(R.id.searchResultTextView);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(this);

        return true;
    }
    @Override
    public boolean onQueryTextSubmit(String query) {
        performSearch(query);
        return true;
    }
    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
    private void performSearch(String query) {
        searchResultTextView.setText("Search query: " + query);
    }
}
