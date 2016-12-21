package ru.ifmo.android_2016.listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = (RecyclerView) findViewById(R.id.cardview);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        List<Folder> folders = new ArrayList<>();
        folders.add(new Folder("Fuck", "/fuck/this/shit"));
        folders.add(new Folder("Suck", "/fuck/this/shit"));
        folders.add(new Folder("SHIT", "/fuck/this/shit"));
        rv.setAdapter(new MyAdapter(folders));
    }
}