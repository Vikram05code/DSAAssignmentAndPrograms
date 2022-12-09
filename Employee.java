package skill.vikram;

public class Employee {
    String name;
    int yoj;
    String address;

  /*  public Employee(String name, int year, String address){
        this.name = name;
        this.year = year;
        this.address = address;
    }*/

 /*   public void getDetails(){
        System.out.println("Name" + "\t" + "Year" + "\t" + "Address");
        System.out.println(name + "\t" + year +"\t" + address);
    }*/


    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.name = "Robert";
        e1.yoj = 1994;
        e1.address = "64C- WallsStreet";

        Employee e2 = new Employee();
        e2.name = "Sam";
        e2.yoj = 1994;
        e2.address = "68D- WallsStreet";

        Employee e3 = new Employee();
        e3.name = "John";
        e3.yoj = 1999;
        e3.address = "26B- WallsStreet";

        System.out.println("Name" +"\t" +"Year of Join"+ "\t" +"Address");
        System.out.println(e1.name +"\t" +e1.yoj +"\t"+e1.address);
        System.out.println(e2.name +"\t" +e2.yoj +"\t"+e2.address);
        System.out.println(e3.name +"\t" +e3.yoj +"\t"+e3.address);
       /* Employee e1 = new Employee("Robert", 1994, "64C- WallsStreet");
        Employee e2 = new Employee("Sam", 2000, "64D- WallsStreet");
        Employee e3 = new Employee("John", 1999, "26B- WallsStreet");*/

        /*e1.getDetails();
        e2.getDetails();
        e3.getDetails();*/
    }
}
