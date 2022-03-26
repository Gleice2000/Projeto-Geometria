public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Teste da classe Quadrado
				Quadrado primeiroQuadrado = new Quadrado();
				primeiroQuadrado.setLado(8);
				
				double areaPrimeiroQuadrado = primeiroQuadrado.calculaArea();
				System.out.println("A área quadrado é: " + areaPrimeiroQuadrado);
				
				System.out.println("\n Este é o desenho do quadrado: \n");
				primeiroQuadrado.desenhar();
			


				Retangulo retangulo1 = new Retangulo();
		        retangulo1.setBase(4);
		        retangulo1.setAltura(7);
		        
		        Retangulo primeiroRetangulo = new Retangulo();
				primeiroRetangulo.setBase(4);
				primeiroRetangulo.setAltura(7);
				
				double areaRetangulo1 = retangulo1.calculaArea();
				System.out.println("A área do retangulo é: " + areaRetangulo1);
				
				System.out.println("\n Este é o desenho do retangulo: \n");
				primeiroRetangulo.desenhar();
				System.out.println("");
		
				

		        Triangulo triangulo1 = new Triangulo();
		        triangulo1.setBase(6);
		        triangulo1.setAltura(8);
		
		        Triangulo primeiroTriangulo = new Triangulo();
		        primeiroTriangulo.setBase(8);
		        primeiroRetangulo.setAltura(8);
		
		        double areaTriangulo1 = triangulo1.calculaArea();
		        System.out.println(" A área do retangulo é: " + areaTriangulo1);
		
		        System.out.println("\n Este é o desenho do triangulo: \n");
		        primeiroTriangulo.desenhar();
		        System.out.println("");
		
				
		        
				Circulo circulo1 = new Circulo();
		        circulo1.setRaio(9);
		        
		        Circulo primeiroCirculo = new Circulo();
				primeiroCirculo.setRaio(9);
						
				double areaCirculo1 = circulo1.calculaArea();
				System.out.println(" A área do circulo é: " + areaCirculo1);
				
				
				
		
				
	}
}