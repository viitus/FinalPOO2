/*@author victo */

package View;

import Controller.EventoController;
import Controller.EventoParticipanteController;
import Controller.ParticipanteController;
import Controller.LocalController;
import Model.LocalModel;
import Model.EventoModel;
import Model.EventoParticipanteModel;
import Model.ParticipanteModel;
import View.TelaAdicionarParticipantes;
import java.awt.Frame;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class TelaEventos extends javax.swing.JPanel {

    private int linhaEventos = -1;
    private ArrayList<ParticipanteModel> listaParticipantes = new ArrayList<>();
    private ArrayList<EventoModel> listaEventos = new ArrayList<>();
    
    public TelaEventos() {
        initComponents();
        InicializaTela();
        PreencherTabelaParticipantes();
        PreencherTabelaEvento();
        PreencherCBLocais();
        LimparCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnNovo = new javax.swing.JButton();
        jtxNome = new javax.swing.JTextField();
        jbtnSalvar = new javax.swing.JButton();
        jtxDescricao = new javax.swing.JTextField();
        jbtnExcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcbLocais = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableParticipantesDoEvento = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jbtnAdicionarParticipante = new javax.swing.JButton();
        jbtnRemoverParticipantes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEventos = new javax.swing.JTable();
        jtxDataInicio = new javax.swing.JFormattedTextField();
        jtxDataFinal = new javax.swing.JFormattedTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Eventos");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Data de Inicio:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Data de Fim:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Nome do Evento:");

        jbtnNovo.setText("Novo");
        jbtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNovoActionPerformed(evt);
            }
        });

        jtxNome.setColumns(10);

        jbtnSalvar.setText("Salvar");
        jbtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalvarActionPerformed(evt);
            }
        });

        jtxDescricao.setColumns(10);

        jbtnExcluir.setText("Excluir");
        jbtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExcluirActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Descrição do Evento:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Local do Evento:");

        jTableParticipantesDoEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Idade", "Telefone"
            }
        ));
        jTableParticipantesDoEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableParticipantesDoEventoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableParticipantesDoEvento);

        jLabel8.setText("Participantes do Evento");

        jbtnAdicionarParticipante.setText("Adicionar Participantes");
        jbtnAdicionarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdicionarParticipanteActionPerformed(evt);
            }
        });

        jbtnRemoverParticipantes.setText("Remover Selecionado");
        jbtnRemoverParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoverParticipantesActionPerformed(evt);
            }
        });

        jTableEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Local", "Início", "Fim", "id"
            }
        ));
        jTableEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEventosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableEventos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxDataFinal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbLocais, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxDataInicio))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(261, 261, 261))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnAdicionarParticipante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnRemoverParticipantes))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnAdicionarParticipante)
                            .addComponent(jbtnRemoverParticipantes)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnExcluir))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jtxDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jtxDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcbLocais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNovoActionPerformed
        jbtnNovo.setEnabled(false);
        jbtnSalvar.setEnabled(true);
        jbtnExcluir.setEnabled(false);
        jbtnAdicionarParticipante.setEnabled(true);
        jbtnRemoverParticipantes.setEnabled(false); 
        
        jtxNome.setEditable(true);
        jtxDescricao.setEditable(true);
        jtxDataInicio.setEditable(true);
        jtxDataFinal.setEditable(true);
        
        LimparCampos();
    }//GEN-LAST:event_jbtnNovoActionPerformed

    private void jTableEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEventosMouseClicked
        linhaEventos = jTableEventos.getSelectedRow();
        
        if(linhaEventos != -1){
            jtxNome.setText(jTableEventos.getValueAt(linhaEventos, 0).toString());
            jtxDescricao.setText(jTableEventos.getValueAt(linhaEventos, 1).toString());
            jcbLocais.setSelectedItem(jTableEventos.getValueAt(linhaEventos, 2).toString());
            jtxDataInicio.setText(jTableEventos.getValueAt(linhaEventos, 3).toString());
            jtxDataFinal.setText(jTableEventos.getValueAt(linhaEventos, 4).toString());            
            
            jbtnNovo.setEnabled(false);
            jbtnSalvar.setEnabled(true);
            jbtnExcluir.setEnabled(true);
            jbtnSalvar.setText("Salvar Edição");
            jbtnAdicionarParticipante.setEnabled(true);
            jbtnRemoverParticipantes.setEnabled(true);
            
            jtxDescricao.setEditable(true);
            jcbLocais.setEditable(true);
            jtxDataFinal.setEditable(true);
            jtxNome.setEditable(true);
            jtxDataInicio.setEditable(true);
            
            linhaEventos = -1;
        }
    }//GEN-LAST:event_jTableEventosMouseClicked

    private void jTableParticipantesDoEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableParticipantesDoEventoMouseClicked
        jbtnAdicionarParticipante.setEnabled(false);
        jbtnRemoverParticipantes.setEnabled(true);
        jbtnSalvar.setEnabled(true);
        jbtnExcluir.setEnabled(false);
        jbtnNovo.setEnabled(true);

        jtxNome.setEditable(false);
        jtxDescricao.setEditable(false);
        jcbLocais.setEditable(false);
        jtxDataInicio.setEditable(false);
        jtxDataFinal.setEditable(false);
    }//GEN-LAST:event_jTableParticipantesDoEventoMouseClicked

    private void jbtnRemoverParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoverParticipantesActionPerformed
        int linhaParticipante = jTableParticipantesDoEvento.getSelectedRow();
        int linhaEvento = jTableEventos.getSelectedRow();
        
        if (linhaEvento == -1 || linhaParticipante == -1){
            JOptionPane.showMessageDialog(this, "Selecione o Evento e o Participante.");
        }
        
        int idEvento = Integer.parseInt(jTableEventos.getValueAt(linhaEvento, 5).toString());
        String cpf = jTableParticipantesDoEvento.getValueAt(linhaParticipante, 1).toString();
        
        EventoParticipanteModel ep = new EventoParticipanteModel(idEvento,cpf);
        EventoParticipanteController epcontroller = new EventoParticipanteController();
        
        System.out.println("Tentando excluir participante com CPF: " + cpf + " do evento: " + idEvento);

        if(epcontroller.delete(ep)){
            JOptionPane.showMessageDialog(this, "Participante removido do evento com sucesso.");
            PreencherTabelaParticipantes();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir.");
        }
    }//GEN-LAST:event_jbtnRemoverParticipantesActionPerformed

    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
        int linhaSelecionada = jTableEventos.getSelectedRow();
        EventoModel evento = listaEventos.get(linhaSelecionada);
        EventoController controller = new EventoController();
        
        if(controller.delete(evento)){
            JOptionPane.showMessageDialog(this, "Evento excluido com sucesso");
            LimparCampos();
            InicializaTela();
            PreencherTabelaEvento();
            PreencherTabelaParticipantes();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir evento.");
        }
    }//GEN-LAST:event_jbtnExcluirActionPerformed

    private void jbtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalvarActionPerformed
        String nome = jtxNome.getText();
        String descricao = jtxDescricao.getText();
        LocalModel local = (LocalModel) jcbLocais.getSelectedItem();
        String dataInicio = jtxDataInicio.getText();
        String dataFinal = jtxDataFinal.getText();
        
        if( (nome.isEmpty()) || (descricao.isEmpty()) || (local == null) || (dataInicio.isEmpty()) || (dataFinal.isEmpty()) ){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
        }else{
            try{
                //Converter para localdateTime
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate inicio = LocalDate.parse(dataInicio, formatter);
                LocalDate fim = LocalDate.parse(dataFinal, formatter);
                
                //Model
                EventoModel evento = new EventoModel();
                evento.setNomeEvento(nome);
                evento.setDescricaoEvento(descricao);
                evento.setIdLocal(local.getIdLocal());
                evento.setDataInicio(inicio.atStartOfDay());
                evento.setDataFim(fim.atStartOfDay());
                
                //Controler
                EventoController controller = new EventoController();
                
                String inserirOuEditar = jbtnSalvar.getText();
                if(inserirOuEditar.equals("Salvar")){
                    if(controller.insert(evento)){
                        JOptionPane.showMessageDialog(this, "Salvo com sucesso.");
                    }else{
                        JOptionPane.showMessageDialog(this, "Erro ao salvar o participante.");
                    }
                }

                if(inserirOuEditar.equals("Salvar Edição")){
                    linhaEventos = jTableEventos.getSelectedRow();
                    if(linhaEventos != -1){
                        int idEventoSelecionado = Integer.parseInt(jTableEventos.getValueAt(linhaEventos, 5).toString());
                        evento.setIdEvento(idEventoSelecionado);
                    }
                    if(controller.update(evento)){
                        JOptionPane.showMessageDialog(this, "Editado com sucesso.");
                    }else{
                        JOptionPane.showMessageDialog(this, "Erro ao editar o participante.");
                    }
                    jbtnSalvar.setText("Salvar");
                }

                LimparCampos();
                InicializaTela();
                PreencherTabelaEvento();
                PreencherTabelaParticipantes();
                
            } catch(DateTimeParseException ex){
                JOptionPane.showMessageDialog(this, "Formato de data invalido");
            }
        }
    }//GEN-LAST:event_jbtnSalvarActionPerformed

    private void jbtnAdicionarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdicionarParticipanteActionPerformed
        TelaAdicionarParticipantes popup = new TelaAdicionarParticipantes((Frame) javax.swing.SwingUtilities.getWindowAncestor(this),true);
        popup.setVisible(true);
        ArrayList<ParticipanteModel> novosParticipantes = popup.getParticipantesSelecionados();
   
        if (novosParticipantes != null && !novosParticipantes.isEmpty()) {
            
            int linhaEvento = jTableEventos.getSelectedRow();
            int idEvento = Integer.parseInt(jTableEventos.getValueAt(linhaEvento, 5).toString());
            EventoParticipanteController epcontroller = new EventoParticipanteController();
            
            for(ParticipanteModel p:novosParticipantes){
                EventoParticipanteModel ep = new EventoParticipanteModel(idEvento, p.getCpf());
                
                if(epcontroller.select(ep) == null){
                    boolean sucesso = epcontroller.insert(ep);
                    
                    if(sucesso){
                        JOptionPane.showMessageDialog(this, "Participante Adicionado ao Evento com Sucesso");
                    }else{
                        JOptionPane.showMessageDialog(this, "Erro ao adicionar Participante ao Evento");
                    }
                }
            }
            PreencherTabelaParticipantes();
        }
    }//GEN-LAST:event_jbtnAdicionarParticipanteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEventos;
    private javax.swing.JTable jTableParticipantesDoEvento;
    private javax.swing.JButton jbtnAdicionarParticipante;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JButton jbtnNovo;
    private javax.swing.JButton jbtnRemoverParticipantes;
    private javax.swing.JButton jbtnSalvar;
    private javax.swing.JComboBox<LocalModel> jcbLocais;
    private javax.swing.JFormattedTextField jtxDataFinal;
    private javax.swing.JFormattedTextField jtxDataInicio;
    private javax.swing.JTextField jtxDescricao;
    private javax.swing.JTextField jtxNome;
    // End of variables declaration//GEN-END:variables

    private void InicializaTela() {
        jbtnNovo.setEnabled(true);
        jbtnSalvar.setEnabled(false);
        jbtnExcluir.setEnabled(false);
        jbtnAdicionarParticipante.setEnabled(false);
        jbtnRemoverParticipantes.setEnabled(false);
        
        jtxNome.setEditable(false);
        jtxDescricao.setEditable(false);
        jtxDataInicio.setEditable(false);
        jtxDataFinal.setEditable(false);
        
        jTableEventos.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                PreencherTabelaParticipantes();
            }
        });
        
        
        try {
            MaskFormatter dataMask = new MaskFormatter("##/##/####");
            dataMask.setPlaceholderCharacter('_');
            jtxDataFinal.setFormatterFactory(new DefaultFormatterFactory(dataMask));
            jtxDataFinal.setValue(null);
            jtxDataInicio.setFormatterFactory(new DefaultFormatterFactory(dataMask));
            jtxDataInicio.setValue(null);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    
    private void PreencherCBLocais(){
        LocalController controller = new LocalController();
        ArrayList<LocalModel> listaLocais = controller.selectAll();
        
        jcbLocais.removeAllItems();
        for(LocalModel local : listaLocais){
            jcbLocais.addItem(local);
        }
    }
    
    private void PreencherTabelaParticipantes() {
        
        //Recupera Participantes do Evento
        int linhaSelecionada = jTableEventos.getSelectedRow();
        
        if(linhaSelecionada == -1){
            System.out.println("Nenhum Participante cadastrado no evento");
            return;
        }
        
        EventoModel eventoSelecionado = listaEventos.get(linhaSelecionada);
        int idEvento = eventoSelecionado.getIdEvento();
        
        ArrayList<ParticipanteModel> listaTodosParticipantes = new ParticipanteController().selectAll();
        ArrayList<EventoParticipanteModel> relacoes = new EventoParticipanteController().selectAll();

        ArrayList<ParticipanteModel> listaParticipantesDoEvento = new ArrayList<>();

        for (EventoParticipanteModel ep : relacoes) {
            if (ep.getIdEvento() == idEvento) {
                for (ParticipanteModel p : listaTodosParticipantes) {
                    if (p.getCpf().equals(ep.getCpfParticipante())) {
                        listaParticipantesDoEvento.add(p);
                        break;
                    }
                }
            }
        }
        
        //Preenche a tabela Participantes do Evento
        DefaultTableModel modeloTabela = (DefaultTableModel) jTableParticipantesDoEvento.getModel();
        modeloTabela.setRowCount(0);

        if (listaParticipantesDoEvento.isEmpty()) {
            System.out.println( "Nenhum participante para este evento.");
        } else {
            for (ParticipanteModel p : listaParticipantesDoEvento) {
                modeloTabela.addRow(new String[]{
                    p.getNome(),
                    p.getCpf(),
                    String.valueOf(p.getIdade()),
                    p.getCelular()
                });
            }
        }
    }


    private void PreencherTabelaEvento() {
        EventoController controller = new EventoController();
        listaEventos = controller.selectAll();
        LocalController localcontroller = new LocalController();

        DefaultTableModel modeloTabela = (DefaultTableModel) jTableEventos.getModel();
        modeloTabela.setRowCount(0);

        if (listaEventos.isEmpty()) {
            System.out.println("Nenhum evento cadastrado.");
        } else {
            for (EventoModel l : listaEventos) {
                LocalModel local = localcontroller.selectById(l.getIdLocal());
                String nomeLocal = (local != null) ? local.getNomeLocal() : "Desconhecido";

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                modeloTabela.addRow(new String[]{
                    l.getNomeEvento(),
                    l.getDescricaoEvento(),
                    nomeLocal,
                    l.getDataInicio().format(formatter),
                    l.getDataFim().format(formatter),
                    String.valueOf(l.getIdEvento()) 
                });
            }
            jTableEventos.getColumnModel().getColumn(5).setMinWidth(0);
            jTableEventos.getColumnModel().getColumn(5).setMaxWidth(0);
            jTableEventos.getColumnModel().getColumn(5).setWidth(0);
        }
    }

    private void LimparCampos() {
        jtxNome.setText("");
        jtxDescricao.setText("");
        jcbLocais.setSelectedIndex(0);
    }
}
//socorro