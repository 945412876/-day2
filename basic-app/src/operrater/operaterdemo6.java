package operrater;

public class operaterdemo6 {
    public static void main(String[] args) {
        //逻辑运算符
        double size = 9.9;
        double a = 16;
        //需求：尺寸大于6.95，内存大于等于8
        System.out.println(size >= 8 & a >= 8);
        System.out.println(size >= 10 | a >= 12);
        System.out.println(!true);
        //逻辑异或 必须两个不同结果为true
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        //      && || 左边为  右边不执行
        int h =10;
        int b=20;
    }
}