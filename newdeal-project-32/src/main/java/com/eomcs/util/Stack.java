package com.eomcs.util;

public class Stack<E> extends LinkedList<E> implements Cloneable {

  private int maxSize;

  public Stack() {
    maxSize = 100;
  }

  public Stack(int maxSize) {
    this.maxSize = maxSize;
  }

  @Override
  public Stack<E> clone() {
    Stack<E> temp = new Stack<>();
    for (int i = 0; i < size(); i++) {
      temp.add(get(i));
    }
    return (Stack<E>) temp;
  }

  public void push(E value) {
    if (size() == maxSize)
      remove(0);
    add(value);
  }

  public E pop() {
    return remove(size() - 1);
  }

  public Iterator<E> iterator(){
    return new Iterator<>(){
     
        //중첩 클래스(이너 클래스) 정해진 곳에서만 딱 한 번 쓰이기 때문에 바로 눈에 띌 수 있게 클래스 안에 넣는 게 좋다.
        //밖으로 빼내면 알아보기가 힘들어 나중에 유지보수가 힘들어진다.
        Stack<?> stack;

        int count;
        //인너 클래스는 바깥 클래스의 멤버에 마음대로 접근할 수 있다. 즉 이 녀석도 Queue의 멤버이다.
        //단, 여기서  this를 사용하면 안 된다. 여기서 this를 사용해버리면 이 안으로 가리키는 것이지 바깥 클래스를 가리키는 것이 아니다.
        {//인스턴스 블록 : static처럼 인스턴스가 실행할 때 전에 먼저 실행되는 블록. 
          //오로지 특정 클래스 안에서만 사용될 것이라면 특정 클래스 안에 만들어라.
          this.stack = Stack.this.clone(); //this앞에 있는 Queue는 바깥 클래스를 뜻하는 것이다.
          //클론을 하지 않고 주어버리면 원본이 전달된다. 그렇기에 클론으로 복사를 해준 stackiterator에게 보내준다.
          
        }
        @Override
        public boolean hasNext() {
          return this.count < Stack.this.size();
        }

        @Override
        public T next() {
          this.count++; //요소 하나를 꺼냈기에 카운트 하나가 증가한다.
          return (T) stack.pop();
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
