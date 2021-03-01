package com.example.javarandom;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.javarandom.databinding.FragmentGameBinding;

import java.util.ArrayList;

public class GameFragment extends Fragment {

    FragmentGameBinding binding;
    ArrayList<String> result;
    //Data names;
    //GameViewModel viewModel = new ViewModelProvider(this).get(GameViewModel.class);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        //names = new Data();
       this.result = new ArrayList<>();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_game, container, false);

        GameViewModel viewModel = new ViewModelProvider(this).get(GameViewModel.class);


        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_game, container, false);
        View view = binding.getRoot();

        binding.history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_gameFragment_to_historyFragment);
            }
        });

        binding.goRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //randomit(view);
                result = viewModel.getRandomName();
                binding.name.setText(result.get(0));
                binding.result.setText(result.get(1));
            }
        });

        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

        inflater.inflate( R.menu.options_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int name = item.getItemId();
        Log.d("item", String.valueOf(name));
        return super.onOptionsItemSelected(item);

    }

//    public void randomit(View v){
//        ArrayList<String> theresults = names.getRandomName();
//        binding.name.setText(theresults.get(0));
//        binding.result.setText(theresults.get(1));
//        Log.d("theresults", theresults.toString());
//    }




}