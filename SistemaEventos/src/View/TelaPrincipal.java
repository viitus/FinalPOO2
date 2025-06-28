package View;
 
public class TelaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaPrincipal.class.getName());

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        telaHome1 = new View.TelaHome();
        TelaPrincipal = new javax.swing.JTabbedPane();
        TelaHome = new View.TelaHome();
        TelaParticipantes = new View.TelaParticipantes();
        TelaEventos = new View.TelaEventos();
        TelaLocais = new View.TelaLocais();
        telaAtividades1 = new View.TelaAtividades();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TelaPrincipal.addTab("Home", TelaHome);
        TelaPrincipal.addTab("Participantes", TelaParticipantes);
        TelaPrincipal.addTab("Eventos", TelaEventos);
        TelaPrincipal.addTab("Locais", TelaLocais);
        TelaPrincipal.addTab("Atividades", telaAtividades1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.TelaEventos TelaEventos;
    private View.TelaHome TelaHome;
    private View.TelaLocais TelaLocais;
    private View.TelaParticipantes TelaParticipantes;
    private javax.swing.JTabbedPane TelaPrincipal;
    private javax.swing.Box.Filler filler1;
    private View.TelaAtividades telaAtividades1;
    private View.TelaHome telaHome1;
    // End of variables declaration//GEN-END:variables
}
