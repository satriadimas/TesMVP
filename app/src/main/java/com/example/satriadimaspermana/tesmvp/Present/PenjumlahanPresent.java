package com.example.satriadimaspermana.tesmvp.Present;

import com.example.satriadimaspermana.tesmvp.Interface.PenjumlahanInput;
import com.example.satriadimaspermana.tesmvp.Interface.PenjumlahanOutput;
import com.example.satriadimaspermana.tesmvp.Model.PenjumlahanModel;

/**
 * Created by gits on VIP.
 * Present for process
 */
public class PenjumlahanPresent implements PenjumlahanInput {
    public PenjumlahanOutput output;
    private int hasil;

    @Override
    public void doSomething(String strA, String strB) {
        PenjumlahanModel response = new PenjumlahanModel();
        response.setVarA(strA);
        response.setVarB(strB);
        output.displaySomething(response);
    }

    @Override
    public void doTambah(int varA, int varB) {
        hasil = varA + varB;
        output.displayHasil(String.valueOf(hasil));
    }

}