package com.example.ks.moodle.teacher_video.teacher_video8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.teacher_video.teacher_video7.TeacherVideo7_7_2;
import com.example.ks.moodle.video.VideoActivity2;

public class TeacherVideo8_1_1 extends Activity {
    private TextView mmao8_1_1Tv;

    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher8_1_1);

        mmao8_1_1Tv = (TextView)findViewById(R.id.mao8_1_1);

        mmao8_1_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo8_1_1.this, VideoActivity2.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_07_01_02.mp4");
                startActivity(intent);
            }
        });

    }
}
