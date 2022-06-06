import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {
    public static void main(String[] args) {
        ///up casting
        //Cat ani = new Cat();
        //Object ani = new Cat();

        Animal ani = new Cat();
        ani.eat(); // 컴파일 시점 -> ani, 실행 시점 ->Cat

        ((Cat) ani).night();

        ani = new Dog();
        ani.eat();
        //다형성
        //상위 클래스가 하위 클래스에게  동일한 메세지로 서로다르게 동작시키는 원리
        Object o = new Dog();
        //o.eat();
        ((Dog) o).eat();
    }

}
