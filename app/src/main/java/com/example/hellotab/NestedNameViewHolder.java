package com.example.hellotab;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

class NestedNameViewHolder extends ViewHolder {

  private final TextView tv_name;

  public NestedNameViewHolder(@NonNull View itemView) {
    super(itemView);
    tv_name = itemView.findViewById(R.id.tv_name);
  }

  public void bind(StudentEntity studentEntity) {
    tv_name.setText(studentEntity.name);
  }
}
