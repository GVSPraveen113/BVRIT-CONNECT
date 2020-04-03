package com.gvsdevelopers.bvritconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private Button Teacher, Student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Teacher = (Button) findViewById(R.id.teacher);
        Student = (Button) findViewById(R.id.student);

        Teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TeacherLoginActivity.class);
                startActivity(intent);
                finish();
                return;

            }


        });
        Student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StudentLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });


    }


}



