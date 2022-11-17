public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta (){

    }
    public Cuenta (Cuenta c){
        this.cantidad=c.cantidad;
        this.titular=c.titular;
    }

    public Cuenta (String titular){
        //this(titular, 0); Sobrecarga
        this.titular=titular;
        this.cantidad=0;
    }
    public Cuenta (String titular, double cantidad){
        this.titular=titular;
        //Si la cantidad es menor que 0 se pondrá a 0 directamente
        if (cantidad<0){
            this.cantidad=0;
        }
        else {
            this.cantidad=cantidad;
        }

    }
    //Métodos o funciones

    public String getTitular (){
        return titular;
    }
    public void setTitular (String titular){
        this.titular=titular;
    }
    public double getCantidad (){
        return cantidad;
    }
    public void setCantidad (double cantidad){
        this.cantidad=cantidad;
    }
    //Función que cargará dinero en la cuenta
    public void ingresar (double cantidad){
        if (cantidad>0){
            this.cantidad+=cantidad;
        }
    }
    public void retirar (double cantidad){
        if (this.cantidad-cantidad<0){
            this.cantidad=0;
        }
        else{
            this.cantidad-=cantidad;
        }
    }
    @Override
    public String toString (){
        return "El titular "+ titular + " tiene " + cantidad + " euros en la cuenta";
    }









}
