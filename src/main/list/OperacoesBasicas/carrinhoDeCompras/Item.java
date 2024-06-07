package main.list.OperacoesBasicas.carrinhoDeCompras;

import java.util.List;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return " quantidade: " + quantidade +
                ", produto: " + nome + ", preco: " + preco +
                 '\n';
    }
}
