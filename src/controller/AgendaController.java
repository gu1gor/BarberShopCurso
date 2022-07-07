package controller;

import View.Agenda;
import controller.helper.AgendaHelper;
import java.util.ArrayList;
import model.Agendamento;
import model.DAO.AgendamentoDAO;
import static model.DAO.Banco.agendamento;

public class AgendaController {

    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }

    public void atualizarTablela() {

        //Buscar uma lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();

        //exibir lista na view
        helper.preencherTabela(agendamento);

    }
}
