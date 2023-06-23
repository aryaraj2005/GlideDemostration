package com.example.glide_demostration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        img=findViewById(R.id.pimg);
        textView=findViewById(R.id.dummytext);

        Glide.with(this).load("https://rukminim1.flixcart.com/image/832/832/kqwobrk0/shoe/p/z/v/6-gb11-elevarse-black-original-imag4tdysgsch8ry.jpeg?q=70").into(img);
        textView.setText("Running Shoes for men");
    }
}