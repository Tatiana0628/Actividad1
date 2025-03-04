public class Vehiculo {

    String empresapropietaria;
    int numeropasajeros;
    int capacidadcombustible; 
    int consumo;

    public Vehiculo (String empresapropietaria, int numeropasajeros, int capacidadcombustible, int capacidadconsumo) {
        this.empresapropietaria = empresapropietaria;
        this.numeropasajeros = numeropasajeros;
        this.capacidadcombustible = capacidadcombustible;
        this.consumo = consumo;
    }
  public int calcularrango () {
    return  capacidadcombustible * consumo;

    }

    public void mostrarinformacion() {
        System.out.println("empresapropietaria: " + empresapropietaria);
        System.out.println("numeropasajeros: " + numeropasajeros);
        System.out.println("capacidadcombustible: " + capacidadcombustible + "galones");
            System.out.println("consumo: " + consumo + "millas por galon");
            System.out.println("rangovehiculo: " + calcularrango() + "millas/n");
  }public static void main(String[] args) {
      Vehiculo minivan = new Vehiculo ("cootranar", 11, 29, 22);
      Vehiculo doubos = new Vehiculo ("trans arauca", 40, 28, 35);
      minivan.mostrarinformacion ();
      doubos.mostrarinformacion ();
    }
}

