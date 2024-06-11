package main.set.OperacoesBasicas.Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for ( Convidado c : convidadosSet) {
            if (c.getCodigoConvidado() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }
    public int contarConvidados() {

        return convidadosSet.size();
    }
    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + "dentro do set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 123);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 124);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 124);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 125);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 126);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + "dentro do set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(123);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + "dentro do set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
