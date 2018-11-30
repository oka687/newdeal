package com.eomcs.util;

public class Queue<E> extends LinkedList<E> implements Cloneable {

  private int maxSize;

  public Queue() {
    maxSize = 100;
  }

  public Queue(int maxSize) {
    this.maxSize = maxSize;
  }

  @Override
  public Queue<E> clone() {
    Queue<E> temp = new Queue<>();
    for (int i = 0; i < size(); i++) {
      temp.add(get(i));
    }
    return (Queue<E>) temp;
  }

  public void offer(E value) {
    if (size() == maxSize)
      remove(0); // 꽉차면 맨 앞에 입력된 값을 제거한다.
    add(value);
  }

  public E poll() {
    if (size() > 0)
      return remove(0);
    return null;
  }

  public Iterator<E> iterator(){
    return new Iterator<>() {  
        //중첩 클래스(이너 클래스)
        Queue<?> queue;
        int size;
        int count;
        //인너 클래스는 바깥 클래스의 멤버에 마음대로 접근할 수 있다. 즉 이 녀석도 Queue의 멤버이다.
        //단, 여기서  this를 사용하면 안 된다. 여기서 this를 사용해버리면 이 안으로 가리키는 것이지 바깥 클래스를 가리키는 것이 아니다.
        {//인스턴스 블록 : 생성자가 호출되기 전에 먼저 실행되는 블록. 
          //오로지 특정 클래스 안에서만 사용될 것이라면 특정 클래스 안에 만들어라.
          this.queue = Queue.this.clone(); //this앞에 있는 Queue는 바깥 클래스를 뜻하는 것이다.

        }

        public boolean hasNext() {
          return this.count < Queue.this.size();
        }

        public E next() {
          this.count++; //요소 하나를 꺼냈기에 카운트 하나가 증가한다.
          return (E) queue.poll();
        }
      };

    }
}









/*
  public static void main(String[] args) throws Exception {
    Stack<String> stack = new Stack<>();
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");
    stack.push("ddd");
    stack.push("eee");
    stack.push("fff");

    Stack<String> temp1 = stack.clone();
    while (temp1.size() > 0) {
      System.out.println(temp1.pop());
    }
    System.out.println("----------------------");

    Stack<String> temp2 = stack.clone();
    while (temp2.size() > 0) {
      System.out.println(temp2.pop());
    }
  }*/
}
