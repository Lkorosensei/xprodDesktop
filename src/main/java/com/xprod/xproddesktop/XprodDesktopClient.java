package com.xprod.xproddesktop;

import com.xprod.xproddesktop.dao.Connexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samir Ibrahim
 */
public class XprodDesktopClient extends javax.swing.JFrame {

    /**
     * Creates new form XprodDesktop
     */
    public XprodDesktopClient() {
        initComponents();
        this.setTitle("XPROD gestion des produits");
        setLocationRelativeTo(null);//Pour centrer le contenu de ma fenêtre
        tableUpdate(); //Mettre à jour la table des produits
    }
    
    //Affichage utilisateur
    public void afficherUser(String user) {
        lblUserClient.setText(user);
    }
    
    //Connexion
    Connexion cn = new Connexion();
    Connection con;
    PreparedStatement pst;

    //Mise à jour du tableau
    private void tableUpdate() {
        int cpt;// déclaration d'une variable que je nomme compteur

        try {
            
            con = cn.getCon();
            
            String query = "SELECT * FROM produit";
            pst = con.prepareStatement(query);

            ResultSet rs = pst.executeQuery(); //Je mets mes données dans un tableau de résultat

            ResultSetMetaData rsmd = rs.getMetaData();// Je récupère toute mes métadonnées du tableau de résultat
            cpt = rsmd.getColumnCount();// Je compte toute mes métadonnées

            DefaultTableModel dtm = (DefaultTableModel) tablePRODUIT.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {//Tant que j'ai des données dans mon tableau de résultat
                Vector vect = new Vector();
                vect.add(rs.getString("idproduit"));
                vect.add(rs.getString("refproduit"));
                vect.add(rs.getString("designation"));
                vect.add(rs.getString("description"));
                vect.add(rs.getString("prixuht"));
                dtm.addRow(vect);
            }

        } catch (Exception e) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablePRODUIT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDESIGNATION = new javax.swing.JTextField();
        txtDESCRIPTIF = new javax.swing.JTextField();
        txtPRIXUHT = new javax.swing.JTextField();
        txtREF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnAJOUTER = new javax.swing.JButton();
        btnMODIFIER = new javax.swing.JButton();
        btnSUPPRIMER = new javax.swing.JButton();
        lblUserClient = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablePRODUIT.setBorder(javax.swing.BorderFactory.createTitledBorder("DATA"));
        tablePRODUIT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUIT", "REF PRODUIT", "DESIGNATION", "DESCRIPTIF", "PRIX UHT"
            }
        ));
        tablePRODUIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePRODUITMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePRODUIT);

        jLabel1.setText("LISTE DES PRODUITS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel3.setText("REF");

        jLabel4.setText("DESIGNATION");

        jLabel5.setText("DESCRIPTIF");

        jLabel6.setText("PRIX UHT");

        jLabel2.setText("ID");

        btnAJOUTER.setText("AJOUTER");
        btnAJOUTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAJOUTERActionPerformed(evt);
            }
        });

        btnMODIFIER.setText("MODIFIER");
        btnMODIFIER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODIFIERActionPerformed(evt);
            }
        });

        btnSUPPRIMER.setText("SUPPRIMER");
        btnSUPPRIMER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUPPRIMERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtREF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDESIGNATION, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDESCRIPTIF, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                            .addComponent(txtPRIXUHT))))
                                .addGap(0, 181, Short.MAX_VALUE)))
                        .addGap(106, 106, 106)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAJOUTER)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMODIFIER)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSUPPRIMER)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtREF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDESIGNATION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDESCRIPTIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPRIXUHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAJOUTER)
                    .addComponent(btnMODIFIER)
                    .addComponent(btnSUPPRIMER))
                .addContainerGap())
        );

        lblUserClient.setText("Utilisateur");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel1)
                        .addGap(112, 112, 112)
                        .addComponent(lblUserClient))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUserClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAJOUTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAJOUTERActionPerformed
        // Je récupère les informations entrées dans nos textes
        //String idProduit = txtID.getText(); AUTO INCREMENT
        String refProduit = txtREF.getText();
        String designation = txtDESIGNATION.getText();
        String descriptif = txtDESCRIPTIF.getText();
        String prixUHT = txtPRIXUHT.getText();

        try {

            con = cn.getCon();

            pst = con.prepareStatement("insert into produit (refproduit, designation, description, prixuht) values (?,?,?,?)");

            pst.setString(1, refProduit);
            pst.setString(2, designation);
            pst.setString(3, descriptif);
            pst.setString(4, prixUHT);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Données enregistrées");

            //Vider les champs après le message
            txtREF.setText("");
            txtDESCRIPTIF.setText("");
            txtDESIGNATION.setText("");
            txtPRIXUHT.setText("");

        } catch (Exception e) {
    }//GEN-LAST:event_btnAJOUTERActionPerformed
    }
    private void tablePRODUITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePRODUITMouseClicked
        // Pour séléctionner les informations d'un champ
        DefaultTableModel dtm = (DefaultTableModel) tablePRODUIT.getModel();

        int selectedIndex = tablePRODUIT.getSelectedRow();

        txtID.setText(dtm.getValueAt(selectedIndex, 0).toString());
        txtREF.setText(dtm.getValueAt(selectedIndex, 1).toString());
        txtDESIGNATION.setText(dtm.getValueAt(selectedIndex, 2).toString());
        txtDESCRIPTIF.setText(dtm.getValueAt(selectedIndex, 3).toString());
        txtPRIXUHT.setText(dtm.getValueAt(selectedIndex, 4).toString());
    }//GEN-LAST:event_tablePRODUITMouseClicked

    private void btnMODIFIERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODIFIERActionPerformed
        // Modification
        DefaultTableModel dtm = (DefaultTableModel) tablePRODUIT.getModel();

        int selectedIndex = tablePRODUIT.getSelectedRow();

        try {
            int IDProduit = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());//ID de la table produit

            String refProduit = txtREF.getText();
            String designation = txtDESIGNATION.getText();
            String descriptif = txtDESCRIPTIF.getText();
            String prixUHT = txtPRIXUHT.getText();

           con = cn.getCon();

            pst = con.prepareStatement("update produit set refproduit=?, designation=?, description=?, prixuht=? where idproduit=?");

            pst.setString(1, refProduit);
            pst.setString(2, designation);
            pst.setString(3, descriptif);
            pst.setString(4, prixUHT);
            pst.setInt(5, IDProduit);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Données mise à jour");

            //Vider les champs après le message
            txtID.setText("");
            txtREF.setText("");
            txtDESCRIPTIF.setText("");
            txtDESIGNATION.setText("");
            txtPRIXUHT.setText("");

            tableUpdate();//Mettre à jour la table des produits
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnMODIFIERActionPerformed

    private void btnSUPPRIMERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUPPRIMERActionPerformed
        //Supprimer
        DefaultTableModel dtm = (DefaultTableModel) tablePRODUIT.getModel();
        int selectedIndex = tablePRODUIT.getSelectedRow();
        int IDProduit = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());  //Id de la table produit 

        int dialogResult = JOptionPane.showConfirmDialog(null, "Voulez-vous supprimer cette données ?", "ATTENTION!", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {

            try {
                
                con = cn.getCon();
                
                pst = con.prepareStatement("delete from produit where idproduit=?");
                pst.setInt(1, IDProduit);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Données supprimées !");

                //Je vide le contenu des champs remplis
                txtREF.setText("");
                txtDESCRIPTIF.setText("");
                txtDESIGNATION.setText("");
                txtPRIXUHT.setText("");

                tableUpdate(); //Mettre à jour la table des produits

            } catch (SQLException ex) {
                Logger.getLogger(XprodDesktopClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSUPPRIMERActionPerformed
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
            java.util.logging.Logger.getLogger(XprodDesktopClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XprodDesktopClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XprodDesktopClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XprodDesktopClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new XprodDesktopClient().setVisible(true);
            }
        });
        
        Login.main(args);
        Fournisseur.main(args);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAJOUTER;
    private javax.swing.JButton btnMODIFIER;
    private javax.swing.JButton btnSUPPRIMER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUserClient;
    private javax.swing.JTable tablePRODUIT;
    private javax.swing.JTextField txtDESCRIPTIF;
    private javax.swing.JTextField txtDESIGNATION;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPRIXUHT;
    private javax.swing.JTextField txtREF;
    // End of variables declaration//GEN-END:variables
}
