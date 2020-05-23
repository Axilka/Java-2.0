import operations.Divide;
import operations.Minus;
import operations.Multiply;
import operations.Plus;

import java.util.Scanner;

public class CalculatorExercise5 {
    public static void main(String[] args) {
        Plus plus = new Plus();
        Minus minus = new Minus();
        Divide divide = new Divide();
        Multiply multiply = new Multiply();

        Scanner in = new Scanner(System.in);
        String l = "";
        double equals = 0;

        //Каждый раз при вводе числа или знака операции нужно нажимать Enter
        //Вводить числа можно сколько угодно, результат будут только после знака равенства.
        //Описаны только положительные случаи без своих исключений, срабатывают только программные исключения
        System.out.println("Введите знак операции того, что вы хотите сделать сложить (+), вычесть (-), поделить (/) или умножить (*): ");
        while (!l.equals("=")) {
            String i = in.nextLine();

            if (i.equals("+")) {
                plus.setPlusValue(in.nextDouble());
                equals = plus.plusValue(equals);
            }

            if (i.equals("-")) {
                minus.setMinusValue(in.nextDouble());
                equals = minus.minusValue(equals);
            }

            if (i.equals("/")) {
                divide.setDivideValue(in.nextDouble());
                equals = divide.divideValue(equals);
            }

            if (i.equals("*")) {
                multiply.setMultiplyValue(in.nextDouble());
                equals = multiply.multiplyValue(equals);
            }

            if (i.equals("=")) {
                l = "=";
                System.out.println(equals);
            }
        }
    }
}
