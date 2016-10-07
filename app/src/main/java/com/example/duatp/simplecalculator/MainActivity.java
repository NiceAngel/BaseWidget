package com.example.duatp.simplecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    EditText edit2;
    String num1;
    String num2;
    Double result;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText) findViewById(R.id.Text1);
        edit2 = (EditText) findViewById(R.id.Text2);
        textView = (TextView) findViewById(R.id.TextView);


    }

    public void onAddClicked(View v){
        if(Verification()) {
            num1 = edit1.getText().toString();
            num2 = edit2.getText().toString();
            result = Double.parseDouble(num1) + Double.parseDouble(num2);
            textView.setText("계산 결과 : " + result);
        }
    }

    public void onSubClicked(View v){
        if(Verification()) {
            num1 = edit1.getText().toString();
            num2 = edit2.getText().toString();
            result = Double.parseDouble(num1) - Double.parseDouble(num2);
            textView.setText("계산 결과 : " + result);
        }
    }

    public void onMulClicked(View v){
        if(Verification()) {
            num1 = edit1.getText().toString();
            num2 = edit2.getText().toString();
            result = Double.parseDouble(num1) * Double.parseDouble(num2);
            textView.setText("계산 결과 : " + result);
        }
    }

    public void onDivClicked(View v){
        if(Verification()) {
            if(edit2.getText().toString().equals("0")) {
                Toast.makeText(getApplicationContext(),"나누는 값이 0 입니다.",Toast.LENGTH_LONG).show();
            }else{
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Double.parseDouble(num1) / Double.parseDouble(num2);
                textView.setText("계산 결과 : " + result);
            }

        }
    }

    public void onDivxClicked(View v){
        if(Verification()) {
            if(edit2.getText().toString().equals("0")) {
                Toast.makeText(getApplicationContext(),"나누는 값이 0 입니다.",Toast.LENGTH_LONG).show();
            }else{
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Double.parseDouble(num1) % Double.parseDouble(num2);
                textView.setText("계산 결과 : " + result);
            }
        }
    }

    private boolean Verification(){
        if(edit1.getText().toString().equals("")||edit2.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"값이 입력되지 않았습니다.",Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

}
