package com.example.midestino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class kopana extends AppCompatActivity {

    ViewFlipper flipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kopana);


        int imgarray[]={R.drawable.kopana1,R.drawable.kopana3,R.drawable.kopana2};
        flipper=(ViewFlipper)findViewById(R.id.flipper);

        for (int i=0;i<imgarray.length;i++)
            showimage(imgarray[i]);
    }

    public void showimage(int img){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper.addView(imageView);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);
        flipper.setInAnimation(this,android.R.anim.slide_in_left);
        flipper.setInAnimation(this, android.R.anim.slide_out_right);
    }


    public void cont(View view) {
        Intent intent= new Intent(kopana.this,Chat.class);
        startActivity(intent);
    }
}