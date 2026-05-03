import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isPrime=true;
        int n =sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
               isPrime=false;
               break;
            }

        }
        if(isPrime){
            System.out.println("n is prime");
        }
        else{
            System.out.println("n is not prime");
        }
    }
}