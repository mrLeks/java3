package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

    public class less1 {
        private static <T> void swap(T[] array, int firstIndex, int secondIndex){
            T oneVal = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = oneVal;
        }

        private static <T> ArrayList<T> convertToList(T[] array) {
            return new ArrayList<>(Arrays.asList(array));
        }
    }


