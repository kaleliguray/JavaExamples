import javax.jws.soap.SOAPBinding;

public class Driver {

	public static void main(String[] args) {
//		Pencil pencil;
//		pencil = new Pencil();
//
//		pencil.brand = "Faber";
//		pencil.color = "Mavi";
//		pencil.erasable = true;
//		pencil.price = 4.0f;
//		pencil.refillable = false;
//		pencil.type = "Kurşun Kalem";
//
//		System.out.println("Brand: " + pencil.brand);
//		System.out.println("Color: " + pencil.color);
//		System.out.println("Is erasable: " + pencil.erasable);
//		System.out.println("Price: " + pencil.price + " TL");
//		System.out.println("Is refill: " + pencil.refillable);
//		System.out.println("Type: " + pencil.type);
		
		
		Car car = new Car();
		System.out.println(car.speed);
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		System.out.println(car.speed);
		car.breakSpeed();
		car.breakSpeed();
		System.out.println(car.speed);
		car.handBreak();
		System.out.println(car.speed);
	}
}
