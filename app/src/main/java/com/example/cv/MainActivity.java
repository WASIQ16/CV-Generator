package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton btn;
    EditText Name,Email, Phone, Discription;
    Spinner Exprience, Skill;
    String value, value1, value3, gender;
    RadioButton Rb1, Rb2;
    Switch Sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.submit);
        btn.setOnClickListener(this);
        Name=findViewById(R.id.name);
        Email = findViewById(R.id.email);
        Phone = findViewById(R.id.phone);
        Discription=findViewById(R.id.disc);
        Exprience=findViewById(R.id.expr);
        Skill=findViewById(R.id.skil);
        Rb1=findViewById(R.id.Radiobutton);
        Rb1.setOnClickListener(this);
        Rb2=findViewById(R.id.radioButton3);
        Rb2.setOnClickListener(this);
        Sb=findViewById(R.id.switch1);
        Sb.setOnClickListener(this);
        String[] arrayExprience = new String[]
                {
                        "0-9 Months", "1 Year" ,"2 Years", "3 Years", "4 Years", "5 Years", "6-10 Years", "More then 10 Years"
                };
        Spinner Exps= (Spinner) findViewById(R.id.expr);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arrayExprience);
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        Exps.setAdapter(adapter);
        Exps.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                 value = parent.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        {

        };


        String[] arraySkil = new String[]
                {
                        "Android Developer", "Flutter Developer", "Graphic Designer", "Video Grapher", "Frelancer"
                };
        Spinner Skil= (Spinner) findViewById(R.id.skil);
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arraySkil);
        Adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        Skil.setAdapter(Adapter);
        Skil.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int j, long id) {
                value1 = parent.getItemAtPosition(j).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }




    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.switch1:
                if(Sb.isChecked())
                {
                    value3="YES";
                }
                else
                {
                    value3="NO";
                }
                break;
            case R.id.Radiobutton:
                if(Rb1.isChecked())
                {
                    gender="Male";
                }
                break;
            case R.id.radioButton3:

                if (Rb2.isChecked())
                {
                    gender="Female";
                }
                break;

            case R.id.submit:
                Intent i=new Intent(MainActivity.this,maker.class);
                i.putExtra("w", Name.getText().toString());
                i.putExtra("a", Email.getText().toString());
                i.putExtra("s", Phone.getText().toString());
                i.putExtra("i", Discription.getText().toString());
                i.putExtra("q", value);
                i.putExtra("z",value1);
                i.putExtra("f",gender);
                i.putExtra("r",value3);
                startActivity(i);
        }
    }
}