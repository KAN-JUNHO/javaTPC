public class TPC06 {
    public static void main(String[] args) {
//        System.out.println(sum(10,50));
        int arr[] = makArr();
        int hap=0;
        for (int i = 0; i <arr.length; i++) {
            hap+=arr[i];
        }
        System.out.println(hap);
        for (int i = 0; i < makArr().length; i++) {
            hap+=makArr()[i];
        }
        System.out.println(hap);
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int[] makArr(){
        int x=10;
        int y=10;
        int z=10;
        int arr[] = new int[3];
        arr[0]=x;
        arr[1]=y;
        arr[2]=z;
        return arr;
    }
}
