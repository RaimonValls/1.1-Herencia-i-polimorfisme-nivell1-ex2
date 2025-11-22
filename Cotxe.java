package exercicis1012;

public class Cotxe {
    private static final String MARCA="Citroen";
    private static String model;
    private final int potencia;

    public Cotxe(String model,int potencia) {
        Cotxe.model=model;
        this.potencia = potencia;
    }
    public String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Cotxe.model = model;
    }

    public int getPotencia() {
        return potencia;
    }

    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }
    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }

    @Override
    public String toString() {
        return "Cotxe{" +"modelo: "+model+
                 " potencia:" + potencia +
                '}';
    }
}




