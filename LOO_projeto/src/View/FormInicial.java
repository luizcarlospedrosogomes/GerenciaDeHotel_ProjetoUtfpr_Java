package View;

import View.Listas.ListaMapaOCupacao;
import DAO.Banco;
import java.awt.Container;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class FormInicial extends javax.swing.JFrame {

    public FormInicial() throws ClassNotFoundException, SQLException {
        initComponents();
        tela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelStatusBanco = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonCadastroCliente1 = new javax.swing.JButton();
        jButtonCadastroQuarto = new javax.swing.JButton();
        jButtonCadastroServico = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonReserva = new javax.swing.JButton();
        jButtonCheckout = new javax.swing.JButton();
        jButtonChekin = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jButtonMapaOcupacao = new javax.swing.JButton();
        jButtonConsuno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabelStatusBanco.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelStatusBanco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabelStatusBanco)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonCadastroCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Clients-icon.png"))); // NOI18N
        jButtonCadastroCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroCliente1ActionPerformed(evt);
            }
        });

        jButtonCadastroQuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/room-512.png"))); // NOI18N
        jButtonCadastroQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroQuartoActionPerformed(evt);
            }
        });

        jButtonCadastroServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Service-icon.png"))); // NOI18N
        jButtonCadastroServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonCadastroCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCadastroServico, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonCadastroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCadastroCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastroServico, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCadastroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/hotel-icon.png"))); // NOI18N
        jButtonReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservaActionPerformed(evt);
            }
        });

        jButtonCheckout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/remove-key-icon.png"))); // NOI18N
        jButtonCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckoutActionPerformed(evt);
            }
        });

        jButtonChekin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add-key-icon.png"))); // NOI18N
        jButtonChekin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChekinActionPerformed(evt);
            }
        });

        jDesktopPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDesktopPane1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonChekin, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChekin, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonMapaOcupacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cama.png"))); // NOI18N
        jButtonMapaOcupacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMapaOcupacaoActionPerformed(evt);
            }
        });

        jButtonConsuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/service.png"))); // NOI18N
        jButtonConsuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonMapaOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonConsuno, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonConsuno, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMapaOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroServicoActionPerformed
        FormCadastroServico cadastroServico = new FormCadastroServico();
        cadastroServico.setLocationRelativeTo(null);
        cadastroServico.setDefaultCloseOperation(cadastroServico.DISPOSE_ON_CLOSE);
        cadastroServico.setVisible(true);
        cadastroServico.setTitle("Cadastro de Serviço");
      
    }//GEN-LAST:event_jButtonCadastroServicoActionPerformed

    private void jButtonCadastroQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroQuartoActionPerformed
       FormCadastroQuarto  cadastroQuarto = new FormCadastroQuarto();
       cadastroQuarto.setLocationRelativeTo(null);
       cadastroQuarto.setDefaultCloseOperation(cadastroQuarto.DISPOSE_ON_CLOSE);
       cadastroQuarto.setVisible(true);
       cadastroQuarto.setTitle("Cadastro de Quarto");
    }//GEN-LAST:event_jButtonCadastroQuartoActionPerformed

    private void jButtonCadastroCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroCliente1ActionPerformed
      
        FormCadastroCliente cadastroCliente = new FormCadastroCliente();
        cadastroCliente.setLocationRelativeTo(null);
        cadastroCliente.setDefaultCloseOperation(cadastroCliente.DISPOSE_ON_CLOSE);
        cadastroCliente.setVisible(true);
        cadastroCliente.setTitle("Cadastro de Hospede");
    }//GEN-LAST:event_jButtonCadastroCliente1ActionPerformed

    private void jButtonReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservaActionPerformed
       FormReserva reserva = new FormReserva();
        reserva.setLocationRelativeTo(null);
        reserva.setDefaultCloseOperation(reserva.DISPOSE_ON_CLOSE);
        reserva.setVisible(true);
        reserva.setTitle("Cadastro de Reserva");
    }//GEN-LAST:event_jButtonReservaActionPerformed

    private void jButtonCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckoutActionPerformed
        FormCheckout checkout = new FormCheckout();
        checkout.setLocationRelativeTo(null);
        checkout.setDefaultCloseOperation(checkout.DISPOSE_ON_CLOSE);
        checkout.setVisible(true);
        checkout.setTitle("Checkout");
    
    }//GEN-LAST:event_jButtonCheckoutActionPerformed

    private void jButtonChekinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChekinActionPerformed
        FormCheckin checkin = new FormCheckin();
        checkin.setLocationRelativeTo(null);
        checkin.setDefaultCloseOperation(checkin.DISPOSE_ON_CLOSE);
        checkin.setVisible(true);
        checkin.setTitle("Ckeckin");
    }//GEN-LAST:event_jButtonChekinActionPerformed

    private void jDesktopPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesktopPane1MouseClicked
     
    }//GEN-LAST:event_jDesktopPane1MouseClicked

    private void jButtonMapaOcupacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMapaOcupacaoActionPerformed
        ListaMapaOCupacao lista = new ListaMapaOCupacao(this, true);
        lista.setLocationRelativeTo(null);
        lista.setDefaultCloseOperation(lista.DISPOSE_ON_CLOSE);
        lista.setVisible(true); 
        //this.setVisible(false);
        lista.setTitle("Lista de Quartos Ocupados");
    }//GEN-LAST:event_jButtonMapaOcupacaoActionPerformed

    private void jButtonConsunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsunoActionPerformed
        FormConsumo consumo = new FormConsumo();
        consumo.setLocationRelativeTo(null);
        consumo.setDefaultCloseOperation(consumo.DISPOSE_ON_CLOSE);
        consumo.setVisible(true);
        consumo.setTitle("Serviços");
    }//GEN-LAST:event_jButtonConsunoActionPerformed
    public void tela() throws ClassNotFoundException, SQLException {
         Banco st = new Banco();
         if(st.status()){
           jLabelStatusBanco.setText("Conectado ao banco");
         }else
           jLabelStatusBanco.setText("Não conectado ao banco");

    }

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormInicial().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FormInicial.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(FormInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastroCliente1;
    private javax.swing.JButton jButtonCadastroQuarto;
    private javax.swing.JButton jButtonCadastroServico;
    private javax.swing.JButton jButtonCheckout;
    private javax.swing.JButton jButtonChekin;
    private javax.swing.JButton jButtonConsuno;
    private javax.swing.JButton jButtonMapaOcupacao;
    private javax.swing.JButton jButtonReserva;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelStatusBanco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
