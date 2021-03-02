package com.example.javarandom;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GameViewModel extends ViewModel {

    private ArrayList<String> names = new ArrayList<String>(
                Arrays.asList("a", "c", "y"));

    private ArrayList<String> actions = new ArrayList<String>(
                Arrays.asList("ow", "x", "om", "fb"));

    private ArrayList<String> result = new ArrayList<>();
    private String randomA = "";
    private String randomN = "";


    Random randomizer = new Random();

    private ArrayList<String> addtoArray() {
        this.randomN = this.names.get(randomizer.nextInt(this.names.size()));
        this.randomA = this.actions.get(randomizer.nextInt(this.actions.size()));
        this.result.add(randomN);
        this.result.add(randomA);
        Log.d("name", this.result.toString());
        return this.result;
    }


    public ArrayList<String> getRandomName() {
        if (!this.randomN.isEmpty() && !this.randomA.isEmpty()) {
            this.randomA = "";
            this.randomN = "";
            this.result.removeAll(result);
            addtoArray();
            return this.result;
        } else {
            addtoArray();
            return this.result;
        }

    }

}



