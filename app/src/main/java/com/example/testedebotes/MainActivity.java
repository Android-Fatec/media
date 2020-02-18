package com.example.testedebotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button btn_media;
    private  EditText n1 = null ;
    private  EditText n2 =  null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn_media = findViewById(R.id.Media);
         n1 = findViewById(R.id.N1);
         n2 = findViewById(R.id.N2);
         btn_media.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v) {
                 float media = (Float.parseFloat(n1.getText().toString()) + Float.parseFloat(n2.getText().toString())) /2;
                 Toast.makeText(MainActivity.this,String.valueOf(media), Toast.LENGTH_LONG).show();

             }
         });

    }



}
