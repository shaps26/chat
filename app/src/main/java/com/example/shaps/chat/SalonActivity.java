package com.example.shaps.chat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.example.shaps.chat.model.AdapterSalon;
import com.example.shaps.chat.model.Salon;

import java.util.ArrayList;

/**
 * Created by shaps on 18/04/17.
 */

public class SalonActivity extends AppCompatActivity {

    private ListView listViewSalon;
    private ArrayList<Salon> salons;
    private AdapterSalon adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salons);

        listViewSalon = (ListView) findViewById(R.id.ListSalon);
        salons = Salon.salonDefault();
        adapter = new AdapterSalon(this, salons);
        listViewSalon.setAdapter(adapter);

        listViewSalon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                goToMessage();
            }
        });

    }


    public void goToMessage(){
        Intent MessageIntent = new Intent(getApplicationContext(), MessageActivity.class);
        startActivity(MessageIntent);

    }

}



