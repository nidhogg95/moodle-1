package com.example.ks.moodle.teacher_video.teacher_video11;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.ks.moodle.R;

public class TeacherVideo11_7 extends Activity {
    private TextView sun11_7Tv;

    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher11_7);
        sun11_7Tv = (TextView) findViewById(R.id.sun11_7);
        sun11_7Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo11_7.this,TeacherVideo11_7_1.class);
                startActivity(intent);
            }
        });
    }
}
