import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("A","B",5000),
                new Employee("C","D",2000),
                new Employee("Q","N",9000),
                new Employee("N","J",1000),
                new Employee("K","I",3000)
        );
        List<Book> books = List.of(
                new Book("dhfjfj"),
                new Book("fgkfjfgjf"),
                new Book("fjfkgk"),
                new Book("jkfkred"),
                new Book("eryfdhdhjfjfjg"),
                new Book("fhfjgfkg"),
                new Book("ffh"),
                new Book("dfhhjfjfj")
        );
        OptionalInt maxTitleLength = maxTitleLength(books);
        System.out.println("maxTitleLength = " + maxTitleLength);
        peek(employees);

        //5
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //dobutok(integers, 3);

        //6
        Integer reduce = reduce(integers);
        //System.out.printf(reduce.toString());
    }
    public static OptionalInt maxTitleLength(List<Book> books){
        return books.stream()
                .map(Book::getTitle)
                .mapToInt(String::length)
                .max();
    }

    public static void peek(List<Employee> employees){
        employees.stream().filter(employee -> employee.getSalary()>2000).peek(employee -> System.out.println(employee.getfName()));
    }
    public static void dobutok(List<Integer> integers, int multiplier){
        integers.stream().map(integer -> integer * multiplier).forEach(System.out::println);
    }
    public static Integer reduce(List<Integer> integers){
        return integers.stream().filter(integer -> integer%2==0)
                .reduce(0, Integer::sum);
    }
}