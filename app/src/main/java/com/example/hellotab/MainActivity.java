package com.example.hellotab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ahmadhamwi.tabsync.TabbedListMediator;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    RecyclerView recyclerView = findViewById(R.id.recyclerView);
    TabLayout tab_layout = findViewById(R.id.tabLayout);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    List<CategoryEntity> list = DataUtil.categoryList();
    recyclerView.setAdapter(new MyAdapter(this, list))  ;

    for (CategoryEntity item : list) {
      tab_layout.addTab(tab_layout.newTab().setText(item.name));
    }
    TabbedListMediator mediator = new TabbedListMediator(
        recyclerView,
        tab_layout,
        indexList(list),true
    );

    mediator.attach();


  }

  private List<Integer> indexList(List<CategoryEntity> list) {
    List<Integer> index = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      index.add(i);
    }

    return index;
  }

}