package Com_Observer;

import java.util.Observable;
import java.util.Observer;

// Classe que representa a Revista (o sujeito observado)
public class RevistaInformatica extends Observable {

    private int edicao;

    // Método para atualizar a edição e notificar os assinantes
    public void setNovaEdicao(int novaEdicao) {
        this.edicao = novaEdicao;

        setChanged();         // Marca que houve uma mudança
        notifyObservers();    // Notifica todos os observadores registrados
    }

    public int getEdicao() {
        return this.edicao;
    }

    public static void main(String[] args) {
        // Exemplo de uso do sistema
        RevistaInformatica revista = new RevistaInformatica();

        // Criação e registro de assinantes
        Assinante1 assinante1 = new Assinante1(revista);
        Assinante2 assinante2 = new Assinante2(revista);

        // Lançamento de uma nova edição
        revista.setNovaEdicao(5);
    }
}
