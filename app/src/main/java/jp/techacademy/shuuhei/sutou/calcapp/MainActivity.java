package jp.techacademy.shuuhei.sutou.calcapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        startActivity(intent);


        double num1 = Double.parseDouble(editText1.getText().toString());
        double num2 = Double.parseDouble(editText2.getText().toString());


        intent.putExtra("editText1", num1);
        intent.putExtra("editText2", num2);

        if (v.getId() == R.id.button1) {
            intent.putExtra("but1", 1);
        }else if (v.getId() == R.id.button2) {
            intent.putExtra("but2", 2);
        }else if (v.getId() == R.id.button3) {
            intent.putExtra("but3", 3);
        }else if (v.getId() == R.id.button4) {
            intent.putExtra("but4", 4);

        }


    }

}