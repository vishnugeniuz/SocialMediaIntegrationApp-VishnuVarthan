package com.example.finallogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class screen3 extends AppCompatActivity {
    TextView name,tv,tv2;
    String username;
    ImageView im;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        button2 = findViewById(R.id.button2);
        tv = findViewById(R.id.tv);
        tv2 = findViewById(R.id.tv);
        im = findViewById(R.id.im);
        username=getIntent().getStringExtra("username");
        name=(TextView)findViewById(R.id.nametextView);
        name.setText(username);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(screen3.this, screen1.class);
                startActivity(intent);
                finish();
            }
        });
    }
}