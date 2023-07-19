package JogoApresentacao;

import javax.swing.JFrame;
import javax.swing.SwingConstants;


public class TelaComoJogar extends javax.swing.JFrame
{

    public TelaComoJogar()
    {
        initComponents();
        Informativo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        TelaComoJogar2 = new javax.swing.JFrame();
        btnVoltar2 = new javax.swing.JButton();
        btnProximo2 = new javax.swing.JButton();
        lblInformativo2 = new javax.swing.JLabel();
        lblLixeiraPlasticoIMG = new javax.swing.JLabel();
        lblLixeiraPapelIMG = new javax.swing.JLabel();
        lblLixeiraMetalIMG = new javax.swing.JLabel();
        lblLixeiraVidroIMG = new javax.swing.JLabel();
        lblLixeiraOrganicoIMG = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        lblInterrogacaoIMG = new javax.swing.JLabel();
        lblInterrogacaoPapelIMG = new javax.swing.JLabel();
        lblInterrogacaoBlurIMG = new javax.swing.JLabel();
        lblInformativo = new javax.swing.JLabel();

        TelaComoJogar2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        TelaComoJogar2.setTitle("Como Jogar!");
        TelaComoJogar2.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        TelaComoJogar2.setMinimumSize(new java.awt.Dimension(530, 420));

        btnVoltar2.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnVoltar2.setText("Voltar");
        btnVoltar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnVoltar2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVoltar2ActionPerformed(evt);
            }
        });

        btnProximo2.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnProximo2.setText("Próximo");
        btnProximo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnProximo2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnProximo2ActionPerformed(evt);
            }
        });

        lblInformativo2.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblInformativo2.setText("jLabel1");
        lblInformativo2.setAlignmentY(0.0F);
        lblInformativo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblInformativo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblLixeiraPlasticoIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Marcos\\Desktop\\APS3\\APS3\\src\\JogoApresentacao\\imagenssAPS\\lixeiraPlasticoIMG.png")); // NOI18N

        lblLixeiraPapelIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Marcos\\Desktop\\APS3\\APS3\\src\\JogoApresentacao\\imagenssAPS\\lixeiraPapelIMG.png")); // NOI18N

        lblLixeiraMetalIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Marcos\\Desktop\\APS3\\APS3\\src\\JogoApresentacao\\imagenssAPS\\lixeiraMetalIMG.png")); // NOI18N

        lblLixeiraVidroIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Marcos\\Desktop\\APS3\\APS3\\src\\JogoApresentacao\\imagenssAPS\\lixeiraVidroIMG.png")); // NOI18N

        lblLixeiraOrganicoIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Marcos\\Desktop\\APS3\\APS3\\src\\JogoApresentacao\\imagenssAPS\\lixeiraOrganicoIMG.png")); // NOI18N

        javax.swing.GroupLayout TelaComoJogar2Layout = new javax.swing.GroupLayout(TelaComoJogar2.getContentPane());
        TelaComoJogar2.getContentPane().setLayout(TelaComoJogar2Layout);
        TelaComoJogar2Layout.setHorizontalGroup(
            TelaComoJogar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaComoJogar2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(TelaComoJogar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaComoJogar2Layout.createSequentialGroup()
                        .addComponent(btnVoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProximo2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaComoJogar2Layout.createSequentialGroup()
                        .addGroup(TelaComoJogar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaComoJogar2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblLixeiraPlasticoIMG)
                                .addGap(18, 18, 18)
                                .addComponent(lblLixeiraPapelIMG)
                                .addGap(18, 18, 18)
                                .addComponent(lblLixeiraMetalIMG)
                                .addGap(30, 30, 30)
                                .addComponent(lblLixeiraVidroIMG)
                                .addGap(18, 18, 18)
                                .addComponent(lblLixeiraOrganicoIMG))
                            .addGroup(TelaComoJogar2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(lblInformativo2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        TelaComoJogar2Layout.setVerticalGroup(
            TelaComoJogar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaComoJogar2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(lblInformativo2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaComoJogar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLixeiraPapelIMG)
                    .addComponent(lblLixeiraMetalIMG)
                    .addComponent(lblLixeiraVidroIMG)
                    .addComponent(lblLixeiraOrganicoIMG)
                    .addComponent(lblLixeiraPlasticoIMG))
                .addGap(18, 18, 18)
                .addGroup(TelaComoJogar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProximo2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Como Jogar!");
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        btnVoltar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnVoltar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVoltarActionPerformed(evt);
            }
        });

        btnProximo.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnProximo.setText("Próximo");
        btnProximo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnProximo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnProximoActionPerformed(evt);
            }
        });

        lblInterrogacaoIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Marcos\\Desktop\\APS3\\APS3\\src\\JogoApresentacao\\imagenssAPS\\interrogacaoBlurIMG.png")); // NOI18N
        lblInterrogacaoIMG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblInterrogacaoPapelIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Marcos\\Desktop\\APS3\\APS3\\src\\JogoApresentacao\\imagenssAPS\\interrogacaoPapelIMG.png")); // NOI18N
        lblInterrogacaoPapelIMG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblInterrogacaoBlurIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Marcos\\Desktop\\APS3\\APS3\\src\\JogoApresentacao\\imagenssAPS\\interrogacaoIMG.png")); // NOI18N
        lblInterrogacaoBlurIMG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblInformativo.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblInformativo.setText("jLabel1");
        lblInformativo.setAlignmentY(0.0F);
        lblInformativo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblInformativo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInterrogacaoIMG)
                        .addGap(152, 152, 152)
                        .addComponent(lblInterrogacaoBlurIMG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInterrogacaoPapelIMG))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242)
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblInformativo, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblInterrogacaoBlurIMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInterrogacaoPapelIMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInterrogacaoIMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblInformativo, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Informativo(){
        lblInformativo.setText("<html>Aparecerá um residuo em sua tela identifique-o,<br>E de acordo com o seu tipo selecione a lixeira correta.<br>Caso acerte será adicionado ao score 1 ponto,<br>Caso erre seu score permanecerá o mesmo.<br>OBS: Caso tenha dúvida sobre o residuo atual, Clique<br> em cima do residuo para que seja exibido o seu nome! </html>");
        lblInformativo.setHorizontalAlignment(SwingConstants.CENTER);
        lblInformativo.setVerticalAlignment(SwingConstants.CENTER);
        lblInformativo2.setText("<html>Vermelho: Plastico<br>Azul: Papel<br>Amarelo: Metal<br>Verde: Vidro<br>Marrom: Organico </html>");
        lblInformativo2.setHorizontalAlignment(SwingConstants.CENTER);
        lblInformativo2.setVerticalAlignment(SwingConstants.CENTER);

    }
    
    private void ajusteTelaComoJogar2(){
        
        lblLixeiraPlasticoIMG.setBounds(110, 290, 70, 70);
        lblLixeiraPapelIMG.setBounds(280, 290, 70, 70);
        lblLixeiraMetalIMG.setBounds(370, 290, 70, 70);
        lblLixeiraVidroIMG.setBounds(460, 290, 70, 70);
        lblLixeiraOrganicoIMG.setBounds(550, 290, 70, 70);
        btnProximo2.setBounds(520, 320, 90, 60);
        btnVoltar2.setBounds(30, 320, 90, 60);
        lblInformativo2.setBounds(265,20,295,200);
        //---------------------------------------------------------------------//
        lblLixeiraPlasticoIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/lixeiraPlasticoIMG.png")));
        lblLixeiraPapelIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/lixeiraPapelIMG.png")));
        lblLixeiraMetalIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/lixeiraMetalIMG.png")));
        lblLixeiraVidroIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/lixeiraVidroIMG.png")));
        lblLixeiraOrganicoIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/lixeiraOrganicoIMG.png")));
    }
    
    public void ajusteTelaComoJogar(){
        btnProximo.setBounds(520, 320, 90, 60);
        btnVoltar.setBounds(30, 320, 90, 60);
        lblInformativo.setBounds(265,30,490,175);
        lblInterrogacaoIMG.setBounds(5, 10, 70, 70);
        lblInterrogacaoBlurIMG.setBounds(155, 10, 70, 70);
        lblInterrogacaoPapelIMG.setBounds(525,10,70,70);
        //---------------------------------------------------------------------//
        lblInterrogacaoIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/interrogacaoIMG.png")));
        lblInterrogacaoBlurIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/interrogacaoBlurIMG.png")));
        lblInterrogacaoPapelIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/interrogacaoPapelIMG.png")));
    }
    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnProximoActionPerformed
    {//GEN-HEADEREND:event_btnProximoActionPerformed
        TelaComoJogar telaComoJogar2 = new TelaComoJogar();
        TelaComoJogar2.setVisible(true);
        TelaComoJogar2.setLocationRelativeTo(null);
        telaComoJogar2.setSize(530, 350);
        ajusteTelaComoJogar2();
        dispose();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnProximo2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnProximo2ActionPerformed
    {//GEN-HEADEREND:event_btnProximo2ActionPerformed
        
    }//GEN-LAST:event_btnProximo2ActionPerformed

    private void btnVoltar2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVoltar2ActionPerformed
    {//GEN-HEADEREND:event_btnVoltar2ActionPerformed
        dispose();
        TelaComoJogar telaComoJogar = new TelaComoJogar();
        telaComoJogar.setVisible(true);
        telaComoJogar.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVoltar2ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVoltarActionPerformed
    {//GEN-HEADEREND:event_btnVoltarActionPerformed
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        telaInicial.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TelaComoJogar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame TelaComoJogar2;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnProximo2;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnVoltar2;
    private javax.swing.JLabel lblInformativo;
    private javax.swing.JLabel lblInformativo2;
    private javax.swing.JLabel lblInterrogacaoBlurIMG;
    private javax.swing.JLabel lblInterrogacaoIMG;
    private javax.swing.JLabel lblInterrogacaoPapelIMG;
    private javax.swing.JLabel lblLixeiraMetalIMG;
    private javax.swing.JLabel lblLixeiraOrganicoIMG;
    private javax.swing.JLabel lblLixeiraPapelIMG;
    private javax.swing.JLabel lblLixeiraPlasticoIMG;
    private javax.swing.JLabel lblLixeiraVidroIMG;
    // End of variables declaration//GEN-END:variables
}
