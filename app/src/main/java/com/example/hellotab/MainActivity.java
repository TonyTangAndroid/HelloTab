package com.example.hellotab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    RecyclerView recyclerView = findViewById(R.id.list);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setAdapter(new MyAdapter(this, DataUtil.dataList()));
  }

}