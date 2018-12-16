package com.example.ks.moodle.teacher_video.teacher_video6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.video.VideoActivity2;

public class TeacherVideo6_2 extends Activity {
    private TextView sun6_2Tv;

    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher6_2);

        sun6_2Tv = (TextView) findViewById(R.id.sun6_2);
        sun6_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo6_2.this, VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_03_04.mp4");
                startActivity(intent);
            }
        });
    }
}