package com.example.hellotab;

import java.util.Arrays;
import java.util.List;

public class DataUtil {

  static List<StudentEntity> dataList() {
    return Arrays.asList(new StudentEntity("0", "Tony"), new StudentEntity("1", "Jun"));
  }
}
