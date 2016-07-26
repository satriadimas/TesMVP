package com.example.satriadimaspermana.tesmvp.Configure;

import com.example.satriadimaspermana.tesmvp.View.Pengurangan;
import com.example.satriadimaspermana.tesmvp.Present.PenguranganPresent;

/**
 * Created by gits on Configurator
 */
public class PenguranganConfigure {
    private static PenguranganConfigure ourInstance = new PenguranganConfigure();

    private PenguranganConfigure() {
    }

    public static PenguranganConfigure getInstance() {
        return ourInstance;
    }

    public void config(Pengurangan activity) {
        PenguranganPresent present = new PenguranganPresent();
        present.output = activity;
        activity.input = present;
    }
}
