import java.lang.reflect.Array;
import java.util.Arrays;

public class GenType<T> {
    private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
    public GenType(T[] array){
        this.array = array;
    }

    public void geneTypeFunc(){
        Array.Sort()
    }
}
