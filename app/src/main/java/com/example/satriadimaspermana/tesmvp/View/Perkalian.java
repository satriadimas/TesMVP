package com.example.satriadimaspermana.tesmvp.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.satriadimaspermana.tesmvp.Interface.PerkalianInput;
import com.example.satriadimaspermana.tesmvp.Interface.PerkalianOutput;
import com.example.satriadimaspermana.tesmvp.Configure.PerkalianConfigure;
import com.example.satriadimaspermana.tesmvp.Model.PerkalianModel;
import com.example.satriadimaspermana.tesmvp.R;

public class Perkalian extends AppCompatActivity implements PerkalianOutput {

    public PerkalianInput input;
    private EditText varA;
    private EditText varB;
    private TextView hasilHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkalian);
        PerkalianConfigure.getInstance().config(this);

        varA = (EditText) findViewById(R.id.varA);
        varB = (EditText) findViewById(R.id.varB);
        hasilHitung = (TextView) findViewById(R.id.txtHasil);

        doSomething();
    }

    private void doSomething() {
        input.doSomething("this", "input");
    }

    @Override
    public void displaySomething(PerkalianModel response) {
        Log.d("RESULT", "RESULT");
    }

    @Override
    public void displayHasil(String hasil) {

        hasilHitung.setText(hasil);

    }

    public void lakukanPerkalian(View view) {
        int va = Integer.parseInt(varA.getText().toString());
        int vb = Integer.parseInt(varB.getText().toString());
        input.doKali(va,vb);
    }
}
