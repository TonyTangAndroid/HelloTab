package com.example.hellotab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import java.util.List;

class NestedAdapter extends Adapter<NestedNameViewHolder> {

  private final Context context;
  private final List<StudentEntity> list;

  public NestedAdapter(Context context, List<StudentEntity> list) {
    this.context = context;
    this.list = list;
  }

  @NonNull
  @Override
  public NestedNameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return new NestedNameViewHolder(LayoutInflater.from(context).inflate(R.layout.item_student, parent,false));
  }

  @Override
  public void onBindViewHolder(@NonNull NestedNameViewHolder holder, int position) {
    holder.bind(list.get(position));
  }

  @Override
  public int getItemCount() {
    return list.size();
  }

}
