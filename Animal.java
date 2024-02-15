package taller_2;

public class Animal {
	String nombre;
	String genero = "M";
	double peso;
	Animal pareja;
	static int totalAnimales; 
	
	void setPareja(Animal pareja) {
		this.pareja = pareja;
		}
	
	Animal tenerHijo (String nombre) {
		Animal hijo = new Animal();
		totalAnimales++;
		hijo.nombre = nombre;
		hijo.peso = 1;
		double random = Math.random();
		
		if (random < 0.5)
			hijo.genero = "F";
		else
			hijo.genero = "M";
		
		return hijo;
		}
	
		Familia procrear(String Nombrehijo) {
		
			if (pareja == null) {
				System.out.println(this.nombre + " no tiene pareja");
				return null;}
			if (pareja.genero.equals(genero)) {
				System.out.println(nombre + "y" + pareja.nombre + "son del mismo genero");
					return null;
			}
		

		
	}

}

