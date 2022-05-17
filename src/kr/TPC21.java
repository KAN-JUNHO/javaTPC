package kr;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();
        cat.night();

        //Dog.class , Cat.class
        Animal ani = new Dog();//up casting
        ani.eat();

        ani = new Cat();//up casting
        ani.eat();

//        Cat cc =(Cat)ani;
//        cc.night();
        ((Cat) ani).night();
    }
}
