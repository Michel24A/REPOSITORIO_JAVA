public class Pedido {
    public static void main(String[] args) throws Exception {
       double costoArticulo= 30.99; 
       boolean listoEnviar= false; 

       if (costoArticulo>24.00){
        System.out.println("¡El valor del articulo es alto");
       }
       if (listoEnviar == true){
        System.out.println("Enviado");
       }
        else  {
            System.out.println("Pedido no listo");
        }
       

    }
}
