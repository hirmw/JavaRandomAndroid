package com.example.javarandom;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javarandom.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> result;
    ActivityMainBinding binding;
    Data names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        names = new Data();

        setContentView(binding.getRoot());

        Button button = (Button) binding.goRandom;

        binding.name.setText("Rich");
    }

    public void randomit(View v){
        ArrayList<String> theresults = names.getRandomName();
        binding.name.setText(theresults.get(0));
        binding.result.setText(theresults.get(1));
        Log.d("theresults", theresults.toString());

    }

    public void gotoRandom(View v){
        Intent sendtohistory = new Intent(v.getContext(), History.class);
        startActivity(sendtohistory);

    }




}