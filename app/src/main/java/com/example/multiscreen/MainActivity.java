package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] countries = {"Аргентина", "Бразилия", "Чили", "Колумбия", "Уругвай"};
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, countries);
        setListAdapter(mAdapter);
        AdapterView.OnItemClickListener itemclick = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Intent intent = new Intent(MainActivity.this, Argentina.class);
                        Toast.makeText(getApplicationContext(), "Флаг Аргентины", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, Brasilia.class);
                        Toast.makeText(getApplicationContext(), "Флаг Бразилии", Toast.LENGTH_SHORT).show();
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, Chili.class);
                        Toast.makeText(getApplicationContext(), "Флаг Чили", Toast.LENGTH_SHORT).show();
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this, Columbia.class);
                        Toast.makeText(getApplicationContext(), "Флаг Колумбии", Toast.LENGTH_SHORT).show();
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(MainActivity.this, Urugvai.class);
                        Toast.makeText(getApplicationContext(), "Флаг Уругвая", Toast.LENGTH_SHORT).show();
                        startActivity(intent4);
                        break;
                }
            }
        };
        getListView().setOnItemClickListener(itemclick);
    }
}