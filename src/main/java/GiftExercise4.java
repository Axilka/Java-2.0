import staff.*;

public class GiftExercise4 {
    public static void mass() {
        int maxMinus = 0;
        int minPlus = 10;
        int numberPlus = 0;
        int numberMinus = 0;
        int save;

        int n = 20;
        int[] massInt = new int[n];

        for (int i = 0; i < massInt.length; i++)
            massInt[i] = (int) (Math.random() * 20) - 10;

        for (int i = 0; i < massInt.length; i++) {
            if ((massInt[i] < minPlus) && (massInt[i] > 0)) {
                minPlus = massInt[i];
                numberPlus = i;
            }

            if (massInt[i] < maxMinus) {
                maxMinus = massInt[i];
                numberMinus = i;
            }
        }

        for (int i : massInt)
            System.out.print(i + " ");

        save = massInt[numberPlus];
        massInt[numberPlus] = massInt[numberMinus];
        massInt[numberMinus] = save;

        System.out.println("\nМаксимальное отрицательное: " + maxMinus);
        System.out.println("Минимальное положительное: " + minPlus);

        System.out.println("Поменяные местами элементы массива: " + numberPlus + " и " + numberMinus);

        for (int i : massInt)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        mass();

        Candy candy1 = new Candy(200.4, 50.5, "lollipop");
        Jellybean jellybean1 = new Jellybean();
        jellybean1.setFlavor("salty");
        jellybean1.setPrice(60.7);
        jellybean1.setWeight(100.8);
        Brownie brownie1 = new Brownie(150.6, 90.8, 562.9);
        Chocolate chocolate1 = new Chocolate();
        chocolate1.setColor("black");
        chocolate1.setPrice(325.9);
        chocolate1.setWeight(513.4);
        Staff[] gift = {candy1, jellybean1, brownie1, chocolate1};

        System.out.println("\n\nПодарок состоит из: ");
        for (Staff someStaff : gift) {
            System.out.println(someStaff.toString());
        }
        double sum = 0, weight = 0;
        for (Staff someStaff : gift) {
            sum = sum + someStaff.getPrice();
        }

        for (Staff someStaff : gift) {
            weight = weight + someStaff.getWeight();
        }

        System.out.println("Общая сумма = " + sum + "\n" + "Общий вес = " + weight);
    }
}
