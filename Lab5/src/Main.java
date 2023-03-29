import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //peopleOutput(List.of(new Visitants(1), new Visitants(2), new Visitants(3), new Visitants(4)));
        //peopleOutput(List.of(new Workers(1, "Пазюк", "Офіціант", LocalDate.of(2000, 1, 11)), new Workers(1, "Пазюк55", "Офіціант", LocalDate.of(2000, 1, 11))));
        //lowerPeopleOutput(List.of(new Visitants(1), new Visitants(2), new Visitants(3), new Visitants(4)));
        //GenecicsClass<Integer> genecicsClassInt = new GenecicsClass<>(1);
        //System.out.println(genecicsClassInt.showType());
        //GenecicsClass<String> genecicsClassString = new GenecicsClass<>("1");
        //System.out.println(genecicsClassString.showType());
        Integer[] integers= {1,47,7,9,3,35,8,35,2,15,347,58,89,24,367,598,35,37,47,24,26485,89,46,32};
        geneTypeFunc(integers);
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


    public static void lowerPeopleOutput(List<? super Visitants> visitantsOrParent){
        for (Object obj: visitantsOrParent){
            if(obj instanceof Visitants visitant){
                System.out.println(visitant.toString());
            }
            else System.out.println("Не зрозуміло хто!");
        }
    }
}