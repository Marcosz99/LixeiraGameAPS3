package JogoApresentacao;

import JogoModelo.Residuo;
import JogoApresentacao.TelaJogo;

public class TelaInicial extends javax.swing.JFrame
{
    public TelaInicial()
    {
        initComponents();
        telaInicialConfig();
    }

    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        btnComoJogar = new javax.swing.JButton();
        btnJogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setBackground(getBackground());
        setIconImages(null);

        btnComoJogar.setBackground(new java.awt.Color(230, 0, 0));
        btnComoJogar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnComoJogar.setText("Como Jogar");
        btnComoJogar.setAlignmentY(0.0F);
        btnComoJogar.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        btnComoJogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComoJogar.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btnComoJogar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnComoJogarActionPerformed(evt);
            }
        });

        btnJogar.setBackground(new java.awt.Color(255, 0, 0));
        btnJogar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        btnJogar.setText("Jogar");
        btnJogar.setAlignmentY(0.0F);
        btnJogar.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        btnJogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJogar.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btnJogar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnJogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnComoJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(btnJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComoJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void telaInicialConfig(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }   
    private void btnComoJogarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnComoJogarActionPerformed
    {//GEN-HEADEREND:event_btnComoJogarActionPerformed
        TelaComoJogar telaComoJogar = new TelaComoJogar();
        telaComoJogar.setVisible(true);
        telaComoJogar.ajusteTelaComoJogar();
        setDefaultCloseOperation(telaComoJogar.EXIT_ON_CLOSE);
        telaComoJogar.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnComoJogarActionPerformed

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnJogarActionPerformed
    {//GEN-HEADEREND:event_btnJogarActionPerformed
        TelaJogo telaJogo = new TelaJogo();
        telaJogo.ajusteNecessario();
        telaJogo.setVisible(true);
        setDefaultCloseOperation(telaJogo.EXIT_ON_CLOSE);
        telaJogo.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnJogarActionPerformed

    public static void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComoJogar;
    private javax.swing.JButton btnJogar;
    // End of variables declaration//GEN-END:variables
}
