import java.util.Scanner;
public class cotxe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car c = new Car();
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introdueix la marca del cotxe");
//		c.marca = sc.next();
//		System.out.println("Introdueix el model del cotxe");
//		c.model = sc.next();
//		System.out.println("Introdueix el nombre de cilindres");
//		c.cilindres = sc.nextInt();
//		System.out.println("Introdueix la cilindrada");
//		c.cilindrada = sc.nextInt();
//				
//		c.setPotenciaFiscal();
//		
//		System.out.println("El " + c.getMarca() + " " + c.getModel() + " té " + c.getPotenciaFiscal() + " cavalls fiscals");
//		
		CotxeHibrid c = new CotxeHibrid();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdueix la marca del cotxe");
		c.marca = sc.next();
		System.out.println("Introdueix el model del cotxe");
		c.model = sc.next();
		System.out.println("Introdueix el nombre de cilindres");
		c.cilindres = sc.nextInt();
		System.out.println("Introdueix la cilindrada");
		c.cilindrada = sc.nextInt();
		System.out.println("Introdueix la potència del motor elèctric");
		c.kW = sc.nextInt();
		
		c.setPotenciaFiscal();
		
		System.out.println("El " + c.getMarca() + " " + c.getModel() + " té " + c.getPotenciaFiscal() + " cavalls fiscals");
	}	
	
}
