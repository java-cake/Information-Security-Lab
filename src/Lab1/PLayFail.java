/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author PC
 */
public class PLayFail extends javax.swing.JFrame {

    char pf[][] = {{'M', 'O', 'N', 'A', 'R'},
                   {'C', 'H', 'Y', 'B', 'D'},
                   {'E', 'F', 'G', 'I', 'K'},
                   {'L', 'P', 'Q', 'S', 'T'},
                   {'U', 'V', 'W', 'X', 'Z'}};
    
    public PLayFail() {
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
        txtNoiDung = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtKhoa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBanMa = new javax.swing.JTextArea();
        btnMaHoa = new javax.swing.JButton();
        btnGiaiMa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nội dung");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Khóa");

        txtKhoa.setEditable(false);
        txtKhoa.setText("MONARCHY \n");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Bản mã");

        txtBanMa.setColumns(20);
        txtBanMa.setRows(5);
        jScrollPane1.setViewportView(txtBanMa);

        btnMaHoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMaHoa.setText("Mã hóa");
        btnMaHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaHoaActionPerformed(evt);
            }
        });

        btnGiaiMa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGiaiMa.setText("Giải mã");
        btnGiaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaiMaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMaHoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGiaiMa)
                                .addGap(8, 8, 8)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGiaiMa)
                    .addComponent(btnMaHoa))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaHoaActionPerformed
        String noiDung = this.txtNoiDung.getText();
        noiDung = noiDung.toUpperCase();
        noiDung = noiDung.replace('J', 'I');
        String banMa = maHoa(noiDung);
        this.txtBanMa.setText(banMa);
    }//GEN-LAST:event_btnMaHoaActionPerformed

    private void btnGiaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaiMaActionPerformed
        String banMa = this.txtBanMa.getText();
        String noiDung = giaiMa(banMa);
        int n = noiDung.length();
        String nd = "";
        for (int i = 0; i < n - 2; i += 2)
            if (noiDung.charAt(i) == noiDung.charAt(i + 2))
                nd += noiDung.charAt(i);
            else
                nd += noiDung.charAt(i) + "" + noiDung.charAt(i + 1);
        if (noiDung.charAt(n - 1) == 'X')
            nd += noiDung.charAt(n - 2);
        else
            nd += noiDung.charAt(n - 1);
        this.txtNoiDung.setText(nd);
    }//GEN-LAST:event_btnGiaiMaActionPerformed

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
            java.util.logging.Logger.getLogger(PLayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PLayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PLayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PLayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PLayFail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiaiMa;
    private javax.swing.JButton btnMaHoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtBanMa;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtNoiDung;
    // End of variables declaration//GEN-END:variables

    private String maHoa(String noiDung) {
        int n = noiDung.length();
        int i = 0;
        String banMa = "";
        char a, b;
        while (i < n){
            if (i == n - 1){
                a = noiDung.charAt(i);
                b = 'X';
                i++;
            }
            else{
                a = noiDung.charAt(i);
                b = noiDung.charAt(i + 1);
                if (a == b){
                    b = 'X';
                    i++; 
                }
                else
                    i += 2;
            }
            banMa += thayThe(a, b);
        }
        return banMa;
    }
    private String thayThe(char a, char b){
        String viTriA = timViTri(a);
        String viTriB = timViTri(b);
        char x, y;
        if (viTriA.charAt(0) == viTriB.charAt(0)){
            x = pf[viTriA.charAt(0) - '0'][((viTriA.charAt(1) - '0') + 1) % 5];
            y = pf[viTriB.charAt(0) - '0'][((viTriB.charAt(1) - '0') + 1) % 5];
            return x + "" + y;
        }
        if (viTriA.charAt(1) == viTriB.charAt(1)){
            x = pf[((viTriA.charAt(0) - '0') + 1) % 5][(viTriA.charAt(1) - '0')];
            y = pf[((viTriB.charAt(0) - '0') + 1) % 5][(viTriB.charAt(1) - '0')];
            return x + "" + y;
        }
        x = pf[viTriA.charAt(0) - '0'][(viTriA.charAt(1) - '0')];
        y = pf[viTriB.charAt(0) - '0'][(viTriB.charAt(1) - '0')];
        return x + "" + y;
    }
    private String timViTri(char a){
        for (int i = 0; i < 5; ++i)
            for (int j = 0; j < 5; ++j)
                if (pf[i][j] == a)
                    return i + "" + j;
        return "";
    }

    private String giaiMa(String banMa) {
        int n = banMa.length();
        String noiDung = "";
        char a, b;
        for (int i = 0; i < n; i += 2){
            a = banMa.charAt(i);
            b = banMa.charAt(i + 1);
            noiDung += thayTheNguoc(a, b);
        }
        return noiDung;
    }
    private String thayTheNguoc(char a, char b){
        String viTriA = timViTri(a);
        String viTriB = timViTri(b);
        char x, y;
        if (viTriA.charAt(0) == viTriB.charAt(0)){
            x = pf[viTriA.charAt(0) - '0'][((viTriA.charAt(1) - '0') - 1 + 5) % 5];
            y = pf[viTriB.charAt(0) - '0'][((viTriB.charAt(1) - '0') - 1 + 5) % 5];
            return x + "" + y;
        }
        if (viTriA.charAt(1) == viTriB.charAt(1)){
            x = pf[((viTriA.charAt(0) - '0') - 1 + 5) % 5][(viTriA.charAt(1) - '0')];
            y = pf[((viTriB.charAt(0) - '0') - 1 + 5) % 5][(viTriB.charAt(1) - '0')];
            return x + "" + y;
        }
        x = pf[viTriA.charAt(0) - '0'][(viTriA.charAt(1) - '0')];
        y = pf[viTriB.charAt(0) - '0'][(viTriB.charAt(1) - '0')];
        return x + "" + y;
    }
}
