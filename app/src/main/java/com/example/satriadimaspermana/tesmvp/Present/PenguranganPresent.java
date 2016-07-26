package com.example.satriadimaspermana.tesmvp.Present;

import com.example.satriadimaspermana.tesmvp.Interface.PenguranganInput;
import com.example.satriadimaspermana.tesmvp.Interface.PenguranganOutput;
import com.example.satriadimaspermana.tesmvp.Model.PenguranganModel;

/**
 * Created by gits on VIP.
 * Present for process
 */
public class PenguranganPresent implements PenguranganInput {
    public PenguranganOutput output;
    private int hasil;

    @Override
    public void doSomething(String strA, String strB) {
        PenguranganModel response = new PenguranganModel();
        response.setVarA(strA);
        response.setVarB(strB);
        output.displaySomething(response);
    }

    @Override
    public void doPengurangan(int varA, int varB) {
        hasil = varA - varB;
        output.displayHasil(String.valueOf(hasil));
    }

}