package _14_genericsSepMap;

import java.util.Arrays;
import java.util.List;

/**
 * _03_WildcardTypes
 */
public class _03_WildcardTypes {

    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myString = Arrays.asList("Sushi", "Zeus", "Nino");
        printList(myString);
    }

    public static void printList(List<?> list) {

        System.out.print("[ ");
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.print("]\n");
    }
}