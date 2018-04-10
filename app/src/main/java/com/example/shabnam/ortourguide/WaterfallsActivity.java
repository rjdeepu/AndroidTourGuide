package com.example.shabnam.ortourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class WaterfallsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        final ArrayList<Info> info = new ArrayList<>();

        info.add(new Info(getString(R.string.w1), getString(R.string.w1_desc),R.drawable.multnomah));
        info.add(new Info(getString(R.string.w2), getString(R.string.w2_desc),R.drawable.oneonta));
        info.add(new Info(getString(R.string.w3), getString(R.string.w3_desc),R.drawable.silver_falls));
        info.add(new Info(getString(R.string.w4), getString(R.string.w4_desc),R.drawable.toketee));
        info.add(new Info(getString(R.string.w5), getString(R.string.w5_desc),R.drawable.watson));

        InfoAdapter adapter = new InfoAdapter(this, info, R.color.category_waterfalls);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
