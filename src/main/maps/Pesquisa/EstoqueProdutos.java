package main.maps.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque=0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;

    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L,"A", 10, 5.0);
        estoque.adicionarProduto(2L,"b", 5, 4.0);
        estoque.adicionarProduto(3L,"c", 3, 15.0);
        estoque.adicionarProduto(4L,"d", 1, 20.0);

        estoque.exibirProdutos();
        System.out.println("Valor Total do estoque " + estoque.calcularValorTotalEstoque());
        System.out.println("Valor Produto mais caro " + estoque.obterProdutoMaisCaro());

    }



}
