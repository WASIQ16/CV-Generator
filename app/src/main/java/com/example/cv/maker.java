package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class maker extends AppCompatActivity {
    EditText Name, Email, Phone, Discript, Final, Exprience, Skill, Gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maker);

        Name=findViewById(R.id.nam);
        Email=findViewById(R.id.emai);
        Phone=findViewById(R.id.phn);
        Discript=findViewById(R.id.dis);
        Final=findViewById(R.id.fin);
        Exprience=findViewById(R.id.exp);
        Skill=findViewById(R.id.skl);
        Gender=findViewById(R.id.gend);

        Intent a = getIntent();
        String str1 = a.getStringExtra("w");
        Name.setText(str1);

        String str2 = a.getStringExtra("a");
        Email.setText(str2);

        String str3 = a.getStringExtra("s");
        Phone.setText(str3);

        String str4 = a.getStringExtra("i");
        Discript.setText(str4);

        String str6 = a.getStringExtra("q");
        Exprience.setText(str6);

        String str7 = a.getStringExtra("z");
        Skill.setText(str7);

        String str5 = a.getStringExtra("f");
        Gender.setText(str5);

        String str8 = a.getStringExtra("r");
        Final.setText(str8);
    }
}