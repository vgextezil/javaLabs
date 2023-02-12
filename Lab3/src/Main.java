import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean check =false;
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть довжину масиву");
            int massLenght = scanner.nextInt();

            if(massLenght<2){
                throw new Exception("Розмір масиву замалий");
            }

            System.out.println("Заповніть масив");

            float[] mass = new float[massLenght];
            for(int i = 0;i<massLenght;i++){
                mass[i] = scanner.nextFloat();
            }

            float min = mass[0];
            int position = 1;
            for(int i = 0; i<massLenght;i++){
                if(mass[i]<min){
                    min = mass[i];
                    position = i +1;
                }
            }

            if(min>0) throw new Exception("В масиві немає від'ємного елемента");

            System.out.println("Мінімальний елемент в масиві - " + min);
            System.out.println("Номер елемента в масиві - " + position);
        }
        catch (InputMismatchException e){
           System.out.println("Ви ввели букву замість цифри");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
