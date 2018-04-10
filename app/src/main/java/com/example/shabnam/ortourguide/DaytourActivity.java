package com.example.shabnam.ortourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class DaytourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        final ArrayList<Info> info = new ArrayList<>();

        info.add(new Info(getString(R.string.d1), getString(R.string.d1_desc)));
        info.add(new Info(getString(R.string.d2), getString(R.string.d2_desc)));
        info.add(new Info(getString(R.string.d3), getString(R.string.d3_desc)));
        info.add(new Info(getString(R.string.d4), getString(R.string.d4_desc)));

        InfoAdapter adapter = new InfoAdapter(this, info, R.color.category_daytour);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
