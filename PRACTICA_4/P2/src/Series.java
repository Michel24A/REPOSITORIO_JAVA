import java.util.Scanner;

public class Series {
    public static void main(String[] args) throws Exception {
       //Realiza un programa en java que imprima los primeros 15 elementos de alguna de las siguientes series haciendo uso necesariamente de las sentencias de control:
       System.out.println("SERIE DE NUMEROS");
       int opc=0; 
       Scanner l = new Scanner(System.in); 
       opc = l.nextInt(); 
       switch (opc) {
        case 1:
            System.out.println("Serie de numeros impares positivos");
            break;
       case 2: 
            System.out.println("Serie de Fibonacci");
            break; 


        default:
            break;
       }
       System.out.println("¿Qué serie desea ejecutar? ");
       
       System.out.println("La serie seleccionada es: "+opc);
    }
}
