package bai1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Ceasar extends javax.swing.JFrame {
    public Ceasar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPlainText = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtKhoa = new javax.swing.JTextField();
        btnEncrypt = new javax.swing.JButton();
        btnGhiFile = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCipherText = new javax.swing.JTextArea();
        btnDecrypt = new javax.swing.JButton();
        btnMoFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("CHƯƠNG TRÌNH MÃ HÓA / GIẢI MÃ CEASAR CIPHER ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("PLAIN TEXT");

        txtPlainText.setColumns(20);
        txtPlainText.setRows(5);
        jScrollPane1.setViewportView(txtPlainText);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("KHÓA");

        txtKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKhoaActionPerformed(evt);
            }
        });

        btnEncrypt.setText("ENCRYPT");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        btnGhiFile.setText("GHI FILE");
        btnGhiFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiFileActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("CIPHER TEXT");

        txtCipherText.setColumns(20);
        txtCipherText.setRows(5);
        jScrollPane2.setViewportView(txtCipherText);

        btnDecrypt.setText("DECRYPT");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        btnMoFile.setText("MỞ FILE");
        btnMoFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 44, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDecrypt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnMoFile))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEncrypt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnGhiFile))
                                    .addComponent(jScrollPane1)
                                    .addComponent(txtKhoa)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEncrypt)
                    .addComponent(btnGhiFile))
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecrypt)
                    .addComponent(btnMoFile))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKhoaActionPerformed

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        int k = Integer.valueOf(this.txtKhoa.getText());
        String text = this.txtPlainText.getText();
        this.txtCipherText.setText(maHoa(text, k));
    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        int k = Integer.valueOf(this.txtKhoa.getText());
        String text = this.txtCipherText.getText();
        this.txtPlainText.setText(maHoa(text, -k));
    }//GEN-LAST:event_btnDecryptActionPerformed

    private void btnGhiFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiFileActionPerformed
        try {
            BufferedWriter bw = null;
            String fileName = "D:\\data.txt";
            String s = txtCipherText.getText();
            bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(s);
            bw.close();
            JOptionPane.showMessageDialog(null, "Write File Success");
        } catch (IOException ex) {
            Logger.getLogger(Ceasar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGhiFileActionPerformed

    private void btnMoFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoFileActionPerformed
        try {
            BufferedReader br = null;
            String fileName = "D:\\data.txt";
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null, "Open File Success");
            char[] ca = new char[5];
            while (br.ready()){
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            System.out.println("Dữ liệu xuất ra là " + sb);
            String s = sb.toString();
            txtPlainText.setText(s);
        } catch (IOException ex) {
            Logger.getLogger(Ceasar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMoFileActionPerformed

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
            java.util.logging.Logger.getLogger(Ceasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ceasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ceasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ceasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ceasar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JButton btnGhiFile;
    private javax.swing.JButton btnMoFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtCipherText;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextArea txtPlainText;
    // End of variables declaration//GEN-END:variables
    private char maHoaKiTu(char c, int k){
        if (!Character.isLetter(c))
            return c;
        return (char)((((Character.toUpperCase(c) - 'A') + k) % 26 + 26) % 26 + 'A');
    }
    private String maHoa(String text, int k) {
        String result  = "";
        int n = text.length();
        for (int i = 0; i < n; ++i)
            result += maHoaKiTu(text.charAt(i), k);
        return result;
    }
}
