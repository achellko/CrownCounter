package com.example.anastasiaafanasyeva.crowncounter;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mCrowsCounterButton;
    private int mCount = 0;
    private TextView mInfoTextView;
    private static final String KEY_COUNT = "COUNT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCrowsCounterButton = (Button)findViewById(R.id.buttonCounter);
        mInfoTextView  = (TextView)findViewById(R.id.textView);

        if(savedInstanceState != null) {
            mCount = savedInstanceState.getInt(KEY_COUNT, 0);
            mInfoTextView.setText("Я насчитал " + mCount + " ворон");
        }
            mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mInfoTextView.setText("I count " + ++mCount + " crows");
                }
            });
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(KEY_COUNT, mCount);
    }

    public void onClick(View view) {
        mInfoTextView  = (TextView)findViewById(R.id.textView);
        mInfoTextView.setText("Hello, my friend!");
    }
}
