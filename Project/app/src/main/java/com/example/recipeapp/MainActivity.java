package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.ViewFlipper;

import me.relex.circleindicator.CircleIndicator3;

public class MainActivity extends AppCompatActivity {
    //추후에 메인에 있는 변수 접근을 위해 선언한 변수
    //japanese는 간식류 페이지
    public static Context context_main;
    Dialog settingDialog;
    Dialog custompopup_k;
    Dialog custompopup_c;
    Dialog custompopup_w;
    Dialog custompopup_j;
    Dialog infoDialog;

    //음식 팝업
    Dialog jokbal_pop;
    Dialog ddeokbokki_pop;
    Dialog jjimdak_pop;
    Dialog gobchang_pop;
    Dialog gamjatang_pop;
    Dialog soondae_pop;
    Dialog jjajangmyeon_pop;
    Dialog tangsuyook_pop;
    Dialog jjambbong_pop;
    Dialog maratang_pop;
    Dialog chicken_pop;
    Dialog pizza_pop;
    Dialog dongas_pop;
    Dialog gamjathuigim_pop;
    Dialog icecream_pop;
    Dialog snack_pop;
    Dialog yogurt_pop;

    //이미지 자동 슬라이드
    ViewFlipper v_fllipper;

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

        //음식 팝업 등록
        jokbal_pop=new Dialog(MainActivity.this);
        jokbal_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        jokbal_pop.setContentView(R.layout.main_food_jokbal);
        jokbal_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ddeokbokki_pop=new Dialog(MainActivity.this);
        ddeokbokki_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        ddeokbokki_pop.setContentView(R.layout.main_food_ddeokbokki);
        ddeokbokki_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        jjimdak_pop=new Dialog(MainActivity.this);
        jjimdak_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        jjimdak_pop.setContentView(R.layout.main_food_jjimdak);
        jjimdak_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        gobchang_pop=new Dialog(MainActivity.this);
        gobchang_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        gobchang_pop.setContentView(R.layout.main_food_gobchang);
        gobchang_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        gamjatang_pop=new Dialog(MainActivity.this);
        gamjatang_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        gamjatang_pop.setContentView(R.layout.main_food_gamjatang);
        gamjatang_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        soondae_pop=new Dialog(MainActivity.this);
        soondae_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        soondae_pop.setContentView(R.layout.main_food_soondae);
        soondae_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        jjajangmyeon_pop=new Dialog(MainActivity.this);
        jjajangmyeon_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        jjajangmyeon_pop.setContentView(R.layout.main_foodc_jjajangmyeon);
        jjajangmyeon_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        tangsuyook_pop=new Dialog(MainActivity.this);
        tangsuyook_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        tangsuyook_pop.setContentView(R.layout.main_foodc_tangsuyook);
        tangsuyook_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        jjambbong_pop=new Dialog(MainActivity.this);
        jjambbong_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        jjambbong_pop.setContentView(R.layout.main_foodc_jjambbong);
        jjambbong_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        maratang_pop=new Dialog(MainActivity.this);
        maratang_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        maratang_pop.setContentView(R.layout.main_foodc_maratang);
        maratang_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        chicken_pop=new Dialog(MainActivity.this);
        chicken_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        chicken_pop.setContentView(R.layout.main_foodw_chicken);
        chicken_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        pizza_pop=new Dialog(MainActivity.this);
        pizza_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        pizza_pop.setContentView(R.layout.main_foodw_pizza);
        pizza_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        dongas_pop=new Dialog(MainActivity.this);
        dongas_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dongas_pop.setContentView(R.layout.main_foodw_dongas);
        dongas_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        gamjathuigim_pop=new Dialog(MainActivity.this);
        gamjathuigim_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        gamjathuigim_pop.setContentView(R.layout.main_foodw_gamjathuigim);
        gamjathuigim_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        icecream_pop=new Dialog(MainActivity.this);
        icecream_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        icecream_pop.setContentView(R.layout.main_foodj_icecream);
        icecream_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        snack_pop=new Dialog(MainActivity.this);
        snack_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        snack_pop.setContentView(R.layout.main_foodj_snack);
        snack_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        yogurt_pop=new Dialog(MainActivity.this);
        yogurt_pop.requestWindowFeature(Window.FEATURE_NO_TITLE);
        yogurt_pop.setContentView(R.layout.main_foodj_yogurt);
        yogurt_pop.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //이미지 슬라이드 배열
        int images[] = {
                R.drawable.img_1,
                R.drawable.img_2,
                R.drawable.slideimage,
                R.drawable.img_3,
                R.drawable.img_9,
                R.drawable.img_12,
                R.drawable.img_13,
                R.drawable.img_14,
                R.drawable.img_16,
                R.drawable.img_24,
                R.drawable.img_29,
                R.drawable.img_40,
                R.drawable.img_62,
                R.drawable.img_42,
                R.drawable.img_57,
                R.drawable.img_51,
                R.drawable.img_65
        };

        //이미지 자동추천 배열
        int images_2[]={
                R.drawable.img_4,
                R.drawable.img_5,
                R.drawable.img_6,
                R.drawable.img_7,
                R.drawable.img_8,
                R.drawable.img_10,
                R.drawable.img_11,
                R.drawable.img_15,
                R.drawable.img_17,
                R.drawable.img_18,
                R.drawable.img_19,
                R.drawable.img_20,
                R.drawable.img_21,
                R.drawable.img_22,
                R.drawable.img_23,
                R.drawable.img_25,
                R.drawable.img_26,
                R.drawable.img_27,
                R.drawable.img_28,
                R.drawable.img_30,
                R.drawable.img_31,
                R.drawable.img_32,
                R.drawable.img_33,
                R.drawable.img_34,
                R.drawable.img_35,
                R.drawable.img_36,
                R.drawable.img_37,
                R.drawable.img_38,
                R.drawable.img_39,
                R.drawable.img_41,
                R.drawable.img_43,
                R.drawable.img_44,
                R.drawable.img_45,
                R.drawable.img_46,
                R.drawable.img_47,
                R.drawable.img_48,
                R.drawable.img_49,
                R.drawable.img_50,
                R.drawable.img_52,
                R.drawable.img_53,
                R.drawable.img_54,
                R.drawable.img_55,
                R.drawable.img_56,
                R.drawable.img_58,
                R.drawable.img_59,
                R.drawable.img_60,
        };

        //이미지 자동 전환 기능
        v_fllipper = findViewById(R.id.image_slide);
        for(int image : images) {
            fllipperImages(image);
        }

        //이미지 추천 기능
        ImageView mImageView = (ImageView)findViewById(R.id.imageView2);
        int imageId = (int)(Math.random() * images.length);
        mImageView.setBackgroundResource(images_2[imageId]);

        //버튼 연결부
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

    //이미지 자동 전환 함수
    public void fllipperImages(int image) {
        ImageView imageView = new ImageView(this); imageView.setBackgroundResource(image); v_fllipper.addView(imageView);      // 이미지 추가
        v_fllipper.setFlipInterval(4000); // 자동 이미지 슬라이드 딜레이시간(1000 당 1초)
        v_fllipper.setAutoStart(true);// 자동 시작 유무 설정
        // animation
        v_fllipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_fllipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }

    //커스텀 팝업 함수
    public void showInfopopup() {
        infoDialog.show();
    }

    //setting 기능 함수
    public void showSettingDialog() {
        settingDialog.show();

        //기능 구현
        //언어 변경 기능
        TextView title= findViewById(R.id.textView);
        TextView rbook= findViewById(R.id.textView16);
        TextView cart= findViewById(R.id.textView15);
        TextView info= findViewById(R.id.textView18);
        TextView recommend = findViewById(R.id.textView19);
        TextView select = findViewById(R.id.textView3);

        /*
        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.activity_my_recipe, null);
        TextView recipeTitle = (TextView)view.findViewById(R.id.cart_name);
        */

        Switch transSwitch = settingDialog.findViewById(R.id.switch2);

        transSwitch.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    title.setText("요리조리");
                    rbook.setText("레시피북");
                    cart.setText("카트");
                    info.setText("정보");
                    recommend.setText("오늘의 추천요리");
                    select.setText("선택");
                    //recipeTitle.setText("나의 레시피");
                } else {
                    title.setText("Recipe App");
                    rbook.setText("Recipe Book");
                    cart.setText("Cart");
                    info.setText("Info");
                    recommend.setText("Today's Recommend");
                    select.setText("Select");
                    //recipeTitle.setText("My Recipe");
                }
            }
        });

        //배경색 변경(야간모드)
        ToggleButton darkbutton = settingDialog.findViewById(R.id.toggleButton);

        darkbutton.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                } else {

                }
            }
        });
    }

    //음식 팝업 함수
    public void showCustomJpopup() {
        custompopup_j.show();

        //기능 구현
        Button icecream_btn= custompopup_j.findViewById(R.id.button_japanese1);
        icecream_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showicecreampopup();
            }
        });

        Button snack_btn= custompopup_j.findViewById(R.id.button_japanese2);
        snack_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showsnackpopup();
            }
        });

        Button yogurt_btn= custompopup_j.findViewById(R.id.button_japanese3);
        yogurt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showyogurtpopup();
            }
        });
    }

    public void showCustomKpopup() {
        custompopup_k.show();

        //기능 구현
        Button jokbal_btn= custompopup_k.findViewById(R.id.button_korean1);
        jokbal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showjokbalpopup();
            }
        });

        Button ddeokbokki_btn = custompopup_k.findViewById(R.id.button_korean2);
        ddeokbokki_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showddeokbokkipopup();
            }
        });

        Button jjimdak_btn = custompopup_k.findViewById(R.id.button_korean3);
        jjimdak_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showjjimdakpopup();
            }
        });

        Button gobchang_btn = custompopup_k.findViewById(R.id.button_korean4);
        gobchang_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showgobchangpopup();
            }
        });

        Button gamjatang_btn = custompopup_k.findViewById(R.id.button_korean5);
        gamjatang_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showgamjatangpopup();
            }
        });

        Button soondae_btn = custompopup_k.findViewById(R.id.button_korean6);
        soondae_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showsoondaepopup();
            }
        });

    }

    public void showCustomWpopup() {
        custompopup_w.show();

        //기능 구현
        Button chicken_btn= custompopup_w.findViewById(R.id.button_western1);
        chicken_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showchickenpopup();
            }
        });

        Button pizza_btn= custompopup_w.findViewById(R.id.button_western2);
        pizza_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showpizzapopup();
            }
        });

        Button dongas_btn= custompopup_w.findViewById(R.id.button_western3);
        dongas_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showdongaspopup();
            }
        });

        Button gamjathuigim_btn= custompopup_w.findViewById(R.id.button_western4);
        gamjathuigim_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showgamhathuigimpopup();
            }
        });
    }

    public void showCustomCpopup() {
        custompopup_c.show();

        //기능 구현
        Button jjajangmyeon_btn= custompopup_c.findViewById(R.id.button_chinese1);
        jjajangmyeon_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showjjajangmyeon();
            }
        });

        Button tangsuyook_btn=custompopup_c.findViewById(R.id.button_chinese2);
        tangsuyook_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showtangsuyookpopup();
            }
        });

        Button jjambbong_btn=custompopup_c.findViewById(R.id.button_chinese3);
        jjambbong_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showjjambbongpopup();
            }
        });

        Button maratang_btn=custompopup_c.findViewById(R.id.button_chinese4);
        maratang_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showmaratangpopup();
            }
        });
    }

    //음식 종류 팝업 함수
    public void showddeokbokkipopup() {
        ddeokbokki_pop.show();

        //팝업 기능 구현
    }

    public void showjokbalpopup() {
        jokbal_pop.show();

        //팝업 기능 구현
    }

    public void showjjimdakpopup() {
        jjimdak_pop.show();

        //팝업 기능 구현
    }

    public void showgobchangpopup() {
        gobchang_pop.show();

        //팝업 기능 구현
    }

    public void showgamjatangpopup() {
        gamjatang_pop.show();

        //팝업 기능 구현
    }

    public void showsoondaepopup() {
        soondae_pop.show();

        //팝업 기능 구현
    }

    public void showjjajangmyeon() {
        jjajangmyeon_pop.show();

        //팝업 기능 구현
    }

    public void showmaratangpopup() {
        maratang_pop.show();

        //팝업 기능 구현
    }

    public void showjjambbongpopup() {
        jjambbong_pop.show();

        //팝업 기능 구현
    }

    public void showtangsuyookpopup() {
        tangsuyook_pop.show();

        //팝업 기능 구현
    }

    public void showgamhathuigimpopup() {
        gamjathuigim_pop.show();

        //팝업 기능 구현
    }

    public void showdongaspopup() {
        dongas_pop.show();

        //팝업 기능 구현
    }

    public void showpizzapopup() {
        pizza_pop.show();

        //팝업 기능 구현
    }

    public void showchickenpopup() {
        chicken_pop.show();

        //팝업 기능 구현
    }

    public void showyogurtpopup() {
        yogurt_pop.show();

        //팝업 기능 구현
    }

    public void showsnackpopup() {
        snack_pop.show();

        //팝업 기능 구현
    }

    public void showicecreampopup() {
        icecream_pop.show();

        //팝업 기능 구현
    }
}
