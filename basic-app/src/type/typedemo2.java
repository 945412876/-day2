public class typedemo2 {

    public static void main(String[] args) {
            //掌握自动转化变量的规则
        byte a = 10;
                int b=20;
                     double c =1.0;
                    double d= a+b+c;
        System.out.println(d);
        byte q =1;
                byte w =2;
          //              byte e =q+w;//byte 会自动转化为int类型
        //所以得用int
        int e =q + w;
        System.out.println(e);
    }
}
