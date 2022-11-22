package skill.vikram;
import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of row r : ");
        int r = sc.nextInt();

        // Print Triangular Pattern
        /*
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        */
        //Print Opposite Triangle Pattern
        /*for(int i=1; i<=r; i++){
            for(int j=r; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //2nd Method
        for(int i=1; i<=r; i++){
            for(int j=1; j<= r+1-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
