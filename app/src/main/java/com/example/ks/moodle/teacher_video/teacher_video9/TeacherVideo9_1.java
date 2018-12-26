package com.example.ks.moodle.teacher_video.teacher_video9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;


public class TeacherVideo9_1 extends Activity {
    private TextView sun9_1Tv;

    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher9_1);
        sun9_1Tv = (TextView) findViewById(R.id.sun9_1);
        sun9_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo9_1.this,TeacherVideo9_1_1.class);
                startActivity(intent);
            }
        });
    }
}
