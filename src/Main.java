import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите данные для вычисления через пробел: ");
        String newCAlk = calc(s.nextLine());
    }


    public static String calc(String newCAlk){
        String [] newStr = newCAlk.split(" ");//убираем пробелы и кладем в новый массив.

        for (String b: newStr) {
            System.out.print(b);
        }
        return newCAlk;
    }
}
