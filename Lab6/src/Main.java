import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("A","B",5000),
                new Employee("C","D",5000),
                new Employee("Q","N",5000),
                new Employee("N","J",5000),
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

        List<Student> students1 = List.of(
            new Student("jgk",3),
            new Student("hkldgs",33),
            new Student("fgkgk",23),
            new Student("turwt",93),
            new Student("ghkhlnm",39),
            new Student("tyityi",32)
        );

        List<Student> students2 = List.of(
                new Student("ddh",31),
                new Student("dgd",3123),
                new Student("fgfhfg",93463),
                new Student("fkgk",3479),
                new Student("gjgkg",34572)
        );
        List<Student> students3 = List.of(
                new Student("yuit",33),
                new Student("titi",33533),
                new Student("mbnmbb",248583),
                new Student("qwqrw",9358),
                new Student("youp",395858),
                new Student("ulhjlj",32568)
        );

        List<Group> groups = List.of(
                new Group(1,students1),
                new Group(2,students2),
                new Group(3,students3)
        );


        //OptionalInt maxTitleLength = maxTitleLength(books);
        //System.out.println("maxTitleLength = " + maxTitleLength.getAsInt());
        peek(employees);

        //5
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //dobutok(integers, 3);


        Integer reduce = reduce(integers);
        System.out.printf(reduce.toString());

        System.out.println(collect(employees));

        //System.out.println(flatMap(groups));

        //System.out.println(Arrays.toString(toArray(books)));
        //System.out.println(filter(employees,200));
    }

    public static Optional<Employee> filter(List<Employee> employees, int salary){
        return employees.stream().filter(employee -> employee.getSalary()>salary).findFirst();
    }

    public static String[] toArray(List<Book> books) {
        return books.stream().map(Book::getTitle).toArray(String[]::new);
    }

    public static OptionalInt maxTitleLength(List<Book> books){
        return books.stream()
                .map(Book::getTitle)
                .mapToInt(String::length)
                .max();
    }

    public static Optional<Student> flatMap(List<Group> groups){
        return groups.stream()
                .flatMap(group -> group.getStudents()
                        .stream())
                .max(Comparator.comparing(Student::getAverageMark));
    }

    public static void peek(List<Employee> employees){
        employees.stream().peek(employee -> System.out.println(employee.getfName())).findFirst();
    }
    public static void dobutok(List<Integer> integers, int multiplier){
        integers.stream().map(integer -> integer * multiplier).forEach(System.out::println);
    }
    public static Integer reduce(List<Integer> integers){
        return integers.stream().filter(integer -> integer%2==0)
                .reduce(0, Integer::sum);
    }
    public static Map<Integer, List<Employee>> collect(List<Employee> employees){
        return employees.stream().collect(Collectors.groupingBy(Employee::getSalary));
    }
}


