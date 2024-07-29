package main.maps.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Eventos> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Eventos evento = new Eventos(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual =LocalDate.now();
        LocalDate proximaData = null;
        Eventos proximoEvento = null;
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Eventos> entry : eventosMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + "acontecera na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15),"evento1", "Atracao1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JUNE, 11),"evento2", "Atracao1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.DECEMBER, 12),"evento3", "Atracao1");
        agendaEventos.adicionarEvento(LocalDate.of(2020, Month.JANUARY, 10),"evento4", "Atracao1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 20),"evento5", "Atracao1");

        agendaEventos.obterProximoEvento();
        System.out.println("--------");
        agendaEventos.exibirAgenda();
    }
}
