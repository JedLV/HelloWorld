public class Variable4 {
    public static void main (String[] args){

        //编码情况1
        long l = 1233212;
        System.out.println(l);
        //编译失败：过大的整数
        //long l1 = 2132133212;
        long l1 =2132133212L;

        //*****************
        //编译失败
        //float f1 =12.3;
        float f1 =(float) 12.3;

        //编码情况2
        //整型常量，默认类型为int型
        //浮点型常量，默认类型为double型
        byte b = 12;
        //byte b1 = b +1;//编译失败

        //float f1 = b +12.3;//编译失败

    }
}
