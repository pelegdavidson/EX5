package com.example.peleg.ex5;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.zip.Inflater;

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
        RelativeLayout.LayoutParams rlp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, toPixel(160));
        rlp.setMargins(toPixel(20), toPixel(20), toPixel(20), 0);
        rlp.addRule(RelativeLayout.BELOW, tvIntro.getId());
        rl1.addView(ll1,rlp);

        TextView tvIntro2 = new TextView(this);
        tvIntro2.setId(R.id.tvIntro2);
        tvIntro2.setText(R.string.intro2);
        LinearLayout.LayoutParams llp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        llp2.gravity = Gravity.CENTER_HORIZONTAL;
        ll1.addView(tvIntro2, llp2);

        LinearLayout ll2 = new LinearLayout(this);
        ll2.setId(R.id.ll2Id);
        ll2.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams llp3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        llp3.setMargins(0, toPixel(50),0,0 );
        llp3.gravity = Gravity.CENTER;
        ll1.addView(ll2, llp3);

        CheckBox c1 = new CheckBox(this);
        c1.setId(R.id.checkBox1);
        LinearLayout.LayoutParams checklp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        c1.setText(R.string.checkBox1);
        ll2.addView(c1, checklp);
        CheckBox c2 = new CheckBox(this);
        c2.setId(R.id.checkbox2);
        LinearLayout.LayoutParams checklp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        c2.setText(R.string.checkBox2);
        ll2.addView(c2, checklp2);





    }
    private int toPixel(int dp) {
        Resources r = getResources();
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics());
        return (int) px;
    }
    public void enterLayout(View v){
        FrameLayout f1 = (FrameLayout) findViewById(R.id.f1);
        if(((ToggleButton)v).isChecked()==true){
            LinearLayout ll4 = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.layout2, null);
            f1.removeAllViews();
            f1.addView(ll4);
        }
        else{
            LinearLayout ll3 = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.layout1, null);
            f1.removeAllViews();
            f1.addView(ll3);
        }

    }
}
