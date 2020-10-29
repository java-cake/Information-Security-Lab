package lab2;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.swing.JOptionPane;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Bai2 extends javax.swing.JFrame {
    private static final String UNICODE_FORMAT = "UTF8"; 
    private static final String DESEDE_ENCRYPTION_SCHEME = "DESede"; 
    private KeySpec myKeySpec; 
    private SecretKeyFactory mySecretKeyFactory; 
    private Cipher cipher; 
    private byte[] keyAsBytes; 
    private String myEncryptionKey; 
    private String myEncryptionScheme; 
    private SecretKey key; 
    public Bai2() {
        initComponents();
    }
    
    public String encrypt(String unencryptedString){
        String encryptedString = null;
        try {
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
            byte[] encryptedText = cipher.doFinal(plainText);
            BASE64Encoder base64Encoder = new BASE64Encoder();
            encryptedString = base64Encoder.encode(encryptedText);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return encryptedString;
    }
    public String decrypt(String encryptedString){
        String decryptedText = null;
        try {
            cipher.init(Cipher.DECRYPT_MODE, key);
            BASE64Decoder base64decoder = new BASE64Decoder();
            byte[] encryptedText = base64decoder.decodeBuffer(encryptedString);
            byte[] plainText = cipher.doFinal(encryptedText);
            String a= new String(plainText);
            System.out.println("Chuoi plaintext :" + a);
            decryptedText = a;
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return decryptedText;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtKey = new javax.swing.JTextField();
        btnEncrypt = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnWriteFile = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPlainText = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCipherText = new javax.swing.JTextArea();
        btnDecrypt = new javax.swing.JButton();
        btnAllShow = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Input Key");

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

        txtPlainText.setColumns(20);
        txtPlainText.setRows(5);
        jScrollPane2.setViewportView(txtPlainText);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Plain Text ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cipher Text ");

        txtCipherText.setColumns(20);
        txtCipherText.setRows(5);
        jScrollPane1.setViewportView(txtCipherText);

        btnDecrypt.setText("Giải mã");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        btnAllShow.setText("All Show");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("3DES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
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
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
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
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        try {
            myEncryptionKey = txtKey.getText();
            myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
            keyAsBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
            myKeySpec = new DESedeKeySpec(keyAsBytes);
            mySecretKeyFactory = SecretKeyFactory.getInstance(myEncryptionScheme);
            cipher = Cipher.getInstance(myEncryptionScheme); 
            key = mySecretKeyFactory.generateSecret(myKeySpec); 
            System.out.println("Khoa ma hoa k :" +" "+ key);
            String plainText = txtPlainText.getText();
            String encrypted = encrypt(plainText);
            System.out.println("Encrypted Value :" + encrypted);
            txtCipherText.setText(encrypted);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        try {
            String key = txtKey.getText();
            FileInputStream fis = new FileInputStream("Des.txt");
            FileOutputStream fos = new FileOutputStream("EnDes.txt"); 
            encrypt(key); 
            JOptionPane.showMessageDialog(null," Da ma hoa van ban"); 
        } catch (FileNotFoundException ex) {
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

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
       
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
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai2().setVisible(true);
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
