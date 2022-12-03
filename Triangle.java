package skill.vikram;

public class Triangle {
    int a, b, c;
    public double getArea(){
        double s = (a+b+c)/2.0;
        return Math.pow((s*(s-a)*(s-b)*(s-c)), .5);
    }
    public double getPerimeter(){
        return (a+b+c);
    }
    public static void main(String[] args){
       Triangle t1 = new Triangle();
       t1.a = 2;
       t1.b = 5;
       t1.c = 6;

       System.out.println(t1.getArea());
       System.out.println(t1.getPerimeter());
    }
}
