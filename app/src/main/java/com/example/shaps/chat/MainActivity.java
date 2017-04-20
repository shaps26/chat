package com.example.shaps.chat;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    private Button ButtonLetsGo;
    private Button BtCreateSalon;
    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButtonLetsGo = (Button) findViewById(R.id.ButtonLetsGo);
        ButtonLetsGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSalon();
            }
        });


        //code dialogue Box

        activity = this;
        BtCreateSalon = (Button) findViewById(R.id.ButtonCreateSalon);
        BtCreateSalon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                final View view = inflater.inflate(R.layout.formsalon, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setView(view)

                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                View editText= view.findViewById(R.id.salonname);
                            }
                        })
                        .setNegativeButton("annuler", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // User cancelled the dialog
                            }
                        });
                // Create the AlertDialog object and return it
                AlertDialog dialog = builder.create();
                dialog.show();
            }

        });

    }



    public void goToSalon(){
        Intent SalonIntent = new Intent(getApplicationContext(), SalonActivity.class);
        startActivity(SalonIntent);

    }


}
