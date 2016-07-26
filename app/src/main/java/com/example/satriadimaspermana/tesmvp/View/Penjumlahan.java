package com.example.satriadimaspermana.tesmvp.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.satriadimaspermana.tesmvp.Interface.PenjumlahanInput;
import com.example.satriadimaspermana.tesmvp.Interface.PenjumlahanOutput;
import com.example.satriadimaspermana.tesmvp.Configure.PenjumlahanConfigure;
import com.example.satriadimaspermana.tesmvp.Model.PenjumlahanModel;
import com.example.satriadimaspermana.tesmvp.R;

public class Penjumlahan extends AppCompatActivity implements PenjumlahanOutput {

    public PenjumlahanInput input;
    private EditText varA;
    private EditText varB;
    private TextView hasilHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjumlahan);
        PenjumlahanConfigure.getInstance().config(this);

        varA = (EditText) findViewById(R.id.varA);
        varB = (EditText) findViewById(R.id.varB);
        hasilHitung = (TextView) findViewById(R.id.txtHasil);

        doSomething();
    }

    private void doSomething() {
        input.doSomething("this", "input");
    }

    @Override
    public void displaySomething(PenjumlahanModel response) {
        Log.d("RESULT", "RESULT");
    }

    @Override
    public void displayHasil(String hasil) {

        hasilHitung.setText(hasil);
    }

    public void lakukanPenjumlahan(View view) {
        int va = Integer.parseInt(varA.getText().toString());
        int vb = Integer.parseInt(varB.getText().toString());
        input.doTambah(va,vb);
    }
}
