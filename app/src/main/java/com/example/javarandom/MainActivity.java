package com.example.javarandom;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javarandom.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Button button = findViewById(R.id.goRandom);

    //tuts
    //private lateinit var binding: ActivityMainBinding
    //binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    //docs
    //val binding: ViewDataBinding? = DataBindingUtil.bind(viewRoot)

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
                //theresults.clear();
                Log.d("theresults", theresults.toString());
            }
        };

        button.setOnClickListener(buttonClick);

//        binding.goRandom.setOnClickListener(v ->
//                binding.result.setText(result.toString()
//                )

//        binding.goRandom.setOnClickListener(v ->
//                result = names.getRandomName()
//                //binding.result.setText(result.toString())
//                Log.d("theresults", result.toString())) ;
    }
}