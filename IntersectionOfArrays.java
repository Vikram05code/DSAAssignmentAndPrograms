package skill.vikram;
import java.util.Scanner;

public class IntersectionOfArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        System.out.print("Enter elements of a array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter elements of b array: ");
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
            boolean check = false;
            for(int j=0; j<m; j++){
                if(b[i] == a[j]){
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.print(b[i]+" ");
            }
        }
    }
}
