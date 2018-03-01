package jp.techacademy.shuuhei.sutou.calcapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import java.math.BigDecimal;
import java.math.RoundingMode;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText = (EditText) findViewById(R.id.editText1);
        mEditText = (EditText) findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, SecondActivity.class);

        EditText editText1 = (EditText)findViewById(R.id.editText1);
        EditText editText2 = (EditText)findViewById(R.id.editText2);

        String str1 = editText1.getText().toString();
        String str2 = editText2.getText().toString();

        BigDecimal a = new BigDecimal(str1);
        BigDecimal b = new BigDecimal(str2);

        if(v.getId() == R.id.button1){
            BigDecimal result = a.add(b);
            intent.putExtra("VALUE", result);
        }else if(v.getId() == R.id.button2){
            BigDecimal result = a.subtract(b);
            intent.putExtra("VALUE", result);
        }else if(v.getId() == R.id.button3){
            BigDecimal result = a.multiply(b);
            intent.putExtra("VALUE", result);
        }else if(v.getId() == R.id.button4){
            if(a.compareTo(BigDecimal.ZERO)==0 || b.compareTo(BigDecimal.ZERO)==0) {
                BigDecimal result = new BigDecimal("0");
                intent.putExtra("VALUE", result);
            }
            else{
                BigDecimal result = a.divide(b,10, RoundingMode.HALF_UP);
                intent.putExtra("VALUE", result);
                }
        }

        startActivity(intent);

    }
}