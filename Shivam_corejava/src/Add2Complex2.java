import java.util.Scanner;
class Complex2 {
    int real;
    int img;

    public Complex(int r, int i) {
        real = r;
        img = i;
    }

    public Complex() {
        this(0, 0);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the real and img value ");
        real = scanner.nextInt();
        img = scanner.nextInt();
    }

    public void display() {
        System.out.println("Complex number is " + real + "+" + img + "i");
    }

    public void add(Complex c, Complex result) {
        result.real = real + c.real;
        result.img = img + c.img;
    }
}

class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();

        c1.input();
        c2.input();

        c1.add(c2, c3);
        c3.display();
    }
}

