package com.example.anastasiaafanasyeva.crowncounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mCrowsCounterButton;
    private int mCount = 0;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCrowsCounterButton = (Button)findViewById(R.id.buttonCounter);
        mInfoTextView  = (TextView)findViewById(R.id.textView);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText("I count " + ++mCount + " crows");
            }
        });
    }

    public void onClick(View view) {
        mInfoTextView  = (TextView)findViewById(R.id.textView);
        mInfoTextView.setText("Hello, my friend!");
    }
}
