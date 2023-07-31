import java.util.Scanner;

public class ControlStatement {
    static void canVote(int age){
        // Speical case 
        if(age < 1) System.out.println("Enter Valid Age");


        if(age < 18){ // if age is greater then 18 this statement will execute
            System.out.println("You are too young to vote");
        }
        else if(age >= 18) { // otherise this will
            System.out.println("You can vote");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        canVote(age);
    }
}
