package com.eomcs.util;

public class StackIterator<E> implements Iterator<E> {

  Stack<E> stack;
  int size;
  int count;
  
  public StackIterator(Stack<E> stack) {
   this.stack = stack;
   this.size = stack.size(); //처음의 스택 사이즈를 가지고 있어야 한다.
  }
  
  
  @Override
  public boolean hasNext() {
 
    return this.count < this.size();
  }

  @Override
  public E next() {
    this.count++; //요소 하나를 꺼냈기에 카운트 하나가 증가한다.
    return stack.pop();
  }

}
