package syedharisali.data_structures_practice_java;

import android.provider.Settings;
import android.util.Log;

/**
 * Created by haris on 1/17/17.
 */

public class Sort {

    private static void Swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void Print(String tag, int[] list) {
        String log = "List contains: [";
        for (int i = 0; i < list.length; i++) {
            log += list[i];
            if (i == list.length - 1) {
                log += "]";
            }
            else {
                log += ", ";
            }
        }
        System.out.print(tag + log + "\n");
    }

    public static void SelectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    Swap(list, i, j);
                }
            }
        }
    }

    public static void BubbleSort(int[] list) {
        for (int i = list.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (list[j] > list[j + 1]) {
                    Swap(list, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

}
