package com.example.androidappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Lobby extends AppCompatActivity {
    private View 	decorView;
    private int	uiOption;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_lobby);
        decorView = getWindow().getDecorView();
        uiOption = getWindow().getDecorView().getSystemUiVisibility();
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH )
            uiOption |= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN )
            uiOption |= View.SYSTEM_UI_FLAG_FULLSCREEN;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT )
            uiOption |= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

        decorView.setSystemUiVisibility( uiOption );
    }
    public void Btn_Page(View view){
        if (view.getId() == R.id.ramen) { // 라면 카테고리 페이지
            Intent intent = new Intent(getApplicationContext(), ramen.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            startActivity(intent);
            finish();
        }else if(view.getId() == R.id.ice) { // 냉동 카테고리 페이지
            Intent intent = new Intent(getApplicationContext(),icecream.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            startActivity(intent);
            finish();
        }else if(view.getId() == R.id.meal) { // 즉석식품 카테고리 페이지
            Intent intent = new Intent(getApplicationContext(),meal.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            startActivity(intent);
            finish();
        }else if(view.getId() == R.id.drink) { // 음료 카테고리 페이지
            Intent intent = new Intent(getApplicationContext(),drink.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            startActivity(intent);
            finish();
        }else if(view.getId() == R.id.live) { // 생필품 카테고리 페이지
            Intent intent = new Intent(getApplicationContext(), live.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            startActivity(intent);
            finish();
        }else if(view.getId() == R.id.bread){
            Intent intent = new Intent(getApplicationContext(),bread.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            startActivity(intent);
            finish();
        }else if(view.getId() == R.id.logout){
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            startActivity(intent);
            finish();
        }
    }
}
