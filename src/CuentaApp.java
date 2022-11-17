public class CuentaApp {
    public static void main(String[] args) {
        Cuenta cuenta1=new Cuenta("Estefania");
        Cuenta cuenta2=new Cuenta("Mario", 300);

        //Ingresamos dinero en las cuentas
        cuenta1.ingresar(300);
        cuenta2.ingresar(400);

        //Retirar dinero de las cuentas
        cuenta1.retirar(500);
        cuenta2.retirar(100);

        //Mostramos por pantalla las cantidades que hay
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}
