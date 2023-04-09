import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //peopleOutput(List.of(new Visitants(1), new Visitants(2), new Visitants(3), new Visitants(4)));
        //peopleOutput(List.of(new Workers(1, "Пазюк", "Офіціант", LocalDate.of(2000, 1, 11)), new Workers(1, "Пазюк55", "Офіціант", LocalDate.of(2000, 1, 11))));
        //lowerPeopleOutput(List.of(new Visitants(1), new Visitants(2), new Visitants(3), new Visitants(4)));
        //GenericsClass<Integer> genecicsClassInt = new GenericsClass<>(1);
        //System.out.println(genecicsClassInt.showType());
        //GenericsClass<String> genecicsClassString = new GenericsClass<>("1");
        //System.out.println(genecicsClassString.showType());
        Integer[] integers= {1,47,7,9,3,35,8,35,2,15,347,58,89,24,367,598,35,37,47,24,26485,89,46,32};
        //geneTypeFunc(integers);

        String[] strings = {"1","3"};


        ArrayFunctions arrayFunctions = new ArrayFunctions();
        System.out.println(arrayFunctions.findMax(integers));
        System.out.println(arrayFunctions.sum(integers));
        System.out.println(arrayFunctions.dob(integers));

    }

    public static <T> void geneTypeFunc(T[] elements){
        Arrays.sort(elements);
        for (T element:elements) {
            System.out.println(element);
        }
        for (int i = elements.length-1; i >-1; i--) {
            System.out.println(elements[i]);
        }
        T max = elements[0];

    }
    public static void peopleOutput(List<? extends Visitants> visitantsOrParent){
        for (Object obj: visitantsOrParent) {
            System.out.println(obj.toString());
        }
    }

    public static void lowerPeopleOutput(List<? super Visitants> visitantsOrParent){
        for (Object obj: visitantsOrParent){
            if(obj instanceof Visitants visitant){
                System.out.println(visitant);
            }
            else System.out.println("Не зрозуміло хто!");
        }
    }
}