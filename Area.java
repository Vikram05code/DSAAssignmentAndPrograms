package skill.vikram;
import java.util.Scanner;

public class Area {
    int length;
    int breadth;
    Area(int l, int b){
        length = l;
        breadth = b;
    }
    public int getArea(){
        return length*breadth;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter breadth of rectangle : ");
        int b = sc.nextInt();
        Area a = new Area(l, b);
        System.out.println("Area of rectangle : " + a.getArea());
    }
}
