package com.example.Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.Calculator.R;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateProfit(View view) {
        // Находит эл. по идентификатору
        EditText zarplataEditText = findViewById(R.id.zarplata);
        // Получаешь что ввел пользователь в виде строки
        String zarplataString = zarplataEditText.getText().toString();
        // Превращаешь строку в число

        EditText freelanceEditText = findViewById(R.id.freelance);
        String freelanceString = freelanceEditText.getText().toString();

        EditText otherProfitEditText = findViewById(R.id.otherProfit);
        String otherProfitString = otherProfitEditText.getText().toString();

        if (zarplataString.isEmpty() || freelanceString.isEmpty() || otherProfitString.isEmpty()) {
            Toast.makeText(this, "Введены не все данные", Toast.LENGTH_SHORT).show();
            return;
        }

        Integer zarplata = Integer.valueOf(zarplataString);
        Integer freelance = Integer.valueOf(freelanceString);
        Integer otherProfit = Integer.valueOf(otherProfitString);

        Integer result1 = zarplata + freelance + otherProfit;

        EditText result1EditText = findViewById(R.id.result1);
        result1EditText.setText(String.valueOf(result1));
    }

    public void calculateEpenses(View view) {

        EditText rentEditText = findViewById(R.id.rent);
        String rentString = rentEditText.getText().toString();


        EditText utilitiesEditText = findViewById(R.id.utilities);
        String utilitiesString = utilitiesEditText.getText().toString();

        EditText medicineEditText = findViewById(R.id.medicine);
        String medicineString = medicineEditText.getText().toString();

        EditText creditEditText = findViewById(R.id.credit);
        String creditString = creditEditText.getText().toString();

        EditText carEditText = findViewById(R.id.car);
        String carString = carEditText.getText().toString();


        EditText foodEditText = findViewById(R.id.food);
        String foodString = foodEditText.getText().toString();

        EditText clothesEditText = findViewById(R.id.clothes);
        String clothesString = clothesEditText.getText().toString();


        EditText otherEditText = findViewById(R.id.other);
        String otherString = otherEditText.getText().toString();

        if (rentString.isEmpty() || utilitiesString.isEmpty() || medicineString.isEmpty() || otherString.isEmpty() || clothesString.isEmpty() || foodString.isEmpty() || carString.isEmpty() || creditString.isEmpty()) {
            Toast.makeText(this, "Введены не все данные", Toast.LENGTH_SHORT).show();
            return;
        }

        Integer rent = Integer.valueOf(rentString);
        Integer other = Integer.valueOf(otherString);
        Integer clothes = Integer.valueOf(clothesString);
        Integer food = Integer.valueOf(foodString);
        Integer car = Integer.valueOf(carString);
        Integer credit = Integer.valueOf(creditString);
        Integer medicine = Integer.valueOf(medicineString);
        Integer utilities = Integer.valueOf(utilitiesString);


        Integer result2 = rent + utilities + medicine + credit + car + food + clothes + other;

        EditText result2EditText = findViewById(R.id.result2);
        result2EditText.setText(String.valueOf(result2));
    }

    public void calculateOutcome(View view) {

        EditText posthoneEditText = findViewById(R.id.posthone);
        String posthoneString = posthoneEditText.getText().toString();

        EditText result1EditText = findViewById(R.id.result1);
        String result1String = result1EditText.getText().toString();

        EditText result2EditText = findViewById(R.id.result2);
        String result2String = result2EditText.getText().toString();


        if (posthoneString.isEmpty() || result1String.isEmpty() || result2String.isEmpty()) {
            Toast.makeText(this, "Введены не все данные", Toast.LENGTH_SHORT).show();
            return;
        }

        Integer posthone = Integer.valueOf(posthoneString);
        Integer result1 = Integer.valueOf(result1String);
        Integer result2 = Integer.valueOf(result2String);


        Integer result3 = result1 - (result2 + posthone);

        EditText result3EditText = findViewById(R.id.result3);
        result3EditText.setText(String.valueOf(result3));

    }
}