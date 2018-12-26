package com.example.ks.moodle.teacher_video.teacher_video10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;

public class TeacherVideo10_1 extends Activity {
    private TextView sun10_1Tv;

    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher10_1);

        sun10_1Tv = (TextView)findViewById(R.id.sun10_1);

        sun10_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo10_1.this,TeacherVideo10_1_1.class);
                startActivity(intent);
            }
        });
    }
}
