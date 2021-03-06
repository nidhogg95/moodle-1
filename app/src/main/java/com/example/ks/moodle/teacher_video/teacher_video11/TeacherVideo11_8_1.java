package com.example.ks.moodle.teacher_video.teacher_video11;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.video.VideoActivity2;

public class TeacherVideo11_8_1 extends Activity {

    private TextView sun11_8_1Tv;
    private TextView sun11_8_2Tv;
    private TextView sun11_8_3Tv;


    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher11_8_1);

        sun11_8_1Tv=(TextView)findViewById(R.id.sun11_8_1);
        sun11_8_2Tv=(TextView)findViewById(R.id.sun11_8_2);
        sun11_8_3Tv=(TextView)findViewById(R.id.sun11_8_3);



        sun11_8_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_8_1.this, VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_05_11.mp4");
                startActivity(intent);
            }
        });

        sun11_8_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_8_1.this,VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_05_12.mp4");
                startActivity(intent);
            }
        });

        sun11_8_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_8_1.this,VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_05_13.mp4");
                startActivity(intent);
            }
        });


    }
}
