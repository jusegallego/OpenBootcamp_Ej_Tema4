
public class Switch_Case {

	public static void main(String[] args) {
       String estacion = "INVIERNO"; //para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
	
	switch(estacion) {   //Estructura de control que permite definir varios casos de selección
		case "INVIERNO":
			System.out.println("La estación es invierno");
			break;
		case "VERANO":
			System.out.println("La estación es verano");
			break;
		case "OTOÑO":
			System.out.println("La estación es otoño");
			break;
		case "PRIMAVERA":
			System.out.println("La estación es primavera");
			break;
		default:
			System.out.println("¿Qué estacion es?");
			
	
	}
	}

}
