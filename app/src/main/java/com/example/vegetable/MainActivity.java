package com.example.vegetable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView verticalRecyclerView, horizontalRecyclerView;
    List<Model> modelList;
    VegAdapter vegAdapter;
    NonVegAdapter nonVegAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verticalRecyclerView = findViewById(R.id.verticalRecyclerView);
        horizontalRecyclerView = findViewById(R.id.horizontalRecyclerView);

        modelList = new ArrayList<>();

        Model model1 = new Model("Carrots",R.drawable.a2);
        Model model2 = new Model("Broccoli",R.drawable.a3);
        Model model3 = new Model("Mushrooms",R.drawable.a4);
        Model model4 = new Model("Carrots",R.drawable.a5);
        Model model5 = new Model("Bell Peppers",R.drawable.a6);
        Model model6 = new Model("Carrots",R.drawable.a7);
        Model model7 = new Model("Beens",R.drawable.a8);
        Model model8 = new Model("BeetRoot",R.drawable.a9);
        Model model9 = new Model("Tomato",R.drawable.a10);

        modelList.add(model1);
        modelList.add(model2);
        modelList.add(model3);
        modelList.add(model4);
        modelList.add(model5);
        modelList.add(model6);
        modelList.add(model7);
        modelList.add(model8);
        modelList.add(model9);

        nonVegAdapter = new NonVegAdapter(modelList);
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        horizontalRecyclerView.setLayoutManager(horizontalLayoutManager);
        horizontalRecyclerView.setAdapter(nonVegAdapter);

        modelList = new ArrayList<>();
        Model model10 = new Model("Banana",R.drawable.aa);
        Model model11 = new Model("Mango",R.drawable.bb);
        Model model12 = new Model("Apple",R.drawable.cc);
        Model model13 = new Model("Banana",R.drawable.dd);
        Model model14 = new Model("Banana",R.drawable.ee);
        Model model15 = new Model("Graphes",R.drawable.ff);
        Model model16 = new Model("WaterMelon",R.drawable.gg);
        Model model17 = new Model("Orange",R.drawable.hh);
        Model model18 = new Model("Apple",R.drawable.ii);

        modelList.add(model10);
        modelList.add(model11);
        modelList.add(model12);
        modelList.add(model13);
        modelList.add(model14);
        modelList.add(model15);
        modelList.add(model16);
        modelList.add(model17);
        modelList.add(model18);

        vegAdapter = new VegAdapter(modelList);
        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        verticalRecyclerView.setAdapter(vegAdapter);


    }
}