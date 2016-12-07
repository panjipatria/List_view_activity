package com.example.panji.listview;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends Activity {

    String[] product = new String[] {"Ubuntu", "Mac", "Windows"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, product);

        final ListView listView = (ListView) findViewById(R.id.lv_product);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = (String) listView.getItemAtPosition(i);
                Toast.makeText(ListViewActivity.this, "No Product" +" "+ i +" "+ "Nama Product" +" "+ value, Toast.LENGTH_LONG).show();
            }
        });

    }
}
