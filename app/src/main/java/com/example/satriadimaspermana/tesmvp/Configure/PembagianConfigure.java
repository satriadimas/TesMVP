package com.example.satriadimaspermana.tesmvp.Configure;

import com.example.satriadimaspermana.tesmvp.Present.PembagianPresent;
import com.example.satriadimaspermana.tesmvp.View.Pembagian;

/**
 * Created by gits on Configurator
 */
public class PembagianConfigure {
    private static PembagianConfigure ourInstance = new PembagianConfigure();

    private PembagianConfigure() {
    }

    public static PembagianConfigure getInstance() {
        return ourInstance;
    }

    public void config(Pembagian activity) {
        PembagianPresent present = new PembagianPresent();
        present.output = activity;
        activity.input = present;
    }
}
