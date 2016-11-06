package com.example.tasmiachowdhury.archhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Menu extends AppCompatActivity {
    EditText editText1, editText2, editText3,editText4, editText5, editText6;
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        Button button1 = (Button) findViewById(R.id.evaluate);
        editText1 = (EditText)findViewById(R.id.blood_pressure);
        editText2 = (EditText)findViewById(R.id.blood_temperature);
        editText3 = (EditText)findViewById(R.id.heart_rate);
        editText4 = (EditText)findViewById(R.id.weight);
        editText5 = (EditText)findViewById(R.id.height);
        editText6 = (EditText)findViewById(R.id.blood_pressure_dys);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Evaluate();
                /*public class  {

                    public static void main(String args[]) {
                        int a, b;
                        a = 10;
                        b = (a == 1) ? 20: 30;
                        System.out.println( "Value of b is : " +  b );

                        b = (a == 10) ? 20: 30;
                        System.out.println( "Value of b is : " + b );
                    }
                    */

                }
            });


    }

    public void Evaluate(){
        {
            Intent intent1 = new Intent(this,Results1.class);
            //EditText editText1 = (EditText) findViewById(R.id.evaluate);
           /* String message = editText1.getText().toString();
            String message1 = editText2.getText().toString();
            String message2 = editText3.getText().toString();
            String message3 = editText4.getText().toString();
            String message4 = editText5.getText().toString();
            intent1.putExtra(EXTRA_MESSAGE,message);
            intent1.putExtra(EXTRA_MESSAGE,message1);
            intent1.putExtra(EXTRA_MESSAGE,message2);
            intent1.putExtra(EXTRA_MESSAGE,message3);
            intent1.putExtra(EXTRA_MESSAGE,message4);
            startActivity(intent1);*/
            Bundle extras = new Bundle();
            extras.putString("BLOOD PRESSURE", editText1.getText().toString());
            extras.putString("BODY TEMP", editText2.getText().toString());
            extras.putString("PULSE", editText3.getText().toString());
            extras.putString("WEIGHT",editText4.getText().toString());
            extras.putString("HEIGHT",editText5.getText().toString());
            extras.putString("BLOOD PRESSURE DIASTOLE" ,editText6.getText().toString());
            //extras.putInt("HEIGHT", editText5.get);
            intent1.putExtras(extras);
            startActivity(intent1);
        }
    }
}
