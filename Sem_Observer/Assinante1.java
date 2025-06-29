package Sem_Observer;

public class Assinante1 implements Assinante {
    @Override
    public void receberNovaEdicao(int numeroEdicao) {
        System.out.println("Assinante 1: Recebi a nova edição número " + numeroEdicao);
    }
}
