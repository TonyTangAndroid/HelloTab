package com.example.hellotab;

import java.util.List;

class CategoryEntity {
  public final String name;
  public final List<StudentEntity> list;

  public CategoryEntity(String name, List<StudentEntity> list) {
    this.name = name;
    this.list = list;
  }
}
