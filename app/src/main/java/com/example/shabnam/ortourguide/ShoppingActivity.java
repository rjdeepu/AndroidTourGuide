package com.example.shabnam.ortourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        final ArrayList<Info> info = new ArrayList<>();

        info.add(new Info(getString(R.string.s1), getString(R.string.s1_desc)));
        info.add(new Info(getString(R.string.s2), getString(R.string.s2_desc)));
        info.add(new Info(getString(R.string.s3), getString(R.string.s3_desc)));
        info.add(new Info(getString(R.string.s4), getString(R.string.s4_desc)));
        info.add(new Info(getString(R.string.s5), getString(R.string.s5_desc)));
        info.add(new Info(getString(R.string.s6), getString(R.string.s6_desc)));
        info.add(new Info(getString(R.string.s7), getString(R.string.s7_desc)));

        InfoAdapter adapter = new InfoAdapter(this, info, R.color.category_shopping);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
