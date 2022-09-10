package com.example.saving_objects_test_gson;

import androidx.appcompat.app.AppCompatActivity;

import android.media.metrics.LogSessionId;
import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        Employee employee = new Employee("kennedy",50,"kennedylinzie@gmail.com");
        String json = gson.toJson(employee);
        String output = json;


        Employee employee1  = gson.fromJson(output,Employee.class);

    }
}