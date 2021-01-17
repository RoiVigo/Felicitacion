package com.example.felicitacion;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.audio);
        mediaPlayer.start();

        Animation text2= AnimationUtils.loadAnimation(this,R.anim.text2);
        TextView textView2 =(TextView) findViewById(R.id.textView2);
        textView2.startAnimation(text2);

        Animation text3= AnimationUtils.loadAnimation(this,R.anim.text3);
        TextView textView3 =(TextView) findViewById(R.id.textView3);
        textView3.startAnimation(text3);

        Animation fade_in= AnimationUtils.loadAnimation(this,R.anim.image_in);
        ImageView imageView2 =(ImageView) findViewById(R.id.imageView2);
        imageView2.startAnimation(fade_in);


    }
}