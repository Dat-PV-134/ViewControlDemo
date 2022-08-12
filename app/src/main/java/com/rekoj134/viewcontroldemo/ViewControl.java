package com.rekoj134.viewcontroldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ViewControl extends AppCompatActivity {
    Button btnDangKi;
    EditText etName, etPass, etPhoneNumber;
    CheckBox chOk;
    SeekBar seeBar;
    RadioButton radioButtonMale, radioButtonFemale;
    RatingBar ratingBar;
    ToggleButton toggleButton;
    Switch aSwitch;
    String name;
    String pass;
    String phoneNumber;
    String textDieuKhoan;
    boolean aBoolean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_control);

        btnDangKi = findViewById(R.id.btnDangKi);
        etName = findViewById(R.id.etName);
        etPass = findViewById(R.id.etPass);
        etPhoneNumber = findViewById(R.id.etPhoneNumber);
        chOk = findViewById(R.id.cbOk);
        seeBar = findViewById(R.id.seeBar);
        radioButtonMale = findViewById(R.id.radioMale);
        radioButtonFemale = findViewById(R.id.radioFemail);
        ratingBar = findViewById(R.id.ratingBar);
        toggleButton = findViewById(R.id.toggleBtn);
        aSwitch = findViewById(R.id.switchNew);

        btnDangKi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = etName.getText().toString();
                pass = etPass.getText().toString();
                phoneNumber = etPhoneNumber.getText().toString();
                aBoolean = chOk.isChecked();
                if (aBoolean) textDieuKhoan = "OK";
                else textDieuKhoan = "Not OK";

                int age = seeBar.getProgress();

                String gender = radioButtonMale.isChecked() ? "Male" : "Female";

                float rating = ratingBar.getRating();
                String togg = toggleButton.isChecked() ? "ON" : "OFF";
                String strs = aSwitch.isChecked() ? "Mở" : "Đóng";

                Toast.makeText(getBaseContext(), name + "\n" + pass + "\n" + phoneNumber +
                        "\n" + textDieuKhoan + "\n" + "Tuoi: " + age + "\n" + "Gender: " + gender + "\n"
                        + "Rating: " + rating + "\n" + "ToggleButton: " + togg + "\n" + "Switch: " + strs
                        , Toast.LENGTH_LONG).show();
            }
        });
    }
}