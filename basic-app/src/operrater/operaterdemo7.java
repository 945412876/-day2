package operrater;

public class operaterdemo7 {
    public static void main(String[] args) {
        //目标：学会使用三元运算符，理解其流程
        double score = 98;
        String rs = score >= 60 ? "pass" : "goodgame";
        System.out.println(rs);
        //需要从两个整数中找到较大值
        int a = 2000;
        int b = 230;
        String c = a > b ? "a" : "b";
        System.out.println(c);
        //要比较三个变量的 大小 先比两个 设置一个临时变量 在比第三个和临时变量的大小最后输出最大的
    }
}
