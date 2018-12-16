package com.example.ks.moodle.teacher_video.teacher_video6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.ks.moodle.R;

public class TeacherVideo6_3 extends Activity {
    private TextView sun6_3Tv;

    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher6_3);
        sun6_3Tv = (TextView) findViewById(R.id.sun6_3);
        sun6_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo6_3.this,TeacherVideo6_3_1.class);
                startActivity(intent);
            }
        });
    }
}