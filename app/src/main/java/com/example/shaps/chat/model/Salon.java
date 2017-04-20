package com.example.shaps.chat.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shaps on 18/04/17.
 */

public class Salon {

    private String name;

    public Salon(String name) {
        this.name = name;
    }


    public static ArrayList salonDefault(){

        Salon[] salonMessenger = {

                new Salon("salon des dev"),
                new Salon("salon du president"),
                new Salon("salon de mounira"),
                new Salon("salon de joan"),
                new Salon("salon de guillaume"),
                new Salon("salon de salif"),
                new Salon("salon de julien"),
                new Salon("salon de shaps"),
                new Salon("salon de yousri"),
                new Salon("salon de lebib")

        };

        List<Salon> tmpList = Arrays.asList(salonMessenger);
        ArrayList<Salon> salonMessagerieList = new ArrayList<Salon>(tmpList);

        return salonMessagerieList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
