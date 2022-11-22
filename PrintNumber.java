package skill.vikram;

public class PrintNumber {
    public static void main(String[] args){

      /*  for(int num=1; num<=100; num++){
            if((num % 3==0) && (num % 5==0)){
                System.out.println("FizzBuzz");
                continue;
            }
            if(num % 3==0){
                System.out.println("Fizz");
                continue;
            }
            if(num % 5 == 0){
                System.out.println("Buzz");
                continue;
            }
            else{
                System.out.println(num);
            }

        }*/

        int num = 1;
        while(num <= 100){
            if((num % 3==0) && (num % 5==0)){
                System.out.println("FizzBuzz");
                num++;
                continue;
            }
            if(num % 3 == 0){
                System.out.println("Fizz");
                num++;
                continue;
            }
            if(num % 5==0){
                System.out.println("Buzz");
                num++;
                continue;
            }
            else{
                System.out.println(num);
                num++;
            }
        }


    }
}
