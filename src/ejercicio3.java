import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Float nota1, nota2, nota3 ;
        Float promedio ;
        
        System.out.println("Ingrese la primera nota");
        nota1 = entrada.nextFloat();

        System.out.println("Ingrese la segunda nota");
        nota2 = entrada.nextFloat();

        System.out.println("Ingrese la tercera nota");
        nota3 = entrada.nextFloat();

        promedio= (nota1 + nota2 + nota3)/3;

        if (promedio>=10) {
            System.out.println("Felicidades estas aprobado: " + promedio);
           
        }
        else{
            System.out.println("Estas reprobado:" + promedio);
        }
        

    
    }
}
