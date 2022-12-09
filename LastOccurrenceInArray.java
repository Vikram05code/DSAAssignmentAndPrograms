package skill.vikram;
import java.util.Scanner;
public class LastOccurrenceInArray {
    public static void main(String[] args){
        //1st Method
       /*Scanner sc = new Scanner(System.in);
       System.out.print("Enter lenght of array: ");
       int n = sc.nextInt();
       System.out.print("Enter value of x: ");
       int x = sc.nextInt();
       int[] arr = new int[n];
        System.out.println("Enter element of array: ");
       for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
       }

       for(int i=n-1; i>=0; i--){
           if(arr[i] == x){
               System.out.println(i);
               break;
           }
       }*/

        // 2nd Method

        int[] arr = {1, 4, 7, 9, 1};
        System.out.println(lastOccurrence(arr,1));

    }
    public static int lastOccurrence(int[] arr, int x){
        int index = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                index = i;
            }
        }
        return index;
    }
}
