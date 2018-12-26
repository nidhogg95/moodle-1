package com.example.ks.moodle.teacher_video.teacher_video8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;

public class TeacherVideo8_6 extends Activity {
    private TextView mmao8_6Tv;

    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher8_6);;

        mmao8_6Tv = (TextView)findViewById(R.id.mao8_6);

        mmao8_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo8_6.this,TeacherVideo8_4_1.class);
                startActivity(intent);
            }
        });
    }
}
