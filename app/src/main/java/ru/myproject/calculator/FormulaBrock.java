package ru.myproject.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class FormulaBrock extends AppCompatActivity {

    CheckBox cbWoman;
    CheckBox cbMan;
    EditText etHeight_value;
    TextView tvWeight_value;
    String result;
    Double d;
    Button btnCalculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formula_brock);

        cbWoman = findViewById(R.id.woman);
        cbMan = findViewById(R.id.man);
        etHeight_value = findViewById(R.id.input_height);
        tvWeight_value = findViewById(R.id.weight_value);
        btnCalculate=findViewById(R.id.calculate);

        btnCalculate.setOnClickListener(v -> {
            if (cbWoman.isChecked()) {
                result = etHeight_value.getText().toString(); //получили то, что ввел пользователь
                d = (Double.parseDouble(result) - 110) * (1.15); //перевели в цифру и посчитали
                result = (Double.toString(d)); //вернули в строку
                result+=getResources().getString(R.string.add_kg);
                tvWeight_value.setText(result); //вывели
            } else if (cbMan.isChecked()) {
                result = etHeight_value.getText().toString(); //получили то, что ввел пользователь
                d = (Double.parseDouble(result) - 100) * (1.15); //перевели в цифру и посчитали
                result = (Double.toString(d)); //вернули в строку
                result+=getResources().getString(R.string.add_kg);
                tvWeight_value.setText(result); //вывели
            }
        });


    }


}

