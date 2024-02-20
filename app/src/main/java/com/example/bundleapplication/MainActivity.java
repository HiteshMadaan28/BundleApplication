package com.example.bundleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText e;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button);
        e=findViewById(R.id.e1);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String value=e.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("Value",value);
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });










    }
}