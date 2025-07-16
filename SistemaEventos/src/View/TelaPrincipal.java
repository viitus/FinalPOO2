package View;
 
public class TelaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaPrincipal.class.getName());

    private View.TelaHome telaHome;
    private View.TelaParticipantes telaParticipantes;
    private View.TelaEventos telaEventos;
    private View.TelaLocais telaLocais;
    private View.TelaAtividades telaAtividades;
    
    private boolean[] abasCarregadas = new boolean[5];
    
    public TelaPrincipal() {
        initComponents();

        abasCarregadas[0] = true;
        // Substitui os painéis reais por placeholders vazios
        for (int i = 1; i < TelaPrincipal.getTabCount(); i++) {
            TelaPrincipal.setComponentAt(i, new javax.swing.JPanel());
        }

        // Listener para carregar sob demanda
        TelaPrincipal.addChangeListener(e -> {
            int index = TelaPrincipal.getSelectedIndex();
            switch (index) {
                case 1 -> TelaPrincipal.setComponentAt(index, new View.TelaParticipantes());
                case 2 -> TelaPrincipal.setComponentAt(index, new View.TelaEventos());
                case 3 -> TelaPrincipal.setComponentAt(index, new View.TelaLocais());
                case 4 -> TelaPrincipal.setComponentAt(index, new View.TelaAtividades());
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaPrincipal = new javax.swing.JTabbedPane();
        TelaHome = new View.TelaHome();
        TelaParticipantes = new View.TelaParticipantes();
        TelaEventos = new View.TelaEventos();
        TelaLocais = new View.TelaLocais();
        telaAtividades1 = new View.TelaAtividades();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TelaHome.setPreferredSize(new java.awt.Dimension(1200, 1200));
        TelaPrincipal.addTab("Home", TelaHome);
        TelaPrincipal.addTab("Participantes", TelaParticipantes);
        TelaPrincipal.addTab("Eventos", TelaEventos);
        TelaPrincipal.addTab("Locais", TelaLocais);
        TelaPrincipal.addTab("Programação", telaAtividades1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE)
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
    private View.TelaAtividades telaAtividades1;
    // End of variables declaration//GEN-END:variables
}
