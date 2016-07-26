package com.example.satriadimaspermana.tesmvp.Configure;

import com.example.satriadimaspermana.tesmvp.Present.PenjumlahanPresent;
import com.example.satriadimaspermana.tesmvp.View.Penjumlahan;

/**
 * Created by gits on Configurator
 */
public class PenjumlahanConfigure {
    private static PenjumlahanConfigure ourInstance = new PenjumlahanConfigure();

    private PenjumlahanConfigure() {
    }

    public static PenjumlahanConfigure getInstance() {
        return ourInstance;
    }

    public void config(Penjumlahan activity) {
        PenjumlahanPresent present = new PenjumlahanPresent();
        present.output = activity;
        activity.input = present;
    }
}
