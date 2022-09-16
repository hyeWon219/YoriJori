package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MyRecipe extends AppCompatActivity {
    public static Context context_my_recipe;

    FrameLayout[] recipe;
    TextView[] recipeName;
    TextView[] recipeKind;
    String[] recipeContent;
    int[] recipeImage;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recipe);
        context_my_recipe = this;

        TextView noRecipe = findViewById(R.id.textView6);
        TextView recipeContentName = findViewById(R.id.recipe_name);
        TextView recipeContentText = findViewById(R.id.recipeText);
        ImageView cookingImage = findViewById(R.id.cookImage);

        recipeContent = new String[16];
        recipeImage = new int[16];

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

        TextView name1 = findViewById(R.id.name1);
        TextView name2 = findViewById(R.id.name2);
        TextView name3 = findViewById(R.id.name3);
        TextView name4 = findViewById(R.id.name4);
        TextView name5 = findViewById(R.id.name5);
        TextView name6 = findViewById(R.id.name6);
        TextView name7 = findViewById(R.id.name7);
        TextView name8 = findViewById(R.id.name8);
        TextView name9 = findViewById(R.id.name9);
        TextView name10 = findViewById(R.id.name10);
        TextView name11 = findViewById(R.id.name11);
        TextView name12 = findViewById(R.id.name12);
        TextView name13 = findViewById(R.id.name13);
        TextView name14 = findViewById(R.id.name14);
        TextView name15 = findViewById(R.id.name15);
        TextView name16 = findViewById(R.id.name16);

        recipeName = new TextView[] { name1, name2, name3, name4, name5, name6, name7, name8,
                name9, name10, name11, name12, name13, name14, name15, name16 };

        TextView kind1 = findViewById(R.id.kind1);
        TextView kind2 = findViewById(R.id.kind2);
        TextView kind3 = findViewById(R.id.kind3);
        TextView kind4 = findViewById(R.id.kind4);
        TextView kind5 = findViewById(R.id.kind5);
        TextView kind6 = findViewById(R.id.kind6);
        TextView kind7 = findViewById(R.id.kind7);
        TextView kind8 = findViewById(R.id.kind8);
        TextView kind9 = findViewById(R.id.kind9);
        TextView kind10 = findViewById(R.id.kind10);
        TextView kind11 = findViewById(R.id.kind11);
        TextView kind12 = findViewById(R.id.kind12);
        TextView kind13 = findViewById(R.id.kind13);
        TextView kind14 = findViewById(R.id.kind14);
        TextView kind15 = findViewById(R.id.kind15);
        TextView kind16 = findViewById(R.id.kind16);

        recipeKind = new TextView[] { kind1, kind2, kind3, kind4, kind5, kind6, kind7, kind8,
                kind9, kind10, kind11, kind12, kind13, kind14, kind15, kind16 };

        KeepRecipe();
        if(count == 0){
            noRecipe.setVisibility(View.VISIBLE);
        }else{
            noRecipe.setVisibility(View.INVISIBLE);
        }


        FrameLayout recipeFrame = findViewById(R.id.recipeFrame);
        Button recipeDown = findViewById(R.id.button11);
        recipeDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText("음식 이름");
                recipeFrame.setVisibility(View.INVISIBLE);
            }
        });

        //리스트 온클릭(노동...)

        reicpe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[0].getText());
                recipeContentText.setText(recipeContent[0]);
                cookingImage.setImageResource(recipeImage[0]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[1].getText());
                recipeContentText.setText(recipeContent[1]);
                cookingImage.setImageResource(recipeImage[1]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[2].getText());
                recipeContentText.setText(recipeContent[2]);
                cookingImage.setImageResource(recipeImage[2]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[3].getText());
                recipeContentText.setText(recipeContent[3]);
                cookingImage.setImageResource(recipeImage[3]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[4].getText());
                recipeContentText.setText(recipeContent[4]);
                cookingImage.setImageResource(recipeImage[4]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[5].getText());
                recipeContentText.setText(recipeContent[5]);
                cookingImage.setImageResource(recipeImage[5]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[6].getText());
                recipeContentText.setText(recipeContent[6]);
                cookingImage.setImageResource(recipeImage[6]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[7].getText());
                recipeContentText.setText(recipeContent[7]);
                cookingImage.setImageResource(recipeImage[7]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[8].getText());
                recipeContentText.setText(recipeContent[8]);
                cookingImage.setImageResource(recipeImage[8]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[9].getText());
                recipeContentText.setText(recipeContent[9]);
                cookingImage.setImageResource(recipeImage[9]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[10].getText());
                recipeContentText.setText(recipeContent[10]);
                cookingImage.setImageResource(recipeImage[10]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[11].getText());
                recipeContentText.setText(recipeContent[11]);
                cookingImage.setImageResource(recipeImage[11]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[12].getText());
                recipeContentText.setText(recipeContent[12]);
                cookingImage.setImageResource(recipeImage[12]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[13].getText());
                recipeContentText.setText(recipeContent[13]);
                cookingImage.setImageResource(recipeImage[13]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[14].getText());
                recipeContentText.setText(recipeContent[14]);
                cookingImage.setImageResource(recipeImage[14]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

        reicpe16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recipeContentName.setText(recipeName[15].getText());
                recipeContentText.setText(recipeContent[15]);
                cookingImage.setImageResource(recipeImage[15]);

                recipeFrame.setVisibility(View.VISIBLE);
            }
        });

    }

    public void KeepRecipe(){
        Intent intent = getIntent();
        boolean chk = intent.getBooleanExtra("확인",false);
        String name = intent.getStringExtra("제목");
        String content = intent.getStringExtra("내용");
        int img = intent.getIntExtra("이미지",0);

        if(chk == true && count < 16){
            recipeImage[count] = img;
            recipeContent[count] = content;
            recipeName[count].setText(name);
            recipe[count].setVisibility(View.VISIBLE);

            count += 1;
        }
        System.out.print(count);
    }
}