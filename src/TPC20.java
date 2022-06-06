import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
    public static void main(String[] args) {
        // Animal 부모클래스 사용안함
        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();
        cat.night();

        //Dog.class, Cat.class
        Animal ani = new Dog();
        ani.eat();
        ani=new Cat();
        ani.eat();
//        ani.night();
        ((Cat) ani).night(); // 밤에 눈--> downcasting 강제형변환
    }
}
