package com.example.aplikasicuaca;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int[] images = {R.drawable.awan, R.drawable.awan, R.drawable.awan};

    String[] version = {"12.00", "13.00", "14.00"};

    ListView lView;

    ListAdapter lAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lView = (ListView) findViewById(R.id.waktuList);

        lAdapter = new ListAdapter(MainActivity.this, version, images);

        lView.setAdapter(lAdapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, version[i]+" ", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
