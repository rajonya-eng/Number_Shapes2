package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class number{
        int number;
        int x=1;
        int triangularnumber=1;
        public boolean isTriangular(){
            while(triangularnumber<number){
                x++;
                triangularnumber+=x;

            }
            if(triangularnumber==number){
                return true;
            }
            else{
                return false;
            }
        }
        public boolean isSquareNumber(){
            Double squareroot = Math.sqrt(number);

            if(squareroot==Math.floor(squareroot)){
                return true;
            }
            else{
                return false;
            }
        }

    }

    public void shape(View view) {
        EditText num = (EditText) findViewById(R.id.editTextNumber2);
        number myNum=new number();
        myNum.number=Integer.parseInt(num.getText().toString());
        String message="";
        if(myNum.isSquareNumber()) {
            if (myNum.isTriangular()) {
                message = "The number is both Triangular and Square";
            } else {
                message = "The number is Square but not Triangular";
            }
        }
        else if(myNum.isTriangular()) {
            message = "The number is Triangular but not Square";
        }
        else {
            message = "The number is neither Triangular nor Square";
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}