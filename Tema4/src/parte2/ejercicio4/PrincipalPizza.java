package parte2.ejercicio4;

public class PrincipalPizza {
public static void main(String[] args) {
	
//objeto pizza1
	Pizza pizza1=new Pizza(1,"FAMILIAR","CUATROQUESOS");
	//objeto pizza2
	Pizza pizza2=new Pizza(2,"MEDIA","CUATROQUESOS");
	//objeto pizza3
	Pizza pizza3=new Pizza(3,"FAMILIAR","FUNGHI");
	
	
	System.out.println(pizza1);
	System.out.println(pizza2);
	System.out.println(pizza3);
	
	System.out.println(pizza1.equals(pizza2));
	
	
	
}
}
