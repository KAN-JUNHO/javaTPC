import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
    public static void main(String[] args) {
        // 관계를 이해해라 PDT VD UDDT
        // 정수 1개를 저장하기 위한 변수를 선언하시오

        //책 한권을 저장 하기위한 변수선언
        Book b;
//        System.out.println(b);
        b=new Book();
        b.title="자바";
        b.price=4540;
        b.company="한빛";
        b.page=700;
        System.out.println(b.title);

        PersonVO p;
        p=new PersonVO();
        p.name="박매일";
        p.age=40;
        p.weight=68.4f;
        p.height=175.4f;

        System.out.println(p.name);

    }

}
