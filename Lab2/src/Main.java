public class Main {
    public static boolean checkForWord(String str, String word){
        return str.contains(word);
    }
    public static void main(String[] args) {
        String str = "Hi, I’m Chandler. I make jokes when I’m uncomfortable.";
        String[] substr = {"joke","orange"};
        System.out.println(str);
        System.out.println(substr[0]);
        System.out.println(substr[1]);
        String task1 = String.format("Завдання 1 %d",str.length());
        System.out.println(task1);

        boolean check1 = checkForWord(str,substr[0]);
        if(check1==true){
            System.out.println("Містить");
        }
        else System.out.println("Не містить");

        boolean check2 = checkForWord(str,substr[1]);
        if(check2==true){
            System.out.println("Містить");
        }
        else System.out.println("Не містить");

        String newStr = str;
        String[] ao ={"b", "B", "c", "C", "d", "D", "f", "F","g","G", "h","H", "j","J", "k","K", "l","L", "m","M,", "n", "N" ,"p", "P","q","Q", "r","R", "s","S", "t","T", "v","V", "w", "W", "x", "y", "z"};
        for(int i=0; i<ao.length;i++){
            newStr = newStr.replace(ao[i], "");
        }
        String task3 = String.format("Завдання 3 %s",newStr);
        System.out.println(task3);

        String task4 = String.format("Завдання 4 %s", str.concat(newStr));
        System.out.println(task4);

    }

}