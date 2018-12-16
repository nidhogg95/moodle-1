package com.example.ks.moodle.teacher_video.teacher_video7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.video.VideoActivity2;

public class TeacherVideo7_2_1 extends Activity {

    private TextView sun7_2_1Tv;
    private TextView sun7_2_2Tv;


    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher7_2_1);

        sun7_2_1Tv=(TextView)findViewById(R.id.sun7_2_1);
        sun7_2_2Tv=(TextView)findViewById(R.id.sun7_2_2);

        sun7_2_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo7_2_1.this, VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_09_01_07.mp4");
                startActivity(intent);
            }
        });

        sun7_2_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo7_2_1.this,VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_09_01.mp4");
                startActivity(intent);
            }
        });


    }
}