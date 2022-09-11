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

        FrameLayout reicpe1 = findViewById(R.id.recipe_1);
        reicpe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeFrame.setVisibility(View.VISIBLE);
            }
        });
    }
}