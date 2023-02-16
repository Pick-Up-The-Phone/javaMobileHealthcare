package com.example.finally_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class FindDoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);

        CardView exitFD = findViewById(R.id.cardFDBack);
        exitFD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindDoctorActivity.this, HomeActivity.class));
            }
        });

        CardView familyphysician = findViewById(R.id.cardFDFamilyPhysician);
        familyphysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this, DoctorDetailActivity.class);
                it.putExtra("title", "Family Physicians");
                startActivity(it);
            }
        });

        CardView dietician = findViewById(R.id.cardFDDietitian);
        dietician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this, DoctorDetailActivity.class);
                it.putExtra("title", "Dietitian");
                startActivity(it);
            }
        });

        CardView dentist = findViewById(R.id.cardFDDentist);
        dentist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this, DoctorDetailActivity.class);
                it.putExtra("title", "Dentist");
                startActivity(it);
            }
        });

        CardView surgeon = findViewById(R.id.cardFDSurgeon);
        surgeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this, DoctorDetailActivity.class);
                it.putExtra("title", "Surgeon");
                startActivity(it);
            }
        });

        CardView cardiologists = findViewById(R.id.cardFDCardiologists);
        cardiologists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity.this, DoctorDetailActivity.class);
                it.putExtra("title", "Cardiologists");
                startActivity(it);
            }
        });
    }
}