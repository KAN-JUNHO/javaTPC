package kr.tpc;

public class Dog extends Animal {
    //이름 나이 종 :상태 정보
    // 재정의(override)
    public void eat(){
        System.out.println("dog");
    }
    public Dog(){
        super();//new Animal();
    }
}
