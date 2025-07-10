/* @author victo*/

package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Model.ParticipanteModel;
import Controller.ParticipanteController;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class TelaParticipantes extends javax.swing.JPanel {

    private int linha = -1;
    private ArrayList<ParticipanteModel> listaParticipantes = new ArrayList<>();
    
    public TelaParticipantes() {
        initComponents();
        InicializaTela();
        LimparCampos();
        PreencherTabela();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxIdade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbtnNovo = new javax.swing.JButton();
        jbtnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableParticipantes = new javax.swing.JTable();
        jbtnSalvar = new javax.swing.JButton();
        jftxCpf = new javax.swing.JFormattedTextField();
        jftxTelefone = new javax.swing.JFormattedTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Participantes");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Nome:");

        jtxNome.setColumns(10);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("CPF:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Idade:");

        jtxIdade.setColumns(10);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Telefone:");

        jbtnNovo.setText("Novo");
        jbtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNovoActionPerformed(evt);
            }
        });

        jbtnExcluir.setText("Excluir");
        jbtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExcluirActionPerformed(evt);
            }
        });

        jTableParticipantes.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableParticipantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableParticipantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableParticipantes);

        jbtnSalvar.setText("Salvar");
        jbtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalvarActionPerformed(evt);
            }
        });

        try {
            jftxCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("\"###.###.###-##\"")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxCpf.setToolTipText("");

        try {
            jftxTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxIdade)
                            .addComponent(jtxNome)
                            .addComponent(jftxCpf)
                            .addComponent(jftxTelefone))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jftxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jftxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnExcluir)
                        .addGap(33, 33, 33)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void LimparCampos(){
        jtxNome.setText("");
        jftxCpf.setValue(null);
        jtxIdade.setText("");
        jftxTelefone.setValue(null);
    }
    
    
    private void jbtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNovoActionPerformed
        jbtnNovo.setEnabled(false);
        jbtnExcluir.setEnabled(false);
        jbtnSalvar.setEnabled(true);
        jbtnSalvar.setText("Salvar");
        
        jftxCpf.setEditable(true);
        jtxIdade.setEditable(true);
        jtxNome.setEditable(true);
        jftxTelefone.setEditable(true);
        
        LimparCampos();
    }//GEN-LAST:event_jbtnNovoActionPerformed

    
    private void jTableParticipantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableParticipantesMouseClicked
        linha = jTableParticipantes.getSelectedRow();
        
        if(linha != -1){
            jtxNome.setText(jTableParticipantes.getValueAt(linha, 0).toString());
            jftxCpf.setText(jTableParticipantes.getValueAt(linha, 1).toString()); 
            jtxIdade.setText(jTableParticipantes.getValueAt(linha, 2).toString());
            jftxTelefone.setText(jTableParticipantes.getValueAt(linha, 3).toString());
            
            jbtnNovo.setEnabled(false);
            jbtnExcluir.setEnabled(true);
            jbtnSalvar.setEnabled(true);
            jbtnSalvar.setText("Salvar Edição");

            jftxCpf.setEditable(false);
            jtxIdade.setEditable(true);
            jtxNome.setEditable(true);
            jftxTelefone.setEditable(true);
            
            linha = -1;
        }
    }//GEN-LAST:event_jTableParticipantesMouseClicked

   
    
    
    private void jbtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalvarActionPerformed
        String nome = jtxNome.getText();
        String cpf = jftxCpf.getText();
        String idadeStr = jtxIdade.getText();
        String telefone = jftxTelefone.getText();
        
        if( (nome.isEmpty()) || (cpf.isEmpty()) || (idadeStr.isEmpty()) || (telefone.isEmpty()) ){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
        }else{
            int idade = Integer.parseInt(idadeStr);
            //Model
            ParticipanteModel participante = new ParticipanteModel();
            participante.setNome(nome);
            participante.setCpf(cpf);
            participante.setIdade(idade);
            participante.setCelular(telefone);
            //Controler
            ParticipanteController controller = new ParticipanteController();
            
            String inserirOuEditar = jbtnSalvar.getText();
            if(inserirOuEditar.equals("Salvar")){
                if(controller.insert(participante)){
                    JOptionPane.showMessageDialog(this, "Salvo com sucesso.");
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao salvar o participante.");
                }
            }
            
            if(inserirOuEditar.equals("Salvar Edição")){
                if(controller.update(participante)){
                    JOptionPane.showMessageDialog(this, "Editado com sucesso.");
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao editar o participante.");
                }
            }
                    
            LimparCampos();
            InicializaTela();
            PreencherTabela();
        }
    }//GEN-LAST:event_jbtnSalvarActionPerformed

    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
        int linhaSelecionada = jTableParticipantes.getSelectedRow();
        ParticipanteModel participante = listaParticipantes.get(linhaSelecionada);
        ParticipanteController controller = new ParticipanteController();
        
        if(controller.delete(participante)){
            JOptionPane.showMessageDialog(this, "Excluido com sucesso");
            LimparCampos();
            InicializaTela();
            PreencherTabela();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir");
        }
    }//GEN-LAST:event_jbtnExcluirActionPerformed

    
    private void PreencherTabela(){
        ParticipanteController controller = new ParticipanteController();
        listaParticipantes = controller.selectAll();
        
        DefaultTableModel modeloTabela = (DefaultTableModel)jTableParticipantes.getModel();
        modeloTabela.setRowCount(0);
        
        if(listaParticipantes.isEmpty()){
            System.out.println("Nenhum participante cadastrado.");
        }else{
            for(ParticipanteModel p:listaParticipantes){
                modeloTabela.addRow(new String[]{
                    p.getNome(),
                    p.getCpf(),
                    String.valueOf(p.getIdade()),
                    p.getCelular()
                });
            }
        }
    }
    


    public void InicializaTela(){
        jbtnNovo.setEnabled(true);
        jbtnExcluir.setEnabled(false);
        jbtnSalvar.setEnabled(false);
        jbtnSalvar.setText("Salvar");
        
        jftxCpf.setEditable(false);
        jtxIdade.setEditable(false);
        jtxNome.setEditable(false);
        jftxTelefone.setEditable(false);
        
       
        try {
            MaskFormatter cpfMask = new MaskFormatter("###.###.###-##");
            cpfMask.setPlaceholderCharacter('_');
            jftxCpf.setFormatterFactory(new DefaultFormatterFactory(cpfMask));
            jftxCpf.setValue(null);
            
            MaskFormatter telefoneMask = new MaskFormatter("(##) #####-####");
            telefoneMask.setPlaceholderCharacter('_');
            jftxTelefone.setFormatterFactory(new DefaultFormatterFactory(telefoneMask));
            jftxTelefone.setValue(null);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableParticipantes;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JButton jbtnNovo;
    private javax.swing.JButton jbtnSalvar;
    private javax.swing.JFormattedTextField jftxCpf;
    private javax.swing.JFormattedTextField jftxTelefone;
    private javax.swing.JTextField jtxIdade;
    private javax.swing.JTextField jtxNome;
    // End of variables declaration//GEN-END:variables
}
