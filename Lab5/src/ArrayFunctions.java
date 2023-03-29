import java.util.Arrays;
public class ArrayFunctions<T extends Comparable<T>> {

    private T[] array;

    public ArrayFunctions(T[] array) {
        this.array = array;
    }

    public void sortAscending() {
        Arrays.sort(array);
    }

    public void sortDescending() {
        Arrays.sort(array, (a, b) -> b.compareTo(a));
    }

    public T findMin() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T findMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

}