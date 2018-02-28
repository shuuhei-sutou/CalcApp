package jp.techacademy.shuuhei.sutou.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Parcelable;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        double val = intent.getDoubleExtra("editText1", 0);
        double va2 = intent.getDoubleExtra("editText2", 0);

        int but1 = intent.getIntExtra("but1",0);
        int but2 = intent.getIntExtra("but2",0);
        int but3 = intent.getIntExtra("but3",0);
        int but4 = intent.getIntExtra("but4",0);


        TextView m1 = (TextView) findViewById(R.id.textView);
        if (but1 == 1) {
            m1.setText(String.valueOf(val + va2));
        } else if (but2 == 2) {
            m1.setText(String.valueOf(val - va2));
        } else if (but3 == 3) {
            m1.setText(String.valueOf(val * va2));
        } else if (but4 == 4) {
            m1.setText(String.valueOf(val / va2));
        }


    }
}
