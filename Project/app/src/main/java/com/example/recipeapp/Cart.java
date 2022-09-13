package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Cart extends AppCompatActivity {
    public static Context context_cart;

    public FrameLayout[] recipe;
    public TextView[] recipeName;
    public String[] recipeContent;

    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        TextView recipeContentName = findViewById(R.id.recipe_name);
        TextView recipeContentText = findViewById(R.id.recipeText);

        FrameLayout reicpe1 = findViewById(R.id.recipe_1);
        FrameLayout reicpe2 = findViewById(R.id.recipe_2);
        FrameLayout reicpe3 = findViewById(R.id.recipe_3);
        FrameLayout reicpe4 = findViewById(R.id.recipe_4);
        FrameLayout reicpe5 = findViewById(R.id.recipe_5);
        FrameLayout reicpe6 = findViewById(R.id.recipe_6);
        FrameLayout reicpe7 = findViewById(R.id.recipe_7);
        FrameLayout reicpe8 = findViewById(R.id.recipe_8);
        FrameLayout reicpe9 = findViewById(R.id.recipe_9);
        FrameLayout reicpe10 = findViewById(R.id.recipe_10);
        FrameLayout reicpe11 = findViewById(R.id.recipe_11);
        FrameLayout reicpe12 = findViewById(R.id.recipe_12);
        FrameLayout reicpe13 = findViewById(R.id.recipe_13);
        FrameLayout reicpe14 = findViewById(R.id.recipe_14);
        FrameLayout reicpe15 = findViewById(R.id.recipe_15);
        FrameLayout reicpe16 = findViewById(R.id.recipe_16);

        recipe = new FrameLayout[] { reicpe1, reicpe2, reicpe3, reicpe4, reicpe5, reicpe6,
                reicpe7, reicpe8, reicpe9, reicpe10, reicpe11, reicpe12,
                reicpe13, reicpe14, reicpe15, reicpe16 };

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

        reicpe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //recipeContentName.text =
                //recipeContentText.setText(recipeContent[0]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });
    }
}