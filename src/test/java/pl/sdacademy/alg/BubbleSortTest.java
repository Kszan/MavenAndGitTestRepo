package pl.sdacademy.alg;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.annotation.Annotation;
import java.util.*;

public class BubbleSortTest {

    @Test
    public void shouldSortList() {
        //given
        int[] array = {1,6,7,3,5,7};
        BubbleSort bubbleSort = new BubbleSort(array);

        //when
        array = bubbleSort.sort();

        //then
        for (int i = 0; i< array.length-1; i++) {
            Assert.assertTrue("Lista nie posortowana "+ array[i] +"<= " + array[i+1], array[i] <= array[i+1]);
        }

    }

    @Test
    public void shouldSortNullList() {
        //given
        int[] array = null;
        BubbleSort bubbleSort = new BubbleSort(array);

        //when
        array = bubbleSort.sort();

        //then
        for (int i = 0; i< array.length-1; i++) {
            Assert.assertTrue("Lista nie posortowana", array[i] <= array[i+1]);
        }
    }

}
