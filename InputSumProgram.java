package skill.vikram;

import java.util.Scanner;
public class InputSumProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum =0;
        while(sc.hasNext()){
            int num = sc.nextInt();
            if(num >= 0){
              sum +=num;
              System.out.println(sum);
            }else{
                sum = -1;
                break;
            }

        }
        System.out.println(sum);
    }
}
