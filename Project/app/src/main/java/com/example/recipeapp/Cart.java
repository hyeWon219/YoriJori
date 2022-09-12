package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class Cart extends AppCompatActivity {
    public static Context context_cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        context_cart = this;

        ImageButton buttonBack = findViewById(R.id.backToHome);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(backIntent);
                finish();
            }
        });

        FrameLayout recipeFrame = findViewById(R.id.recipeFrame);
        Button recipeDown = findViewById(R.id.button11);
        recipeDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.INVISIBLE);
            }
        });

        //리스트 온클릭(노동...)
        FrameLayout reicpe1 = findViewById(R.id.recipe_1);
        reicpe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        FrameLayout reicpe2 = findViewById(R.id.recipe_2);
        reicpe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        FrameLayout reicpe3 = findViewById(R.id.recipe_3);
        reicpe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        FrameLayout reicpe4 = findViewById(R.id.recipe_4);
        reicpe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        FrameLayout reicpe5 = findViewById(R.id.recipe_5);
        reicpe5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        FrameLayout reicpe6 = findViewById(R.id.recipe_6);
        reicpe6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        FrameLayout reicpe7 = findViewById(R.id.recipe_7);
        reicpe7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        FrameLayout reicpe8 = findViewById(R.id.recipe_8);
        reicpe8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        FrameLayout reicpe9 = findViewById(R.id.recipe_9);
        reicpe9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        FrameLayout reicpe10 = findViewById(R.id.recipe_10);
        reicpe10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        FrameLayout reicpe11 = findViewById(R.id.recipe_11);
        reicpe11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        FrameLayout reicpe12 = findViewById(R.id.recipe_12);
        reicpe12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        FrameLayout reicpe13 = findViewById(R.id.recipe_13);
        reicpe13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        FrameLayout reicpe14 = findViewById(R.id.recipe_14);
        reicpe14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        FrameLayout reicpe15 = findViewById(R.id.recipe_15);
        reicpe15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        FrameLayout reicpe16 = findViewById(R.id.recipe_16);
        reicpe16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });
    }
}