public class Main {

  public static void main(String[] args) {
      suma(10, 30, 60);

      coche miCoche = new coche();
      miCoche.agregarPuerta();
      System.out.println(miCoche.puertas);
  }

  public static void suma(int a, int b, int c) {
      int resultado;
      resultado = a + b;

      System.out.println(resultado);
  }
}


class coche {
  public int puertas = 0;

  public void agregarPuerta() {
    this.puertas++;
  }
}
