/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author CHARIF
 */
public class PayByCredit extends javax.swing.JInternalFrame {

    /**
     * Creates new form PayByCredit
     */
    public PayByCredit() {
        initComponents();
    }
    
    Connection con;
    PreparedStatement pst;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cvcod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        crednumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        carType = new javax.swing.JComboBox<>();
        PaymentButtonCard = new javax.swing.JButton();
        expiryDate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Payment Card");

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CVV CODE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 110, 160, 30);

        cvcod.setBackground(new java.awt.Color(51, 51, 51));
        cvcod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cvcod.setForeground(new java.awt.Color(255, 255, 255));
        cvcod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(cvcod);
        cvcod.setBounds(270, 110, 270, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CARD TYPE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 230, 160, 30);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Credit Card Number");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 50, 160, 30);

        crednumber.setBackground(new java.awt.Color(51, 51, 51));
        crednumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        crednumber.setForeground(new java.awt.Color(255, 255, 255));
        crednumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(crednumber);
        crednumber.setBounds(270, 50, 270, 30);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("EXPIRY YEAR");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 170, 160, 30);

        carType.setBackground(new java.awt.Color(51, 51, 51));
        carType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        carType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT CARD TYPE", "VISA", "MASTER CARD", "MAESTRO" }));
        carType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        jPanel1.add(carType);
        carType.setBounds(270, 230, 270, 30);

        PaymentButtonCard.setBackground(new java.awt.Color(153, 255, 255));
        PaymentButtonCard.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        PaymentButtonCard.setText("Pay");
        PaymentButtonCard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PaymentButtonCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentButtonCardActionPerformed(evt);
            }
        });
        jPanel1.add(PaymentButtonCard);
        PaymentButtonCard.setBounds(440, 290, 90, 30);

        expiryDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(expiryDate);
        expiryDate.setBounds(270, 170, 270, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\CHARIF\\Downloads\\Airline\\cardback.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PaymentButtonCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentButtonCardActionPerformed
        // TODO add your handling code here:
        try
            {
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
                
                try
                {
                    String q="insert into paybycredit values(?,?,?,?)";
                    pst=con.prepareStatement(q);
                    pst.setString(1,crednumber.getText());
                    pst.setString(2, cvcod.getText());
                    DateFormat exdat= new SimpleDateFormat("dd-MM-yyyy");
                    String expireDate = exdat.format(expiryDate.getDate());
                    pst.setString(3,expireDate);
                    pst.setString(4, carType.getSelectedItem().toString());
                    pst.executeUpdate();
                   
                   JOptionPane.showMessageDialog(rootPane, "PAYMENT SUCCESSFUL", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    this.dispose();
                    PaymentTickets obj=new PaymentTickets();
                    obj.dispose();
                    JOptionPane.showMessageDialog(rootPane, "Ticket has been booked. Have a great trip", "Booking Status", JOptionPane.INFORMATION_MESSAGE);
                   
                   
                  
                   
                  
                    
                   
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
    }//GEN-LAST:event_PaymentButtonCardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PaymentButtonCard;
    private javax.swing.JComboBox<String> carType;
    private javax.swing.JTextField crednumber;
    private javax.swing.JTextField cvcod;
    private com.toedter.calendar.JDateChooser expiryDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
