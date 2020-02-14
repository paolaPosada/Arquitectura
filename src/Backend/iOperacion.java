package Backend;
import Model.Sumando;
import Model.Resta;

import com.company.Main;

public interface iOperacion {

    int suma(Sumando a, Sumando b);
    int resta(Resta a, Resta b);
    void mostrarSuma();
    void mostrarResta();
}
