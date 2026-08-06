import java.util.*;
public class Salary {
public static void main(String[] args) {
	System.out.println("Enter the Salary ");
	Scanner obj=new Scanner (System.in);
    double Salary=obj.nextFloat();
	double ta=Salary*0.10;
	double da=Salary*0.12;
	double hra=Salary*0.18;
	double pf=Salary*0.25;
	double grossSalary=Salary+ta+da+hra;
	double netsalary=grossSalary-pf;
	System.out.println("Basic Salary is"+Salary);
	System.out.println("TA 10%= "+ta);
	System.out.println("Da 12% ="+da);
	System.out.println("HRA 18% ="+hra);
	System.out.println("Gross Salary ="+grossSalary);
	System.out.println("PF 25% = "+pf);
	System.out.println("Net Salary= "+netsalary);

	}

}
