package skill.vikram;
import java.util.Scanner;
public class Complex {
    int real;
    int imag;

    public Complex(int r, int i){
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }

    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real * b.real) - (a.imag * b.imag)), ((a.real * b.real) + (a.imag * b.imag)));
    }

    public void printComplex(){
        if(real == 0 && imag != 0){
           System.out.println(imag + "i");
        }
        else if(imag == 0 && real != 0){
            System.out.println(real);
        }
        else{
            System.out.println(real + "+" + imag +"i");
        }
    }

}

class Ans {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of complex number 1: ");
        int real1 = sc.nextInt();
        System.out.print("Enter complex part of complex number 1 without iota sign: ");
        int comp1 = sc.nextInt();
        System.out.print("Enter real part of complex number 2: ");
        int real2 = sc.nextInt();
        System.out.print("Enter complex part of complex nukber 2 without iota sign: ");
        int comp2 = sc.nextInt();

        Complex c = new Complex(real1, comp1);
        Complex d = new Complex(real2, comp2);
        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);

        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}
