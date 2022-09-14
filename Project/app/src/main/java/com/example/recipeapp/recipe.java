package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;

class RecipeDetail{

}

public class recipe extends AppCompatActivity implements View.OnClickListener {

    ImageView starView;
    ImageView fillStarView;
    int imageIndex=0;

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


        findViewById(R.id.clickLayout1).setOnClickListener(this);
        findViewById(R.id.detailRecipeCloseButton).setOnClickListener(this);


        detailRecipeFrameLayout = findViewById(R.id.detailRecipeFrameLayout);
        detailRecipeFrameLayout.setVisibility(View.INVISIBLE);

        starView = findViewById(R.id.starView);
        fillStarView=findViewById(R.id.fillStarView);


    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.clickLayout1:

                detailRecipeFrameLayout.setVisibility(View.VISIBLE);


                break;


            case R.id.detailRecipeCloseButton:

                detailRecipeFrameLayout.setVisibility(View.INVISIBLE);


                break;


        }
    }

    public  void starClick(View v){

        changeImage();

    }
    private void changeImage(){
        if (imageIndex == 0) {
            starView.setVisibility(View.VISIBLE);
            fillStarView.setVisibility(View.INVISIBLE);

            imageIndex = 1;
        }
        else if (imageIndex == 1) {
            starView.setVisibility(View.INVISIBLE);
            fillStarView.setVisibility(View.VISIBLE);

            imageIndex = 0;
        }

    }





}