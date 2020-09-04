package edu.escuelaing.arep.calculator;

import java.util.Arrays;
import java.util.List;

public class BubbleSort <T extends Comparable<? super T>> {


     public static void main(String[] args)
     {

     Double[] arrayOfDoubles = {0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, 0.66, 0.82, 0.17, 0.20, 0.96, 0.18, 0.25, 0.37, 0.52};
     BubbleSort<Double> doubleSorter   = new BubbleSort<>();
     List<Double> lista= doubleSorter.bubbleSort(arrayOfDoubles);
     System.out.println(lista.toString());

     }


    public List<T> bubbleSort(T[] array){
        int n = array.length;
        while (n > 0)
        {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++)
            {
                // if the item at the previous index is greater than the item at the `currentIndex`, swap them
                if (array[currentIndex - 1].compareTo(array[currentIndex]) > 0)
                {
                    // swap
                    T temp = array[currentIndex - 1];
                    array[currentIndex - 1] = array[currentIndex];
                    array[currentIndex] = temp;
                    // save the index that was modified
                    lastModifiedIndex = currentIndex;
                }
            }
            // save the last modified index so we know not to iterate past it since all proceeding values are sorted
            n = lastModifiedIndex;
        }
        List<T> lista = Arrays.asList(array);
        return lista;
    }
}
