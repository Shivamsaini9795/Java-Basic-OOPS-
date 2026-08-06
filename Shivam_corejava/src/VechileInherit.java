class VechileInherit {
    String model;
    int year;

    VechileInherit(String m, int y) {
        model = m;
        year = y;
    }

    void displayInfo() {
        System.out.println("Vehicle model: " + model);
        System.out.println("Vehicle year: " + year);
    }
}

class Car extends VechileInherit {
    int doors;

    Car(String m, int y, int d) 
    {
        VechileInherit vi = new VechileInherit(m, y);
        model = vi.model;
        year = vi.year;
        doors = d;
    }

    void displayCarInfo() {
        System.out.println("Number of doors: " + doors);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 2022, 4);
        c.displayInfo();
        c.displayCarInfo();
    }
}
