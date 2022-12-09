package skill.vikram;
import java.util.Scanner;

public class ChangePosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter element of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        int idx=0;

        for(int i=0; i<n; i++){
            if(arr[i] >= 0){
                ans[idx] = arr[i];
                idx++;
            }
        }
        for(int i=0; i<n; i++){
           if(arr[i] < 0){
               ans[idx] = arr[i];
               idx++;
           }
        }

        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
