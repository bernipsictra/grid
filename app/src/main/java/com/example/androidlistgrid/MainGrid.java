package com.example.androidlistgrid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainGrid extends AppCompatActivity {
    private GridView gv;
    private ArrayAdapter adapter;
    private String[] data = {
            "Albania 2.8 million", "Portugal 10.28 million", "Mexico 127.6 million",
            "Netherlands 17.28 million ", "Japan 126.3 million"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid);

        gv = (GridView) findViewById(R.id.gv);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,data);
        gv.setAdapter(adapter);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainGrid.this, data[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}