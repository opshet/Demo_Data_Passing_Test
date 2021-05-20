package sg.edu.rp.c346.id20010021.demo_data_passing_test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonInt;
    Button buttonChar;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonInt=findViewById(R.id.buttonInt);
        buttonChar=findViewById(R.id.buttonChar);
        textView3=findViewById(R.id.textView3);

        buttonInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent i= new Intent(MainActivity.this,
                         SecondActivity.class);
                 i.putExtra("value", 1);
                 startActivity(i);
            }
        });

        buttonChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,
                        ThirdActivity.class);
                i.putExtra("value", 'a');
                startActivity(i);

            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,
                        activity_double.class);
                i.putExtra("value", 99.99);
                startActivity(i);
            }
        });


    }
}