package skill.vikram;
import java.util.Scanner;

public class CalculateProfitLoss {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the cost price : ");
       double costPrice = sc.nextDouble();
       System.out.print("Enter the selling price : ");
       double sellingPrice = sc.nextDouble();
       double amount;
       if(sellingPrice < costPrice){
           amount = costPrice - sellingPrice;
           System.out.println("The Loss is " +  amount);
       }else if(sellingPrice > costPrice){
           amount = sellingPrice - costPrice;
           System.out.println("The Profit is " + amount);
       }
       else{
           System.out.println("No Profit No Loss");
       }
    }
}
