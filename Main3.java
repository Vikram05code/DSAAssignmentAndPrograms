package skill.vikram;

class ArraysExample{
    void multiArrays(){
        int[][] arr = {{11, 22, 34}, {65, 54, 32}};
        /*System.out.println(arr[0][0]); //11
        System.out.println(arr[0][1]); //22
        System.out.println(arr[0][2]); //34
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);*/

        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    void demoArrays(){
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] name = new String[3];

        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 22;

        name[0] = "Vikram";
        name[1] = "Rahul";
        name[2] = "Monu";

     /*   System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);*/


/*for(int i=0; i<3; i++){
            System.out.println(name[i]);
        }

        for(int age : ages){
            System.out.println(age);
        }

        int i=0;
        while(i<3){
            System.out.println(ages[i]);
            i++;
        }*/




    }

}

public class Main3 {
    public static void main(String[] args){
        ArraysExample obj = new ArraysExample();
        obj.demoArrays();
        obj.multiArrays();
    }
}
