import java.util.*;
import java.lang.String;


class Car
{

	public static void main(String []args)
	{	
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one of the below (your input should be only integer values): ");
                System.out.println("1. LUV ");
                System.out.println("2. MUV ");
                System.out.println("3. SUV ");
		
		n=sc.nextInt();
		SwitchOperation so = new SwitchOperation();
		so.switchFunction(n);
		

	}

}

class SwitchOperation
{
	 void switchFunction(int x)
	{
		CarType ct = new CarType();

		switch (x) {
	            case 1:  
		    ct.luv();
                    break;
        	    case 2:
                    ct.muv();
                    break;
		    case 3:
                    ct.suv();
		    break;
		    default: System.out.println("Kindly provide a valid input");
                    break;
	}


	}

}

abstract class GeneralCar
{

	String carModel = new String();
	String carMake = new String();
	String carNumber = new String();

}

class CarType extends GeneralCar
{

	void luv()
	{

		carModel = "Brio";
		carMake = "Honda";
		carNumber = "MH 01 AB 1234";
		System.out.println("The LUV we have in store is:" +carMake +carModel + "with the carNumber:" + carNumber);

	}


	void muv()
        {

                carModel = "Go Plus";
                carMake = "Datsun";
                carNumber = "MH 43 DT 5678";
                System.out.println("The MUV we have in store is:" +carMake +carModel + "with the carNumber:" + carNumber);

        }

	void suv()
        {

                carModel = "Scorpio";
                carMake = "Mahindra";
                carNumber = "MH 04 SO 2676";
                System.out.println("The SUV we have in store is " +carMake+ " " +carModel+ " " + "with the carNumber:" + carNumber);

        }



}
