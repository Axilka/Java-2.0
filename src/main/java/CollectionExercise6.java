import java.io.*;
import java.util.*;

public class CollectionExercise6 {
    public static void main(String[] args) {
        int freq;
        String line;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь к файлу в формате D:/имя.txt: ");
        String way = "D:/qwert.txt"; //in.nextLine();
        int maxFreq = 0;
        String wordMaxValue = "";

        try {
            //Ввести путь к файлу
            File file = new File(way); //создаём объект текстового файла
            FileReader fileReader = new FileReader(file); //поток, который подключается к текстовому файлу
            BufferedReader bufferedReader1 = new BufferedReader(fileReader); //соединяем FileReader с BufferedReader для считывания текста из потока

            while ((line = bufferedReader1.readLine()) != null) {
                //Прочитать слова из файла
                System.out.println("Начальный слова из файла: \n" + line + "\n"); //выводим содержимое файла на экран

                //Отсортировать в алфавитном порядке
                List<String> arrayList = new ArrayList<>(Arrays.asList(line.split(" ")));
                Collections.sort(arrayList);
                System.out.println("Сортируем коллекцию и выводим на экран: ");
                System.out.println(arrayList + "\n");

                //Посчитать сколько раз каждое слово встречается в файле. Вывести статистику на консоль
                System.out.println("Cколько раз встречается в файле каждое из слов и вывести статистику на экран: ");

                for (int j = 0; j < arrayList.size(); j++) {
                    freq = Collections.frequency(arrayList, arrayList.get(j));
                    System.out.println("Слово: " + arrayList.get(j) + " - " + freq);

                    if (freq > maxFreq) {
                        maxFreq = freq;
                        wordMaxValue = arrayList.get(j);
                    }

                    for (int p = j + 1; p < arrayList.size(); p++) {
                        if (arrayList.get(j).equals(arrayList.get(p))) {
                            j++;
                        }
                    }
                }

                //Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
                System.out.println("\nНайти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле: \n" + wordMaxValue + " с частотой - " + maxFreq);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывод: " + exc);
        }
    }
}




