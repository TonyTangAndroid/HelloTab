package com.example.hellotab;

import java.util.Arrays;
import java.util.List;

public class DataUtil {

  static List<CategoryEntity> categoryList() {
    return Arrays.asList(
        new CategoryEntity("Category 1", student1List()),
        new CategoryEntity("Category 2", student2List()),
        new CategoryEntity("Category 3", student2List()),
        new CategoryEntity("Category 4", student2List()),
        new CategoryEntity("Category 5", student2List())
    );
  }
  static List<StudentEntity> student1List() {
    return Arrays.asList(
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("11", "Tony11"),
        new StudentEntity("12", "Jun11"));
  }

  static List<StudentEntity> student2List() {
    return Arrays.asList(
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("22", "Tony22"),
        new StudentEntity("23", "Jun22"));
  }
}
