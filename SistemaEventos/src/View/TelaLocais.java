/* @author victo*/

package View;

import Model.LocalModel;
import Controller.LocalController;
import java.text.ParseException;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class TelaLocais extends javax.swing.JPanel {

    private int linha = -1;
    private ArrayList<LocalModel> listaLocais = new ArrayList<>();
            
    public TelaLocais() {
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
        jtxCapacidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxRua = new javax.swing.JTextField();
        jtxNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxNumero = new javax.swing.JTextField();
        jtxCidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbtnNovo = new javax.swing.JButton();
        jbtnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLocais = new javax.swing.JTable();
        jbtnExcluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtxCep = new javax.swing.JFormattedTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Locais");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Capacidade:");

        jtxCapacidade.setColumns(10);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Nome do Local:");

        jtxRua.setColumns(10);

        jtxNome.setColumns(10);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Rua:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Número:");

        jtxNumero.setColumns(10);

        jtxCidade.setColumns(10);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Cidade:");

        jbtnNovo.setText("Novo");
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

        jTableLocais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Rua", "Número", "Cidade", "CEP", "Capacidade", "id"
            }
        ));
        jTableLocais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLocaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLocais);

        jbtnExcluir.setText("Excluir");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("CEP:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtxCep, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxCapacidade)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jtxRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jtxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jtxCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jtxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnSalvar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnExcluir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jtxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jtxCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNovoActionPerformed
        jbtnNovo.setEnabled(false);
        jbtnSalvar.setEnabled(true);
        jbtnExcluir.setEnabled(false);
        jbtnSalvar.setText("Salvar");
        
        jtxCapacidade.setEditable(true);
        jtxCep.setEditable(true);
        jtxCidade.setEditable(true);
        jtxNome.setEditable(true);
        jtxNumero.setEditable(true);
        jtxRua.setEditable(true);
        
        LimparCampos();
    }//GEN-LAST:event_jbtnNovoActionPerformed

    private void jTableLocaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLocaisMouseClicked
        linha = jTableLocais.getSelectedRow();
        
        if(linha != -1){
            jtxNome.setText(jTableLocais.getValueAt(linha, 0).toString());
            jtxRua.setText(jTableLocais.getValueAt(linha, 1).toString());
            jtxNumero.setText(jTableLocais.getValueAt(linha, 2).toString());
            jtxCidade.setText(jTableLocais.getValueAt(linha, 3).toString());
            jtxCep.setText(jTableLocais.getValueAt(linha, 4).toString());            
            jtxCapacidade.setText(jTableLocais.getValueAt(linha, 5).toString());
            
            jbtnNovo.setEnabled(false);
            jbtnSalvar.setEnabled(true);
            jbtnExcluir.setEnabled(true);
            jbtnSalvar.setText("Salvar Edição");
            
            jtxCapacidade.setEditable(true);
            jtxCep.setEditable(true);
            jtxCidade.setEditable(true);
            jtxNome.setEditable(true);
            jtxNumero.setEditable(true);
            jtxRua.setEditable(true);
            
            linha = -1;
        }
    }//GEN-LAST:event_jTableLocaisMouseClicked

  
    
    private void jbtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalvarActionPerformed
        String nome = jtxNome.getText();
        String cidade = jtxCidade.getText();
        String cep = jtxCep.getText();
        String capacidadeStr = jtxCapacidade.getText();
        String rua = jtxRua.getText();
        String numero = jtxNumero.getText();
        
        if( (nome.isEmpty()) || (cidade.isEmpty()) || (cep.isEmpty()) || (capacidadeStr.isEmpty()) || (rua.isEmpty()) || (numero.isEmpty()) ){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
        }else{
            int capacidade = Integer.parseInt(capacidadeStr);
            //Model
            LocalModel local = new LocalModel();
            local.setNomeLocal(nome);
            local.setCidadeEndereco(cidade);
            local.setCepEndereco(cep);
            local.setCapacidade(capacidade);
            local.setRuaEndereco(rua);
            local.setNumEndereco(numero);
            //Controler
            LocalController controller = new LocalController();
            String inserirOuEditar = jbtnSalvar.getText();
            
            if(inserirOuEditar.equals("Salvar")){
                if(controller.insert(local)){
                    JOptionPane.showMessageDialog(this, "Salvo com sucesso.");
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao salvar o participante.");
                }
            }
            
            if(inserirOuEditar.equals("Salvar Edição")){
                linha = jTableLocais.getSelectedRow();
                int idLocalSelecionado = Integer.parseInt(jTableLocais.getValueAt(linha,6).toString());
                local.setIdLocal(idLocalSelecionado);
                if(controller.update(local)){
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
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLocais;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JButton jbtnNovo;
    private javax.swing.JButton jbtnSalvar;
    private javax.swing.JTextField jtxCapacidade;
    private javax.swing.JFormattedTextField jtxCep;
    private javax.swing.JTextField jtxCidade;
    private javax.swing.JTextField jtxNome;
    private javax.swing.JTextField jtxNumero;
    private javax.swing.JTextField jtxRua;
    // End of variables declaration//GEN-END:variables

    private void InicializaTela() {
        jbtnNovo.setEnabled(true);
        jbtnSalvar.setEnabled(false);
        jbtnExcluir.setEnabled(false);
        jbtnSalvar.setText("Salvar");
        
        jtxCapacidade.setEditable(false);
        jtxCep.setEditable(false);
        jtxCidade.setEditable(false);
        jtxNome.setEditable(false);
        jtxNumero.setEditable(false);
        jtxRua.setEditable(false);
        
        
        try {
            MaskFormatter cepMask = new MaskFormatter("#####-###");
            cepMask.setPlaceholderCharacter('_');
            jtxCep.setFormatterFactory(new DefaultFormatterFactory(cepMask));
            jtxCep.setValue(null);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        
    }

    private void LimparCampos() {
        jtxCapacidade.setText("");
        jtxCep.setText("");
        jtxCidade.setText("");
        jtxNome.setText("");
        jtxNumero.setText("");
        jtxRua.setText("");
    }

 
    
    private void PreencherTabela() {
        LocalController controller = new LocalController();
        listaLocais = controller.selectAll();
        
        DefaultTableModel modeloTabela = (DefaultTableModel)jTableLocais.getModel();
        modeloTabela.setRowCount(0);
        
        if(listaLocais.isEmpty()){
            System.out.println("Nenhum local cadastrado.");
        }else{
            for(LocalModel l:listaLocais){
                modeloTabela.addRow(new String[]{
                    l.getNomeLocal(),
                    l.getRuaEndereco(),
                    l.getNumEndereco(),
                    l.getCidadeEndereco(),
                    l.getCepEndereco(),
                    String.valueOf(l.getCapacidade()),
                    String.valueOf(l.getIdLocal())
                });
            }
            jTableLocais.getColumnModel().getColumn(6).setMinWidth(0);
            jTableLocais.getColumnModel().getColumn(6).setMaxWidth(0);
            jTableLocais.getColumnModel().getColumn(6).setWidth(0);
        }
    }

  
}


