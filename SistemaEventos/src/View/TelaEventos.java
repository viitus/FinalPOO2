/*@author victo */

package View;

import Controller.EventoController;
import Controller.ParticipanteController;
import Controller.LocalController;
import Model.LocalModel;
import Model.EventoModel;
import Model.ParticipanteModel;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        jtxDataInicio = new javax.swing.JTextField();
        jtxDataFinal = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Eventos");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Data de Inicio:");

        jtxDataInicio.setColumns(10);

        jtxDataFinal.setColumns(10);

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

        jbtnRemoverParticipantes.setText("Remover Selecionado");
        jbtnRemoverParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoverParticipantesActionPerformed(evt);
            }
        });

        jTableEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Local", "Início", "Fim"
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbLocais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxDataFinal)
                            .addComponent(jtxDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxDescricao)
                            .addComponent(jtxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                    .addComponent(jtxDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
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
    }//GEN-LAST:event_jbtnNovoActionPerformed

    private void jTableEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEventosMouseClicked
        linhaEventos = jTableEventos.getSelectedRow();
        
        if(linhaEventos != -1){
            jtxNome.setText(jTableEventos.getValueAt(linhaEventos, 0).toString());
            jtxDescricao.setText(jTableEventos.getValueAt(linhaEventos, 1).toString());
            jcbLocais.setSelectedItem(jTableEventos.getValueAt(linhaEventos, 2).toString());
            jtxDataInicio.setText(jTableEventos.getValueAt(linhaEventos, 3).toString());
            jtxDataFinal.setText(jTableEventos.getValueAt(linhaEventos, 4).toString());            
            
            jbtnNovo.setEnabled(true);
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
        int linhaSelecionada = jTableParticipantesDoEvento.getSelectedRow();
        ParticipanteModel participante = listaParticipantes.get(linhaSelecionada);
        EventoController controller = new EventoController();
        
        if(controller.RemoverParticipante(participante)){
            JOptionPane.showMessageDialog(this, "Excluido com sucesso.");
            PreencherTabelaParticipantes();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir.");
        }
    }//GEN-LAST:event_jbtnRemoverParticipantesActionPerformed

    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
        int linhaSelecionada = jTableEventos.getSelectedRow();
        EventoModel evento = listaEventos.get(linhaSelecionada);
        EventoController controller = new EventoController();
        
        if(controller.excluir(evento)){
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
        String local = jcbLocais.getSelectedItem().toString();
        String dataInicio = jtxDataInicio.getText();
        String dataFinal = jtxDataFinal.getText();
        
        if( (nome.isEmpty()) || (descricao.isEmpty()) || (local.isEmpty()) || (dataInicio.isEmpty()) || (dataFinal.isEmpty()) ){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
        }else{
            //Model
            EventoModel evento = new EventoModel();
            evento.setNome(nome);
            evento.setDescricao(descricao);
            evento.setLocal(local);
            evento.setDataInicio(dataInicio);
            evento.setDataFinal(dataFinal);
            //Controler
            EventoController controller = new EventoController();
            
            String inserirOuEditar = jbtnSalvar.getText();
            if(inserirOuEditar.equals("Salvar")){
                if(controller.inserir(evento)){
                    JOptionPane.showMessageDialog(this, "Salvo com sucesso.");
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao salvar o participante.");
                }
            }
            
            if(inserirOuEditar.equals("Salvar Edição")){
                if(controller.editar(evento)){
                    JOptionPane.showMessageDialog(this, "Editado com sucesso.");
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao editar o participante.");
                }
            }
                    
            LimparCampos();
            InicializaTela();
            PreencherTabelaEvento();
            PreencherTabelaParticipantes();
        }
    }//GEN-LAST:event_jbtnSalvarActionPerformed


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
    private javax.swing.JComboBox<String> jcbLocais;
    private javax.swing.JTextField jtxDataFinal;
    private javax.swing.JTextField jtxDataInicio;
    private javax.swing.JTextField jtxDescricao;
    private javax.swing.JTextField jtxNome;
    // End of variables declaration//GEN-END:variables

    private void InicializaTela() {
        jbtnNovo.setEnabled(true);
        jbtnSalvar.setEnabled(false);
        jbtnExcluir.setEnabled(false);
        jbtnAdicionarParticipante.setEnabled(false);
        jbtnRemoverParticipantes.setEnabled(false);
    }

    // ADICIONAR AO LOCAL CONTROLER O METODO public String toString(){ return this.nome;}
    private void PreencherCBLocais(){
        LocalController controller = new LocalController();
        ArrayList<LocalModel> listaLocais = controller.selecionarTodos();
        
        jcbLocais.removeAllItems();
        for(LocalModel local : listaLocais){
            jcbLocais.addItem(local);
        }
        
    }
    
    private void PreencherTabelaParticipantes() {
        
        if (linhaEventos == -1){
            // Nenhum evento selecionado
            return;
        }
        ParticipanteController controller = new ParticipanteController();
        listaParticipantes = controller.selecionarPorEvento(linhaEventos);
        
        DefaultTableModel modeloTabela = (DefaultTableModel)jTableParticipantesDoEvento.getModel();
        modeloTabela.setRowCount(0);
        
        if(listaParticipantes.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum evento cadastrado.");
        }else{
            for(ParticipanteModel l:listaParticipantes){
                modeloTabela.addRow(new String[]{
                    l.getNome(),
                    l.getCpf(),
                    l.getIdade(),
                    l.getTelefone()
                });
            }
        }
    }

    private void PreencherTabelaEvento() {
        EventoController controller = new EventoController();
        listaEventos = controller.selecionarTodos();
        
        DefaultTableModel modeloTabela = (DefaultTableModel)jTableEventos.getModel();
        modeloTabela.setRowCount(0);
        
        if(listaEventos.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum evento cadastrado.");
        }else{
            for(EventoModel l:listaEventos){
                modeloTabela.addRow(new String[]{
                    l.getNome(),
                    l.getDescricao(),
                    l.getLocal(),
                    l.getInicio(),
                    l.getFim()
                });
            }
        }
    }

    private void LimparCampos() {
        jtxNome.setText("");
        jtxDescricao.setText("");
        jtxDataInicio.setText("");
        jtxDataFinal.setText("");
        jcbLocais.setSelectedIndex(0);
    }
}


/* Lembretes
Verificar se os atributos sao String int etc e corrgir os metodos 
Adicionar mask aos termos que nescessitam
verificar se os metodos chamados ao controller estao funcionando
*/