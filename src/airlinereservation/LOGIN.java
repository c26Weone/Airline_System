/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservation;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;

//java.awt.event.KeyEvent
/**
 *
 * @author CHARIF
 */
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        ClosseButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 230, 90, 30);

        jPasswordField1.setBackground(new java.awt.Color(255, 229, 186));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(100, 230, 230, 30);

        LoginButton.setBackground(new java.awt.Color(102, 153, 255));
        LoginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        LoginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginButtonKeyPressed(evt);
            }
        });
        jPanel2.add(LoginButton);
        LoginButton.setBounds(40, 310, 97, 36);

        ClosseButton.setBackground(new java.awt.Color(255, 0, 0));
        ClosseButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClosseButton.setText("Close");
        ClosseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClosseButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ClosseButton);
        ClosseButton.setBounds(310, 320, 102, 36);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 170, 90, 30);

        jTextField1.setBackground(new java.awt.Color(255, 229, 186));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(100, 170, 230, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AIRLINE SYSTEM RESERVATION");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 0, 540, 60);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\CHARIF\\Downloads\\lockBackg.jpg")); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 600, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        try
        {
            Connection myconnection;

            myconnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");

            try
            {
                String q="select * from users where username=? and password=?";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                mystatement.setString(1,jTextField1.getText());
                mystatement.setString(2,jPasswordField1.getText());
                ResultSet myresult=mystatement.executeQuery();
                if(myresult.next())
                {
                    myglobalclass.usname=jTextField1.getText();
                    AdminHome obj=new AdminHome();
                    obj.setExtendedState(MAXIMIZED_BOTH);
                    this.dispose();
                    obj.setVisible(true);
                }
                else
                {

                    String q2="select * from employeedatabase where EmpEmail=? and EmpPassword=?";
                    PreparedStatement mystatement1=myconnection.prepareStatement(q2);
                    mystatement1.setString(1,jTextField1.getText());
                    mystatement1.setString(2,jPasswordField1.getText());
                    ResultSet myresult1=mystatement1.executeQuery();
                    if(myresult1.next())
                    {
                        myglobalclass.usname=jTextField1.getText();
                        EmployeeHome obj=new EmployeeHome();
                        obj.setExtendedState(MAXIMIZED_BOTH);
                        this.dispose();
                        obj.setVisible(true);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Wrong username/passsword", "Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error in query due to"+e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
            }
            finally
            {
                myconnection.close();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error in connection" +e.getMessage());
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void LoginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try
            {
                Connection myconnection;

                myconnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");

                try
                {
                    String q="select * from users where username=? and password=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(q);
                    mystatement.setString(1,jTextField1.getText());
                    mystatement.setString(2,jPasswordField1.getText());
                    ResultSet myresult=mystatement.executeQuery();
                    if(myresult.next())
                    {
                        myglobalclass.usname=jTextField1.getText();
                        AdminHome obj=new AdminHome();
                        obj.setExtendedState(MAXIMIZED_BOTH);
                        this.dispose();
                        obj.setVisible(true);
                    }
                    else
                    {

                        String q2="select * from employeedatabase where EmpEmail=? and EmpPassword=?";
                        PreparedStatement mystatement1=myconnection.prepareStatement(q2);
                        mystatement1.setString(1,jTextField1.getText());
                        mystatement1.setString(2,jPasswordField1.getText());
                        ResultSet myresult1=mystatement1.executeQuery();
                        if(myresult1.next())
                        {
                            myglobalclass.usname=jTextField1.getText();
                            EmployeeHome obj=new EmployeeHome();
                            obj.setExtendedState(MAXIMIZED_BOTH);
                            this.dispose();
                            obj.setVisible(true);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(rootPane, "Wrong username/passsword", "Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error in query due to"+e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                }
                finally
                {
                    myconnection.close();
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "Error in connection" +e.getMessage());
            }
        }
    }//GEN-LAST:event_LoginButtonKeyPressed

    private void ClosseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClosseButtonActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(this,"You are about cloasing the hole  Systeme\n are you sure to continue the process?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(res == JOptionPane.YES_OPTION){
            // closing the system
            System.exit(0);
        } else if(res == JOptionPane.NO_OPTION || res == JOptionPane.CLOSED_OPTION){
            return;
        }
    }//GEN-LAST:event_ClosseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClosseButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
