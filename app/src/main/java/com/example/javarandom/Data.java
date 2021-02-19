package com.example.javarandom;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Data {

    private final ArrayList<String> names;
    private final ArrayList<String> actions;
    private final ArrayList<String> result;
    private String randomN;
    private String randomA;
    private String name;



    public Data() {
        this.names = new ArrayList<>(
                Arrays.asList("a", "c", "y"));

        this.actions = new ArrayList<>(
                Arrays.asList("ow", "x", "om", "fb"));

        this.result = new ArrayList<>();
        this.randomA = "";
        this.randomN = "";

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

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