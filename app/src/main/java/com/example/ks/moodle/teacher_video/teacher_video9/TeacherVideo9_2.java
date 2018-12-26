package com.example.ks.moodle.teacher_video.teacher_video9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;

public class TeacherVideo9_2 extends Activity {
    private TextView sun9_2Tv;


    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher9_2);

        sun9_2Tv = (TextView)findViewById(R.id.sun9_2);

        sun9_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo9_2.this,TeacherVideo9_2_1.class);
                startActivity(intent);
            }
        });

    }
}
