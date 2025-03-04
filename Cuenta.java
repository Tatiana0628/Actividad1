public class Cuenta {
    

    private String titular;
    private double total;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
        this.total = 5000;  
    }
    public Cuenta(String titular, double total) {
        this.titular = titular;
        this.total = total;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getTotal() {
        return total;
    }

        
    
    public void setTotal(double total) {
        this.total = total;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }


    public void Ingresar(double cantidad) {
        if (cantidad > 0) {
            total += cantidad;  
        }
    }


    public void Retirar(double cantidad) {
        if (cantidad < 0) {
            total = 5000;  
        } else {
            total -= cantidad;
            if (total < 0) {
                total = 0;  
            }
        }
    }

 
    public void ConsultarSaldo() {
        System.out.println("Saldo actual de " + titular + ": $" + total);
    }

    
    public static void main(String[] args) {
   
        Cuenta cuentaJuan = new Cuenta("Juan");

        cuentaJuan.ConsultarSaldo();


        cuentaJuan.Ingresar(2000);
        cuentaJuan.ConsultarSaldo();

        cuentaJuan.Retirar(8000);
        cuentaJuan.ConsultarSaldo();

    
        cuentaJuan.Retirar(-500);
        cuentaJuan.ConsultarSaldo();

    
        cuentaJuan.Retirar(300);
        cuentaJuan.ConsultarSaldo();
    }
}
