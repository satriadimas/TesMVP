package com.example.satriadimaspermana.tesmvp.Configure;

import com.example.satriadimaspermana.tesmvp.Present.PerkalianPresent;
import com.example.satriadimaspermana.tesmvp.View.Perkalian;

/**
 * Created by gits on Configurator
 */
public class PerkalianConfigure {
    private static PerkalianConfigure ourInstance = new PerkalianConfigure();

    private PerkalianConfigure() {
    }

    public static PerkalianConfigure getInstance() {
        return ourInstance;
    }

    public void config(Perkalian activity) {
        PerkalianPresent present = new PerkalianPresent();
        present.output = activity;
        activity.input = present;
    }
}
