import kr.tpc.MemberVO;

public class TPC14 {
    public static void main(String[] args) {
        MemberVO m = new MemberVO();
        m.setName("홍길동");
        m.setAge(50);
        m.setTel("4564864");
        m.setAddr("부산");
        System.out.println(m.toString());
        System.out.println(m);
/*        m.name="홍길도";
        m.age=70;
        m.tel="dsa1242";
        m.addr="서울";
        System.out.println(m.name);*/

    }
}
