package com.example.newproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
public class AlgorithmAdapter extends ArrayAdapter<AlgorithmItem> {
    public AlgorithmAdapter(Context context, ArrayList<AlgorithmItem> algorithmList)
    {
        super(context, 0, algorithmList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        return initView(position, convertView, parent);
    }
    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        return initView(position, convertView, parent);
    }
    private View initView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_spinner_item, parent, false);
        }

        TextView textViewName = convertView.findViewById(R.id.text_view);
        AlgorithmItem currentItem = getItem(position);

        if (currentItem != null) {
            textViewName.setText(currentItem.getAlgorithmName());
        }
        return convertView;
    }
}
