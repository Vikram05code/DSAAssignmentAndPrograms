package skill.vikram;
import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of row r : ");
        int r = sc.nextInt();
        System.out.print("Enter value of Column c : ");
        int c = sc.nextInt();

    // Print rectangular pattern

       /* for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print("*");
            }
            System.out.println();
        } */

       // print rectangular border pattern

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if(i==1 || j==1 || i==r || j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
