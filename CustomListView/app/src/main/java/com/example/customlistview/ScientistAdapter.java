package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ScientistAdapter extends ArrayAdapter<Scientist> {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        Scientist cs=getItem(position);

        if(convertView==null)
        {
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.item_scientist,parent,false);
        }

        TextView name=convertView.findViewById(R.id.name);
        TextView id=convertView.findViewById((R.id.id));

        name.setText(cs.getName());
        id.setText(cs.getId());

        return convertView;
    }
//0 for create our view
    public ScientistAdapter (@NonNull Context context, List<Scientist> scientistList) {
        super(context, 0,scientistList);
    }
}
