package com.eomcs.lms.util;

import java.util.Arrays;
import com.eomcs.lms.domain.Board;

public class ArrayList <WhatType>{
  final int DEFAULT_CAPACITY = 10;
  Object[] list;
  int size = 0;
  
  public ArrayList() {
    list  = new Board[DEFAULT_CAPACITY];
  }
  
  public ArrayList(int initialCapacity) {
    if (initialCapacity > DEFAULT_CAPACITY) 
      list = new Object[initialCapacity];
    else
      list = new Object[DEFAULT_CAPACITY];
  }
  
  @SuppressWarnings("unchecked")//경고를 띄우지 말라는 어노테이션
  public WhatType[] toArray(WhatType[] a) {
    if(a.length < size)
    return (WhatType[]) Arrays.copyOf(list, size, a.getClass());
  }
  
  public void add(WhatType item) {
    if (size >= list.length) {
      int oldCapacity = list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      list = Arrays.copyOf(list, newCapacity);
    }
    
    list[size++] = item;
  }
  
  public int size() {
    return this.size;
    
    
  }
  
  
  
  
}
