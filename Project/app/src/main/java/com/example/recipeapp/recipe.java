package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

class RecipeDetail{

}

public class recipe extends AppCompatActivity implements View.OnClickListener{

    ImageView starView;
    ImageView fillStarView;
    boolean imageIndex=true;

    FrameLayout detailRecipeFrameLayout;


    Button detailRecipeCloseButton;

    //조리방법 담는 배열!
    RecipeDetail recipeDetail_Kor[]= {};
    RecipeDetail recipeDetail_Jap[]= {};
    RecipeDetail recipeDetail_Ch[]= {};
    RecipeDetail recipeDetail_West[]= {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recipe);


        findViewById(R.id.foodImage1).setOnClickListener(this);
        findViewById(R.id.foodName1).setOnClickListener(this);
        findViewById(R.id.ingredientText1).setOnClickListener(this);
        findViewById(R.id.detailRecipeCloseButton).setOnClickListener(this);
        findViewById(R.id.starView).setOnClickListener(this);

        detailRecipeFrameLayout = findViewById(R.id.detailRecipeFrameLayout);
        detailRecipeFrameLayout.setVisibility(View.INVISIBLE);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.foodImage1:

                detailRecipeFrameLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.foodName1:

                detailRecipeFrameLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.ingredientText1:

                detailRecipeFrameLayout.setVisibility(View.VISIBLE);
                break;

            case R.id.detailRecipeCloseButton:
                detailRecipeFrameLayout.setVisibility(View.INVISIBLE);
                break;

            case R.id.starView:


                if(imageIndex==true){
                    starView.setImageResource(R.drawable.fill_star);
                    imageIndex=false;

                }else{
                    starView.setImageResource(R.drawable.star);
                    imageIndex=true;
                }

                break;
        }
    }
}

