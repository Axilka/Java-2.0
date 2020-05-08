import java.util.Scanner;

/**
 * @author valery
 * @see Base
 */
public class Base {
    //Другие JavaDoc в данном задании не использовал (разновидности @see, @param, @return)
    public static void main(String[] args) {
        //Определяем переменные и экземпляр класса
        double i, j, equals;
        int number;
        Scanner in = new Scanner(System.in);

        /*Ввод значений
        Проверки деления на ноль, ввод других чисел отличных от предложенных или любое отклонение, которое может быть
        прописано в исключениях - нет. Часть исключений обработает Idea по написанному коду.
         */
        System.out.print("Выберите, какую операцию вы хотите выполнить: \n 1 - сложение\n 2 - вычитание\n 3 - умножение\n 4 - деление\n >>");
        number = in.nextInt();

        System.out.print("Введите первое число с плавающей точкой: ");
        i = in.nextDouble();

        System.out.print("Введите второе число с плавающей точкой: ");
        j = in.nextDouble();

        //Добавлены дополнительыне операции с числами
        if (number == 1) {
            equals = i + j;
            System.out.printf("Ответ равен: %.4f", equals);
        } else if (number == 2) {
            equals = i - j;
            System.out.printf("Ответ равен: %.4f", equals);
        } else if (number == 3) {
            equals = i * j;
            System.out.printf("Ответ равен: %.4f", equals);
        } else if (number == 4) {
            equals = i / j;
            System.out.printf("Ответ равен: %.4f", equals);
        }

        //Закрываем поток для отображения вводимых данных в консоль
        in.close();
    }
}
