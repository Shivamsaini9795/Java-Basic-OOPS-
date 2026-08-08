 class Complex {
    int real;
    int img;

    public Complex() {}

    public Complex(int r, int i) {
        real = r;
        img = i;
    }

    public Complex sum(Complex c1, Complex c2) {
        Complex c3 = new Complex();
        c3.real = c1.real + c2.real;
        c3.img = c1.img + c2.img;
        return c3;
    }

    public void display() {
        System.out.println("Addition of 2 Complex numbers is " + real + "+" + img + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(5, 4);
        Complex c2 = new Complex(10, 6);
        Complex c3 = c1.sum(c1, c2);
        c3.display();
    }
}
