package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText userInput;
    RadioGroup radioGroup;

    TextView result ;

    Button Conver;
    String selectedElement ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = findViewById(R.id.UserInput);
        radioGroup = findViewById(R.id.radioGroup);
        result = findViewById(R.id.result);
        Conver = findViewById(R.id.ButtonResult);



        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = findViewById(i);
                if(radioButton != null){
                    selectedElement = radioButton.getText().toString();

                }

            }
        });

        Conver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               if(!userInput.getText().toString().isEmpty() ){
                   double input = Double.parseDouble(userInput.getText().toString());
                   if(selectedElement.equals("Euro To Dinar")){
                       result.setText(" "+(input*3.3));
                   }else{
                       result.setText(" "+(input*0.3));
                   }
               }else{
                   result.setText("Invalid Input ! ");
               }


            }
        });


    }
}