package es.iesgalileo.dam.caja;

public class CajaGalileo {
	public static void main (String[] args) {
		
		//Constantes
		final double IVA = 0.10;
		final double Descuento = 0.05;
		
		//Datos del ticket
		var producto = "Café";
		int UnidadesVendidas = 2;
		double precio = 1.50;
		var socio = true;
		char tipo = 'b';
		
		//Calculos 
		double subtotal = UnidadesVendidas * precio;
		double importeDescuento = socio ? (subtotal * Descuento):0.0;
		double importeDescontado = subtotal - importeDescuento;
		double importeIva = importeDescontado * IVA;
		
		double importeFinal = (subtotal - (socio ? subtotal * Descuento:0.0))*(1+IVA);	
		
		//Imprimimos los resultados
		//Me apetecia probar con un if para que cambiara la informacion del ticket :)
		System.out.printf("Subtotal:%.2f€%n", subtotal);
		
		if (socio) {
		System.out.printf("Descuento: %.3f€%n", importeDescuento);
		}
		
		if (socio) { 
			System.out.printf("Precio con descuento por socio: %.2f€%n",importeDescontado);
		}
		System.out.printf("IVA: %.3f€ %n", importeIva);
		System.out.printf("Su total es de: %.3f€ %n",importeFinal);
		
		
	}
}
		
	

