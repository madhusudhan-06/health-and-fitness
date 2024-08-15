package com.example.healthandfit.ui.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.healthandfit.R;
import com.example.healthandfit.databinding.FragmentFoodBinding;
import com.example.healthandfit.eggActivity;
import com.example.healthandfit.honeyActivity;

public class FoodFragment extends Fragment {

    private FragmentFoodBinding binding;
    private Button honey;
    private Button egg;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FoodViewModel galleryViewModel =
                new ViewModelProvider(this).get(FoodViewModel.class);

        binding = FragmentFoodBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

       // final TextView textView = binding.textGallery;
        //galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        honey = view.findViewById(R.id.honey);
        honey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // public void goToAttract(View v){
                Intent intent8 = new Intent(getActivity(), honeyActivity.class);
                startActivity(intent8);
                // }
            }
        });


        egg = view.findViewById(R.id.egg);
        egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // public void goToAttract(View v){
                Intent intent9 = new Intent(getActivity(), eggActivity.class);
                startActivity(intent9);
                // }
            }
        });
    }
}