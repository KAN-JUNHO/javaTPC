import com.google.gson.Gson;
import kr.tpc.BookVO;
import kr.tpc.MyUtil;

//import java.lang.*;
public class TPC18 {
    public static void main(String[] args) {
        //1. java에서  제공해주는 클래스들 API
        // 문자열(String)
        String str = new String("APPLE");
        System.out.println(str.toLowerCase());

        // 2. 직접 만들어서 사용하는 class들 DTO/VO, DAO, Utility ... API
        MyUtil my = new MyUtil();
        int sum = my.hap();
        System.out.println(sum);

        //3.다른 회사에서 만들어놓은 Class들 ....API
        //Gson -> json
        Gson g = new Gson();
        BookVO bookVO = new BookVO("자바", 13000, "영진", 123);
        String json = g.toJson(bookVO);
        //{"title":"자바","price":13000,"company":"영진","page":123}
        System.out.println(json);
    }
}
