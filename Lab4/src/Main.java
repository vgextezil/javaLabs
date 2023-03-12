import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Dishes> dishes = new ArrayList<>();
        List<Visitants> visitants = new ArrayList<>();
        List<Workers> workers = new ArrayList<>();
        List<Orders> orders = new ArrayList<>();
        List<LikedDish> likedDishes = new ArrayList<>();


        dishes.add(new Dishes(1,"Кава","Еспрессо",10 ));
        dishes.add(new Dishes(2,"Кава","Американо", 15));
        dishes.add(new Dishes(3,"Кава","Лате", 20));
        dishes.add(new Dishes(4,"Кава","Капучіно", 25));
        dishes.add(new Dishes(5,"Чай","Листкови",10 ));
        dishes.add(new Dishes(6,"Чай","Натуральний", 15));
        dishes.add(new Dishes(7,"Сезонні","Айс лате", 30));
        dishes.add(new Dishes(8,"Сезонні","Мілкшейк", 40));

        visitants.add(new Visitants(1));
        visitants.add(new Visitants(2));
        visitants.add(new Visitants(3));
        visitants.add(new Visitants(4));
        visitants.add(new Visitants(5));
        visitants.add(new Visitants(6));
        visitants.add(new Visitants(7));
        visitants.add(new Visitants(8));
        visitants.add(new Visitants(9));

        workers.add(new Workers(1,"Пазюк","Офіціант", LocalDate.of(2000,1,11)));
        workers.add(new Workers(2,"Мельник","Офіціант", LocalDate.of(2003,3,29)));
        workers.add(new Workers(3,"Ісопеску","Повар", LocalDate.of(1994,6,17)));
        workers.add(new Workers(4,"Гуцуляк","Офіціант", LocalDate.of(1996,8,21)));
        workers.add(new Workers(5,"Рурак","Повар", LocalDate.of(1990,2,23)));

        orders.add(new Orders(1,1, new int[]{1},1,LocalDate.of(2022,2,20)));
        orders.add(new Orders(2,2, new int[]{5,6},2,LocalDate.of(2022,2,21)));
        orders.add(new Orders(3,2, new int[]{8,4 },1,LocalDate.of(2022,2,3)));
        orders.add(new Orders(4,5, new int[]{4,3 },4,LocalDate.of(2023,2,27)));
        orders.add(new Orders(5,3, new int[]{2,8 },4,LocalDate.of(2023,11,19)));
        orders.add(new Orders(6,3, new int[]{5,7,8 },1,LocalDate.of(2023,5,26)));
        orders.add(new Orders(7,3, new int[]{2,3 },2,LocalDate.of(2023,8,13)));
        orders.add(new Orders(8,5, new int[]{7, 8},1,LocalDate.of(2021,5,13)));
        orders.add(new Orders(9,3, new int[]{6, 4},4,LocalDate.of(2021,2,1)));

        likedDishes.add(new LikedDish(1,2,dishes));
        likedDishes.add(new LikedDish(3,5,dishes));
        likedDishes.get(0).toString(dishes,visitants);
        likedDishes.get(1).toString(dishes,visitants);
        //Sorting
        likedDishes.sort((f1, f2) -> CharSequence.compare(f2.getDishes().get(f2.getIdDish()-1).getTitle(), f1.getDishes().get(f1.getIdDish()-1).getTitle()));
        likedDishes.get(0).toString(dishes,visitants);
        likedDishes.get(1).toString(dishes,visitants);
        /*
        List<Integer> integers =check(orders);
        for (int i = 0;i<integers.size();i++){
            System.out.println(integers.get(i).toString());
        }
        */
        //Sorting by price

        orders.sort((f1, f2) -> Long.compare(f2.priceOrder(dishes), f1.priceOrder(dishes)));
        orders.forEach(f -> System.out.print(f.priceOrder(dishes)+" "));
        System.out.println(orders);

        //sorting by liked dishes
        /*
        likedDishes.sort((f1, f2) -> CharSequence.compare(f2.getDishes().get(f2.getIdDish()-1).getTitle(), f1.getDishes().get(f1.getIdDish()-1).getTitle()));
        likedDishes.get(0).toString(dishes,visitants);
        likedDishes.get(1).toString(dishes,visitants);
         */

/*
        System.out.println(orders);
        orders.sort(
                Comparator.comparing(Orders::getIdVisitant).thenComparing(Orders::getIdWorker)
        );
        System.out.println(orders);
        */

    }
     public static List<Integer> check(ArrayList<Orders> orders){
        List<Integer> integers = new ArrayList<>(orders.size());
         for (Orders order : orders) {
             integers.add(order.getIdVisitant());
         }
        Collections.sort(integers);
        integers.sort(Comparator.comparingInt(i->Collections.frequency(integers, i)).reversed());
        return  integers;
    }
}