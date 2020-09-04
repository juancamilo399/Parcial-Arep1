package edu.escuelaing.arep.calculator;

import java.util.Arrays;
import java.util.List;

/**
 * Clase que realiza el bubble sort con datos genericos
 * @param <T>
 */

public class BubbleSort <T extends Comparable<? super T>> {


    /**
     * retorna una lista ordenada
     * @param array la lista a ser ordenada
     * @return la lista ordenada
     */
    public List<T> bubbleSort(T[] array){
        int n = array.length;
        while (n > 0)
        {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++)
            {
                if (array[currentIndex - 1].compareTo(array[currentIndex]) > 0)
                {
                    T temp = array[currentIndex - 1];
                    array[currentIndex - 1] = array[currentIndex];
                    array[currentIndex] = temp;
                    lastModifiedIndex = currentIndex;
                }
            }
            n = lastModifiedIndex;
        }
        List<T> lista = Arrays.asList(array);
        return lista;
    }
}
