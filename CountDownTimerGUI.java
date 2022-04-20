/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CountDownTimerGUI extends javax.swing.JFrame {
    int min = 0, sec = 0, hr = 0, min1, sec1, hr1;
    Timer timer;
    boolean isStop = false;
   
    public CountDownTimerGUI() {
        initComponents();
        for (int i = 0; i < 60; i++) {
            if (i < 10) {
                cbxM.addItem("0" + i);
            } else {
                cbxM.addItem("" + i);
            }
        }
        for (int i = 0; i < 60; i++) {
            if (i < 10) {
                cbxS.addItem("0" + i);
            } else {
                cbxS.addItem("" + i);
            }
        }
        for (int i = 0; i < 24; i++) {
            if (i < 10) {
                cbxH.addItem("0" + i);
            } else {
                cbxH.addItem("" + i);
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblH = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblM = new javax.swing.JLabel();
        lblS = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxH = new javax.swing.JComboBox<>();
        cbxM = new javax.swing.JComboBox<>();
        cbxS = new javax.swing.JComboBox<>();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btn10m = new javax.swing.JButton();
        btn15m = new javax.swing.JButton();
        btn30m = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Count  Down  Timer");

        jLabel2.setText("ชั่วโมง");

        jLabel3.setText("นาที");

        lblH.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblH.setText("00");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText(":");

        lblM.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblM.setText("00");

        lblS.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblS.setText("00");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setText(":");

        jLabel9.setText("วินาที");

        cbxH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHActionPerformed(evt);
            }
        });

        cbxM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMActionPerformed(evt);
            }
        });

        cbxS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSActionPerformed(evt);
            }
        });

        btnStart.setText("เริ่ม");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setText("หยุด");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        btn10m.setText("10 นาที");
        btn10m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10mActionPerformed(evt);
            }
        });

        btn15m.setText("15 นาที");
        btn15m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15mActionPerformed(evt);
            }
        });

        btn30m.setText("30 นาที");
        btn30m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30mActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxH, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxM, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxS, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnStop)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btn10m)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn15m, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn30m)
                            .addGap(91, 91, 91))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblH)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblM)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblS)
                            .addGap(120, 120, 120)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblH)
                    .addComponent(jLabel5)
                    .addComponent(lblM)
                    .addComponent(lblS)
                    .addComponent(jLabel8))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(cbxH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStart)
                    .addComponent(btnStop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn10m)
                    .addComponent(btn15m)
                    .addComponent(btn30m))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
       btnStart.setEnabled(false);
        btn10m.setEnabled(false);
        btn15m.setEnabled(false);
        btn30m.setEnabled(false);
        cbxH.setEnabled(false);
        cbxM.setEnabled(false);
        cbxS.setEnabled(false);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                btnStart.setEnabled(false);

                if (isStop) {
                    min = min1;
                    sec = sec1;
                    hr = hr1;
                    isStop = false;
                }

                if (sec < 1) {
                    sec = 60;
                    min--;
                }

                if (min < 0) {
                    min = 59;
                    hr--;
                }

                if (hr < 0) {
                    JOptionPane.showMessageDialog(rootPane, "Time Out!");
                    hr = 0;
                    min = 0;
                    sec = 0;
                    timer.stop();
                    btnStart.setEnabled(true);
                } else {
                    sec--;
                }

                if (sec < 10) {
                    lblS.setText("0" + sec);
                } else {
                    lblS.setText("" + sec);
                }

                if (min < 10) {
                    lblM.setText("0" + min);
                } else {
                    lblM.setText("" + min);
                }

                if (hr < 10) {
                    lblH.setText("0" + hr);
                } else {
                    lblH.setText("" + hr);
                }

            }
        });
        timer.start();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        min1 = min;
        sec1 = sec;
        hr1 = hr;
        isStop = true;
        timer.stop();
        btnStart.setEnabled(true);
    }//GEN-LAST:event_btnStopActionPerformed

    private void btn10mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10mActionPerformed
     min=10;
     lblM.setText(""+min);
    }//GEN-LAST:event_btn10mActionPerformed

    private void btn15mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15mActionPerformed
     min=15;
     lblM.setText(""+min);
    }//GEN-LAST:event_btn15mActionPerformed

    private void btn30mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30mActionPerformed
       min=30;
     lblM.setText(""+min);
    }//GEN-LAST:event_btn30mActionPerformed

    private void cbxHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHActionPerformed
        lblH.setText(""+cbxH.getSelectedItem());
        hr = Integer.parseInt(lblH.getText());
    }//GEN-LAST:event_cbxHActionPerformed

    private void cbxMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMActionPerformed
        lblM.setText(""+cbxM.getSelectedItem());
        min = Integer.parseInt(lblM.getText());
    }//GEN-LAST:event_cbxMActionPerformed

    private void cbxSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSActionPerformed
        lblS.setText(""+cbxS.getSelectedItem());
        sec = Integer.parseInt(lblS.getText());
    }//GEN-LAST:event_cbxSActionPerformed

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
            java.util.logging.Logger.getLogger(CountDownTimerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CountDownTimerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CountDownTimerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CountDownTimerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CountDownTimerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn10m;
    private javax.swing.JButton btn15m;
    private javax.swing.JButton btn30m;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JComboBox<String> cbxH;
    private javax.swing.JComboBox<String> cbxM;
    private javax.swing.JComboBox<String> cbxS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblH;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblS;
    // End of variables declaration//GEN-END:variables
}
