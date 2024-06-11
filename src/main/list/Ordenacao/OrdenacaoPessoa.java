package main.list.Ordenacao;

import java.util.*;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadaPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
    ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
    ordenacaoPessoa.adicionarPessoa("Nome 2", 52, 1.80);
    ordenacaoPessoa.adicionarPessoa("Nome 3", 29, 1.60);
    ordenacaoPessoa.adicionarPessoa("Nome 4", 25, 1.75);
    ordenacaoPessoa.adicionarPessoa("Nome 5", 10, 1.12);

       System.out.println(ordenacaoPessoa.ordenadaPorIdade());
       System.out.println(ordenacaoPessoa.ordenarPorAltura());

    }
}
