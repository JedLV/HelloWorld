public class Variable3 {
    public static void main (String[] args){

        double d1 = 12.9;//精准损失举例1
        int i1 = (int)d1;//截断操作
        System.out.println(i1);

        long l1 = 123;//没有精度损失
        short s2 = (short) l1;

        int i2 = 128;//精准损失举例2
        byte b = (byte)i2;
        System.out.println(b);

    }
}
