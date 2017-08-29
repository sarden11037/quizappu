package com.example.android.quizappu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.R.attr.checked;

public class MainActivity extends AppCompatActivity {
    int sobCount = 0;
    String sas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void rb1check(View view){
        boolean abr ;
        abr = ((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.rb1:
                if(abr){
                    sobCount+=25;
                    break;
                }
        }
    }
    public void onCheckQ3 (View view){
        boolean arx = ((CheckBox)view).isChecked();
        boolean lomp = false;
        boolean stromp = false;
        switch(view.getId()){
            case R.id.cb13:
                if (arx){
                    lomp = true;
                }
            case R.id.c23:
                if(arx){
                    stromp = true;
                }
                break;
        }
        if(lomp == true && stromp == true){
            sobCount+=25;
        }
    }
    public void rb2check(View view){
        boolean arsx = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.rb1g2:
                if(arsx){
                    sobCount+=25;
                }
        }
    }
    public void clickSubmit(View view){
        EditText tlas = (EditText)findViewById(R.id.et2);
        sas = tlas.getText().toString();
        if(sas.toLowerCase().equals("www.udacity.com")  || sas.toLowerCase().equals("udacity.com")  )
        {
           sobCount+=25;
        }
       String ans = "You score is " + sobCount + " ! ";
        Toast.makeText(getApplicationContext(),ans,Toast.LENGTH_LONG).show();
    }

}
