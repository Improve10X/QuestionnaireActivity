package com.improve10x.questionnaireactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ComponentsActivity extends AppCompatActivity {
    Button radioBtn;
    Button checkBoxBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);
        handleInitView();
        handleRadioButtons();
        handleCheckBoxButton();

    }

    private void handleNavigateCheckBoxBtnActivity() {
        Intent intent = new Intent(this,CheckBoxeActivity.class);
        startActivity(intent);

    }

    private void handleNavigateRadioBtnActivity() {
        Intent intent = new Intent(this,RadioButtonActivity.class) ;
        startActivity(intent);
    }

    private void handleCheckBoxButton() {
        checkBoxBtn.setOnClickListener(view -> {
            handleNavigateCheckBoxBtnActivity();

        });
    }

    private void handleRadioButtons() {
        radioBtn.setOnClickListener(view -> {
            handleNavigateRadioBtnActivity();

        });

    }

    private void handleInitView() {
        radioBtn = findViewById(R.id.radio_btn1);
        checkBoxBtn = findViewById(R.id.checkbox_btn);
    }
}