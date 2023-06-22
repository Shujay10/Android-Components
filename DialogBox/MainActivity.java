package com.example.dialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        AlertDialog.Builder base = new AlertDialog.Builder(MainActivity.this);
        base.setMessage("This is a dialog box");
        base.setTitle("Dialog Box");

        base.setPositiveButton("close", (DialogInterface.OnClickListener) (dialog, which) -> {
            dialog.cancel();
        });
        AlertDialog alertDialog = base.create();
        alertDialog.show();



    }
}