
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkom
 */
public class frame3 extends javax.swing.JFrame {

    /**
     * Creates new form frame3
     */
    public frame3() {
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
        jLabel5 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btnex = new javax.swing.JButton();
        enama = new javax.swing.JTextField();
        ealm = new javax.swing.JTextField();
        esek = new javax.swing.JTextField();
        cbox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        dg = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Tabel Biodata");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 170, 30);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 44, 50, 20);

        jLabel3.setText("Kelas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 84, 40, 20);

        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 124, 40, 20);

        jLabel5.setText("Sekolah");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 164, 70, 20);

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd);
        btnadd.setBounds(90, 220, 51, 23);

        btnex.setText("Exit");
        btnex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexActionPerformed(evt);
            }
        });
        getContentPane().add(btnex);
        btnex.setBounds(210, 220, 51, 23);
        getContentPane().add(enama);
        enama.setBounds(190, 40, 120, 30);
        getContentPane().add(ealm);
        ealm.setBounds(190, 120, 120, 30);
        getContentPane().add(esek);
        esek.setBounds(190, 160, 120, 30);

        cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XIRPL1", "XIRPL2", "XIRPL3", "XIRPL4", "XIRPL5" }));
        getContentPane().add(cbox);
        cbox.setBounds(190, 80, 120, 30);

        dg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Kelas", "Alamat", "Sekolah"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dg.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(dg);
        if (dg.getColumnModel().getColumnCount() > 0) {
            dg.getColumnModel().getColumn(0).setResizable(false);
            dg.getColumnModel().getColumn(1).setResizable(false);
            dg.getColumnModel().getColumn(2).setResizable(false);
            dg.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 260, 340, 120);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 400);

        setBounds(0, 0, 416, 436);
    }// </editor-fold>//GEN-END:initComponents

    private void btnexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnexActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        String nama = enama.getText();
        String kelas = cbox.getSelectedItem().toString();
        String alamat = ealm.getText();
        String sekolah = esek.getText();
        
         if (cbox.getSelectedItem()== "XIRPL1"){
        }
         if (cbox.getSelectedItem()== "XIRPL2"){
        }
          if (cbox.getSelectedItem()== "XIRPL3"){
        }
           if (cbox.getSelectedItem()== "XIRPL4"){
        }
            if (cbox.getSelectedItem()== "XIRPL5");
            
            DefaultTableModel model = (DefaultTableModel) dg.getModel();
            model.addRow(new Object[]{enama.getText(),
                cbox.getSelectedItem(),ealm.getText(),esek.getText()
            });
    }//GEN-LAST:event_btnaddActionPerformed

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
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnex;
    private javax.swing.JComboBox<String> cbox;
    private javax.swing.JTable dg;
    private javax.swing.JTextField ealm;
    private javax.swing.JTextField enama;
    private javax.swing.JTextField esek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
