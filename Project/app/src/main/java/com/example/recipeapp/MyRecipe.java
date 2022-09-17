package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyRecipe extends AppCompatActivity {
    public static Context context_my_recipe;

    FrameLayout[] recipe;
    TextView[] recipeName;
    TextView[] recipeKind;
    String[] recipeContent = new String[30];
    int[] recipeImage = new int[30];

    int count;

    int chkImg;
    String chkContent;
    String chkName;
    //String chkKind;

    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recipe);
        context_my_recipe = this;

        pref = getPreferences(Activity.MODE_PRIVATE);
        editor=pref.edit();
        count = pref.getInt("count", 0);

        TextView noRecipe = findViewById(R.id.textView6);
        TextView recipeContentName = findViewById(R.id.recipe_name);
        TextView recipeContentText = findViewById(R.id.recipeText);
        ImageView cookingImage = findViewById(R.id.cookImage);

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
        FrameLayout reicpe17 = findViewById(R.id.recipe_17);
        FrameLayout reicpe18 = findViewById(R.id.recipe_18);
        FrameLayout reicpe19 = findViewById(R.id.recipe_19);
        FrameLayout reicpe20 = findViewById(R.id.recipe_20);
        FrameLayout reicpe21 = findViewById(R.id.recipe_21);
        FrameLayout reicpe22 = findViewById(R.id.recipe_22);
        FrameLayout reicpe23 = findViewById(R.id.recipe_23);
        FrameLayout reicpe24 = findViewById(R.id.recipe_24);
        FrameLayout reicpe25 = findViewById(R.id.recipe_25);
        FrameLayout reicpe26 = findViewById(R.id.recipe_26);
        FrameLayout reicpe27 = findViewById(R.id.recipe_27);
        FrameLayout reicpe28 = findViewById(R.id.recipe_28);
        FrameLayout reicpe29 = findViewById(R.id.recipe_29);
        FrameLayout reicpe30 = findViewById(R.id.recipe_30);

        recipe = new FrameLayout[] { reicpe1, reicpe2, reicpe3, reicpe4, reicpe5, reicpe6,
                reicpe7, reicpe8, reicpe9, reicpe10, reicpe11, reicpe12,
                reicpe13, reicpe14, reicpe15, reicpe16, reicpe17, reicpe18, reicpe19, reicpe20,
                reicpe21, reicpe22, reicpe23, reicpe24, reicpe25, reicpe26,
                reicpe27, reicpe28, reicpe29, reicpe30 };

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
        TextView name17 = findViewById(R.id.name17);
        TextView name18 = findViewById(R.id.name18);
        TextView name19 = findViewById(R.id.name19);
        TextView name20 = findViewById(R.id.name20);
        TextView name21 = findViewById(R.id.name21);
        TextView name22 = findViewById(R.id.name22);
        TextView name23 = findViewById(R.id.name23);
        TextView name24 = findViewById(R.id.name24);
        TextView name25 = findViewById(R.id.name25);
        TextView name26 = findViewById(R.id.name26);
        TextView name27 = findViewById(R.id.name27);
        TextView name28 = findViewById(R.id.name28);
        TextView name29 = findViewById(R.id.name29);
        TextView name30 = findViewById(R.id.name30);

        recipeName = new TextView[] { name1, name2, name3, name4, name5, name6, name7, name8,
                name9, name10, name11, name12, name13, name14, name15, name16, name17, name18,
                name19, name20,  name21, name22, name23, name24, name25, name26, name27, name28,
                name29, name30};

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
        TextView kind17 = findViewById(R.id.kind17);
        TextView kind18 = findViewById(R.id.kind18);
        TextView kind19 = findViewById(R.id.kind19);
        TextView kind20 = findViewById(R.id.kind20);
        TextView kind21 = findViewById(R.id.kind21);
        TextView kind22 = findViewById(R.id.kind22);
        TextView kind23 = findViewById(R.id.kind23);
        TextView kind24 = findViewById(R.id.kind24);
        TextView kind25 = findViewById(R.id.kind25);
        TextView kind26 = findViewById(R.id.kind26);
        TextView kind27 = findViewById(R.id.kind27);
        TextView kind28 = findViewById(R.id.kind28);
        TextView kind29 = findViewById(R.id.kind29);
        TextView kind30 = findViewById(R.id.kind30);

        recipeKind = new TextView[] { kind1, kind2, kind3, kind4, kind5, kind6, kind7, kind8,
                kind9, kind10, kind11, kind12, kind13, kind14, kind15, kind16, kind17, kind18,
                kind19, kind20, kind21, kind22, kind23, kind24, kind25, kind26, kind27, kind28,
                kind29, kind30 };

        for(int i=0; i < count; i++){
            chkImg = pref.getInt("img"+i , 0);
            chkContent = pref.getString("content"+i, "내용");
            chkName = pref.getString("name"+i, "요리 이름");
            //chkKind = pref.getString("kind"+i,"분류");

            recipeImage[i] = chkImg;
            recipeContent[i] = chkContent;
            recipeName[i].setText(chkName);
            //recipeKind[i].setText(chkKind);

            if(chkName != ""){
                recipe[i].setVisibility(View.VISIBLE);
            }
        }

        if(count<30){
            KeepRecipe();
        } else{
            Toast.makeText(this.getApplicationContext(),"즐겨찾기가 가득 찼습니다.",
                    Toast.LENGTH_SHORT).show();
        }

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
            editor.putInt("img"+count,img);

            recipeContent[count] = content;
            editor.putString("content"+count, content);

            recipeName[count].setText(name);
            editor.putString("name"+count, name);

            //setKind(name);

            recipe[count].setVisibility(View.VISIBLE);

            count += 1;
            editor.putInt("count", count);
            editor.apply();

            Toast.makeText(this.getApplicationContext(),name+ "가 즐겨찾기에 추가 됐습니다",
                    Toast.LENGTH_SHORT).show();
        }

    }

    /*
    public void DeleteRecipe(){
        Intent intent = getIntent();
        boolean chk; // 삭제 확인 변수 받아오기
        String name; //이름 받아오기

        if(chk == true){
            for(int i=0; i <=count; i++){
                if(recipeName[i].getText() == name){
                    for(int k = i; k<count;k++){
                        recipeImage[k] = recipeImage[k+1];
                        editor.putInt("img"+k,recipeImage[k]);

                        recipeContent[k] = recipeContent[k+1];
                        editor.putString("content"+k, recipeContent[k]);

                        recipeName[k] = recipeName[k+1];
                        editor.putString("name"+k, recipeContent[k]);
                    }
                    break();
                }
            }
            recipe[count].setVisibility(View.INVISIBLE);
                    count += 1;
                    editor.putInt("count", count);
                    editor.apply();
                    Toast.makeText(this.getApplicationContext(),name+ "가 즐겨찾기에서 제외 됐습니다",
                            Toast.LENGTH_SHORT).show();
        }
    }

     */
/*
    String koreanFood [] = {"불족면", "백종원족발덮밥", "오리엔탈 족발샐러드", "족발 김밥", "족발볶음", "매운 족발",
                            "떡볶이에그인헬", "로제 라면", "떡볶이 볶음밥", "매콤 닭떡조림", "떡볶이 피자", "떡볶이 짜파게티",
                            "찜닭계란만두", "찜닭 볶음밥", "찜닭마요", "찜닭 떡볶이",
                            "곱창파스타", "곱창볶음밥", "치아곱타",
                            "감자탕 라면", "우거지 해장국", "감자탕 볶음밥",
                            "순대 볶음", "순대국", "순대튀김", "떠먹는 치즈 순대"};
    String chinaFood[] = {"짜장 덮밥", "볶음 짜장", "짜장면 부침개", "짜장 파스타", "중국식 볶음밥", "계란짜장밥",
                            "탕수육 잡채덮밥", "깐풍기", "탕수육 강정", "탕수육 샐러드", "김피탕", "탕수육 찌개",
                            "짬뽕밥", "만두국", "짬뽕 볶음밥", "짬뽕 라면", "토마토짬뽕파스타", "짬뽕 두부 조림",
                            "마라 라면", "마라 볶음밥"};
    String westernFood[] = {"치킨마요 덮밥", "카레 치즈 라면", "양념 치킨 볶음밥", "치킨전", "케이준 크루통샐러드", "치킨 스낵랩",
                            "피자 말아또", "피자그라탕", "누드피자전", "피자라볶이", "떠먹는 피자", "피자 프리타타",
                            "돈까스김치나베", "가츠동 덮밥", "카츠샌드", "돈까스덮밥", "돈까스 라면", "돈까스 카레 덮밥",
                            "오지치즈후라이", "고로케", "감자튀김치즈전", "떠먹는 감자 피자", "버터갈릭감자튀김", "매콤감자튀김"};
    String snackFood[] = {"메로나떡", "아포가토", "아이스크림 샌드위치", "백종원표 투게더 빵 푸딩", "아이스크림 튀김", "아이스크림 플로트",
                            "매쉬드 포테이토", "오레오 디저트 컵", "오레오 티라미수", "옥수수 머핀", "오감자 후라이", "깐풍소스 새우깡",
                            "그릭모모", "그릭단호박", "요거트 베이글", "요거트 에그마요샌드위치"};

    public void setKind(String name){
        for(int i = 0; i<=koreanFood.length; i++){
            if(name == koreanFood[i]){
                recipeKind[count].setText("한식");
                editor.putString("kind"+count, "한식");
            }
        }
        for(int i = 0; i<=chinaFood.length; i++){
            if(name == chinaFood[i]){
                recipeKind[count].setText("중식");
                editor.putString("kind"+count, "중식");
            }
        }
        for(int i = 0; i<=westernFood.length; i++){
            if(name == westernFood[i]){
                recipeKind[count].setText("양식");
                editor.putString("kind"+count, "양식");
            }
        }
        for(int i = 0; i<=snackFood.length; i++){
            if(name == snackFood[i]){
                recipeKind[count].setText("간식류");
                editor.putString("kind"+count, "간식류");
            }
        }
    }

 */
}