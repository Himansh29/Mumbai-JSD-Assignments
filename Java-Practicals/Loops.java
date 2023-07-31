public class Loops
{
    static void printTable(int number){
        for(int i = 1; i<=10; i++) {
            System.out.println(number * i);
        }
    }
    
    static void printTableUsingWhile(int number){
        int i = 1;
        while(i <= 10) {
            System.out.println(number * i);
            i++;
        }
    }
    
    static void printTableUsingDoWhile(int number){
        int i = 1;
        do{
            System.out.println(number * i);
            i++;
        }while(i<=10);
    }
	public static void main(String[] args) {
		printTableUsingDoWhile(2);
	}
}