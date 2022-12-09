package skill.vikram;
import java.util.Scanner;

public class PositiveFirstArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k=0;
        for(int j=0; j<n; j++){
            if(arr[j] >= 0){
                ans[k] = arr[j];
                k++;
            }
        }
        for(int l=0; l<n; l++){
            if(arr[l] < 0){
                ans[k] = arr[l];
                k++;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(ans[i] +" ");
        }
    }
}
