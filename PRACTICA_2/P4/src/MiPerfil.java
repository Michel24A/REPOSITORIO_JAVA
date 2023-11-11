public class MiPerfil {
    public static void main(String[] args) throws Exception {
        String nombre = "Anette Michel"; 
        int edad= 24; 
        double salarioDeseado= 25000.00;
        char genero= 'F';
        boolean buscandoTrabajo=true; 
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(salarioDeseado);
        System.out.println(genero);
        if (buscandoTrabajo == true){
            System.out.println("Abierto a ofertas de trabajo");
        }
        else {
            System.out.println("No estoy abierto a ofertas de trabajo");
        }
    }
}
