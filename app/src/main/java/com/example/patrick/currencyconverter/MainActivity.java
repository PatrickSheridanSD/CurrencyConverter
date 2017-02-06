package com.example.patrick.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText euroField = (EditText) findViewById(R.id.euroField);

        Double euroAmount = Double.parseDouble(euroField.getText().toString());

        Double poundAmount = euroAmount * 0.77;

        Toast.makeText(getApplicationContext(),"Pounds "+poundAmount.toString(), Toast.LENGTH_LONG).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
