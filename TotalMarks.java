package skill.vikram;
import java.util.Scanner;
public class TotalMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int totalMarks = mark1 + mark2 + mark3;
        int percentageMarks = totalMarks / 3;
        System.out.println(totalMarks);
        System.out.println(percentageMarks+"%");
    }
}
