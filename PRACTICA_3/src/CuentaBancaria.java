public class CuentaBancaria {
    public static void main(String[] args) throws Exception {
        double saldo = 1000.75; 
        double cantidadARetirar = 250; 
        double saldoActualizado= saldo-cantidadARetirar; 
        double cantidadParaCadaAmigo= saldoActualizado/3; 
        boolean puedeComprarTicket; 
        if (cantidadParaCadaAmigo == 250){
            puedeComprarTicket = true; 
            //System.out.println("Puede comprar Ticket");
        } else {
            puedeComprarTicket= false; 
        }
        System.out.println("Le di a cada amigo "+ cantidadParaCadaAmigo);
    }
}
