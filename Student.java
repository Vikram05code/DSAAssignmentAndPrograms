package skill.vikram;

public class Student {
    String name;
    int roll_no;
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "John";
        s1.roll_no = 2;
        System.out.println(s1.name);
        System.out.println(s1.roll_no);
    }
}
