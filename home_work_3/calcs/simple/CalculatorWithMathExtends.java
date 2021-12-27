package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator{
    @Override
    public int absolute(int x) {
        return Math.abs(x);
    }

    @Override
    public double pow(double x, int pow) {
        return  Math.pow(x,pow);
    }

    @Override
    public double squareRoot(int x, int pow) {
        return Math.pow(x, pow);
    }
}
