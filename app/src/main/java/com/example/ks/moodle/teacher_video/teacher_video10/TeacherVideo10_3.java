package com.example.ks.moodle.teacher_video.teacher_video10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;

public class TeacherVideo10_3 extends Activity {
    private TextView sun10_3Tv;

    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher10_3);

        sun10_3Tv = (TextView)findViewById(R.id.sun10_3);

        sun10_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo10_3.this,TeacherVideo10_3_1.class);
                startActivity(intent);
            }
        });
    }
}
