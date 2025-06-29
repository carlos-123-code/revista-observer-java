package Sem_Observer;

import java.util.ArrayList;
import java.util.List;

public class RevistaInformatica {

    private int edicao;
    private List<Assinante> assinantes = new ArrayList<>();

    public void adicionarAssinante(Assinante assinante) {
        assinantes.add(assinante);
    }

    public void setNovaEdicao(int novaEdicao) {
        this.edicao = novaEdicao;
        notificarAssinantes();
    }

    public int getEdicao() {
        return this.edicao;
    }

    private void notificarAssinantes() {
        for (Assinante assinante : assinantes) {
            assinante.receberNovaEdicao(this.edicao);
        }
    }

    public static void main(String[] args) {
        RevistaInformatica revista = new RevistaInformatica();

        Assinante1 assinante1 = new Assinante1();
        Assinante2 assinante2 = new Assinante2();

        revista.adicionarAssinante(assinante1);
        revista.adicionarAssinante(assinante2);

        revista.setNovaEdicao(10);
    }
}
