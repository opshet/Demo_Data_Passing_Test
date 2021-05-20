package sg.edu.rp.c346.id20010021.demo_data_passing_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        textView2=findViewById(R.id.textView2);

        Intent i= getIntent();
        char value= i.getCharExtra("value", 'a');
        textView2.setText("Character value received is: "+value);
    }
}