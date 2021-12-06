package home_work_1;

public class Operators {

    public static void main(String[] args) {
        operators_1();
        operators_2();
        operators_3();
        operators_4();
        operators_5();
        operators_6();
        //Operators_7();
        operators_8();
        operators_9();
    }


    public static void operators_1(){
        double result=0.0;
        result=5+2/8.0;
        System.out.println(result);
    }
    public static void operators_2(){
        double result=0.0;
        result=(5+2)/8.0;
        System.out.println(result);
    }
    public static void operators_3(){
        double result=0.0;
        int a=2;
        result=(5+a++)/8.0;
        System.out.println(result);
    }
    public static void operators_4(){//?????????????????????????
        double result=0.0, b=8.0;
        double a=2.0;
        result=(5+a++)/--b;
        System.out.println(result);
    }
    public static void operators_5(){//?????????
        double result=0.0, b=8.0;
        int a=2;
        result=(5*a>>a++)/--b;
        System.out.println(result);
    }
    public static void operators_6(){
        double result=0.0, b=8.0;
        int a=2;
        result=(5 + 7 > 20 ? 68 : 22 * 2>>a++)/--b;
        System.out.println(result);
    }
   /* public static void operators_7(){
        double  b=8.0;
        boolean result;
        int a=2;
        result=(5 + 7 > 20 ? 68 >= 22 * 2>>a++)/--b;
        System.out.println(result);
    }*/
    public static void operators_8(){
        boolean result;
        result=6-2>3 && 12*12 <=19;
        System.out.println(result);
    }
    public static void operators_9(){
        boolean result;
        result=true && false;
        System.out.println(result);
    }
}
