package com.gvsdevelopers.bvritconnect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gvsdevelopers.bvritconnect.Dashboard.Circulars;
import com.gvsdevelopers.bvritconnect.Dashboard.Events;

public class StudentHomePage extends AppCompatActivity implements View.OnClickListener {
    private CardView Events, Circulars, News, Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //define cards
        setContentView(R.layout.activity_student_home_page);
        Events = (CardView) findViewById(R.id.EventsCard);
        Circulars = (CardView) findViewById(R.id.NoticeCard);
        News = (CardView) findViewById(R.id.NewsCard);
        Info = (CardView) findViewById(R.id.InfoCard);
        //Add Click Listener to cards
        Events.setOnClickListener(this);
        Circulars.setOnClickListener(this);
        News.setOnClickListener(this);
        Info.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.EventsCard:
                i = new Intent(this, com.gvsdevelopers.bvritconnect.Dashboard.Events.class);
                startActivity(i);
                break;
            case R.id.NoticeCard:
                i = new Intent(this, com.gvsdevelopers.bvritconnect.Dashboard.Circulars.class);
                startActivity(i);
                break;
            case R.id.NewsCard:
                i = new Intent(this, com.gvsdevelopers.bvritconnect.Dashboard.News.class);
                startActivity(i);
                break;
            case R.id.InfoCard:
                i = new Intent(this, com.gvsdevelopers.bvritconnect.Dashboard.Info.class);
                startActivity(i);
                break;
            default:
                break;

        }
    }
}
