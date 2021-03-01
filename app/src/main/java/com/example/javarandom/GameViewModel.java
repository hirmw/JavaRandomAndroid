package com.example.javarandom;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GameViewModel extends ViewModel {

//    private MutableLiveData<List<User>> users;
//    public LiveData<List<User>> getUsers() {
//        if (users == null) {
//            users = new MutableLiveData<List<User>>();
//            loadUsers();
//        }
//        return users;
//    }
//
//    private void loadUsers() {
//        // Do an asynchronous operation to fetch users.
//    }

//    private ArrayList<String> names;
//    private ArrayList<String> actions;
//    private ArrayList<String> result;
//    private String randomN;
//    private String randomA;
//    private String name;


    private ArrayList<String> names = new ArrayList<String>(
                Arrays.asList("a", "c", "y"));

    private ArrayList<String> actions = new ArrayList<String>(
                Arrays.asList("ow", "x", "om", "fb"));

    private ArrayList<String> result = new ArrayList<>();
    private String randomA = "";
    private String randomN = "";


//    private MutableLiveData<List<String>> names;
//    private MutableLiveData<List<String>> actions;
//    private MutableLiveData<List<String>> result;


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



