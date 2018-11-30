package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Lesson;

public class LessonList {
  static final int LENGTH = 10;
  private Lesson[] list;
  private int size = 0;
  
  public LessonList() {
    //default 생성자
    this.list = new Lesson[LENGTH]; //생성자에서 객체를 생성한 것.
  }
  
  public LessonList(int initialCapacity) {
    if(initialCapacity > LENGTH)
    this.list = new Lesson[initialCapacity];
    else 
      this.list = new Lesson[LENGTH]; //카파시티가 기본 크기보다 클 때는 카파시티를 배열로 아니라면 기본배열로
  }
  
  
  public Lesson[] toArray() {
    
   return Arrays.copyOf(list, size);
    //size로 복사된 것만큼 나에게 리턴 하라.
  }
  
  public void add(Lesson lesson) {
    if(size >= list.length) {
      int oldLenght = list.length;   //과거의 길이를 현재의 길이로 교체한다. 링크드리스트로 바꾸는 방법이 있으니 찾아서 공부할 것.
      //int newCapacity = oldLenght + (int)(oldLenght * 0.5); //원래 있던 배열의 절반 만큼 더한 뒤 새로운 배열로 만든다.
      //이때 double의 계산이므로 int형으로 캐스팅을 해준다.
        //부동소숫점 연산은 CPU를 상당히 많이 잡아 먹는다. 게임에서 특히 잡아 먹는데 그것을 분담해주는 것이 GPU이다.
        //그래서 나온 방법이 비트이동연산자이다.
      int newCapacity = oldLenght + oldLenght >> 1; //비트이동연산자를 활용한 예
      //기존의 열개를 1 비트이동 하면 다섯 개가 되고 그걸 원래 있던 것에 합하면 15개가 되는 원리
    
      list =Arrays.copyOf(list, newCapacity);
       
    }
    list[size++] = lesson; //방번호를 증가시키는 것
    //size++; 이 연산자를 아예 배열에 넣어버렸다.
    }
  
  

  
}
