package Sem_Observer;

public class Assinante2 implements Assinante {
    @Override
    public void receberNovaEdicao(int numeroEdicao) {
        System.out.println("Assinante 2: Nova edição disponível: " + numeroEdicao);
    }
}
