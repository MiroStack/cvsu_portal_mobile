package com.example.studentportal;

import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class fragment_Map extends Fragment {
    private Button mapButton, feedbackButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         View  view  = inflater.inflate(R.layout.fragment__map, container, false);

        mapButton = view.findViewById(R.id.mapBtn);
        feedbackButton = view.findViewById(R.id.feedbackAndRateBtn_id);
        mapButton.setOnClickListener(v ->{
              Intent intent = new Intent(getActivity(), MapActivity.class);
              startActivity(intent);
          }
        );

        feedbackButton.setOnClickListener(v ->{
            NavController navController = Navigation.findNavController(requireActivity(), R.id.navHostFragment);
            navController.navigate(R.id.action_dashboard_to_feedback);
        });

        return view;
    }

}

