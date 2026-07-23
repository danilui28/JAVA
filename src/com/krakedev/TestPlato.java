package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		
		Plato platoA = new Plato();
		Plato platoB = new Plato();
		Plato platoC= new Plato();
		
        platoA.nombre = "Pollo frito";
        platoA.tipo = "Plato fuerte";
        platoA.precio = 2.50;
        platoA.disponible = true;

        platoB.nombre = "Pizza";
        platoB.tipo = "Plato fuerte";
        platoB.precio = 12.50;
        platoB.disponible = true;

        platoC.nombre = "Cheesecake";
        platoC.tipo = "Postre";
        platoC.precio = 4.50;
        platoC.disponible = false;

        System.out.println("////// Platillo 1 //////");
        System.out.println("Nombre: " + platoA.nombre);
        System.out.println("Tipo: " + platoA.tipo);
        System.out.println("Precio: $" + platoA.precio);
        System.out.println("Disponible: " + platoA.disponible);

        System.out.println("////// Platillo 2 //////");
        System.out.println("Nombre: " + platoB.nombre);
        System.out.println("Tipo: " + platoB.tipo);
        System.out.println("Precio: $" + platoB.precio);
        System.out.println("Disponible: " + platoB.disponible);

        System.out.println("////// Platillo 3 //////");
        System.out.println("Nombre: " + platoC.nombre);
        System.out.println("Tipo: " + platoC.tipo);
        System.out.println("Precio: $" + platoC.precio);
        System.out.println("Disponible: " + platoC.disponible);
		
	}

}
