import kr.tpc.MemberVO;

public class TPC15 {
    public static void main(String[] args) {
        MemberVO m = new MemberVO("홍길동", 40, "0104646", "부산");
        //setter method - X
        System.out.println(m);
        MemberVO m1 = new MemberVO();
        m1.setName("나길동");
        m1.setAge(34);
        m1.setTel("010-4548-4448");
        m1.setAddr("광주");
        System.out.println(m1);
    }
}
