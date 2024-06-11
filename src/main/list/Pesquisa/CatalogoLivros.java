package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;
    private CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal) {
                List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList){
                if (l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo =l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro2", "Autor 1", 2022);
        catalogoLivros.adicionarLivro("Livro3", "Autor 3", 2022);
        catalogoLivros.adicionarLivro("Livro4", "Autor 4", 2015);
        catalogoLivros.adicionarLivro("Livro5", "Autor 4", 1980);
        catalogoLivros.adicionarLivro("Livro5", "Autor 5", 1989);

      //  System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
      //  System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1989,2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livrto5"));
    }
}
