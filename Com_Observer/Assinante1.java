package Com_Observer;

import java.util.Observable;
import java.util.Observer;

// Assinante 1 - implementa Observer e reage à nova edição
class Assinante1 implements Observer {

    public Assinante1(Observable revista) {
        revista.addObserver(this);  // Registra como observador
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof RevistaInformatica) {
            RevistaInformatica revista = (RevistaInformatica) o;
            System.out.println("Assinante 1: Chegou a edição nº " + revista.getEdicao() + " da Revista Informática.");
        }
    }
}