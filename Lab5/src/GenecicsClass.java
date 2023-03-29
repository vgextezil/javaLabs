public class GenecicsClass<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public GenecicsClass(T value){
        this.value = value;
    }
    public String showType(){
        return String.format("Data type: %s – Value: %s",this.value.getClass().getName(),this.value);
    }
}
