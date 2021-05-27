package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.editTextNumber);
        Button buttonCalc = findViewById(R.id.buttonCalcul);
        TextView textView_result = findViewById(R.id.textView_result);
        ListView listView_results =findViewById(R.id.listView_results);
        List<String> data = new ArrayList<>();
        ArrayAdapter <String> StringArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
        listView_results.setAdapter(StringArrayAdapter);
        buttonCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value= Double.parseDouble(editText.getText().toString());
                double result = value *6;
                textView_result.setText(String.valueOf(result));

                data.add(value+"x 6 ="+ result);
                StringArrayAdapter.notifyDataSetChanged();
                editText.setText("");            }
        });

    }
}