package skill.vikram;

public class SwapTwoNumber{
    public static void main(String[] args){
        int num1 = 2;
        int num2 = 4;
        int temp = 0;
        System.out.println("The first number before swap is : " + num1);
        System.out.println("The second number before swap is : " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The first number after swap is : " + num1);
        System.out.println("The second number after swap is : "+ num2);
    }
}
