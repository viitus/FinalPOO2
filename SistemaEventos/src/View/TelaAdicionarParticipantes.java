
package View;

import Controller.ParticipanteController;
import Model.ParticipanteModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class TelaAdicionarParticipantes extends java.awt.Dialog {

    private ArrayList<ParticipanteModel> listaParticipantes = new ArrayList<>();
    private ArrayList<ParticipanteModel> listaSelecionados = new ArrayList<>();
    
    public TelaAdicionarParticipantes(java.awt.Frame parent, boolean modal) {
        super(parent,  java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        initComponents();
        PreencherTabela();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableParticipantes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jbtnAdicionarParticipantes = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

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
        jScrollPane2.setViewportView(jTableParticipantes);

        jPanel2.add(jScrollPane2);

        add(jPanel2);

        jbtnAdicionarParticipantes.setText("Adicionar Participantes");
        jbtnAdicionarParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdicionarParticipantesActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAdicionarParticipantes);

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setToolTipText("");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCancelar);

        add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void jbtnAdicionarParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdicionarParticipantesActionPerformed
        int[] linhasSelecionadas = jTableParticipantes.getSelectedRows();
        listaSelecionados.clear();
        for(int linha:linhasSelecionadas){
            ParticipanteModel p = listaParticipantes.get(linha);
            listaSelecionados.add(p);
        }
        this.dispose();
    }//GEN-LAST:event_jbtnAdicionarParticipantesActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    
    // vai ser chamado no TelaEvento
    public ArrayList<ParticipanteModel> getParticipantesSelecionados(){
        return listaSelecionados;
    }
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaAdicionarParticipantes dialog = new TelaAdicionarParticipantes(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableParticipantes;
    private javax.swing.JButton jbtnAdicionarParticipantes;
    private javax.swing.JButton jbtnCancelar;
    // End of variables declaration//GEN-END:variables


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


}
