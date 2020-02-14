package Frontend;
import Model.Sumando;
import Model.Resta;
import Backend.MotorCalculo;

public class ViewOpe {

    public ViewOpe obtener(int n1, int n2) {
        Sumando a = new Sumando();
        a.setA(n1);
        Sumando b = new Sumando();
        b.setB(n2);
        int sumatoria = new MotorCalculo().suma(a, b);

        Resta min = new Resta();
        min.setMin(n1);
        Resta sust = new Resta();
        sust.setSust(n2);
        MotorCalculo restar = new MotorCalculo();
        restar.resta(min, sust);

        restar.mostrarResta();
        System.out.println(sumatoria);
        System.out.println(restar);
        return null;
    }









}
