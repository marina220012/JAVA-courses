package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends number=new CalculatorWithMathExtends();
        double res= number.add(number.add(4.1, number.multiplication(15,7)),
                number.pow(number.division(28,5), 2));//134.1
        System.out.println("Результат "+res);
    }
}
