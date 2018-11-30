package com.eomcs.util;

public class QueueIterator<E> implements Iterator<E> {

  Queue<E> queue;
  int count;
  int size;
  
  public QueueIterator(Stack<E> stack) {
   this.queue = queue;
   this.size = queue.size();
  }
  
  
  
  @Override
  public boolean hasNext() {
    return this.count < queue.size();
  }

  @Override
  public E next() {
    this.count++; //요소 하나를 꺼냈기에 카운트 하나가 증가한다.
    return queue.poll();
  }

}
