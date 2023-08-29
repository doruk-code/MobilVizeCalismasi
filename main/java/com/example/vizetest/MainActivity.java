package com.example.vizetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView tvyazdir;
        Button btncevap;
        EditText tvAd;
        RadioGroup rgCinsiyet;
        RadioButton rbKadin;
        RadioButton rbErkek;
        CheckBox cbJava;
        CheckBox cbKotlin;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvyazdir=findViewById(R.id.tvyazdir);
        btncevap=findViewById(R.id.btncevap);
        tvAd=findViewById(R.id.tvAd);
        rgCinsiyet=findViewById(R.id.rgCinsiyet);
        rbErkek=findViewById(R.id.rbErkek);
        rbKadin=findViewById(R.id.rbKadin);
        cbJava=findViewById(R.id.cbJava);
        cbKotlin=findViewById(R.id.cbKotlin);

        if (cbJava.isChecked()==true)
        {
            tvyazdir.setText("Java");

        }

        btncevap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String abc;

                if (rbErkek.isChecked()) {
                    abc=rbErkek.getText().toString();
                }else {
                    abc=rbKadin.getText().toString();
                }
                tvyazdir.setText(tvAd.getText()+" " + abc);

            }
        });

    }
}