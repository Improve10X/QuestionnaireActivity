package com.improve10x.questionnaireactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxeActivity extends AppCompatActivity {
    CheckBox mercuryCb;
    CheckBox sunCb;
    CheckBox moonCb;
    CheckBox jupiterCb;
    CheckBox saturnCb;
    CheckBox plutoCb;
    Button verifyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkboxes_button);
        handleInitView();
        handleVerifyBtn();
    }

    private void handleVerifyBtn() {
        verifyBtn.setOnClickListener(v -> {
            boolean result = isCorrect();
            showResult(result);

        });
    }
    private void handleInitView() {
        mercuryCb = findViewById(R.id.mercury_cb);
        sunCb = findViewById(R.id.sun_cb);
        moonCb = findViewById(R.id.moon_cb);
        jupiterCb = findViewById(R.id.jupiter_cb);
        saturnCb = findViewById(R.id.saturn_cb);
        plutoCb = findViewById(R.id.pluto_cb);
        verifyBtn = findViewById(R.id.verify_btn);
    }

    public boolean isCorrect() {
        boolean checkedMercury = mercuryCb.isChecked();
        boolean checkedJupiter = jupiterCb.isChecked();
        boolean checkedSaturn = saturnCb.isChecked();
        boolean checkedSun = sunCb.isChecked();
        boolean checkedMoon = moonCb.isChecked();
        boolean checkedPluto = plutoCb.isChecked();
        boolean result = false;
        if (checkedMercury == true && checkedJupiter == true && checkedSaturn == true && checkedMoon == false && checkedSun == false && checkedPluto == false) {
            result = true;
        }
        return result;
    }
    public void showResult(boolean result){
        if (result){
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
    }
}
}