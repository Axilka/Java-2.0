import operations.Minus;
import operations.Multiply;
import operations.Plus;
import org.junit.Assert;
import org.junit.Test;
import operations.Divide;

public class Tests {
    //Проверка методов деления
    @Test
    public void dividerCheckFromMainInsertEquals() {
        Divide divide = new Divide();
        divide.setDivideValue(5);
        Assert.assertEquals(divide.divideValue(5), 1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void dividerByNull() {
        Divide divide = new Divide();
        divide.setDivideValue(0);
        divide.divideValue(5);
    }

    @Test
    public void dividerCheckNullFromMainInsertEquals() {
        Divide divide = new Divide();
        divide.setDivideValue(0);
        Assert.assertEquals(divide.divideValue(5), 5, 0);
    }

    //Проверка методов вычитания
    @Test
    public void minusCheckFromMainInsertEquals() {
        Minus minus = new Minus();
        minus.setMinusValue(5);
        Assert.assertEquals(minus.minusValue(5), 0, 0);
    }

    //Проверка методов умножения
    @Test
    public void multiplyCheckFromMainInsertEquals() {
        Multiply multiply = new Multiply();
        multiply.setMultiplyValue(5);
        Assert.assertEquals((multiply.multiplyValue(5)), 25, 0);
    }

    //Проверка методов сложения
    @Test
    public void plusCheckFromMainInsertEquals() {
        Plus plus = new Plus();
        plus.setPlusValue(5);
        Assert.assertEquals(plus.plusValue(5), 10, 0);
    }
}
