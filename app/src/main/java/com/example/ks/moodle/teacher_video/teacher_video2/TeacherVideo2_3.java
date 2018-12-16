package com.example.ks.moodle.teacher_video.teacher_video2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.ks.moodle.R;
import com.example.ks.moodle.video.VideoActivity2;

public class TeacherVideo2_3 extends Activity{
    private TextView sun2_3Tv;

    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher2_3);
        sun2_3Tv=(TextView)findViewById(R.id.sun2_3);
        sun2_3Tv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(TeacherVideo2_3.this, VideoActivity2.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_03_09.mp4");
                startActivity(intent);
            }
        });
    }
}
