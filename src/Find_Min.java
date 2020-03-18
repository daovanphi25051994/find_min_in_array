import java.util.Scanner;

public class Find_Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] arrayNumbers = new int[size];
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arrayNumbers[i] = scanner.nextInt();
        }
        int minIndex = getMinIndexOfArray(arrayNumbers);
        System.out.printf("min of array = %d", arrayNumbers[minIndex]);
    }

    public static int getMinIndexOfArray(int[] arrNumbers) {
        int min = arrNumbers[0];
        int minIndex = 0;
        for (int i = 1; i < arrNumbers.length; i++) {
            if (min > arrNumbers[i]) {
                min = arrNumbers[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
