package com.example.satriadimaspermana.tesmvp.Present;

import com.example.satriadimaspermana.tesmvp.Interface.PembagianInput;
import com.example.satriadimaspermana.tesmvp.Interface.PembagianOutput;
import com.example.satriadimaspermana.tesmvp.Model.PembagianModel;

/**
 * Created by gits on VIP.
 * Present for process
 */
public class PembagianPresent implements PembagianInput {
    public PembagianOutput output;
    private int hasil;

    @Override
    public void doSomething(String strA, String strB) {
        PembagianModel response = new PembagianModel();
        response.setVarA(strA);
        response.setVarB(strB);
        output.displaySomething(response);
    }

    @Override
    public void doPembagian(int varA, int varB) {
        hasil = varA/varB;
        output.displayHasil(String.valueOf(hasil));
    }

}