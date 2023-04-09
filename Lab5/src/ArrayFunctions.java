import java.util.Arrays;
public class ArrayFunctions  {




    public <T extends Number & Comparable<T>> void  sortAscending(T[] array) {
        Arrays.sort(array);
    }

    public <T extends Number & Comparable<T>>  void sortDescending(T[] array) {
        Arrays.sort(array, (a, b) -> b.compareTo(a));
    }

    public <T extends Number & Comparable<T>> T findMin(T[] array) {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public <T extends Number & Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
    public <T extends Number & Comparable<T>> int sum(T[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += (Integer)array[i];
        }
        return sum;
    }
    public <T extends Number & Comparable<T>> double dob(T[] array){
        double dob = 1;
        for (int i = 0; i < array.length; i++) {
            dob *= (Integer)array[i];
        }
        return dob;
    }
}