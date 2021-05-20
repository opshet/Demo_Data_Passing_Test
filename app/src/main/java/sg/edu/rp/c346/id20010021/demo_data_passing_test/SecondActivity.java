package sg.edu.rp.c346.id20010021.demo_data_passing_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView=findViewById(R.id.textView);

        Intent i= getIntent();
        int value= i.getIntExtra("value", 0);
        textView.setText("Integer value received is: "+value);
    }
}