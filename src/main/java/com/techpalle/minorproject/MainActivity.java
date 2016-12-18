package com.techpalle.minorproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2, textView3;
    LinearLayout linearLayout1,linearLayout2,linearLayout3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView) findViewById(R.id.text1);
        textView2 = (TextView) findViewById(R.id.text2);
        textView3= (TextView) findViewById(R.id.text3);
        linearLayout1= (LinearLayout) findViewById(R.id.line1);
        linearLayout2= (LinearLayout) findViewById(R.id.line2);
        linearLayout3= (LinearLayout) findViewById(R.id.line3);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                Toast.makeText(MainActivity.this, "Welcome to online video sesion", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                Toast.makeText(MainActivity.this, "Welcome to online video sesion", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main5Activity.class);
                Toast.makeText(MainActivity.this, "Welcome to online video sesion", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
