package com.example.satriadimaspermana.tesmvp.Present;

import com.example.satriadimaspermana.tesmvp.Interface.PerkalianInput;
import com.example.satriadimaspermana.tesmvp.Interface.PerkalianOutput;
import com.example.satriadimaspermana.tesmvp.Model.PerkalianModel;

/**
 * Created by gits on VIP.
 * Present for process
 */
public class PerkalianPresent implements PerkalianInput {
    public PerkalianOutput output;
    private int hasil;

    @Override
    public void doSomething(String strA, String strB) {
        PerkalianModel response = new PerkalianModel();
        response.setVarA(strA);
        response.setVarB(strB);
        output.displaySomething(response);
    }

    @Override
    public void doKali(int varA, int varB) {
        hasil = varA * varB;
        output.displayHasil(String.valueOf(hasil));
    }

}