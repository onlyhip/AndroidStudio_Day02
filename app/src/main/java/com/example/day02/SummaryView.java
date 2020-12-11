package com.example.day02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class SummaryView extends AppCompatActivity {

    CheckBox chkFilm, chkFPT, chkClip;
    Button btnConfirm;
    TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_view);

        linkViews();
        addEvents();
    }


    private void linkViews() {
        chkFilm = findViewById(R.id.chkFilm);
        chkFPT = findViewById(R.id.chkFPT);
        chkClip = findViewById(R.id.chkClip);
        btnConfirm = findViewById(R.id.btnConfirm);
        txtResult = findViewById(R.id.txtResult);
    }


    private void addEvents() {
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "You choose: ";
                if (chkFilm.isChecked()) {
                    result += chkFilm.getText() + ", ";
                }
                if (chkFPT.isChecked()) {
                    result += chkFPT.getText() + ", ";
                }
                if (chkClip.isChecked()) {
                    result += chkClip.getText();
                }
                txtResult.setText(result);
            }
        });
    }
}