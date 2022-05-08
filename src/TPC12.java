import kr.tpc.BookVO;

public class TPC12 {
    public static void main(String[] args) {
        // 생성자 -> 생성+초기화 ->중복정의
        BookVO b1 = new BookVO();
        System.out.println(b1.page);

        BookVO b2 = new BookVO();
        System.out.println(b2.page);

        BookVO b3 = new BookVO("py",1800,"대림",920);
        System.out.println(b3.page);
    }
}
