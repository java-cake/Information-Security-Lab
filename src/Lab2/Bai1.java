package lab2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Bai1 extends javax.swing.JFrame {
    private int mode;
    private static void doCopy(InputStream is, OutputStream os) {
        byte[] bytes = new byte[6];
        int numBytes; 
        try {
            while ((numBytes = is.read(bytes)) != -1) {
                os.write(bytes, 0, numBytes);    
            } 
            os.flush(); 
            os.close(); 
            is.close(); 
        } catch (IOException ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static void encryptOrDecrypt(String key, int mode, InputStream is, OutputStream os) {
        try {
            DESKeySpec dks = new DESKeySpec(key.getBytes());
            SecretKeyFactory skf = SecretKeyFactory.getInstance("DES"); 
            SecretKey desKey = skf.generateSecret(dks); 
            Cipher cipher = Cipher.getInstance("DES"); 
            if (mode == Cipher.ENCRYPT_MODE) {
                    cipher.init(Cipher.ENCRYPT_MODE, desKey); 
                    CipherInputStream cis = new CipherInputStream(is, cipher); 
                    doCopy(cis, os); 
            } 
            else if (mode == Cipher.DECRYPT_MODE) {
                    cipher.init(Cipher.DECRYPT_MODE, desKey); 
                    CipherOutputStream cos = new CipherOutputStream(os, cipher); 
                    doCopy(is, cos); 
            } 
        } catch (InvalidKeyException | NoSuchAlgorithmException 
                                     | InvalidKeySpecException | NoSuchPaddingException ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        }
	
    }
    
    private static void encrypt(String key, InputStream is, OutputStream os){
	encryptOrDecrypt(key, Cipher.ENCRYPT_MODE, is, os);
    }
    private static void decrypt(String key, InputStream is, OutputStream os){
	encryptOrDecrypt(key, Cipher.DECRYPT_MODE, is, os);
    }
    
    public Bai1() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        btnEncrypt = new javax.swing.JButton();
        txtKey = new javax.swing.JTextField();
        btnShow = new javax.swing.JButton();
        btnWriteFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCipherText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPlainText = new javax.swing.JTextArea();
        btnAllShow = new javax.swing.JButton();
        btnDecrypt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Input Key");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Plain Text ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cipher Text ");

        btnEncrypt.setText("Mã hóa");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        btnShow.setText("Hiển thị");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnWriteFile.setText("Ghi File");
        btnWriteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteFileActionPerformed(evt);
            }
        });

        txtCipherText.setColumns(20);
        txtCipherText.setRows(5);
        jScrollPane1.setViewportView(txtCipherText);

        txtPlainText.setColumns(20);
        txtPlainText.setRows(5);
        jScrollPane2.setViewportView(txtPlainText);

        btnAllShow.setText("All Show");
        btnAllShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllShowActionPerformed(evt);
            }
        });

        btnDecrypt.setText("Giải mã");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDecrypt)
                                .addGap(126, 126, 126)
                                .addComponent(btnAllShow))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnEncrypt)
                                    .addGap(115, 115, 115)
                                    .addComponent(btnShow)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnWriteFile))
                                .addComponent(txtKey)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEncrypt)
                    .addComponent(btnShow)
                    .addComponent(btnWriteFile))
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAllShow)
                    .addComponent(btnDecrypt))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        try {
            String key = txtKey.getText();
            FileInputStream fis = new FileInputStream("Des.txt");
            FileOutputStream fos = new FileOutputStream("EnDes.txt"); 
            encrypt(key, fis, fos); 
            JOptionPane.showMessageDialog(null," Da ma hoa van ban"); 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        BufferedReader br = null; 
        try { 
            String fileName = "EnDes.txt";
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer(); 
            JOptionPane.showMessageDialog(null, "Da Mo File"); 
            char[] ca = new char[5]; 
            while (br.ready()) {
                int len = br.read(ca); 
                sb.append(ca, 0, len); 
            }
            br.close();
            System.out.println("Du Lieu la :" + " " + sb); 
            String chuoi = sb.toString(); 
            txtCipherText.setText(chuoi); 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        }	
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnWriteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteFileActionPerformed
        BufferedWriter bw = null;
        try {
            String fileName = "Des.txt"; 
            String s = txtPlainText.getText(); 
            bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(s); 
            bw.close(); 
            JOptionPane.showMessageDialog(null,"Da Ghi File"); 
            txtCipherText.setText(s);
        } catch (IOException ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnWriteFileActionPerformed

    private void btnAllShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAllShowActionPerformed

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        FileInputStream fis2 = null; 
        try { 
            String key = txtKey.getText(); 
            fis2 = new FileInputStream("EnDes.txt");
            FileOutputStream fos2 = new FileOutputStream("DeDes.txt"); 
            decrypt(key, fis2, fos2); 
            BufferedReader br = new BufferedReader(new FileReader("DeDes.txt")); 
            StringBuffer sb = new StringBuffer(); 
            JOptionPane.showMessageDialog(null, "Da Giai Ma"); 
            char[] ca = new char[5]; 
            while (br.ready()) {
                int len = br.read(ca); 
		sb.append(ca, 0, len); 
            }
            br.close(); 
            System.out.println("Du Lieu la :" + " " + sb); 
            String chuoi = sb.toString(); 
            txtCipherText.setText(chuoi); 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDecryptActionPerformed

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
            java.util.logging.Logger.getLogger(Bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllShow;
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnWriteFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtCipherText;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextArea txtPlainText;
    // End of variables declaration//GEN-END:variables

}
