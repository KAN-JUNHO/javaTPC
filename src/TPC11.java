import kr.tpc.BookVO;

public class TPC11 {
    public static void main(String[] args) {
        // 책 1권을 저장하기 위해 객체를 생성하시오.
        BookVO b = new BookVO();
        b.title="파이썬";
        b.price=123;
        b.company="sadfjk";
        b.page=70;

        BookVO b1 = new BookVO();
        b1.title="파이썬";
        b1.price=123;
        b1.company="sadfjk";
        b1.page=70;
    }
}
