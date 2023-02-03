import java.util.ArrayList;
import java.util.List;
public class Task0 {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 13, 20, 8, 3);
        System.out.println(list);

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> list) {
        List<Integer> list2 = new ArrayList<>();

        for(int i = 0; i <= list.size(); i++)
            if(list.get(i) > 0)
                list2.add(list.get(i));

//        for (int i = 0; i < mas.length; i++) {
//            if (i % 2 == 1) {
//                mas[i] = 0;
                return new ArrayList<>();
                System.out.println(new ArrayList<>());
            }
//        }
//    }
    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int min = list.get(0);

        for (Integer i: list) {
            if(i < min)
                min = i;
        }

        System.out.println("минимальное число: " + min);

        return 0;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){

        int max = list.get(0);

        for (Integer i: list) {
            if(i > max)
                max = i;
        }

        System.out.println("максимальное число: " + max);

        return 0;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list){
        double sum = 0;
        for (int x: list) {
            sum += x;
        }
        System.out.print("среднее арифметическое чисел равно: " + sum/list.toArray().length);

        return 0;
    }
}