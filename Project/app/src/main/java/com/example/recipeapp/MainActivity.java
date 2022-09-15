package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //추후에 메인에 있는 변수 접근을 위해 선언한 변수
    public static Context context_main;
    Dialog settingDialog;
    Dialog custompopup_k;
    Dialog custompopup_c;
    Dialog custompopup_w;
    Dialog custompopup_j;
    Dialog infoDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //커스텀 팝업 기능 구현
        settingDialog=new Dialog(MainActivity.this);
        settingDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        settingDialog.setContentView(R.layout.setting_custompopup);
        settingDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        custompopup_k=new Dialog(MainActivity.this);
        custompopup_k.requestWindowFeature(Window.FEATURE_NO_TITLE);
        custompopup_k.setContentView(R.layout.main_custompopup);
        custompopup_k.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        custompopup_c=new Dialog(MainActivity.this);
        custompopup_c.requestWindowFeature(Window.FEATURE_NO_TITLE);
        custompopup_c.setContentView(R.layout.main_custompopup_chinese);
        custompopup_c.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        custompopup_w=new Dialog(MainActivity.this);
        custompopup_w.requestWindowFeature(Window.FEATURE_NO_TITLE);
        custompopup_w.setContentView(R.layout.main_custompopup_western);
        custompopup_w.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        custompopup_j=new Dialog(MainActivity.this);
        custompopup_j.requestWindowFeature(Window.FEATURE_NO_TITLE);
        custompopup_j.setContentView(R.layout.main_custompopup_japanese);
        custompopup_j.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        infoDialog=new Dialog(MainActivity.this);
        infoDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        infoDialog.setContentView(R.layout.info_custompopup);
        infoDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        Button settingButton = findViewById(R.id.Setting_Button);
        settingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showSettingDialog();
            }
        });

        Button customButton_k = findViewById(R.id.button5);
        customButton_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCustomKpopup();
            }
        });

        Button customButton_c=findViewById(R.id.button6);
        customButton_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCustomCpopup();
            }
        });

        Button customButton_w=findViewById(R.id.button7);
        customButton_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCustomWpopup();
            }
        });

        Button customButtom_j=findViewById(R.id.button8);
        customButtom_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCustomJpopup();
            }
        });

        Button infoButton=findViewById(R.id.info_Button);
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInfopopup();
            }
        });

        //cart 페이지 이동을 위한 버튼 변수와 리스너 추가
        Button button_cart = findViewById(R.id.cart_Button);
        button_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, MyRecipe.class);
                startActivity(myIntent);
            }
        });
        Button button_recipe = findViewById(R.id.recipeBook_Button);
        button_recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, recipe.class);
                startActivity(myIntent);
            }
        });
    }

    //커스텀 팝업 함수
    public void showInfopopup() {
        infoDialog.show();

        //기능 구현
    }

    public void showCustomJpopup() {
        custompopup_j.show();

        //기능 구현
    }

    public void showCustomWpopup() {
        custompopup_w.show();

        //기능 구현
    }

    public void showCustomCpopup() {
        custompopup_c.show();

        //기능 구현
    }

    public void showCustomKpopup() {
        custompopup_k.show();

        //기능 구현
    }

    public void showSettingDialog() {
        settingDialog.show();

        //기능 구현
    }
}