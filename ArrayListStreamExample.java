import java.util.ArrayList;
import java.util.List;

public class ArrayListStreamExample {

    public static void main(String[] args) {
        // Создание ArrayList и заполнение его числами от 0 до 100
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }

        // Создание стрима и выполнение указанных операций
        int sum = numbers.stream()
                .map(num -> num / 2)          // Деление на 2
                .filter(num -> num > 25)      // Фильтрация (больше 25)
                .map(num -> num - 30)         // Вычитание 30
                .sorted()                     // Сортировка
                .limit(5)                      // Ограничение первыми 5 элементами
                .mapToInt(Integer::intValue)   // Преобразование в IntStream
                .sum();                       // Подсчет суммы

        // Вывод результата
        System.out.println("Сумма первых 5 элементов после применения операций: " + sum);
    }
}
/*
Этот код создает ArrayList,
применяет указанные операции к элементам с использованием стрима и
 выводит сумму первых 5 элементов после выполнения операций.
 */