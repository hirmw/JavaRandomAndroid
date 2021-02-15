package com.example.javarandom;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javarandom.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        Button button = (Button) binding.goRandom;

        Data names = new Data();

        View.OnClickListener buttonClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> theresults = names.getRandomName();
                binding.name.setText(theresults.get(0));
                binding.result.setText(theresults.get(1));
                Log.d("theresults", theresults.toString());
            }
        };

        button.setOnClickListener(buttonClick);

    }
}