package Backend;
import Model.Resta;
import Model.Sumando;

public class MotorCalculo implements iOperacion{

    public int suma(Sumando a, Sumando b) {
            int sum = a.getA() + b.getB();
            return sum;
        }

        public int resta(Resta a, Resta b) {
            int res = a.getMin()-b.getSust();
            return res;
        }

        public void mostrarSuma() {

        }

        public void mostrarResta() {

        }
    };

