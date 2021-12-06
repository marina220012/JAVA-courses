package home_work_1;

public class BytOperators {
       public static void main(String[] args) {
           System.out.println("a=42, b=15");
            BytOperators1();
           System.out.println("a=-42, b=-15");
            BytOperators2();
       }
       public static void BytOperators1(){
           int a=42, b=15, result;
           result=a&b;//00101010 & 00001111  = 00001010
           System.out.println(result);
           result=a|b;//00101010 |00001111  = 00101111
           System.out.println(result);
           result=a^b; // 00101010 ^00001111  =00100101
           System.out.println(result);
           System.out.println(~a);// 11010101
           System.out.println(~b);//11110000
           a=42; b=15;
           result=a<<2;//00101010 <<2=10101000
           System.out.println(result);
           result=a>>2;// 00101010>>2 =00001010
           System.out.println(result);
           result=b<<2;
           System.out.println(result);
           result=b>>2;
           System.out.println(result);
           System.out.println(a&=b);
           a=42;
           System.out.println(b|=a);
           b=15;
           System.out.println(a^=b);
           a=42;
    }

    public static void BytOperators2(){
        int a=-42, b=-15, result;
        result=a&b;
        System.out.println(result);
        result=a|b;
        System.out.println(result);
        result=a^b;
        System.out.println(result);
        System.out.println(~a);
        System.out.println(~b);
        a=-42; b=-15;
        result=a<<2;
        System.out.println(result);
        result=a>>2;
        System.out.println(result);
        result=b<<2;
        System.out.println(result);
        result=b>>2;
        System.out.println(result);
        System.out.println(a&=b);
        a=-42;
        System.out.println(b|=a);
        b=-15;
        System.out.println(a^=b);
        a=-42;
    }

    /*public static void BytOperators3(){// не работате, тк можно делать побитовые операции толкьо с типами long, int, short, char, byte
           float a=42.5f;
           a=a&4;

    }*/

}
