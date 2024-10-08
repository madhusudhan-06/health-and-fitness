package com.example.healthandfit.ui.Remedies;

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
import com.example.healthandfit.coconutoilActivity;
import com.example.healthandfit.databinding.FragmentRemediesBinding;
import com.example.healthandfit.tulsiActivity;

public class RemediesFragment extends Fragment {

    private FragmentRemediesBinding binding;
    private Button tulsi;
    private Button coconutoil;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RemediesViewModel slideshowViewModel =
                new ViewModelProvider(this).get(RemediesViewModel.class);

        binding = FragmentRemediesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.textSlideshow;
       // slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tulsi = view.findViewById(R.id.tulsi);
        tulsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // public void goToAttract(View v){
                Intent intent6 = new Intent(getActivity(), tulsiActivity.class);
                startActivity(intent6);
                // }
            }
        });


        coconutoil = view.findViewById(R.id.coconutoil);
        coconutoil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // public void goToAttract(View v){
                Intent intent7 = new Intent(getActivity(), coconutoilActivity.class);
                startActivity(intent7);
                // }
            }
        });
    }
}