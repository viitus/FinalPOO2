/*@author victo*/

package View;

import Controller.AtividadeController;
import Controller.EventoController;
import Model.EventoModel;
import Model.AtividadeModel;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class TelaAtividades extends javax.swing.JPanel {

    private ArrayList<AtividadeModel> listaAtividades = new ArrayList<>();
    private int linhaAtividade = -1;
    
    public TelaAtividades() {
        initComponents();
        InicializaTela();
        LimparCampos();
        jcbEventos.addActionListener(e -> PreencherTabelaAtividades());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxTipo = new javax.swing.JTextField();
        jtxTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbtnNovo = new javax.swing.JButton();
        jbtnSalvar = new javax.swing.JButton();
        jbtnExcluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbEventos = new javax.swing.JComboBox<>();
        jtxHoraInicio = new javax.swing.JFormattedTextField();
        jtxHoraFim = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAtividades = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Programação do Evento");

        jtxTipo.setColumns(20);

        jtxTitulo.setColumns(20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Título da Atividade:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Horário de Início:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Horário de Término:");

        jbtnNovo.setText("Nova Atividade");
        jbtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNovoActionPerformed(evt);
            }
        });

        jbtnSalvar.setText("Salvar");
        jbtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalvarActionPerformed(evt);
            }
        });

        jbtnExcluir.setText("Excluir");
        jbtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExcluirActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Tipo de Atividade:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Evento:");

        jtxHoraInicio.setColumns(20);

        jtxHoraFim.setColumns(20);

        jTableAtividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Título", "Hora Início", "Hora Fim", "id"
            }
        ));
        jTableAtividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAtividadesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableAtividades);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtxHoraInicio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxTipo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbEventos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxHoraFim))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jcbEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jtxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jtxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5))
                            .addComponent(jtxHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtxHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jbtnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnExcluir)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNovoActionPerformed

        // Mostra componentes
        jcbEventos.setVisible(true);
        jScrollPane2.setVisible(true);

        // Configura botões
        jbtnNovo.setEnabled(false);
        jbtnSalvar.setEnabled(true);
        jbtnExcluir.setEnabled(true);

        // Ativa campos
        jtxTipo.setEditable(true);
        jtxTitulo.setEditable(true);
        jtxHoraInicio.setEditable(true);
        jtxHoraFim.setEditable(true);

        // Força a atualização da máscara
        jtxHoraInicio.setValue("  :  ");
        jtxHoraInicio.setValue(null);
        jtxHoraFim.setValue("  :  ");
        jtxHoraFim.setValue(null);
        // Foco no primeiro campo
        jtxTipo.requestFocus();
    }//GEN-LAST:event_jbtnNovoActionPerformed

    private void jbtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalvarActionPerformed
        // Validação básica
        if (jtxTipo.getText().isEmpty() || jtxTitulo.getText().isEmpty() || 
            jtxHoraInicio.getText().isEmpty() || jtxHoraFim.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos");
            return;
        }

        EventoModel evento = (EventoModel) jcbEventos.getSelectedItem();
        if (evento == null) {
            JOptionPane.showMessageDialog(this, "Selecione um evento");
            return;
        }

        try {
            // Valida formato das horas
            if (!jtxHoraInicio.getText().matches("\\d{2}:\\d{2}") || 
                !jtxHoraFim.getText().matches("\\d{2}:\\d{2}")) {
                JOptionPane.showMessageDialog(this, "Formato de hora inválido (use HH:mm)");
                return;
            }

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime inicio = LocalTime.parse(jtxHoraInicio.getText(), formatter);
            LocalTime fim = LocalTime.parse(jtxHoraFim.getText(), formatter);

            if (fim.isBefore(inicio)) {
                JOptionPane.showMessageDialog(this, "Horário de término deve ser após o início");
                return;
            }

            // Cria objeto atividade
            AtividadeModel atividade = new AtividadeModel();
            atividade.setTipoAtividade(jtxTipo.getText());
            atividade.setTituloAtividade(jtxTitulo.getText());
            atividade.setHoraInicio(LocalDateTime.of(LocalDate.now(), inicio));
            atividade.setHoraFim(LocalDateTime.of(LocalDate.now(), fim));
            atividade.setIdEvento(evento.getIdEvento());

            AtividadeController controller = new AtividadeController();

            // Verifica se é inserção ou edição
            if (jbtnSalvar.getText().equals("Salvar")) {
                if (controller.insert(atividade)) {
                    JOptionPane.showMessageDialog(this, "Atividade salva com sucesso");
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar atividade");
                }
            } else {
                int linha = jTableAtividades.getSelectedRow();
                if (linha != -1) {
                    atividade.setIdAtividade((Integer) jTableAtividades.getValueAt(linha, 4));
                    if (controller.update(atividade)) {
                        JOptionPane.showMessageDialog(this, "Atividade atualizada com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao atualizar atividade");
                    }
                }
            }

            // Atualiza interface
            LimparCampos();
            InicializaTela();
            PreencherTabelaAtividades();
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "Formato de hora inválido");
        }

    }//GEN-LAST:event_jbtnSalvarActionPerformed

    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
        int linha = jTableAtividades.getSelectedRow();
        AtividadeModel atividade = listaAtividades.get(linha);
        AtividadeController controller = new AtividadeController();
        
        if(controller.delete(atividade)){
            JOptionPane.showMessageDialog(this, "AtividadeExcluida com sucesso");
            LimparCampos();
            PreencherTabelaAtividades();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao exluir atividade");
        }
    }//GEN-LAST:event_jbtnExcluirActionPerformed

    private void jTableAtividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAtividadesMouseClicked
        
        int linha = jTableAtividades.getSelectedRow();
        
        if(linha != -1){
            jtxTipo.setText(jTableAtividades.getValueAt(linha, 0).toString());
            jtxTitulo.setText(jTableAtividades.getValueAt(linha, 1).toString());
            jtxHoraInicio.setText(jTableAtividades.getValueAt(linha, 2).toString());
            jtxHoraFim.setText(jTableAtividades.getValueAt(linha, 3).toString());            
            
            jbtnNovo.setEnabled(false);
            jbtnSalvar.setEnabled(true);
            jbtnExcluir.setEnabled(true);
            jbtnSalvar.setText("Salvar Edição");
            
            jtxTipo.setEditable(true);
            jtxTitulo.setEditable(true);
            jtxHoraInicio.setEditable(true);
            jtxHoraFim.setEditable(true);
            
            linha = -1;
        }
    }//GEN-LAST:event_jTableAtividadesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAtividades;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JButton jbtnNovo;
    private javax.swing.JButton jbtnSalvar;
    private javax.swing.JComboBox<EventoModel> jcbEventos;
    private javax.swing.JFormattedTextField jtxHoraFim;
    private javax.swing.JFormattedTextField jtxHoraInicio;
    private javax.swing.JTextField jtxTipo;
    private javax.swing.JTextField jtxTitulo;
    // End of variables declaration//GEN-END:variables

    
    public void PreencherCBEventos(){
        EventoController controller = new EventoController();
        ArrayList<EventoModel> listaEventos = controller.selectAll();
        
        jcbEventos.removeAllItems();
        jcbEventos.addItem(new EventoModel(0,"--Selecione um Evento--","",null,null,0,0));
        for(EventoModel evento : listaEventos){
            jcbEventos.addItem(evento);
        }
        jcbEventos.setSelectedIndex(0);
    }
    
    private void InicializaTela() {
        jbtnNovo.setEnabled(true);
        jbtnSalvar.setEnabled(false);
        jbtnExcluir.setEnabled(false);

        DefaultTableModel modelo = (DefaultTableModel) jTableAtividades.getModel();
        modelo.setRowCount(0); 

        jTableAtividades.getColumnModel().getColumn(4).setMinWidth(0);
        jTableAtividades.getColumnModel().getColumn(4).setMaxWidth(0);
        jTableAtividades.getColumnModel().getColumn(4).setWidth(0);

        // Configura máscaras para os campos de hora
        try {
            MaskFormatter mascaraHora = new MaskFormatter("##:##");
            mascaraHora.setPlaceholderCharacter('_');

            jtxHoraInicio.setFormatterFactory(new DefaultFormatterFactory(mascaraHora));
            jtxHoraFim.setFormatterFactory(new DefaultFormatterFactory(mascaraHora));

            // Força a atualização da máscara
            jtxHoraInicio.setValue("  :  ");
            jtxHoraInicio.setValue(null);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Erro ao configurar máscaras de horário");
        }

        // Configura campos
        jtxTipo.setEditable(false);
        jtxTitulo.setEditable(false);
        jtxHoraInicio.setEditable(false);
        jtxHoraFim.setEditable(false);

        // Preenche ComboBox
        PreencherCBEventos();
    }
    
    
    
    
    private void PreencherTabelaAtividades() {
        EventoModel eventoSelecionado = (EventoModel) jcbEventos.getSelectedItem();
        if (eventoSelecionado == null) {
            return;
        }

        AtividadeController controller = new AtividadeController();
        listaAtividades = controller.selectAll();

        DefaultTableModel modelo = (DefaultTableModel) jTableAtividades.getModel();
        modelo.setRowCount(0); // Limpa a tabela

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        boolean encontrou = false;

        for (AtividadeModel atividade : listaAtividades) {
            if (atividade.getIdEvento() == eventoSelecionado.getIdEvento()) {
                String horaInicio = atividade.getHoraInicio() != null ? 
                    atividade.getHoraInicio().format(formatter) : "";
                String horaFim = atividade.getHoraFim() != null ? 
                    atividade.getHoraFim().format(formatter) : "";

                modelo.addRow(new Object[]{
                    atividade.getTipoAtividade(),
                    atividade.getTituloAtividade(),
                    horaInicio,
                    horaFim,
                    atividade.getIdAtividade()
                });
                encontrou = true;
            }
        }

        jTableAtividades.getColumnModel().getColumn(4).setMinWidth(0);
        jTableAtividades.getColumnModel().getColumn(4).setMaxWidth(0);
        jTableAtividades.getColumnModel().getColumn(4).setWidth(0);
        
        if (!encontrou) {
            JOptionPane.showMessageDialog(this, "Nenhuma atividade encontrada para este evento");
        }
    }

    
    
    
    private void LimparCampos() {
        jtxTipo.setText("");
        jtxTitulo.setText("");
        jtxHoraInicio.setText("");
        jtxHoraFim.setText(""); 
    }
}
