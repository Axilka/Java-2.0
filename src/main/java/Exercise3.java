import java.util.Scanner;

public class Exercise3 {
    public static void calculator() {
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
        switch (number) {
            case 1:
                equals = i + j;
                System.out.printf("Ответ равен: %.4f", equals);
                break;
            case 2:
                equals = i - j;
                System.out.printf("Ответ равен: %.4f", equals);
                break;
            case 3:
                equals = i * j;
                System.out.printf("Ответ равен: %.4f", equals);
                break;
            case 4:
                equals = i / j;
                System.out.printf("Ответ равен: %.4f", equals);
                break;
        }

        //Закрываем поток для отображения вводимых данных в консоль
        in.close();
    }

    public static void maxMass() {
        int i = 0, size;
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте размер одномерного массива: ");
        size = in.nextInt();

        Scanner insert = new Scanner(System.in);
        String massSting[] = new String[size];
        for (i = 0; i < size; i++) {
            System.out.print("Введите слово в ячейку " + i + ": ");
            massSting[i] = insert.nextLine();
        }

        int max = 0;
        String word = "";
        for (i = 0; i < size; i++) {
            if (massSting[i].length() == max) {
                word = word + massSting[i];
            }

            if (massSting[i].length() > max) {
                max = massSting[i].length();
                word = massSting[i];
            }
        }

        System.out.println("Саммое/ые длинное/ые слово/слова состоит/ят из " + max + " символов");
        System.out.print("Это/ти слово/ва:  " + word);

        in.close();
        insert.close();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сделайте выбор 1-калькулятор 2-поиск максимального слова в массиве: ");
        int i = in.nextInt();
        if (i == 1)
            calculator();
        else if (i == 2)
            maxMass();

        in.close();
    }
}