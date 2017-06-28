package com.othershe.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.othershe.cornerlabelview.CornerLabelView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CornerLabelView cornerLabelView = (CornerLabelView) findViewById(R.id.one);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                cornerLabelView.setText("lallala");
//                cornerLabelView.setBgColor(Color.BLUE);
//            }
//        }, 5000);
    }
}
