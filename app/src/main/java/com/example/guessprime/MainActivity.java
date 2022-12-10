package com.example.guessprime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final Random RANDOM = new Random();
    private TextView number, prime, notPrime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.number);
        prime = findViewById(R.id.prime);
        notPrime = findViewById(R.id.notPrime);

        int random1 = RANDOM.nextInt(100) + 1;

        number.setText(Integer.toString(random1));


    }
}