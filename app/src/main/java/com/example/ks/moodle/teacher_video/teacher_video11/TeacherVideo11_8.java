package com.example.ks.moodle.teacher_video.teacher_video11;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.ks.moodle.R;

public class TeacherVideo11_8 extends Activity {
    private TextView sun11_8Tv;

    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher11_8);
        sun11_8Tv = (TextView) findViewById(R.id.sun11_8);
        sun11_8Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo11_8.this,TeacherVideo11_8_1.class);
                startActivity(intent);
            }
        });
    }
}