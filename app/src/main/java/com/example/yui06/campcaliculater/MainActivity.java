package com.example.yui06.campcaliculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    int number;
    int answer;
    int operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textView);
    }

    public void calculate(){
        switch (operation){

            case 0:
            answer=number;
            break;

            case 1:
            answer=answer+number;
            break;

            case 2:
                answer=answer-number;
                break;

            case 3:
                answer=answer*number;
                break;

            case 4:
                if (number==0) {
                    answer = 0;
                    Toast.makeText(this, "0で割ることはできません！", Toast.LENGTH_LONG).show();
                    allclear();
                }else{
                answer=answer/number;}
                break;
        }

        number=0;

    }


    public void one(View v){
        number = number*10 +1;
        textView.setText(String.valueOf(number));

    }

    public void two(View v){
        number = number*10 +2;
        textView.setText(String.valueOf(number));

    }

    public void three(View v){
        number = number*10 +3;
        textView.setText(String.valueOf(number));

    }

    public void four(View v){
        number = number*10 +4;
        textView.setText(String.valueOf(number));


    }

    public void five(View v){
        number = number*10 +5;
        textView.setText(String.valueOf(number));

    }

    public void six(View v){
        number = number*10 +6;
        textView.setText(String.valueOf(number));

    }


    public void seven(View v){
        number = number*10 +7;
        textView.setText(String.valueOf(number));

    }

    public void eight(View v){
        number = number*10 +8;
        textView.setText(String.valueOf(number));

    }

    public void nine(View v){
        number = number*10 +9;
        textView.setText(String.valueOf(number));

    }

    public void zero(View v){
        number = number*10 +0;
        textView.setText(String.valueOf(number));

    }

    public void plus(View v){
        calculate();
        operation=1;
        textView.setText("+");
    }

    public void minus(View v){
        calculate();
        operation=2;
        textView.setText("-");
    }

    public void kakeru(View v){
        calculate();
        operation=3;
        textView.setText("×");
    }

    public void waru(View v){
        calculate();
        operation=4;
        textView.setText("÷");
    }


    public void allclear(){
        number=0;
        answer=0;
        operation=0;
    }




    public void equal(View v){
        calculate();
        textView.setText(String.valueOf(answer));

    }


    public void clear(View v){
        allclear();
        textView.setText("0");


    }




}
