package com.example.ks.moodle.teacher_video.teacher_video11;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.ks.moodle.R;

public class TeacherVideo11_1 extends Activity {
    private TextView sun11_1Tv;

    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher11_1);
        sun11_1Tv = (TextView) findViewById(R.id.sun11_1);
        sun11_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo11_1.this,TeacherVideo11_1_1.class);
                startActivity(intent);
            }
        });
    }
}