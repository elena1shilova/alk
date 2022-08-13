import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите данные для вычисления через пробел: ");
        //String newCAlk = calc(s.nextLine());
        //System.out.println(calc(newCAlk));
        String newCAlk = s.nextLine();
        System.out.println(calc(newCAlk));
    }
    public static String calc(String newCAlk){
        String [] newStr = newCAlk.split(" ");//убираем пробелы и кладем в новый массив.
        String resultOutput = " ";
        if(newStr.length!=3){                //если длина нового массива больше 3 или меньше 3
            resultOutput = "Формат математической операции не удовлетворяет заданию";
        } else {
            try {
                Integer num1 = Integer.valueOf(newStr[0]);
                Integer num2 = Integer.valueOf(newStr[2]);
                if(num1>10||num2>10){
                    resultOutput = "Формат математической операции не удовлетворяет заданию";
                } else {
                    switch (newStr[1]){
                        case "+" :
                            resultOutput = Integer. toString(num1 + num2);
                            break;
                        case "-" :
                            resultOutput = Integer. toString(num1 - num2);
                            break;
                        case "*" :
                            resultOutput = Integer. toString(num1 * num2);
                            break;
                        case "/" :
                            resultOutput = Integer. toString(num1 / num2);
                            break;
                        default:
                            resultOutput = "Формат математической операции не удовлетворяет заданию";
                    }
                }
            }catch (NumberFormatException e) {
                if ((newStr[0].equals("I") || newStr[0].equals("II") || newStr[0].equals("III") || newStr[0].equals("IV") || newStr[0].equals("V") ||
                        newStr[0].equals("VI") || newStr[0].equals("VII") || newStr[0].equals("VIII") || newStr[0].equals("IX") || newStr[0].equals("X")) &&
                        (newStr[2].equals("I") || newStr[2].equals("II") || newStr[2].equals("III") || newStr[2].equals("IV") || newStr[2].equals("V") ||
                        newStr[2].equals("VI") || newStr[2].equals("VII") || newStr[2].equals("VIII") || newStr[2].equals("IX") || newStr[2].equals("X"))) {
                    int num1 = 0;
                    int num2 = 0;
                    switch (newStr[0]) {
                        case "I": num1 = 1;
                            break;
                        case "II": num1 = 2;
                            break;
                        case "III": num1 = 3;
                            break;
                        case "IV": num1 = 4;
                            break;
                        case "V": num1 = 5;
                            break;
                        case "VI": num1 = 6;
                            break;
                        case "VII": num1 = 7;
                            break;
                        case "VIII": num1 = 8;
                            break;
                        case "IX": num1 = 9;
                            break;
                        case "X": num1 = 10;
                            break;
                        default:
                            resultOutput = "Формат математической операции не удовлетворяет заданию";
                    }
                    switch (newStr[2]) {
                        case "I": num2 = 1;
                            break;
                        case "II": num2 = 2;
                            break;
                        case "III": num2 = 3;
                            break;
                        case "IV": num2 = 4;
                            break;
                        case "V": num2 = 5;
                            break;
                        case "VI": num2 = 6;
                            break;
                        case "VII": num2 = 7;
                            break;
                        case "VIII": num2 = 8;
                            break;
                        case "IX": num2 = 9;
                            break;
                        case "X": num2 = 10;
                            break;
                        default:
                            resultOutput = "Формат математической операции не удовлетворяет заданию";
                    }
                    int result = 0;
                    switch (newStr[1]) {
                        case "+": result = num1 + num2;
                            break;
                        case "-": result = num1 - num2;
                            break;
                        case "*": result = num1 * num2;
                            break;
                        case "/":result = num1 / num2;
                            break;
                        default:
                            resultOutput = "Формат математической операции не удовлетворяет заданию";
                    }
                    if (result > 0) {
                        int[] arrArab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                                        21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                                        41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                                        61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                                        81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
                        String[] arrRoman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV",
                                            "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                                            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV",
                                            "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                                            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV",
                                            "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                                            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
                        for (int i = 0; i < arrArab.length; i++) {
                            if (result == arrArab[i]) resultOutput = arrRoman[i];
                        }
                    } else {
                        resultOutput = "Формат математической операции не удовлетворяет заданию";
                    }
                } else {
                    resultOutput = "Формат математической операции не удовлетворяет заданию";
                }
            }
        }
            return resultOutput;
    }
}
