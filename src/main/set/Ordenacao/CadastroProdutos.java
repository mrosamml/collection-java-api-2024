package main.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod,nome, preco,quantidade));
    }

public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;

    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L,"p1",15d,5);
        cadastroProdutos.adicionarProduto(2L,"p2",19d,10);
        cadastroProdutos.adicionarProduto(2L,"p3",4d,4);
        cadastroProdutos.adicionarProduto(4L,"p4",2d,1);
       // cadastroProdutos.adicionarProduto(5L,"p5",1d,15);
        //cadastroProdutos.adicionarProduto(6L,"p6",9d,20);
        System.out.println(cadastroProdutos.produtoSet);
       System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());
    }




}
