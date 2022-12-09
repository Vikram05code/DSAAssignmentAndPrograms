package skill.vikram;

public class CountOccurrence {

    // ques: Count the number of occurrences of a particular element x.
   /* public static int countOfElements(int[] arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1, 4, 7, 9, 1};
        System.out.println(countOfElements(arr, 1));
    }*/


    //Ques: Count the number of elements strictly greater than value x

  /*  public static int countElements(int[] arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1, 4, 7, 9, 1};
        System.out.println(countElements(arr, 1));
    }*/

    // Ques: Check if the given array is sorted or not
    public static boolean check(int[] arr){
        boolean ans = true;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                ans = false;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 2, 5};
        System.out.println(check(arr));
    }
}
