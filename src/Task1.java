import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];


        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();         //заполнение массива вручную
        }

//            for (int i = 0; i < num; i++) {
//                array[i] = (int) (Math.random() * 100); //Заполнение массива случайными числами
//            }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }


}

