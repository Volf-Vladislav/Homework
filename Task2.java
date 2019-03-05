package src;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int[][] arr = {{12, 24, 124, 42,
                        43, 95, 10, 79,
                        123, 884, 92, 1}};


        int[] newArr = Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
        Arrays.sort(newArr);
        System.out.println("Сортировка всего массива: " + Arrays.toString(newArr));
    }

}