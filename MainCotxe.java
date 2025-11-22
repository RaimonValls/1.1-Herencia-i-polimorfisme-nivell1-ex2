package exercicis1012;
public class MainCotxe {
    public static void main(String[] args) {
        Cotxe.frenar();
        Cotxe c1=new Cotxe("c3",45);
        System.out.println(c1.getModel());
        c1.accelerar();
        Cotxe c2=new Cotxe("2cv",78);
        System.out.println(c2.getModel());
        c2.accelerar();
        System.out.println(c1);//el modelo es estatico ambas mostrarán el mismo valor
        System.out.println(c2);
    }
}
