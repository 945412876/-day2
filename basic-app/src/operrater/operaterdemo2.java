package operrater;

public class operaterdemo2 {
    public static void main(String[] args) {
        //需求，拆分三位数，把，各十百 位分别输出
        int a = 589;
                //1.个位
        int b =a % 10;
        System.out.println(b);
        int c = a / 10 %10;
        int d = a/   100;

        System.out.println(c);
        System.out.println(d);
    }
}
