package kr.tpc;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("cat");
    }

    public void night(){
        System.out.println("밤에 눈에서 빛이 난다.");
    }
}
