package com.example.felicitacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class ActivitySplash extends AppCompatActivity implements Animation.AnimationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        Typeface myfont= Typeface.createFromAsset(getAssets(), "heysweet.ttf");
        TextView texto=(TextView) findViewById(R.id.textsplash);

        texto.setTypeface(myfont);

        Animation animacion= AnimationUtils.loadAnimation(this, R.anim.splash);
        texto.startAnimation(animacion);

        animacion.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
    Intent intent= new Intent (ActivitySplash.this,MainActivity.class);
    startActivity(intent);
    finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}