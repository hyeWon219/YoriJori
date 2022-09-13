package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class recipe extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recipe);

        findViewById(R.id.clickLayout1).setOnClickListener(this);
    }

    public void onClick(View v){
        //레시피 클릭하면 팝업뜨게하는 함수인데 xml로 변경할 예정
        switch (v.getId()){
            case R.id.clickLayout1:
                new AlertDialog.Builder(this)
                        .setTitle("레시피팝업")
                        .setMessage("레시피 내용")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
                break;


        }
    }





}