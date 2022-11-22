package skill.vikram;
import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of row r : ");
        int r = sc.nextInt();
        System.out.print("Enter value of Column c : ");
        int c = sc.nextInt();

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
