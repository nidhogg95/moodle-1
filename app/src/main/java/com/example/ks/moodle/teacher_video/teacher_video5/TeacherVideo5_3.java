package com.example.ks.moodle.teacher_video.teacher_video5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.ks.moodle.R;

public class TeacherVideo5_3 extends Activity {
    private TextView sun5_3Tv;

    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher5_3);
        sun5_3Tv = (TextView) findViewById(R.id.sun5_3);
        sun5_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo5_3.this,TeacherVideo5_3_1.class);
                startActivity(intent);
            }
        });
    }
}