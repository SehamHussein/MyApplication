package com.example.systemlife.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual;
    String text="";
    double number1, number2;
    int privateNumber;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,"Welcome",Toast.LENGTH_LONG).show();
        nameEditText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
        button0 = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEditText.setText(nameEditText.getText() + "0");
                text += nameEditText.getText().toString();
                textView.setText(textView.getText() + text);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEditText.setText(nameEditText.getText() + "1");
                text += nameEditText.getText().toString();
                textView.setText(textView.getText() + text);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEditText.setText(nameEditText.getText() + "2");
                text += nameEditText.getText().toString();
                textView.setText(textView.getText() + text);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEditText.setText(nameEditText.getText() + "3");
                text += nameEditText;
                textView.setText(textView.getText() + text);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEditText.setText(nameEditText.getText() + "4");
                text += nameEditText;
                textView.setText(textView.getText() + text);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEditText.setText(nameEditText.getText() + "5");
                text += nameEditText;
                textView.setText(textView.getText() + text);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEditText.setText(nameEditText.getText() + "6");
                text += nameEditText;
                textView.setText(textView.getText() + text);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEditText.setText(nameEditText.getText() + "7");
                text += nameEditText;
                textView.setText(textView.getText() + text);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEditText.setText(nameEditText.getText() + "8");
                text += nameEditText;
                textView.setText(textView.getText() + text);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEditText.setText(nameEditText.getText() + "9");
                text += nameEditText;
                textView.setText(textView.getText() + text);
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEditText.setText(nameEditText.getText() + "+");
                number1 = Double.parseDouble(text);
                privateNumber = 1;
                textView.setText(textView.getText() + "+");
                text = "";
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEditText.setText(nameEditText.getText() + "/");
                number1 = Double.parseDouble(text);
                text = "";
                privateNumber = 2;
                textView.setText(textView.getText() + "/");
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEditText.setText(nameEditText.getText() + "-");
                number1 = Double.parseDouble(text);
                text = "";
                privateNumber = 3;
                textView.setText(textView.getText() + "-");
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEditText.setText(nameEditText.getText() + "*");
                number1 = Double.parseDouble(text);
                text = "";
                privateNumber = 4;
                textView.setText(textView.getText() + "*");
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameEditText.setText(nameEditText.getText() + "=");
                textView.setText(textView.getText() + "=");
                number2 = Double.parseDouble(text);
                if (privateNumber == 1) {
                    double Add = (number1 + number2);
                    String add = String.valueOf(Add);
                    nameEditText.setText(nameEditText.getText() + add);
                    textView.setText(textView.getText() + add);
                } else if (privateNumber == 2) {
                    double Div = (number1 / number2);
                    String div = String.valueOf(Div);
                    nameEditText.setText(nameEditText.getText() + div);
                    textView.setText(textView.getText() + div);
                } else if (privateNumber == 3) {
                    double Sub = (number1 - number2);
                    String sub = String.valueOf(Sub);
                    nameEditText.setText(nameEditText.getText() + sub);
                    textView.setText(textView.getText() + sub);
                } else if (privateNumber == 4) {
                    double Mul = (number1 * number2);
                    String mul = String.valueOf(Mul);
                    nameEditText.setText(nameEditText.getText() + mul);
                    textView.setText(textView.getText() + mul);
                }
            }
        });



    }
}
