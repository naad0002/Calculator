package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText perform;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button dot;
    private Button add;
    private Button equal;
    private Button mul;
    private Button div;
    private Button sub;
    private Button del;
    private Button rem;
    private Button zero;
    private Button ac;
    private EditText field;

    private Double operand1=null;
    private Double operand2=null;
    String op1=null;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        field = (EditText) findViewById(R.id.editText);
        one = (Button) findViewById(R.id.buttonone);
        two = (Button) findViewById(R.id.buttontwo);
        three = (Button) findViewById(R.id.buttonthree);
        four = (Button) findViewById(R.id.buttonfour);
        five = (Button) findViewById(R.id.buttonfive);
        six = (Button) findViewById(R.id.buttonsix);
        seven = (Button) findViewById(R.id.buttonsev);
        eight = (Button) findViewById(R.id.buttoneight);
        nine = (Button) findViewById(R.id.buttonnine);
        dot = (Button) findViewById(R.id.buttondot);
        mul = (Button) findViewById(R.id.buttonmul);
        div = (Button) findViewById(R.id.buttondiv);
        sub = (Button) findViewById(R.id.buttonsub);
        del = (Button) findViewById(R.id.buttondel);
        add = (Button) findViewById(R.id.buttonadd);
        equal = (Button) findViewById(R.id.buttoneq);
        perform = (EditText) findViewById(R.id.perform);
        rem = (Button) findViewById(R.id.buttonrem);
        ac = (Button) findViewById(R.id.buttonAC);
     zero = (Button) findViewById(R.id.buttonzero);
        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button) v;

                field.append(b.getText().toString());
                operand1 =Double.parseDouble(field.getText().toString());



            }
        };
        one.setOnClickListener(ocl);
        two.setOnClickListener(ocl);
        three.setOnClickListener(ocl);
        four.setOnClickListener(ocl);
        five.setOnClickListener(ocl);
        six.setOnClickListener(ocl);
        seven.setOnClickListener(ocl);
        eight.setOnClickListener(ocl);
        nine.setOnClickListener(ocl);
        dot.setOnClickListener(ocl);
         zero.setOnClickListener(ocl);

        View.OnClickListener ocl1 = new View.OnClickListener() {
            public void onClick(View view) {
               Double res=null;
                Button b1 = (Button) view;
                String op = b1.getText().toString();
                System.out.println("op = "+op);

    if(!op.toString().equals("=")){
        op1=op.toString();
      //   String pre=field.getText().toString();
                         if(operand1==null)
                       operand1 =Double.parseDouble(field.getText().toString());
                            else {
                        operand2 = Double.parseDouble(field.getText().toString());

                          }

                perform.append(field.getText().toString());
                field.setText("");
                field.append(op1.toString());

            }
               else {
                    perform.setText("");
                   // Log.d(op);
    switch (op1) {

        case "+":
        operand1+=operand2;
            break;
        case "-":
            operand1 -= operand2;
            break;
        case "*":
         operand1*= operand2;
            break;
        case "/":
            if(operand2==0)
                operand1=0.0;
            else
         operand1 /= operand2;
            break;
        case "%":
          operand1 %= operand2;
            break;
            default:
operand1=operand1;
operand2=operand2;
    }
      //  operand1 =Double.parseDouble(field.getText().toString());
        field.setText(operand1.toString());
                }

            }
        };
        add.setOnClickListener(ocl1);
        sub.setOnClickListener(ocl1);
        mul.setOnClickListener(ocl1);
        div.setOnClickListener(ocl1);
        equal.setOnClickListener(ocl1);
        rem.setOnClickListener(ocl1);


        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                field.setText("");
                perform.setText("");
            }
        });




    }}






