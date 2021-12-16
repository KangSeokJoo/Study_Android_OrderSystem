package com.example.androidappproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Meal_Details extends AppCompatActivity {

    private View 	decorView;
    private int	uiOption;
    String numStr;
    String numStr2;
    String st;
    TextView db_data_text;
    TextView db_data_text5;
    ImageView imageView;
    TextView data_eps;
    String qu_data;
    int i;
    int i_num4;
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference;
    private FirebaseDatabase firebaseDatabase_1 = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_meal_details);
        decorView = getWindow().getDecorView();
        uiOption = getWindow().getDecorView().getSystemUiVisibility();
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH )
            uiOption |= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN )
            uiOption |= View.SYSTEM_UI_FLAG_FULLSCREEN;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT )
            uiOption |= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

        decorView.setSystemUiVisibility( uiOption );
        db_data_text = (TextView)findViewById(R.id.DB_Data_Text) ;
        db_data_text5 = (TextView)findViewById(R.id.DB_Data_Text5) ;
        databaseReference = firebaseDatabase.getInstance().getReference().child("list");
        databaseReference_1= firebaseDatabase_1.getInstance().getReference().child("cart");
        ImageView imageView = (ImageView) findViewById(R.id.change_meal_img);
        data_eps = (TextView) findViewById(R.id.data_eps);
        i = 0;
        i_num4 = 11;

        Intent intent = getIntent(); /*데이터 수신*/

        String name = intent.getExtras().getString("meal_img"); /*String형*/

        if (name.equals("img_1")) {
            imageView.setImageResource(R.drawable.meal_1);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_01").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+ "원");
                    qu_data = "meal_01";

                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        } else if (name.equals("img_2")) {
            imageView.setImageResource(R.drawable.meal_2);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_02").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+1+ "원");
                    qu_data = "meal_02";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if(name.equals("img_3")) {
            imageView.setImageResource(R.drawable.meal_3);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_03").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+2+ "원");
                    qu_data = "meal_03";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_4")){
            imageView.setImageResource(R.drawable.meal_4);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_05").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+3+ "원");
                    qu_data = "meal_04";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_5")){
            imageView.setImageResource(R.drawable.meal_5);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_05").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+4+ "원");
                    qu_data = "meal_05";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_6")){
            imageView.setImageResource(R.drawable.meal_6);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_06").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+5+ "원");
                    qu_data = "meal_06";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_7")){
            imageView.setImageResource(R.drawable.meal_7);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_07").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+6+ "원");
                    qu_data = "meal_07";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_8")){
            imageView.setImageResource(R.drawable.meal_8);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_08").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+7+ "원");
                    qu_data = "meal_08";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_9")){
            imageView.setImageResource(R.drawable.meal_9);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_09").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+8+ "원");
                    qu_data = "meal_09";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_10")){
            imageView.setImageResource(R.drawable.meal_10);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_10").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+9+ "원");
                    qu_data = "meal_10";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_11")){
            imageView.setImageResource(R.drawable.meal_11);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_11").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+10+ "원");
                    qu_data = "meal_11";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_12")){
            imageView.setImageResource(R.drawable.meal_12);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_12").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+11+ "원");
                    qu_data = "meal_12";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_13")){
            imageView.setImageResource(R.drawable.meal_13);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_13").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+12+ "원");
                    qu_data = "meal_13";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_14")){
            imageView.setImageResource(R.drawable.meal_14);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_14").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+13+ "원");
                    qu_data = "meal_14";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_15")){
            imageView.setImageResource(R.drawable.meal_15);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_15").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+14+ "원");
                    qu_data = "meal_15";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_16")){
            imageView.setImageResource(R.drawable.meal_16);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_16").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+15+ "원");
                    qu_data = "meal_16";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_17")){
            imageView.setImageResource(R.drawable.meal_17);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_17").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+16+ "원");
                    qu_data = "meal_17";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_18")){
            imageView.setImageResource(R.drawable.meal_18);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_18").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+17+ "원");
                    qu_data = "meal_18";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_19")){
            imageView.setImageResource(R.drawable.meal_19);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_19").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+18+ "원");
                    qu_data = "meal_19";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }else if (name.equals("img_20")){
            imageView.setImageResource(R.drawable.meal_20);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child("meal_20").getValue().toString();
                    db_data_text.setText(st+"개");
                    db_data_text5.setText(i_num4+19+ "원");
                    qu_data = "meal_20";
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

        }

    }


    public void Ip_spat(View view) {

        if(view.getId()==R.id.btn_plus){
            i = i+1;
            String to = Integer.toString(i);
            data_eps.setText(to+"개");

        }else if(view.getId()==R.id.btn_mono){
            if(i == 0){
                Toast.makeText(getApplicationContext(), "최소 주문 수량은 1개 입니다.", Toast.LENGTH_SHORT).show();

            }else{
                i = i-1;
                String to = Integer.toString(i);
                data_eps.setText(to+"개");

            }

        }
    }
    public void Btn_sell(View view) {
        if(i == 0 || i<=0) {
            Toast.makeText(getApplicationContext(), "최소 주문 수량은 1개 입니다.", Toast.LENGTH_SHORT).show();

        }else if (i > 0) {
            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    st = dataSnapshot.child("meal").child(qu_data).getValue().toString();
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });

            int numInt = Integer.parseInt(st);
            numInt = numInt + i;
            numStr = String.valueOf(numInt);
            numStr2 = String.valueOf(numInt);
            databaseReference.child("meal").child(qu_data).setValue(numStr);
            databaseReference.child("meal").child(qu_data).setValue(numStr2);

            databaseReference_1.child("meal").child(qu_data).setValue(String.valueOf(i));

            Intent intent = new Intent(getApplicationContext(), meal.class);

            intent.putExtra("numStr", numStr);
            startActivity(intent);
            finish();
        }
    }
    public void Btn_click(View view){
        Intent intent = new Intent(getApplicationContext(), meal.class);//뒤로 가기
        startActivity(intent);
        finish();
    }
}
