package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;




public class recipe extends AppCompatActivity{

    boolean imageIndex=true;


    int num=42; //xml때문에 음식 갯수 숫자로 입력


    FrameLayout detailRecipeFrameLayout;

    ImageButton starButton;
    ImageButton settingButton;

    TextView foodName;
    TextView ingredientText;
    TextView detailRecipeName;
    TextView detailRecipeHowToCook;


    ImageView foodImage;

    Button detailRecipeCloseButton;

    Dialog settingDialog;

    //음식이름배열
    String recipeFoodNameArr[]= {" ",
            "불족면",
            "치킨마요  덮밥",
            "짜장 덮밥",
            "카레 치즈 라면",
            "양념 치킨 볶음밥",
            "치킨전",
            "피자 말아또",
            "보쌈고기국수",
            "떡볶이에그인헬",
            "피자그라탕",
            "백종원족발덮밥",
            "찜닭계란만두",
            "곱창파스타",
            "돈까스김치나베",
            "오리엔탈 족발샐러드",
            "탕수육 잡채덮밥",
            "돈풍기",
            "케이준 크루통샐러드",
            "족발 김밥",
            "오향 곱창",
            "누드피자전",
            "로제 라면",
            "떡볶이 볶음밥",
            "감자탕 라면",
            "떡볶이 짜파게티",
            "떡볶이 피자",
            "볶음 짜장",
            "깐풍기",
            "짬뽕밥",
            "짬뽕 만두국",
            "짬뽕 볶음밥",
            "짬뽕 라면",
            "매콤 닭떡조림",
            "치킨 스낵랩",
            "족발볶음",
            "매운 족발",
            "짜장면 부침개",
            "짜장 파스타",
            "우거지 해장국",
            "순대 볶음",
            "찜닭 볶음밥",
            "메로나 떡"
    };
    //재료
    String recipeIngredientArr[]={" ",

            "불닭볶음면, 남은 족발, 상추, 깻잎, 양배추",
            "남은 치킨, 밥, 대파, 마요네즈, 데리야끼 소스, 김",
            "남은 짜장 소스, 밥, 계란",
            "남은 치킨, 라면, 카레, 치즈",
            "남은 양념 치킨, 밥, 치즈",
            "남은 치킨(또는 파닭치킨), 청양 고추, 달걀, (파채)",
            "남은 피자, 다진 파, 다진 마늘, 진간장,\n"+" 설탕, 참기름, 달걀, 야채 또는 불고기",
            "남은 보쌈, 시판용 사골, 파, 소면, 후추, 소금",
            "남은 떡볶이, 모짜렐라치즈, 계란, 토마토소스, (다진마늘)",
            "남은 피자, 피자치즈, 감자, 소금, 버터",
            "남은 족발, 삶은 달걀, 양파, 간장, 설탕, 물",
            "남은 찜닭, 계란, 양파, 당근, 쪽파, 계란, 참기름",
            "남은 곱창, 스파게티면, 소금, 양파, 파, 다진 마늘, 고추, 후추, 치즈",
            "남은 돈까스, 김치, 계란, 양파, 대파, 간장, 설탕, 고춧가루",
            "족발 200g, 샐러드용 채소 250g, 숙주나물 80g, \n" +
                    "간장, 물엿, 양파, 올리브유, 파, 설탕, 청양고추, 통깨, 후춧가루\n",
            "탕수육 300g, 건 당면·영양부추 80g씩, 당근·오이 1/3개씩,\n" +
                    " 밥 150g, 올리브유 적당량, 간장, 꿀, 다진마늘, 참기름, 통깨, 검은깨, 후춧가루",
            "탕수육 200g, 대파 1/2대, 풋고추·홍고추 1개씩, 마늘 3쪽,\n" +
                    " 생강 1톨(20g), 포도씨유 적당량,간장, 설탕, 사과식초, 생수, 후춧가루 \n",
            "치킨 300g, 샐러드용 채소 450g, 방울토마토 8개, 다진\n" +
                    " 파슬리 1작은술, 식빵 1장, 버터, 올리브유 , 말린 허브\n" +
                    ", ,베이컨, 다진 양파, 설탕, 레몬즙, 마요네즈, 머스터드\n",
            "남은 족발, 남은 상추·깻잎·마늘·쌈장·무말랭이 무침, 햇반,\n" +
                    " 청양고추, 고추냉이\n",
            "남은 곱창, 남은 마늘, 생강, 대파, 오이, 셀러리, 간장, 설탕,\n" +
                    " 노두유, 미림 팔각, 산초, 사천 고추, 계피, 물\n",
            "남은 피자, 모짜렐라 치즈, 라이스페이퍼, 조미김, 케첩, 설탕,\n" +
                    " 두반장, 굴소스\n",
            "라면 사리, 먹다 남은 로제 떡볶이 국물",
            "남은 떡볶이 국물, 밥 한 공기, 김치, 참기름, 김가루",
            "남은 감자탕 육수, 돼지고기, 양파, 표고 버섯, 고추, 계란,\n" +
                    " 라면 한 봉지\n",
            "남은 떡볶이, 짜파게티, 치즈",
            "남은 떡볶이, 식빵, 치즈, 콘 등",
            "남은 짜장 소스, 면 사리, 오이, 삶은 계란",
            "남은 탕수육, 양파 1/2개, 파 1/2도막, 간장 3스푼, 다진마늘\n" +
                    " 2스푼, 설탕 1스푼, 올리고당 1스푼, 식초 1스푼, 참기름\n" +
                    " 1스푼, 후춧가루 약간\n",
            "남은 짬뽕 국물, 밥 1공기, 계란, 참기름, 김가루",
            "남은 짬뽕 국물, 인스턴트 만두, 버섯, 고사리",
            "남은 짬뽕 국물, 양파1/2, 감자1/2, 밥 1공기",
            "남은 짬뽕 국물, 라면 사리, 대파1/2, 애호박 1/2 , 표고버섯\n" +
                    " 1~2개, 양파1/2, 물 한컵 반\n",
            "닭다리살 1개, 양파·대파 1/2개씩, 고춧가루 1큰술\n" +
                    ", 고추장·간장 1/2큰술씩, 다진 마늘·설탕 1작은술씩, 후추\n" +
                    " 약간\n",
            "남은 치킨, 또띠아, 양상추, 토마토(야채는 원하는 대로),\n" +
                    " 마요네즈, 허니머스타드, 후추\n",
            "먹다남은족발, 고추장 1T, 설탕 1T, 간장 1/2T, 후추 약간",
            "남은족발, 양파 1/4개, 땡초 3개, 마늘 1스푼, 간장 2스푼, \n" +
                    "설탕 1스푼, 올리고당 1스푼, 고춧가루 2스푼\n",
            "남은 짜장면, 기름",
            "올리브유 3 큰 술, 마늘 4쪽, 파스타면 150g(물 3리터, 소금 2\n" +
                    " 큰 술),소금 약간, 후추 약간, 남은 짜장 소스 1컵, 면수 1/2컵\n",
            "남은 감자탕 국물, 우거지, 대파 한줄, 청양고추 4개, 홍고추\n" +
                    " 한개\n",
            "식용유, 파, 순대(순대 양념), 들깨가루(생략가능)",
            "먹다 남은 찜닭, 밥 1~2공기, 계란",
            "메로나 3개, 건식 찹쌀가루 150"
    };
    //만드는방법배열
    String detailRecipeHowToCookArr[]={" ","1.불닭볶음면을 삶아 찬물에 헹궈 준비한다. \n" +
            "2.족발 고기, 상추, 깻잎, 양배추와 볶음면 소스를 함께 넣고 비빈다\n",
            "1.남은 치킨과 대파를 함께 구워낸다. \n" +
                    "2.밥 위에 치킨과 대파, 마요네즈, 데리야끼 소스를 뿌린 뒤 김을 얹어 마무리 한다\n",
            "1.남은 짜장 소스를 데운 후 밥 위에 얹는다.\n" +
                    "2.계란 후라이를 만든 후 덮밥 위에 얹어서 먹는다.\n",
            "1.남은 치킨 살을 발라낸다.\n" +
                    " 2.라면을 평소 끓이던 물의 양 절반 정도만 넣고 끓인다.\n" +
                    "3.면이 익으면 치킨과 카레를 넣고 졸이듯이 끓인 후 기호에 따라 치즈를 추가한다.\n",
            "1.양념치킨을 잘게 찢는다(두 조각 정도는 찢지 말고 볶음밥과 곁들여 먹게 남겨둔다) \n" +
                    "2.양념과 밥을 함께 볶다가 마지막으로 치즈를 넣는다\n",
            "1.먹다 남은 치킨 살을 프라이팬에 올린다\n" +
                    "2.달걀을 잘 풀고 청양고추를 넣어 치킨 살 위에 붓는다\n" +
                    "3.파채를 곁들여 먹는다\n",
            "1.다진파, 다진 마늘, 진간장, 설탕, 참기름을 섞어 양념을 만든다\n" +
                    "2.피자 조각의 끝부분을 잘라내고 반을 자른 뒤, 네모난 모양을 합친다\n" +
                    "3.달걀 지단을 만들고 그 위에 피자를 올린다\n" +
                    "4.야채나 불고기 등을 볶아 피자 위에 올린 뒤, 달걀 지단으로 돌돌 말아준다\n",
            "1.냄비에 파를 넣고 시판용 사골을 끓여준다\n" +
                    "2.다른 냄비에 소면을 삶는다\n" +
                    "3.끓는 육수에 소면을 넣고 후추와 소금으로 간을 맞춘다\n" +
                    "4.남은 보쌈을 얹어서 먹는다\n",
            "1.팬에 다진마늘 1T를 넣고 볶다가 떡볶이와 물을 넣고 끓여준다\n" +
                    "2.떡볶이가 익으면 토마토소스 2.5T를 넣고 끓여준다\n" +
                    "3.끓기 시작하면 모짜렐라치즈와 계란을 넣고 뚜껑을 덮어 익혀준다\n",
            "1.용기에 버터를 바른 후 감자를 잘게 으깨어 넣는다\n" +
                    "2.감자 위에 남은 피자를 먹기 좋은 크기로 잘라 올린다\n" +
                    "3.피자치즈를 듬뿍 얹은 후 전자레인지에 2분 30초를 돌려준다\n",
            "1.냄비에 간장1 : 설탕 1 : 물 1.5 비율로 끓여준다\n" +
                    "2.끓기 시작하면 양파와 남은 족발을 다져 넣어 함께 끓여준다 \n" +
                    "3.1시간정도 졸인 후 삶은 계란 2개, 물을 넣고 1시간 더 졸여준다\n" +
                    "4.물이 1/3정도 남으면 완성된 것을 밥 위에 올려 먹는다\n",
            "1.쪽파와 당근, 양파와 남은 찜닭을 잘게 다져준다\n" +
                    "2.계란 3개를 풀어 야채와 찜닭을 섞어주고 참기름 1T를 넣는다\n" +
                    "3.팬에 동그랗게 부쳐주다가 한면이 다 익으면 반으로 접어준다\n" +
                    "4.노릇노릇해질 때 까지 구워준다\n",
            "1.끓는 물에 소금 1T를 넣고 스파게티면을 삶아준다\n" +
                    "2.팬에 다진 마늘을 볶다가 고추, 파, 양파를 넣고 볶아준다\n" +
                    "3.익으면 남은 곱창을 넣고 볶다가 스파게티면을 넣고 볶아준다\n" +
                    "4.면수를 1국자 넣고 볶다가 치즈를 조금 넣는다\n",
            "1.양파를 살짝 볶은 후 물을 넣고 끓여준다\n" +
                    "2.설탕 1T, 간장 3T를 넣고 김치를 먹기 좋은 크기로 잘라 넣어준다\n" +
                    "3.어느정도 끓으면 파와 남은 돈까스를 넣고 끓여준다\n" +
                    "4.고춧가루를 뿌리고 계란을 올려 뚜껑을 덮고 익혀준다\n",
            "1.족발은 그대로 사용하거나 먹기 좋게 채썬다\n" +
                    "2.샐러드용 채소는 한입크기로 썰고 찬물에 5분간 담갔다 건져 물기를 제거한다\n" +
                    "3.숙주나물은 깨끗이 씻어 준비한다\n" +
                    "4.볼에 분량의 재료를 넣고 잘 섞어 소스를 만든다\n" +
                    "5.그릇에 채소와 족발은 담고 소스를 뿌려낸다\n" +
                    "<소스만들기>\n" +
                    "간장·물엿·다진 양파 2큰술씩, 올리브유·다진 파·설탕 1큰술씩, 다진 마늘 2작은술, 다진 청양고추 1작은술, 통깨·후춧가루 약간씩 넣고 섞는다\n",
            "1.탕수육은 소스에 버무려진 상태로 준비한다\n" +
                    "2.당면은 미지근한 물에 담가 불린 뒤 끓는 물에 살짝 데친다 \n" +
                    "3.영양부추는 6cm 길이로 썰고, 당근과 오이는 6cm 길이로 토막 낸 뒤 돌려 깎아 채썬다\n" +
                    "4.볼에 분량의 재료를 넣고 잘 섞어 소스를 만든다\n" +
                    "5.달군 팬에 올리브유를 두르고 당근, 오이를 넣어 볶다가 숨이 죽으면 당면과 소스를 넣는다\n" +
                    "6.잘 볶아지면 탕수육을 넣고 살짝 버무린 다음 불을 끈다\n" +
                    "그릇에 밥을 담고 볶은 것을 올려낸다.\n" +
                    "<소스 만들기>\n" +
                    "간장 2큰술, 꿀 1큰술, 다진 마늘·참기름·통깨 1작은술씩, 검은깨·후춧가루 약간씩 넣고 섞는다.\n",
            "1.탕수육은 소스를 뿌리지 않은 상태로 준비한다\n" +
                    "2.대파, 고추, 마늘은 어슷썰고 생강은 곱게 채썬다\n" +
                    "3.볼에 분량의 재료를 넣고 잘 섞어 소스를 만든다\n" +
                    "4.달군 팬에 포도씨유를 넣고 가열한 뒤 위의 재료를 넣고 볶는다\n" +
                    "5.마늘이 노릇해지면 탕수육을 넣고 볶는다\n" +
                    "6.재료가 어우러지면 소스를 넣고 고루 볶아낸다\n" +
                    "<소스만들기>\n" +
                    "간장 3큰술, 설탕·사과식초 2큰술씩, 생수 4큰술, 후춧가루 약간 넣고 섞는다.\n",
            "1.치킨은 뼈를 제거하고 살 부분만 준비한다\n" +
                    "2.샐러드용 채소는 한입 크기로 썬 뒤 찬물에 담갔다가 건져 물기를 뺀다\n" +
                    "3.방울토마토는 꼭지를 떼고 2등분한다\n" +
                    "4.식빵은 모서리부분을 잘라내고 1×1cm로 썬다. 팬에 버터와 올리브유를 두르고 식빵을 넣어 볶다가 노릇해지면 허브를 넣고 불을 줄여 수분이 없어질 때까지 볶아낸다\n" +
                    "5.베이컨을 마른 팬에 바삭하게 구운 뒤 잘게 다진다\n" +
                    "6.볼에 베이컨과 나머지 재료를 넣고 잘 섞어 소스를 만든다\n" +
                    "7.샐러드 볼에 채소와 치킨, 크루통을 담고 소스와 파슬리를 뿌려낸다.\n" +
                    "<소스 만들기>\n" +
                    "베이컨 2장, 다진 양파 4큰술, 설탕 3큰술, 레몬즙 4큰술, 마요네즈 4큰술, 머스터드 3과1/2큰술 넣고 섞는다.\n",
            "1.마늘을 다져 기름에 볶아 색을 낸다\n" +
                    "2.밥에 참기름과 소금으로 간을 해서 준비한다\n" +
                    "3.깻잎이나 상추는 채 썰어 준비한다\n" +
                    "4.김 위에 밥을 넓게 깔고 튀긴 마늘을 고루 뿌린 후 족발의 살과 지방 부분을 겹쳐서 얹는다. 무말랭이와 채 썬 야채들을 넣고 돌돌 만다(냉장고에 묵혀둔 야채가 있으면 함께 채 썰어 넣어도 좋다.)\n" +
                    "5.볼에 쌈장, 다진 청양고추, 다진 마늘, 고추냉이를 넣고 섞어 소스를 만든다\n" +
                    "6.김밥을 자른 후 특제 소스를 얹으면 완성! \n",
            "1.밥솥에 먹다 남은 곱창과 마늘, 생강, 대파를 넣는다. 양념 재료를 부은 후 찐다\n" +
                    "2.쪄낸 곱창을 건져 식힌 후 그릇에 담는다\n" +
                    "3.오이, 셀러리, 대파를 채 썰어 위에 얹는다\n" +
                    "4.간장 1, 설탕 1, 식초 1, 다진 마늘 1/2, 물 2의 비율로 섞어 소스를 만든다. 여기에 고추기름 1, 참기름 1/2을 넣고 완성한 후 3번 위에 뿌린다.\n",
            "1.피자를 잘게 다진다\n" +
                    "2.뜨거운 물을 준비해 라이스페이퍼를 적신 후 접시에 펼쳐 놓는다\n" +
                    "3.정가운데 조미김을 깐 후 다진 피자를 얹는다. 그 위에 모차렐라 치즈를 얹고 조미김으로 덮은 후 라이스페이퍼로 감싼다\n" +
                    "4.팬에 기름을 두르고 노릇하게 구워 접시에 담는다\n" +
                    "5.한 번 더 팬에 기름을 둘러 마늘을 넣고 향을 낸 후 케첩 2, 설탕 2, 두반장 0.5, 굴소스 1 비율로 넣고 끓인다. ‘부먹’이든 ‘찍먹’이든 취향대로 맛있게 먹는다.  \n",
            "1.라면 사리를 삶아서 건져낸다\n" +
                    "2.로제 떡볶이 국물과 라면 사리를 2~3분 정도 같이 볶아서 완성 시켜준다\n" +
                    "+)추가하고 싶은 재료가 있으면 추가해서 볶아도 된다\n",
            "1.남은 떡볶이 국물을 적당량 챙긴다\n" +
                    "2.적당량의 김치를 잘게 잘라준다\n" +
                    "3.떡볶이 국물과 밥, 김치를 후라이펜에 넣고 볶아준다\n" +
                    "4.적당히 볶아졌다면 참기름 한 스푼 넣고 다시 볶아준다\n" +
                    "5.볶다가 김가루를 넣고 1분 정도 더 볶아준다\n",
            "1.돼지 고기 적당량, 양파 ½, 표고 버섯1~2개, 고추 1~2개를 썰어준다\n" +
                    "2.냄비에 돼지고기를 넣고 볶아주다 적당히 익으면 양파를 넣고 볶아두고, 양파가 적당히 익으면 표고 버섯을 넣어 볶아준다\n" +
                    "3.버섯까지 적당히 익었다면 감자탕 육수를 넣고 냄비 뚜껑을 닫고 끓여준다\n" +
                    "4.육수가 끓기 시작하면 라면 스프를 1/2정도 넣어주고 라면 사리를 넣어준다(간을 봐가면서 취향에 따라 스프를 추가해준다)\n" +
                    "5.면이 익어갈 때 쯤 계란과 고추를 넣고 끓여주면 완성\n",
            "1.떡볶이를 후라이팬에 볶는다\n" +
                    "2.조리한 짜파게티를 넣는다\n" +
                    "3.함께 볶고 치즈 및 기호에 맞는 재료를 올린다 \n",
            "1.전자레인지 사용 용기에 떡볶이를 자른다\n" +
                    "2.그 위에 식빵 조각을 올린다\n" +
                    "3.토마토 소스를 바른다\n" +
                    "4.치즈 등 기호에 맞는 재료를 올린다\n" +
                    "5.전자레인지에 넣고 기호에 맞게 돌려준다\n",
            "1.면 사리를 삶아서 준비해둔다\n" +
                    "2.후라이팬에 기름을 살짝 두른 후 남은 짜장 소스를 넣고 살살 볶아준다\n" +
                    "3.삶아놓은 면을 넣고 같이 볶는다\n" +
                    "4.그릇에 담은 후 채썰은 오이와 삶은 계란으로 꾸며주면 완성\n",
            "1.파는 채썰기로, 양파는 깍둑썰기로 준비해둔다\n" +
                    "2.후라이팬 바닥이 잠길정도만 기름을 둘러주고 기름 온도가 올라갈 수 있도록 중간 불로 달궈준다\n" +
                    "3.기름이 달궈지는 동안 다진 마늘 2스푼, 간장 3스푼, 설탕 1스푼, 올리고당 1스푼, 식초 1스푼, 참기름 1스푼, 후춧가루 약간을 섞어서 양념을 준비한다\n" +
                    "4.기름이 달궈졌으면 탕수육 고기를 올려 뒤집어가며 튀겨준다\n" +
                    "5.다른 후라이팬에 기름을 두르고 파기름이 나오도록 파를 볶아준다\n" +
                    "6.파기름향이 올라오면 파는 한쪽으로 치워두고 만들어둔 양념을 모두 부어 끓여준다\n" +
                    "7.양념이 끓으면 양파를 넣고 끓인다\n" +
                    "8.양파향이 베이는 동안 고기를 건져내어 기름을 빼준다\n" +
                    "9.끓고 있는 양념에 고기를 넣고 윤기가 나도록 볶아준다\n",
            "1.냄비에 짬뽕 국물을 옮겨 담은 후, 밥 1공기를 넣고 끓인다\n" +
                    "2.죽처럼 묵직하게 변하면 계란 한 개를 풀어주고 참기름을 넣어주고 1분정도 더 끓여준다\n" +
                    "3.조리가 끝나면 김가루를 뿌려 마무리한다\n",
            "1.버섯을 먹기 좋은 크기로 손질한다\n" +
                    "2.고사리는 살짝 데친 후 먹기 좋은 크기로 썰어서 준비한다\n" +
                    "3.냄비에 짬뽕 국물을 옮겨 담은 후, 준비해둔 버섯과 고사리를 넣고 끓인다\n" +
                    "4.적당히 끓으면 만두를 넣어준 후 끓여서 만두를 익힌다\n" +
                    "5.만두가 다 익으면 그릇에 옮겨 식사\n",
            "1.양파와 감자를 작게 썰어준다\n" +
                    "2.후라이팬에 기름을 적당히 두른 후, 양파와 감자를 넣어 3.노릇하게 익을 때까지 볶아준다\n" +
                    "4.노릇하게 익었다면 밥 1공기를 넣고 잘 섞어준다\n" +
                    "5.잘 섞은 밥에 짬뽕 국물을 적당량 넣고 약불로 어느 정도 수분을 날려주면 볶음밥 완성\n",
            "1.대파와 애호박, 표고버섯, 양파를 먹기 좋은 크기로 손질한다\n" +
                    "2.냄비에 기름을 살짝 두르고 파를 넣어 파기름을 낸다\n" +
                    "3.파기름 냄새가 올라온다면 손질해둔 야채를 넣고 볶아준다\n" +
                    "4.물 한컵 반을 넣어주고 짬뽕국물을 넣어서 끓여준다\n" +
                    "5.다른 냄비에는 라면 사리를 삶아서 라면 사리를 준비한다\n" +
                    "6.삶은 라면 사리를 국물에 넣고 1~2분 끓인다\n" +
                    "7.그릇에 옮겨 마무리한다\n",
            "1.껍질을 제거한 닭 다리 살을 먹기 좋은 크기로 썬다\n" +
                    "2.양파와 대파를 큼직하게 썬다\n" +
                    "3.고춧가루와 고추장, 간장, 다진 마늘, 설탕, 후추를 약간씩 섞어 양념을 만들어준다\n" +
                    "4.냄비에 먹다 남은 떡볶이와 닭 다릿살, 야채를 넣고 양념을 넣은후 재료들이 자작하게 잠길 정도로 물을 부어 끓인다\n" +
                    "5.닭 다릿살에 양념이 잘 배어들면 먹는다.\n",
            "1.남은 치킨을 살짝 데워서 따뜻하게 데운다\n" +
                    "2.치킨을 먹기 좋은 크기로 잘게 썰어준다\n" +
                    "3.마요네즈 4큰술, 허니머스타드 2큰술, 후추 작은 1큰술을 넣고 섞어 소스를 준비한다\n" +
                    "4.살짝 데운 또띠아 위에 양상추, 토마토 등 원하는 야채를 올려준다\n" +
                    "5.데운 치킨을 고르게 펴서 올려준다\n" +
                    "6.만든 소스를 뿌리고 돌돌 말아주면 스낵랩 완성!\n" +
                    "\n",
            "1.먼저 먹다 남은 족발을 후라이팬에 기름 살짝 둘러서 맛있게 볶아준다\n" +
                    "2.고추장 1T, 설탕 1T, 간장 1/2T, 후추 약간 넣어서 양념장을 만들어준다\n" +
                    "3.만들어진 양념장을 볶은 족발에 넣고 볶아준다\n" +
                    "4.양념장이 족발에 잘 배일때 쯤 양파를 넣어준다\n" +
                    "5.족발볶음을 다 한뒤에 깨소금이랑 참기름1T를 넣어준다\n" +
                    "6.파 넣어주고 끝! \n",
            "1.식용유에 남은 족발을 볶아준다\n" +
                    "2.어느정도 볶아졌다 싶으면 간장 두스푼,마늘 한스푼,설탕 한스푼 넣어서 볶다\t\n" +
                    "3.고춧가루 두스푼,양파 넣고 볶아준다\n" +
                    "4.땡초넣고 볶다가 마지막에 올리고당을 넣어주면 끝\n",
            "1.짜장소스가 다 발려져있는 짜장면이 남았을 경우, 비닐봉지에 넣어서 넓게 펴준 후, 냉장고에 넣어준다\n" +
                    "2.굳은 면을 먹기 좋게 썰어준다\n" +
                    "3.팬에 기름을 튀기듯이 넉넉히 뿌리고 거기에 자른 건더기를 제거한 짜장면 조각을 올려준다\n" +
                    "4.잘 익히면 완성\n",
            "1.올리브유 두른 팬에 마늘을 황금색이 나도록 볶는다\n" +
                    "2.파스타면은 포장에 적힌 시간에서 2 ~ 3분을 추가해서 삶은 후 건져 1번에 넣고 달달 볶아준다\n" +
                    "3.짜장 소스와 면수를 넣는다 \n" +
                    "4.짜장 소스가 면에 충분히 배어 들도록 1 ~ 2분가량 빠르게 볶아준다 \n" +
                    "+)부족하다면 소금, 후추 솔솔 뿌린다\n",
            "1.대파를 다져주고 청양고추와 홍고추는 씨를 빼고 다져준다 \n" +
                    "2.남은 감자탕 국물과 우거지에 물을 약간 추가하고 냄비넣고 국물이 졸 때까지 팔팔 끓인다.\n" +
                    "3.우거지를 적당한 크기로 잘라준다 \n" +
                    "4.불을 약불로 줄인 후 먹기 좋은 양이 될 때 까지 졸여준다\n",
            "1.팬에 식용유를 두르고 파를 먼저 넣어 볶는다 \n" +
                    "2.파기름 냄새가 향긋하게 올라오면 냉장고에 있던 순대를 넣고 같이 볶는다 \n" +
                    " 3.순대 살때 준 양념을 뿌려서 같이 볶는다 \n" +
                    " +) 들깨가루를 조금 넣어주면 엄청 고소하다\n",
            "1.남은 고기들을 잘게 찢어준다\n" +
                    "2.후라이팬에 먹고 남은 찜닭의 건더기들을 올려준다\n" +
                    "3.밥 1~2공기를 후라이팬에 넣고 볶아준다\n" +
                    "4.계란 후라이를 해서 볶음밥 위에 얹어 먹으면 된다\n",
            "1.메로나3개를 미리 녹여준다\n" +
                    "2.찹쌀가루에 녹인 메로나를 넣어 잘 섞어준다\n" +
                    "3.반죽을 담은 그릇에 랩을 씌워 포크로 구멍을 내준 후 전자레인지에 2분 돌려준다\n" +
                    "4.그릇을 꺼내 반죽을 잘 저어준 후 다시 전자레인지에 2분 돌려준다\n" +
                    "5.다시 그릇을 꺼내 떡을 식혀주면서 치대주면서 섞어준다\n" +
                    "6.적당히 식고 적당한 찰기가 생겼다면 먹기 좋은 크기로 잘라 먹으면 된다\n"
    };






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recipe);

        detailRecipeFrameLayout = findViewById(R.id.detailRecipeFrameLayout);
        detailRecipeName=findViewById(R.id.detailRecipeName);
        detailRecipeHowToCook=findViewById(R.id.detailRecipeHowToCook);
        detailRecipeFrameLayout.setVisibility(View.INVISIBLE);

        //레시피버튼
        recipeOpen_foodImage();
        recipeOpen_foodName();
        recipeOpen_ingredientText();
        recipeOpen_starButton();



        //레시피닫기버튼
        detailRecipeCloseButton=findViewById(R.id.detailRecipeCloseButton);
        detailRecipeCloseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                detailRecipeFrameLayout.setVisibility(View.INVISIBLE);

            }
        });

        //셋팅버튼
        settingDialog=new Dialog(recipe.this);
        settingDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        settingDialog.setContentView(R.layout.setting_custompopup);
        settingDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        settingButton=findViewById(R.id.settingButton);
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSettingDialog();
            }
        });


    }

    public void showSettingDialog() {
        settingDialog.show();
    }
//레시피버튼 함수
    private void initFoodImage(){
        String packageName=getPackageName();

        for(int i=1;i<=num;i++){
            String recipeFoodName=recipeFoodNameArr[i];
            String recipeHowToCook=detailRecipeHowToCookArr[i];
            int viewId=getResources().getIdentifier("foodImage"+i,"id",packageName);
            foodImage=findViewById(viewId);
            foodImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    detailRecipeFrameLayout.setVisibility(View.VISIBLE);
                    detailRecipeName.setText(recipeFoodName);
                    detailRecipeHowToCook.setText(recipeHowToCook);
                }});
            }}

  private void initFoodName(){

        String packageName=getPackageName();

        for(int i=1;i<=num;i++){
            String recipeFoodName=recipeFoodNameArr[i];
            String recipeHowToCook=detailRecipeHowToCookArr[i];
            int viewId=getResources().getIdentifier("foodName"+i,"id",packageName);
            foodName=findViewById(viewId);
            foodName.setText(recipeFoodName);
            foodName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    detailRecipeFrameLayout.setVisibility(View.VISIBLE);
                    detailRecipeName.setText(recipeFoodName);
                    detailRecipeHowToCook.setText(recipeHowToCook);
                }
            });

        }
    }
    private void initIngredientText(){
        String packageName=getPackageName();

        for(int i=1;i<=num;i++){
            String recipeFoodName=recipeFoodNameArr[i];
            String recipeHowToCook=detailRecipeHowToCookArr[i];
            String recipeIngredient=recipeIngredientArr[i];
            int viewId=getResources().getIdentifier("ingredientText"+i,"id",packageName);
            ingredientText=findViewById(viewId);
            ingredientText.setText(recipeIngredient);
            ingredientText.setTextSize(12); //사이즈
            //ingredientText.autoSizeTextType("uniform");
            ingredientText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    detailRecipeFrameLayout.setVisibility(View.VISIBLE);
                    detailRecipeName.setText(recipeFoodName);
                    detailRecipeHowToCook.setText(recipeHowToCook);
                }
            });

        }
    }

    private void initStarButton(){
        String packageName=getPackageName();
        for(int i=1;i<=num;i++){
            int viewId=getResources().getIdentifier("starButton"+i,"id",packageName);
            starButton=findViewById(viewId);
            starButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(imageIndex==true){
                        starButton.setImageResource(R.drawable.fill_star);
                        imageIndex=false;

                    }else{
                        starButton.setImageResource(R.drawable.star);
                        imageIndex=true;
                    }
                }
            });

        }
    }

    public void recipeOpen_foodImage(){
        initFoodImage();
    }

    public void recipeOpen_foodName(){
        initFoodName();
    }
    public void recipeOpen_ingredientText(){
        initIngredientText();

    }

    public void recipeOpen_starButton(){
        initStarButton();

    }


}

