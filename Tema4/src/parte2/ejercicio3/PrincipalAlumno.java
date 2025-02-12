package parte2.ejercicio3;

public class PrincipalAlumno {
	public static void main(String[] args) {

		// creamos objeto alumno 1
		Alumno alumno1 = new Alumno("Juan Luis Barrionuevo", 5);
		// creamos objeto alumno 2
		Alumno alumno2 = new Alumno("Sergio González", 2);
		// creamos objeto alumno 2
		Alumno alumno3 = new Alumno("Mario Amado", 7);
		
		System.out.println(alumno1);
		System.out.println(alumno2);
		System.out.println(alumno3);
		
		
		System.out.println(alumno1.equals(alumno3));
	}
}
