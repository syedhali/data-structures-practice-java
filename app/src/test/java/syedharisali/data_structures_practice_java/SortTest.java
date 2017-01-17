package syedharisali.data_structures_practice_java;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by haris on 1/17/17.
 */

public class SortTest {

    int[] mUnsortedList;

    @Before
    public void setup() {
        mUnsortedList = new int[20];
        mUnsortedList[0] = (5);
        mUnsortedList[1] = (3);
        mUnsortedList[2] = (9);
        mUnsortedList[3] = (1);
        mUnsortedList[4] = (10);
        mUnsortedList[5] = (8);
        mUnsortedList[6] = (2);
        mUnsortedList[7] = (4);
        mUnsortedList[8] = (7);
        mUnsortedList[9] = (6);
        mUnsortedList[10] = (8);
        mUnsortedList[11] = (2);
        mUnsortedList[12] = (4);
        mUnsortedList[13] = (7);
        mUnsortedList[14] = (6);
        mUnsortedList[15] = (100);
        mUnsortedList[16] = (55);
        mUnsortedList[17] = (3);
        mUnsortedList[18] = (7);
        mUnsortedList[19] = (6);
    }

    @Test
    public void testSelectionSort() {
        Sort.SelectionSort(mUnsortedList);
        for (int i = 0; i < mUnsortedList.length - 1; i++) {
            assertTrue(mUnsortedList[i] <= mUnsortedList[i + 1]);
        }
    }

    @Test
    public void testBubbleSort() {
        Sort.BubbleSort(mUnsortedList);
        for (int i = 0; i < mUnsortedList.length - 1; i++) {
            assertTrue(mUnsortedList[i] <= mUnsortedList[i + 1]);
        }
    }

}