package com.example.hellotab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

class MyAdapter extends Adapter<NameViewHolder> {

  private final Context context;
  private final List<StudentEntity> list;

  public MyAdapter(Context context, List<StudentEntity> list) {
    this.context = context;
    this.list = list;
  }

  @NonNull
  @Override
  public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return new NameViewHolder(LayoutInflater.from(context).inflate(R.layout.item_name, parent,false));
  }

  @Override
  public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
    holder.bind(list.get(position));
  }

  @Override
  public int getItemCount() {
    return list.size();
  }

}
