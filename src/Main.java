import java.util.Scanner;

public class Main {

    public static int linearSearch(int arr[], int elementToSearch) {

        int s = 0;

        for (int index = 0; index < arr.length; index++) {
            s+=1;
            if (arr[index] == elementToSearch) {
                System.out.println("Число операций сравнения = " + s);
                return index;
            }
        }

        System.out.println("Число операций сравнения = " + s);
        return -1;
    }

    public static int binarySearch(int[] arr, int x, int first, int last) {

        int index = -1;
        int s = 0;

        while (first <= last) {
            s++;
            int mid = (first + last) / 2;
            System.out.println("//Середина под индексом: " + mid);
            if (arr[mid] < x) {
                first = mid + 1;
            } else if (arr[mid] > x) {
                last = mid - 1;
            } else if (arr[mid] == x) {
                index = mid;
                break;
            }
        }

            System.out.println("Число операций сравнения = " + s);

        return index;
    }

    public static void print(int x, int index) {
        if (index == -1){
            System.out.println(x + " не найдено.");
        }
        else {
            System.out.println(x + " найдено под индексом: " + index);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int size = input.nextInt();

        int array[] = new int[size];

        System.out.println("Введите элементы массива");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Введите искомое число");
        int x = input.nextInt();


        System.out.println("ПОСЛЕДОВАТЕЛЬНЫЙ ПОИСК");
        int in = linearSearch(array, x);
        print(x, in);
        System.out.println();

        System.out.println("БИНАРНЫЙ ПОИСК");
        int first = 0;
        int last = array.length - 1;

        int i = binarySearch(array, x, first, last);
        print(x, i);
    }
}
