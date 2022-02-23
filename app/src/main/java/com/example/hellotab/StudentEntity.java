package com.example.hellotab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Adapter;

class StudentEntity  {
 public final String id;
 public  final String name;

  public StudentEntity(String id, String name) {
    this.id = id;
    this.name = name;
  }
}
