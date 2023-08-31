package com.example.school;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    ImageButton btnLocker, btnRental, btnRestaurant, btnLibrary;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btnLocker = view.findViewById(R.id.imbtnLocker);
        btnRental = view.findViewById(R.id.imbtnRental);
        btnRestaurant = view.findViewById(R.id.imbtnRestaurant);
        btnLibrary = view.findViewById(R.id.imbtnLibrary);

        // 사물함 대여 버튼을 누르면 사물함 대여 화면으로 전환
        btnLocker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_locker = new Intent(getActivity(), LockerActivity1.class);
                startActivity(intent_locker);
            }
        });

        // 열람실 예약 버튼을 누르면 사물함 대여 화면으로 전환
        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_library = new Intent(getActivity(), LibraryActivity1.class);
                startActivity(intent_library);
            }
        });

        // 식당 예약 버튼을 누르면 사물함 대여 화면으로 전환
        btnRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_book = new Intent(getActivity(), BookRestaurantActivity1.class);
                startActivity(intent_book);
            }
        });

        // 물품 대여 버튼을 누르면 사물함 대여 화면으로 전환
        btnRental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_rental = new Intent(getActivity(), RentalActivity1.class);
                startActivity(intent_rental);
            }
        });
        
        return view;
    }

    
}