package com.example.androidappproject;


import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View 	decorView;
    private int	uiOption;
    String st;
    TextView Pass_Num;
    String arr;
    String PassWord;
    int k;

    // private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    // private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Pass_Num = (TextView) findViewById(R.id.Pass_Num);
        arr = "";
        PassWord = "55555";
        k = 0;

        decorView = getWindow().getDecorView();
        uiOption = getWindow().getDecorView().getSystemUiVisibility();
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH )
            uiOption |= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN )
            uiOption |= View.SYSTEM_UI_FLAG_FULLSCREEN;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT )
            uiOption |= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

        decorView.setSystemUiVisibility( uiOption );

        //푸시 알림을 보내기위해 시스템에 권한을 요청하여 생성

        final NotificationManager notificationManager =

                (NotificationManager)MainActivity.this.getSystemService(MainActivity.this.NOTIFICATION_SERVICE);
    }




    public void Btn_Num(View view) {
        if (k != 5) {

            if (view.getId() == R.id.Num_0) {
                k = k + 1;
                arr = arr + "0";
                Pass_Num.setText("ID : " + arr);
            } else if (view.getId() == R.id.Num_1) {
                k = k + 1;
                arr = arr + "1";
                Pass_Num.setText("ID : " + arr);
            } else if (view.getId() == R.id.Num_2) {
                k = k + 1;
                arr = arr + "2";
                Pass_Num.setText("ID :  " + arr);
            } else if (view.getId() == R.id.Num_3) {
                k = k + 1;
                arr = arr + "3";
                Pass_Num.setText("ID :  " + arr);
            } else if (view.getId() == R.id.Num_4) {
                k = k + 1;
                arr = arr + "4";
                Pass_Num.setText("ID : " + arr);
            } else if (view.getId() == R.id.Num_5) {
                k = k + 1;
                arr = arr + "5";
                Pass_Num.setText("ID : " + arr);
            } else if (view.getId() == R.id.Num_6) {
                k = k + 1;
                arr = arr + "6";
                Pass_Num.setText("ID : " + arr);
            } else if (view.getId() == R.id.Num_7) {
                k = k + 1;
                arr = arr + "7";
                Pass_Num.setText("ID : " + arr);
            } else if (view.getId() == R.id.Num_8) {
                k = k + 1;
                arr = arr + "8";
                Pass_Num.setText("ID : " + arr);
            } else if (view.getId() == R.id.Num_9) {
                k = k + 1;
                arr = arr + "9";
                Pass_Num.setText("ID : " + arr);
            }
        }

    }



    public void Btn_Enter(View view) {
        // databaseReference = firebaseDatabase.getInstance().getReference().child("cart");
        if (view.getId() == R.id.Btn_Enter) {
            if (arr.equals(PassWord)) {
                st = Pass_Num.getText().toString();
                Toast.makeText(this.getApplicationContext(), "환영합니다.", Toast.LENGTH_SHORT).show();
                Pass_Num.setTextColor(Color.parseColor("#FF0000"));

                // databaseReference.child("drink").child("drink_01").setValue("10");

                Intent intent = new Intent(getApplicationContext(), Lobby.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
                startActivity(intent);
                finish();

            }
            else if (k == 0) {
                Toast.makeText(this.getApplicationContext(), "최소 입력은 1개 이상입니다.", Toast.LENGTH_SHORT).show();
                k = 0;
                Pass_Num.setText("ID");
            } else {
                Toast.makeText(this.getApplicationContext(), "비밀번호가 틀립니다.", Toast.LENGTH_SHORT).show();
                arr = "";
                k = 0;
                Pass_Num.setText("ID");
            }
        }
    }

    public void Btn_del(View view) {
        Toast.makeText(this.getApplicationContext(), "정정", Toast.LENGTH_SHORT).show();
        if (view.getId() == R.id.Btn_del) {
            Pass_Num.setText("ID");
            arr = "";
            Pass_Num.setTextColor(Color.parseColor("#1f1f1f"));
            k = 0;
        }
    }

    private void deleteStatusBar() {
        View decorView = getWindow().getDecorView();
        int uiOption = decorView.getSystemUiVisibility();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH)
            uiOption |= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN)
            uiOption |= View.SYSTEM_UI_FLAG_FULLSCREEN;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
            uiOption |= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOption);
    }
}

