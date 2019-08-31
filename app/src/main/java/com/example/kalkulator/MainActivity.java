package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText vtxtA, vtxtB , vtxtC;

    protected float ytxtA, ytxtB,ytxtC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vtxtA = (EditText) findViewById(R.id.txtA);
        vtxtB = (EditText) findViewById(R.id.txtB);
        vtxtC = (EditText) findViewById(R.id.txtC);

        Button vBtnTambah = (Button) findViewById(R.id.btnTambah);
        Button vBtnKurang = (Button)findViewById(R.id.btnKurang);
        Button vBtnKali = (Button)findViewById(R.id.btnKali);
        Button vBtnBagi = (Button)findViewById(R.id.btnBagi);

        vBtnTambah.setOnClickListener(this);
        vBtnKurang.setOnClickListener(this);
        vBtnKali.setOnClickListener(this);
        vBtnBagi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        ytxtA = Float.parseFloat(vtxtA.getText().toString());
        ytxtB = Float.parseFloat(vtxtB.getText().toString());

        switch (view.getId()) {
            case R.id.btnTambah:
                ytxtC = ytxtA + ytxtB;
                vtxtC.setText(Float.toString(ytxtC));
                break;
            case R.id.btnKurang:
                ytxtC = ytxtA - ytxtB;
                vtxtC.setText(Float.toString(ytxtC));
                break;
            case R.id.btnKali:
                ytxtC = ytxtA * ytxtB;
                vtxtC.setText(Float.toString(ytxtC));
                break;
            case R.id.btnBagi:
                ytxtC = ytxtA / ytxtB;
                vtxtC.setText(Float.toString(ytxtC));
                break;

        }
    }
}
