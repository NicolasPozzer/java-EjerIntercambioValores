package javaapplication5;


public class JavaApplication5 {

    
    public static void main(String[] args) {
        
        
        int numero = 35;
        int numero2 = 20;
        int aux;
        
        System.out.println("\n------Antes------");
        System.out.println("El resultado del Primer numero es: " + numero);
        System.out.println("El resultado del Segundo numero es: " + numero2);
        
        aux = numero;
        numero = numero2;
        numero2 = aux;
        
        System.out.println("\n------Despues------");
        System.out.println("El resultado de el Primer numero es: " + numero);
        System.out.println("El resultado de el Segundo numero es: " + numero2);
        
        
        
    }
    
}
