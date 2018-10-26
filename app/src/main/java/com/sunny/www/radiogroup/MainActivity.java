package com.sunny.www.radiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    RadioGroup radioGroup=(RadioGroup)findViewById(R.id.radiogroup);
    radioGroup.setOnCheckedChangListner(new RadioGroup.OnCheckedChangeListener(){
        TextView textView=(TextView)findViewById(R.id.text1);

        @Override
        public void onCheckedChanged(RadioGroup group, int CheckedId){

        String text="CheckedId:"+checkedId;
        textView.setText(text);
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
    }
    });

}
