package com.example.widget3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("Mon1", "EIElab");
        map1.put("Mon2", "EIElab");
        map1.put("Mon3", "Break");
        map1.put("Mon4", "BIO");
        map1.put("Mon5", "Lunch");
        map1.put("Mon6", "CSElab");
        map1.put("Mon7", "CSElab");
        map1.put("Mon8", "Break");
        map1.put("Mon9", "Math");
        map1.put("Mon6", "NA");




        // Create a set of strings to store in the preferences
        HashSet<HashMap<String, String>> myStringSet = new HashSet<>();
        myStringSet.add(map1);






        List<String> integerList = new ArrayList<String>();
        integerList.add( "EIElab");
        integerList.add( "EIElab");
        integerList.add( "Break");
        integerList.add( "BIO");
        integerList.add( "Lunch");
        integerList.add( "CSElab");
        integerList.add( "CSElab");
        integerList.add( "Break");
        integerList.add( "Math");
        integerList.add( "NA");
        SharedPreferences sharedPreferences = getSharedPreferences("data",MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        Gson gson = new Gson();
        String listJson = gson.toJson(integerList);
        //String jsonString = new Gson().toJson(myStringSet);
       // myEdit.putString("timetable",jsonString);
        myEdit.putString("listKey", listJson);
        myEdit.apply();





    }

}