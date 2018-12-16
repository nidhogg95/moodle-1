package com.example.ks.moodle.teacher_video.teacher_video7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;

public class TeacherVideo7_6 extends Activity {

    private TextView sun7_6Tv;
    private TextView chen7_6Tv;

    @Override

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher7_6);

        sun7_6Tv=(TextView)findViewById(R.id.sun7_6);
        chen7_6Tv=(TextView)findViewById(R.id.chen7_6);

        sun7_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo7_6.this,TeacherVideo7_6_1.class);
                startActivity(intent);
            }
        });

        chen7_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo7_6.this,TeacherVideo7_6_2.class);
                startActivity(intent);
            }
        });
    }


}
