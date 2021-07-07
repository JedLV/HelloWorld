public class StringStrengthen {
    public  static void main(String[] args){
        char c = 'a';
        int num = 10;

        //String str1 = 123;//编译不通过
        String str1 = 123 + "";
        System.out.println(str1);//123

        //int num1 = str1;
        //int num1 = (int)str1;

        int num1 = Integer.parseInt(str1);
        System.out.println(num1);//123
    }
}
