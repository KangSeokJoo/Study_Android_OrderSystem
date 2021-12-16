package com.example.androidappproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class drink extends AppCompatActivity {


    private View 	decorView;
    private int	uiOption;
    String []st =  new String[20];
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference;
    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        databaseReference = firebaseDatabase.getInstance().getReference().child("list");
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_drink);

        decorView = getWindow().getDecorView();
        uiOption = getWindow().getDecorView().getSystemUiVisibility();
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH )
            uiOption |= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN )
            uiOption |= View.SYSTEM_UI_FLAG_FULLSCREEN;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT )
            uiOption |= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

        decorView.setSystemUiVisibility( uiOption );



        textView1 = (TextView)findViewById(R.id.drink_text_01);
        textView2 = (TextView)findViewById(R.id.drink_text_02);
        textView3 = (TextView)findViewById(R.id.drink_text_03);
        textView4 = (TextView)findViewById(R.id.drink_text_04);
        textView5 = (TextView)findViewById(R.id.drink_text_05);
        textView6 = (TextView)findViewById(R.id.drink_text_06);
        textView7 = (TextView)findViewById(R.id.drink_text_07);
        textView8 = (TextView)findViewById(R.id.drink_text_08);
        textView9 = (TextView)findViewById(R.id.drink_text_09);
        textView10 = (TextView)findViewById(R.id.drink_text_10);
        textView11 = (TextView)findViewById(R.id.drink_text_11);
        textView12 = (TextView)findViewById(R.id.drink_text_12);
        textView13 = (TextView)findViewById(R.id.drink_text_13);
        textView14 = (TextView)findViewById(R.id.drink_text_14);
        textView15 = (TextView)findViewById(R.id.drink_text_15);
        textView16 = (TextView)findViewById(R.id.drink_text_16);
        textView17 = (TextView)findViewById(R.id.drink_text_17);
        textView18 = (TextView)findViewById(R.id.drink_text_18);
        textView19 = (TextView)findViewById(R.id.drink_text_19);
        textView20 = (TextView)findViewById(R.id.drink_text_20);





        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                st[0] = dataSnapshot.child("drink").child("drink_01").getValue().toString();
                textView1.setText(st[0]+"개");
                st[1] = dataSnapshot.child("drink").child("drink_02").getValue().toString();
                textView2.setText(st[1]+"개");
                st[2] = dataSnapshot.child("drink").child("drink_03").getValue().toString();
                textView3.setText(st[2]+"개");
                st[3] = dataSnapshot.child("drink").child("drink_04").getValue().toString();
                textView4.setText(st[3]+"개");
                st[4] = dataSnapshot.child("drink").child("drink_05").getValue().toString();
                textView5.setText(st[4]+"개");
                st[5] = dataSnapshot.child("drink").child("drink_06").getValue().toString();
                textView6.setText(st[5]+"개");
                st[6] = dataSnapshot.child("drink").child("drink_07").getValue().toString();
                textView7.setText(st[6]+"개");
                st[7] = dataSnapshot.child("drink").child("drink_08").getValue().toString();
                textView8.setText(st[7]+"개");
                st[8] = dataSnapshot.child("drink").child("drink_09").getValue().toString();
                textView9.setText(st[8]+"개");
                st[9] = dataSnapshot.child("drink").child("drink_10").getValue().toString();
                textView10.setText(st[9]+"개");
                st[10] = dataSnapshot.child("drink").child("drink_11").getValue().toString();
                textView11.setText(st[10]+"개");
                st[11] = dataSnapshot.child("drink").child("drink_12").getValue().toString();
                textView12.setText(st[11]+"개");
                st[12] = dataSnapshot.child("drink").child("drink_13").getValue().toString();
                textView13.setText(st[12]+"개");
                st[13] = dataSnapshot.child("drink").child("drink_14").getValue().toString();
                textView14.setText(st[13]+"개");
                st[14] = dataSnapshot.child("drink").child("drink_15").getValue().toString();
                textView15.setText(st[14]+"개");
                st[15] = dataSnapshot.child("drink").child("drink_16").getValue().toString();
                textView16.setText(st[15]+"개");
                st[16] = dataSnapshot.child("drink").child("drink_17").getValue().toString();
                textView17.setText(st[16]+"개");
                st[17] = dataSnapshot.child("drink").child("drink_18").getValue().toString();
                textView18.setText(st[17]+"개");
                st[18] = dataSnapshot.child("drink").child("drink_19").getValue().toString();
                textView19.setText(st[18]+"개");
                st[19] = dataSnapshot.child("drink").child("drink_20").getValue().toString();
                textView20.setText(st[19]+"개");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
    public void Btn_Page(View view) {
        if (view.getId() == R.id.Page_Back) {
            Intent intent = new Intent(getApplicationContext(), Lobby.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            startActivity(intent);
            finish();
        } else if (view.getId() == R.id.drink_img_01) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_1");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_02) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_2");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_03) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_3");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_04) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_4");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_05) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_5");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_06) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_6");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_07) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_7");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_08) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_8");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_09) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_9");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_10 ){
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_10");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_11) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_11");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_12) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_12");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_13) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_13");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_14) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_14");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_15) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_15");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_16) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_16");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_17) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_17");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_18) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_18");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_19) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img","img_19");
            startActivity(intent);
            finish();
        }else if (view.getId() == R.id.drink_img_20) {
            Intent intent = new Intent(getApplicationContext(), drink_details.class);//이동할 xml과 연결되는 java 클래스명 적어주세요.
            intent.putExtra("drink_img", "img_20");
            startActivity(intent);
            finish();
        }

    }
}
