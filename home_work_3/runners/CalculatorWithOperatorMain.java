package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator number=new CalculatorWithOperator();
        double res= number.add(number.add(4.1, number.multiplication(15,7)),
                number.pow(number.division(28.0,5), 2));//140.4599999
    }
}
