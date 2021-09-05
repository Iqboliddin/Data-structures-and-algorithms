import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 3, 3, 4, 5, 5};

        amazonUniqueNumber(arr);

        for (int i = 0; i < arr.length; i++) {
            if (amazonUniqueNumber2(arr, arr[i]) == 1) {
                System.out.println(arr[i]);
                return;
            }
        }

    }

    public static void amazonUniqueNumber(int arr[]) {

        int sumArr = 0;
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            integerSet.add(arr[i]);
            sumArr += arr[i];
        }

        int sumSet = 0;
        Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()) {
            sumSet += iterator.next();
        }

        System.out.println(sumSet * 2 - sumArr);
    }


    public static Integer amazonUniqueNumber2(int arr[], int n) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        return count;
    }


}
