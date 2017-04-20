package com.example.shaps.chat.model;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.shaps.chat.R;

import java.util.ArrayList;

/**
 * Created by shaps on 18/04/17.
 */

public class AdapterSalon extends BaseAdapter {

    private Activity context;
    private ArrayList<Salon> salons;

    public AdapterSalon(Activity context, ArrayList<Salon> salons) {
        this.context = context;
        this.salons = salons;
    }

    public Activity getContext() {
        return context;
    }

    public void setContext(Activity context) {
        this.context = context;
    }

    public ArrayList<Salon> getSalons() {
        return salons;
    }

    public void setSalons(ArrayList<Salon> salons) {
        this.salons = salons;
    }

    @Override
    public int getCount() {
        return  salons.size();
    }

    @Override
    public Object getItem(int position) {
        return salons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.adapteur_salons, null);
        TextView textViewSalonName = (TextView) rowView.findViewById(R.id.valueSalonName);

        textViewSalonName.setText(salons.get(position).getName());
        return rowView;
    }


}
