package com.example.peleg.ex5;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.rl);
        TextView tvIntro = (TextView) findViewById(R.id.tvIntro);
        LinearLayout ll1 = new LinearLayout(this);
        ll1.setId(R.id.ll1Id);
        ll1.setBackgroundResource(R.drawable.roundcolorborders);
        ll1.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        llp.setMargins();
        rl1.addView();

    }
}
