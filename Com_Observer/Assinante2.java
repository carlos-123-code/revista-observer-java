package Com_Observer;

import java.util.Observable;
import java.util.Observer;

// Outro assinante para ilustrar múltiplos observadores
class Assinante2 implements Observer {

    public Assinante2(Observable revista) {
        revista.addObserver(this);  // Também se registra
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof RevistaInformatica) {
            RevistaInformatica revista = (RevistaInformatica) o;
            System.out.println("Assinante 2: Já disponível a nova edição nº " + revista.getEdicao() + "!");
        }
    }
}