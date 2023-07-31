import java.util.Scanner;

public class LoopsAssignment {

    static void printArray(int a[]){

        for(int i = 0; i<a.length; i++) { // if the condition is true it executes the for loops block of code 
            System.out.println(a[i]);
        } // otherwise it terminates the loop
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,3,5,7,9};
        printArray(arr);
    }
}
