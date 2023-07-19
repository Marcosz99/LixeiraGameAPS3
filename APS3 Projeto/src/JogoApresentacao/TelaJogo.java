package JogoApresentacao;

import JogoModelo.Config;
import JogoModelo.Reciclagem;
import JogoModelo.Residuo;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TelaJogo extends javax.swing.JFrame
{

    public TelaJogo()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    public void ajusteNecessario()
    {
        lblLixeiraPlastico.setBounds(Config.POSICAO_LIXEIRA_PLASTICO_X, Config.POSICAO_LIXEIRA_PLASTICO_Y, 70, 70);
        lblLixeiraPapel.setBounds(Config.POSICAO_LIXEIRA_PAPEL_X, Config.POSICAO_LIXEIRA_PAPEL_Y, 70, 70);
        lblLixeiraMetal.setBounds(Config.POSICAO_LIXEIRA_METAL_X, Config.POSICAO_LIXEIRA_METAL_Y, 70, 70);
        lblLixeiraVidro.setBounds(Config.POSICAO_LIXEIRA_VIDRO_X, Config.POSICAO_LIXEIRA_VIDRO_Y, 70, 70);
        lblLixeiraOrganico.setBounds(Config.POSICAO_LIXEIRA_ORGANICO_X, Config.POSICAO_LIXEIRA_ORGANICO_Y, 100, 30);
        lblInformativoUsuario.setBounds(Config.INFORMATIVO_USUARIO_X, Config.INFORMATIVO_USUARIO_Y, 100, 100);
        lblResiduoAtualIMG.setBounds(Config.RESIDUO_ATUAL_X, Config.RESIDUO_ATUAL_Y, 80, 80);
        lblScoreIMG.setBounds(Config.SCORE_IMG_X, Config.SCORE_IMG_Y, 100, 30);
        lblScore.setBounds(Config.SCORE_X, Config.SCORE_Y, 100, 30);
        lblInformativoUsuario.setHorizontalAlignment(JLabel.CENTER);
        lblInformativoUsuario.setVerticalAlignment(JLabel.CENTER);

        lblLixeiraPlastico.setIcon(new javax.swing.ImageIcon(getClass().getResource(Config.PATH_IMG_LIXEIRA_PLASTICO)));
        lblLixeiraPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource(Config.PATH_IMG_LIXEIRA_PAPEL)));
        lblLixeiraMetal.setIcon(new javax.swing.ImageIcon(getClass().getResource(Config.PATH_IMG_LIXEIRA_METAL)));
        lblLixeiraVidro.setIcon(new javax.swing.ImageIcon(getClass().getResource(Config.PATH_IMG_LIXEIRA_VIDRO)));
        lblLixeiraOrganico.setIcon(new javax.swing.ImageIcon(getClass().getResource(Config.PATH_IMG_LIXEIRA_ORGANICO)));

        selecionadoResiduoAleatorio();
        linkarIMGLabel(residuoAtual);
    }

    public void resetGame()
    {
        residuoSelecionado = false;
        lixeiraPlasticoSelecionado = false;
        lixeiraPapelSelecionado = false;
        lixeiraMetalSelecionado = false;
        lixeiraOrganicoSelecionado = false;
        lixeiraVidroSelecionado = false;
        lblResiduoAtualIMG.setBorder(null);
        lblInformativoUsuario.setText("Selecione a lixeira correta!");

    }

    Reciclagem reciclagem = new Reciclagem(this);

    public void scoreLabelTempoReal(String tipoLixeiraSelecionada)
    {
        reciclagem.verificarResiduo(residuoAtual, tipoLixeiraSelecionada);
        lblScore.setText(String.valueOf(reciclagem.getScore()));
        selecionadoResiduoAleatorio();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblLixeiraVidro = new javax.swing.JLabel();
        lblLixeiraPlastico = new javax.swing.JLabel();
        lblLixeiraPapel = new javax.swing.JLabel();
        lblLixeiraMetal = new javax.swing.JLabel();
        lblLixeiraOrganico = new javax.swing.JLabel();
        lblScoreIMG = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        lblResiduoAtualIMG = new javax.swing.JLabel();
        lblInformativoUsuario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo");

        lblLixeiraVidro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblLixeiraVidro.setMinimumSize(new java.awt.Dimension(256, 256));
        lblLixeiraVidro.setPreferredSize(new java.awt.Dimension(256, 256));
        lblLixeiraVidro.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblLixeiraVidroMouseClicked(evt);
            }
        });

        lblLixeiraPlastico.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblLixeiraPlasticoMouseClicked(evt);
            }
        });

        lblLixeiraPapel.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblLixeiraPapelMouseClicked(evt);
            }
        });

        lblLixeiraMetal.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblLixeiraMetalMouseClicked(evt);
            }
        });

        lblLixeiraOrganico.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblLixeiraOrganicoMouseClicked(evt);
            }
        });

        lblScoreIMG.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblScoreIMG.setText("SCORE:");

        lblScore.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblScore.setText("0");

        lblResiduoAtualIMG.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblResiduoAtualIMGMouseClicked(evt);
            }
        });

        lblInformativoUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblInformativoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInformativoUsuario.setText("Selecione a lixeira correta!");
        lblInformativoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblLixeiraVidro, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLixeiraOrganico, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLixeiraPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLixeiraPlastico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLixeiraMetal)
                        .addGap(0, 256, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblScoreIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(lblInformativoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(lblResiduoAtualIMG)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblScoreIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(lblInformativoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblResiduoAtualIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLixeiraMetal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblLixeiraOrganico, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLixeiraPlastico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLixeiraPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLixeiraVidro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblResiduoAtualIMGMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblResiduoAtualIMGMouseClicked
    {//GEN-HEADEREND:event_lblResiduoAtualIMGMouseClicked
        lblResiduoAtualIMG.addMouseListener(labelMouseListener);
    }//GEN-LAST:event_lblResiduoAtualIMGMouseClicked

    private void lblLixeiraPlasticoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblLixeiraPlasticoMouseClicked
    {//GEN-HEADEREND:event_lblLixeiraPlasticoMouseClicked
        metodoMouse("plastico");
    }//GEN-LAST:event_lblLixeiraPlasticoMouseClicked

    private void lblLixeiraMetalMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblLixeiraMetalMouseClicked
    {//GEN-HEADEREND:event_lblLixeiraMetalMouseClicked
        metodoMouse("metal");
    }//GEN-LAST:event_lblLixeiraMetalMouseClicked

    private void lblLixeiraPapelMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblLixeiraPapelMouseClicked
    {//GEN-HEADEREND:event_lblLixeiraPapelMouseClicked
        metodoMouse("papel");
    }//GEN-LAST:event_lblLixeiraPapelMouseClicked

    private void lblLixeiraOrganicoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblLixeiraOrganicoMouseClicked
    {//GEN-HEADEREND:event_lblLixeiraOrganicoMouseClicked
        metodoMouse("organico");
    }//GEN-LAST:event_lblLixeiraOrganicoMouseClicked

    private void lblLixeiraVidroMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblLixeiraVidroMouseClicked
    {//GEN-HEADEREND:event_lblLixeiraVidroMouseClicked
        metodoMouse("vidro");
    }//GEN-LAST:event_lblLixeiraVidroMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        dispose();
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        telaInicial.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private final Residuo garrafa = new Residuo("Garrafa De Plastico", "plastico");
    private final Residuo copoDescartavel = new Residuo("Copo Descartavel", "plastico");
    private final Residuo sacolaPlastica = new Residuo("Sacola Plastica", "plastico");

    // PAPEL
    private final Residuo folhasPapel = new Residuo("Folhas de papel", "papel");
    private final Residuo caixaPapelao = new Residuo("Caixa de papelao", "papel");
    private final Residuo jornal = new Residuo("Jornal", "papel");

    // METAL
    private final Residuo lataRefri = new Residuo("Lata de refrigerante", "metal");
    private final Residuo chave = new Residuo("Chaves", "metal");
    private final Residuo parafuso = new Residuo("Parafusos", "metal");

    // VIDRO
    private final Residuo garrafaVidro = new Residuo("Garrafa De Vidro", "vidro");
    private final Residuo copoVidro = new Residuo("Copo de vidro", "vidro");
    private final Residuo perfume = new Residuo("Perfume", "vidro");

    // ORGANICO
    private final Residuo cascaBanana = new Residuo("Casca De Banana", "organico");
    private final Residuo folhasArvore = new Residuo("Folhas De Arvore", "organico");
    private final Residuo cascaDeOvo = new Residuo("Casca De Ovo", "organico");

    ArrayList<Residuo> listaResiduos = new ArrayList<>();

    Void adicionandoResiduos()
    {

        listaResiduos.add(garrafa);
        listaResiduos.add(copoDescartavel);
        listaResiduos.add(sacolaPlastica);

        listaResiduos.add(folhasPapel);
        listaResiduos.add(caixaPapelao);
        listaResiduos.add(jornal);

        listaResiduos.add(lataRefri);
        listaResiduos.add(chave);
        listaResiduos.add(parafuso);

        listaResiduos.add(garrafaVidro);
        listaResiduos.add(copoVidro);
        listaResiduos.add(perfume);

        listaResiduos.add(cascaBanana);
        listaResiduos.add(folhasArvore);
        listaResiduos.add(cascaDeOvo);
        return null;

    }

    Residuo residuoAtual = null;

    Residuo selecionadoResiduoAleatorio()
    {

        if (listaResiduos.isEmpty() || listaResiduos.size() <= 1)
        {
            adicionandoResiduos();
        }

        Random random = new Random();

        if (residuoAtual != null)
        {
            listaResiduos.remove(residuoAtual);
        }

        Residuo residuoAleatorio = listaResiduos.get(random.nextInt(listaResiduos.size()));

        residuoAtual = residuoAleatorio;

        return residuoAleatorio;
    }

    Void linkarIMGLabel(Residuo Residuo)
    {

        if (Residuo.getNome().equals("Garrafa De Plastico"))
        {
            lblResiduoAtualIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/garrafaPlasticoIMG.png")));
        }
        if (Residuo.getNome().equals("Copo Descartavel"))
        {
            lblResiduoAtualIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/copoPlasticoIMG.png")));
        }
        if (Residuo.getNome().equals("Sacola Plastica"))
        {
            lblResiduoAtualIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/sacolaPlasticoIMG.png")));
        }
        //===================================================//
        if (Residuo.getNome().equals("Folhas de papel"))
        {
            lblResiduoAtualIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/folhasPapelIMG.png")));
        }
        if (Residuo.getNome().equals("Caixa de papelao"))
        {
            lblResiduoAtualIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/caixaPapelaoIMG.png")));
        }
        if (Residuo.getNome().equals("Jornal"))
        {
            lblResiduoAtualIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/jornalIMG.png")));
        }
        //===================================================//
        if (Residuo.getNome().equals("Lata de refrigerante"))
        {
            lblResiduoAtualIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/lataRefriIMG.png")));
        }
        if (Residuo.getNome().equals("Chaves"))
        {
            lblResiduoAtualIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/chaveIMG.png")));
        }
        if (Residuo.getNome().equals("Parafusos"))
        {
            lblResiduoAtualIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/parafusoIMG.png")));
        }
        //===================================================//
        if (Residuo.getNome().equals("Garrafa De Vidro"))
        {
            lblResiduoAtualIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/garrafaVidroIMG.png")));
        }
        if (Residuo.getNome().equals("Copo de vidro"))
        {
            lblResiduoAtualIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/copoVidroIMG.png")));
        }
        if (Residuo.getNome().equals("Perfume"))
        {
            lblResiduoAtualIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/perfumeIMG.png")));
        }
        //===================================================//
        if (Residuo.getNome().equals("Casca De Banana"))
        {
            lblResiduoAtualIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/cascaBananaIMG.png")));
        }
        if (Residuo.getNome().equals("Folhas De Arvore"))
        {
            lblResiduoAtualIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/folhasArvoreIMG.png")));
        }
        if (Residuo.getNome().equals("Casca De Ovo"))
        {
            lblResiduoAtualIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenssAPS/cascaDeOvoIMG.png")));
        }
        return null;

    }

    public Residuo residuoTempoReal;
    public boolean residuoSelecionado = false;
    public boolean lixeiraPlasticoSelecionado = false;
    public boolean lixeiraPapelSelecionado = false;
    public boolean lixeiraVidroSelecionado = false;
    public boolean lixeiraMetalSelecionado = false;
    public boolean lixeiraOrganicoSelecionado = false;

    MouseListener labelMouseListener = new MouseAdapter()
    {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            residuoSelecionado = !residuoSelecionado;

            if (residuoSelecionado)
            {
                lblInformativoUsuario.setText(residuoAtual.getNome());

            } else
            {
                lblResiduoAtualIMG.setBorder(null);
                lblInformativoUsuario.setText("Selecione a lixeira correta!");
            }
        }
    };

    void metodoMouse(String tipoLixeira)
    {
        if (tipoLixeira.equals("plastico"))
        {
            lixeiraPlasticoSelecionado = true;
            scoreLabelTempoReal("plastico");
        }
        if (tipoLixeira.equals("papel"))
        {
            lixeiraPapelSelecionado = true;
            scoreLabelTempoReal("papel");
        }
        if (tipoLixeira.equals("metal"))
        {
            lixeiraMetalSelecionado = true;
            scoreLabelTempoReal("metal");
        }
        if (tipoLixeira.equals("vidro"))
        {
            lixeiraVidroSelecionado = true;
            scoreLabelTempoReal("vidro");
        }
        if (tipoLixeira.equals("organico"))
        {
            lixeiraOrganicoSelecionado = true;
            scoreLabelTempoReal("organico");
        }

        if (lixeiraPlasticoSelecionado || lixeiraPapelSelecionado || lixeiraVidroSelecionado || lixeiraMetalSelecionado || lixeiraOrganicoSelecionado)
        {
            resetGame();
            linkarIMGLabel(residuoAtual);
        }

    }

    public void setLixeiraPapelSelecionado(boolean lixeiraPapelSelecionado)
    {
        this.lixeiraPapelSelecionado = lixeiraPapelSelecionado;
    }

    public boolean getLixeiraPlasticoEstaSelecionado()
    {
        return lixeiraPlasticoSelecionado;
    }

    public boolean getLixeiraPapelEstaSelecionado()
    {
        return lixeiraPapelSelecionado;
    }

    public boolean getLixeiraVidroEstaselecionado()
    {
        return lixeiraVidroSelecionado;
    }

    public boolean getLixeiraMetalEstaSelecionado()
    {
        return lixeiraMetalSelecionado;
    }

    public boolean getLixeiraOrganicoEstaSelecionado()
    {
        return lixeiraOrganicoSelecionado;
    }

    public Residuo getResiduoAtual()
    {
        return residuoAtual;
    }

    public boolean getResiduoSelecionado()
    {
        return residuoSelecionado;
    }

    public static void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
                new TelaJogo().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblInformativoUsuario;
    private javax.swing.JLabel lblLixeiraMetal;
    private javax.swing.JLabel lblLixeiraOrganico;
    private javax.swing.JLabel lblLixeiraPapel;
    private javax.swing.JLabel lblLixeiraPlastico;
    private javax.swing.JLabel lblLixeiraVidro;
    private javax.swing.JLabel lblResiduoAtualIMG;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblScoreIMG;
    // End of variables declaration//GEN-END:variables

    private Object getNome()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getTipo()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setResiduoSelecionado(boolean b)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
