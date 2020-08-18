package pdfreader;


public class Test_start  {
	
	public static void main(String[] args) {
		
System.out.println("*******child class ********************");		
		Bmw b = new Bmw();
		b.setup();
		b.Safety();
		b.stop();
		b.refuel();
		
System.out.println("************parent class********************");		
		Car c = new Car();
		c.setup();
		c.stop();
		c.refuel();
	
System.out.println("*******************Dynamicpolymorphism Top Casting************");		
		Car c2 = new Bmw();
		c2.setup();
		c2.stop();
		c2.refuel();
		
		System.out.println("*******************Down casting************");				
		
		Bmw b2= (Bmw)new Car();
		b2.Safety();
		b2.setup();
			
		}
		
		
		}
	
	
		



