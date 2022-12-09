package skill.vikram;

public class TraverseArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};

        for(int arr2 : arr){
            if(arr2 % 2 == 0){
                System.out.println(arr2);
            }
        }
    }
}
