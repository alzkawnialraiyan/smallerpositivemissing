import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter numbers of elements: ");
        int n = read.nextInt();
        int [] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i =0; i<n ; i++){
            array[i] = read.nextInt();
        }

        int missing = findSmallPositiveInteger(array);
        System.out.println("The missing positive integer is: "+missing);
    }
    static int findSmallPositiveInteger(int [] array){
        Arrays.sort(array);
        int j, i = 1;
        for(j=0 ; j < array.length; j++){
            if(array[j] == i){
                i++;
            }
        }
        return i;
    }
}