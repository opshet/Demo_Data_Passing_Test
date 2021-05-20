package sg.edu.rp.c346.id20010021.demo_data_passing_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity_double extends AppCompatActivity {
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double);

        textView4=findViewById(R.id.textView4);

        Intent i= getIntent();
        double value= i.getDoubleExtra("value", 0.0);
        textView4.setText("Double value received is: "+value);
    }
}