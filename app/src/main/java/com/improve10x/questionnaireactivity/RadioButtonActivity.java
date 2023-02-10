package com.improve10x.questionnaireactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {
   RadioGroup radioRg;
   Button radioVerifyBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio1_button);
        handleInitView();
        handleVerifyBtn();
    }

    private void handleVerifyBtn() {
        radioVerifyBtn.setOnClickListener(v -> {
            boolean result = isCorrect();
            showResults(result);
        });
    }

    private boolean isCorrect() {
        int selectedRb = radioRg.getCheckedRadioButtonId();
        boolean result = false;
        if (selectedRb == R.id.eight_rb){
            result = true;
        }
    return result;
    }

    private void showResults(boolean result) {
        if (result){
            Toast.makeText(this, "Correct answer ", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
        }

    }

    private void handleInitView() {
      radioVerifyBtn = findViewById(R.id.radioverify_btn);
      radioRg = findViewById(R.id.radio_rg);

    }
}