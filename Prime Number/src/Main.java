import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //We'll see if a number is prime or not in this program!
        Scanner scan = new Scanner(System.in);
        int input;
        boolean prime =true;

        do{
            System.out.println("Enter a positive number: ");
            input = scan.nextInt();
        }while(input<2);

        for(int i=2;i<input;i++){
            if(input % i == 0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println("This is a prime number");
        }else{
            System.out.println("This is not a prime number");
        }
    }
}
