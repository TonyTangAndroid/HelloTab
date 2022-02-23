package com.example.hellotab;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

class NameViewHolder extends ViewHolder {

  private final Context context;
  private final RecyclerView category_recycler_view;

  public NameViewHolder(Context context, @NonNull View itemView) {
    super(itemView);
    this.context = context;
    category_recycler_view = itemView.findViewById(R.id.category_recycler_view);
  }

  public void bind(CategoryEntity studentEntity) {
    category_recycler_view.setLayoutManager(new LinearLayoutManager(context,RecyclerView.VERTICAL,false));
    category_recycler_view.setAdapter(new NestedAdapter(context, studentEntity.list));
  }
}
