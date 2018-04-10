package com.example.shabnam.ortourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CoastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        final ArrayList<Info> info = new ArrayList<>();

        info.add(new Info(getString(R.string.c1), getString(R.string.c1_desc)));
        info.add(new Info(getString(R.string.c2), getString(R.string.c2_desc)));
        info.add(new Info(getString(R.string.c3), getString(R.string.c3_desc)));
        info.add(new Info(getString(R.string.c4), getString(R.string.c4_desc)));

        InfoAdapter adapter = new InfoAdapter(this, info, R.color.category_coast);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
