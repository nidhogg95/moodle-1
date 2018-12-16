package com.example.ks.moodle.teacher_video.teacher_video6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.video.VideoActivity2;

public class TeacherVideo6_3_1 extends Activity {

    private TextView sun6_3_1Tv;
    private TextView sun6_3_2Tv;
    private TextView sun6_3_3Tv;
    private TextView sun6_3_4Tv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher6_3_1);

        sun6_3_1Tv=(TextView)findViewById(R.id.sun6_3_1);
        sun6_3_2Tv=(TextView)findViewById(R.id.sun6_3_2);
        sun6_3_3Tv=(TextView)findViewById(R.id.sun6_3_3);
        sun6_3_4Tv=(TextView)findViewById(R.id.sun6_3_4);


        sun6_3_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo6_3_1.this, VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_03_09.mp4");
                startActivity(intent);
            }
        });

        sun6_3_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo6_3_1.this,VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_03_11.mp4");
                startActivity(intent);
            }
        });

        sun6_3_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo6_3_1.this,VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_03_10.mp4");
                startActivity(intent);
            }
        });

        sun6_3_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo6_3_1.this,VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_03_12.mp4");
                startActivity(intent);
            }
        });
    }
}