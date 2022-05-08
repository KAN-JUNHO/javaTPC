public class TPC05 {
    public static void main(String[] args) {
        int a[] = new int[3];
        a[0]=10;
        a[1]=10;
        a[2]=10;
        int sum=0;
        for (int i:a) {
            sum+=i;
        }
        System.out.println(sum);

        int[][] star = new int[5][];
        star[0] = new int[1];
        star[1] = new int[2];
        star[2] = new int[3];
        star[3] = new int[4];
        star[4] = new int[5];
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                star[i][j]= Integer.parseInt(("*"));
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
    }
}
