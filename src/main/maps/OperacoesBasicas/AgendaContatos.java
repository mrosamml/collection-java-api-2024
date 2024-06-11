package main.maps.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome,telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.get(nome);
        }
    return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

       agendaContatos.adicionarContato("Camila", 1235476);
        agendaContatos.adicionarContato("Camila", 8886);
        agendaContatos.adicionarContato("Camila Lima", 111111);
        agendaContatos.adicionarContato("Camila Silva", 33333);
        agendaContatos.adicionarContato("Maria Lima", 12222);
        agendaContatos.exibirContatos();

        System.out.println("-----------------------");
        agendaContatos.removerContato("Maria Lima");
        agendaContatos.exibirContatos();



    }




}
