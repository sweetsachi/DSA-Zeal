/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formtest;

import classes.BinarySearchTree;
import classes.Node;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sajid
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    /* defining Object of textfield */
   
    
    
    public NewJFrame() {
        initComponents();
    }
    
    BinarySearchTree bst = new BinarySearchTree();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAuthorName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAuthorSurname = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        cmbDelete = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        btnDeleteTitle = new javax.swing.JRadioButton();
        btnDeleteIsbn = new javax.swing.JRadioButton();
        txtDelete = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtPrint = new javax.swing.JTextField();
        btnClear2 = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnSearchTitle = new javax.swing.JRadioButton();
        btnSearchIsbn = new javax.swing.JRadioButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtIsbn1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTitle1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAuthorName1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAuthorSurname1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("ISBN ");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 27, -1, -1));
        jPanel5.add(txtIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 24, 271, -1));

        jLabel4.setText("Book Title");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 75, -1, -1));
        jPanel5.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 72, 271, -1));

        jLabel5.setText("Author Name");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 120, -1, -1));
        jPanel5.add(txtAuthorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 117, 271, -1));

        jLabel6.setText("Author Surname");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 165, -1, -1));
        jPanel5.add(txtAuthorSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 162, 271, -1));

        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel5.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 118, -1));

        btnClear1.setText("CLEAR");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Insert", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 149, -1));

        cmbDelete.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cmbDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 191, -1));

        jLabel7.setText("Title / ISBN");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        btnDeleteTitle.setText("Delete By Title");
        jPanel2.add(btnDeleteTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 115, -1));

        btnDeleteIsbn.setText("Delete By ISBN");
        jPanel2.add(btnDeleteIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 115, -1));
        jPanel2.add(txtDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 190, -1));

        jTabbedPane1.addTab("Delete", jPanel2);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Book Type");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));
        jPanel4.add(txtPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 280, -1));

        btnClear2.setText("CLEAR");
        btnClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnClear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 77, -1));

        btnPrint.setText("PRINT");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel4.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 99, -1));

        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel4.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 86, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 460, 170));

        jTabbedPane1.addTab("Print", jPanel4);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearchTitle.setText("Search By Title");
        jPanel3.add(btnSearchTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 140, -1));

        btnSearchIsbn.setText("Search By ISBN");
        jPanel3.add(btnSearchIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 140, -1));

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel3.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));
        jPanel3.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 250, -1));

        jLabel2.setText("Title / ISBN");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        jLabel9.setText("ISBN ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));
        jPanel3.add(txtIsbn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 271, -1));

        jLabel10.setText("Book Title");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));
        jPanel3.add(txtTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 271, -1));

        jLabel11.setText("Author Name");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));
        jPanel3.add(txtAuthorName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 271, -1));

        jLabel12.setText("Author Surname");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));
        jPanel3.add(txtAuthorSurname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 271, -1));

        jTabbedPane1.addTab("Search", jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Zeal Book Store");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtIsbn1.setText(null);
        txtTitle1.setText(null);
        txtAuthorName1.setText(null);
        txtAuthorSurname1.setText(null);
        txtSearch.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        bst.insert(txtTitle.getText(), txtAuthorName.getText(), txtAuthorSurname.getText(), Integer.parseInt(txtIsbn.getText()));

    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        // TODO add your handling code here:
        txtIsbn.setText(null);
        txtTitle.setText(null);
        txtAuthorName.setText(null);
        txtAuthorSurname.setText(null);
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        Boolean r = false;
        if(btnDeleteTitle.isSelected())
        {
            r =  bst.deleteByTitle(txtDelete.getText());
        }
        else if(btnDeleteIsbn.isSelected())
        {
            r = bst.deleteByIsbn(Integer.parseInt(txtDelete.getText()));
        }
        
        if(r)
        {
            JOptionPane.showMessageDialog(null, "Record Deleted", "DELETE BOOK", 1, null);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Record not found.", "DELETE BOOK", 1, null);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClear2ActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        //model.a
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        Node node = new Node();
        
        if(btnSearchTitle.isSelected())
        {
            node = bst.searchByTitle(txtSearch.getText());
        }
        else if (btnSearchIsbn.isSelected())
        {
            node = bst.searchByIsbn(Integer.parseInt(txtSearch.getText()));
        }
        
        if( node == null)
        {
            JOptionPane.showMessageDialog(null, "Record not found.", "SEARCH BOOK", 1, null);
        }
        else
        {
            txtIsbn1.setText(node.getIsbn()+"");
            txtTitle1.setText(node.getTitle());
            txtAuthorName1.setText(node.getAuthorName());
            txtAuthorSurname1.setText(node.getAuthorSurname());
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnClear2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JRadioButton btnDeleteIsbn;
    private javax.swing.JRadioButton btnDeleteTitle;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSearch;
    private javax.swing.JRadioButton btnSearchIsbn;
    private javax.swing.JRadioButton btnSearchTitle;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox cmbDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAuthorName;
    private javax.swing.JTextField txtAuthorName1;
    private javax.swing.JTextField txtAuthorSurname;
    private javax.swing.JTextField txtAuthorSurname1;
    private javax.swing.JTextField txtDelete;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtIsbn1;
    private javax.swing.JTextField txtPrint;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtTitle1;
    // End of variables declaration//GEN-END:variables
}
