package com.example.ks.moodle.teacher_video.teacher_video5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.ks.moodle.R;

public class TeacherVideo5_2 extends Activity {
    private TextView sun5_2Tv;

    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher5_2);
        sun5_2Tv = (TextView) findViewById(R.id.sun5_2);
        sun5_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo5_2.this,TeacherVideo5_2_1.class);
                startActivity(intent);
            }
        });
    }
}