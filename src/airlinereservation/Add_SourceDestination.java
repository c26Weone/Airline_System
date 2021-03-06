/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author CHARIF
 */
public class Add_SourceDestination extends javax.swing.JInternalFrame {

    /**
     * Creates new form Add_SourceDestination
     */
    public Add_SourceDestination() {
        initComponents();
    }
    
    PreparedStatement pst;
     Connection con;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        destinat = new javax.swing.JTextField();
        sourceflight = new javax.swing.JTextField();
        closeWindow = new javax.swing.JButton();
        SaveSOurceDestination = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setLayout(null);

        destinat.setBackground(new java.awt.Color(255, 204, 255));
        destinat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        destinat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(destinat);
        destinat.setBounds(270, 230, 300, 30);

        sourceflight.setBackground(new java.awt.Color(255, 204, 255));
        sourceflight.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sourceflight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(sourceflight);
        sourceflight.setBounds(270, 140, 300, 30);

        closeWindow.setBackground(new java.awt.Color(255, 0, 0));
        closeWindow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        closeWindow.setText("Close");
        closeWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeWindowActionPerformed(evt);
            }
        });
        jPanel1.add(closeWindow);
        closeWindow.setBounds(420, 350, 90, 40);

        SaveSOurceDestination.setBackground(new java.awt.Color(153, 255, 204));
        SaveSOurceDestination.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SaveSOurceDestination.setText("Save");
        SaveSOurceDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveSOurceDestinationActionPerformed(evt);
            }
        });
        jPanel1.add(SaveSOurceDestination);
        SaveSOurceDestination.setBounds(250, 350, 90, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Destination");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 230, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Source");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 140, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("ADD SOURCE AND DESTINATION");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 20, 620, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\CHARIF\\Downloads\\sourceback.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveSOurceDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveSOurceDestinationActionPerformed
        // TODO add your handling code here:
        try
            {
                           
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
                
                try
                {
                    String q="insert into sourcedestination values(?,?)";
                    pst=con.prepareStatement(q);
                   pst.setString(1,sourceflight.getText());
                   pst.setString(2,destinat.getText());
                   pst.executeUpdate();
                       JOptionPane.showMessageDialog(rootPane, "source and destination added", " Success",JOptionPane.INFORMATION_MESSAGE);
                       sourceflight.setText("");
                       destinat.setText("");
                 }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error in query due to"+e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                }
                finally
                {
                    con.close();
                }
            }
        catch(Exception e)
        {
         e.printStackTrace();
         JOptionPane.showMessageDialog(rootPane, "Error in connection" +e.getMessage());
        }
    }//GEN-LAST:event_SaveSOurceDestinationActionPerformed

    private void closeWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeWindowActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(this,"Do you want to leave this page?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if(res == JOptionPane.YES_OPTION){
           // closing the system
           this.hide();
       } else if(res == JOptionPane.NO_OPTION || res == JOptionPane.CLOSED_OPTION){
           return;
       }
    }//GEN-LAST:event_closeWindowActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveSOurceDestination;
    private javax.swing.JButton closeWindow;
    private javax.swing.JTextField destinat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField sourceflight;
    // End of variables declaration//GEN-END:variables
}
