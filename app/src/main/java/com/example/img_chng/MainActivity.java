package com.example.img_chng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ref;
    ImageView img;
    int flag=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ref=findViewById(R.id.ref);
        img=findViewById(R.id.img);
        
        ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag==0){
                    img.setImageResource(R.drawable.im2);
                    flag=1;
                }

                else if (flag==1){
                    img.setImageResource(R.drawable.im3);
                    flag=2;
                }

                else if (flag==2){
                    img.setImageResource(R.drawable.im4);
                    flag=3;
                }

                else if (flag==3){
                    img.setImageResource(R.drawable.im1);
                    flag=0;
                }
            }
        });
    }
}