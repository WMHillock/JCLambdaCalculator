public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1,2);
        int b = calc.minus.apply(1,1);

        Integer c = calc.div.apply(a, b);
        /* выкидывает исключение ArithmeticException из-за деления на 0
        Способ решения переписать с тернарным оператором вариацию деления прим:
        BinaryOperator<Integer> div = (x, y) -> y != 0 ? x / y : null;
        */

        calc.println.accept(c);
    }
}