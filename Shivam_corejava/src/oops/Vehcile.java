package myclass;

public class Vehcile {
	
	    String model;
	    int year;

	    Vehcile(String m, int y) 
	    {
	        model = m;
	        year = y;
	    }

	    void displayInfo() {
	        System.out.println("Vehicle model: " + model);
	        System.out.println("Vehicle year: " + year);
	    }
	}

	class Car extends Vehcile {
	    int doors;

	    Car(String m, int y, int d) 
	    {
	    	super(m, y);
	    	doors=d;
	    }

	    void displayCarInfo() {
	        System.out.println("Number of doors: " + doors);
	    }
	}

	


