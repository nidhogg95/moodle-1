package com.example.ks.moodle.teacher_video.teacher_video12;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.ks.moodle.R;

public class TeacherVideo12_1 extends Activity {
    private TextView sun12_1Tv;

    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher12_1);
        sun12_1Tv = (TextView) findViewById(R.id.sun12_1);
        sun12_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo12_1.this,TeacherVideo12_1_1.class);
                startActivity(intent);
            }
        });
    }
}