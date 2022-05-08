public class tpc04 {
    public static void main(String[] args) {
        //4. 데이터를 이동하라(변수 VS 배열)
        int a,b,c;
        a=10;
        b=20;
        c=30;
        //  a+b+c=? 메서드 처리 -> hap();
        hap(a,b,c);
        int [] arr = new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
    }
    static void hap(int x, int y, int z){
        int sum = x+y+z;
        System.out.println(sum);
    }
    static void hap1(int []x){
        int sum = 0;
        for (int j : x) {
            sum += j;
        }
        System.out.println(sum);
    }
}
