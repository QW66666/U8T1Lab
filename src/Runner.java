import java.lang.reflect.Array;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        String[][] seatingChart = {{"Abby", "Don", "George", "Kim"}, {"Brian", "Elenor", "Harry", "Lenny"}, {"Cathy", "Fred", "Jill", "Matt"}};
        for (String[] arr : seatingChart) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("");
        seatingChart[1][2] = "Paul";
        for (String[] arr : seatingChart) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("");
        String temp = seatingChart[2][3];
        seatingChart[2][3] = seatingChart[0][0];
        seatingChart[0][0] = temp;
        for (String[] arr : seatingChart) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("");
        String[] temp2 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp2;
        for (String[] arr : seatingChart) {
            System.out.println(Arrays.toString(arr));
        }

        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        for (int[] arr : arr1) {
            System.out.println(Arrays.toString(arr));
        }
        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;
        for (int[] arr : arr2) {
            System.out.println(Arrays.toString(arr));
        }



    }
}

