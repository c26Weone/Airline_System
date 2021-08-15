/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservation;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author CHARIF
 */
public class Create_Employee extends javax.swing.JInternalFrame {

    
     
    /**
     * Creates new form Create_Employee
     */
    public Create_Employee() {
        initComponents();
    }

    Connection con;
    PreparedStatement pst;
     String path = null;
    byte[] imageuser = null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EmpEmail = new javax.swing.JTextField();
        EmpUsername = new javax.swing.JTextField();
        EmpPassword = new javax.swing.JPasswordField();
        CreateEmployeeButton = new javax.swing.JButton();
        CancelCreateEmployee = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        UploadPhoto = new javax.swing.JButton();
        PhotoEmp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(780, 513));

        jPanel1.setBackground(new java.awt.Color(110, 216, 171));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Email");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(112, 135, 100, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(112, 210, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(112, 294, 100, 30);

        EmpEmail.setBackground(new java.awt.Color(204, 204, 255));
        EmpEmail.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EmpEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(EmpEmail);
        EmpEmail.setBounds(230, 135, 195, 31);

        EmpUsername.setBackground(new java.awt.Color(204, 204, 255));
        EmpUsername.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EmpUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(EmpUsername);
        EmpUsername.setBounds(230, 211, 195, 30);

        EmpPassword.setBackground(new java.awt.Color(204, 204, 255));
        EmpPassword.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EmpPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(EmpPassword);
        EmpPassword.setBounds(230, 295, 195, 30);

        CreateEmployeeButton.setBackground(new java.awt.Color(65, 143, 136));
        CreateEmployeeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CreateEmployeeButton.setText("Create");
        CreateEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateEmployeeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CreateEmployeeButton);
        CreateEmployeeButton.setBounds(518, 416, 90, 39);

        CancelCreateEmployee.setBackground(new java.awt.Color(255, 0, 0));
        CancelCreateEmployee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CancelCreateEmployee.setText("Cancel");
        CancelCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelCreateEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(CancelCreateEmployee);
        CancelCreateEmployee.setBounds(660, 416, 90, 39);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel5.setText("Create Employee");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 0, 390, 64);

        UploadPhoto.setBackground(java.awt.Color.cyan);
        UploadPhoto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UploadPhoto.setText("Upload");
        UploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadPhotoActionPerformed(evt);
            }
        });
        jPanel1.add(UploadPhoto);
        UploadPhoto.setBounds(660, 292, 95, 35);

        PhotoEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 3));
        PhotoEmp.setPreferredSize(new java.awt.Dimension(120, 75));
        jPanel1.add(PhotoEmp);
        PhotoEmp.setBounds(559, 51, 207, 184);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\CHARIF\\Downloads\\lockback2.jpg")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 40, 590, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadPhotoActionPerformed
        // TODO add your handling code here:
         try {
            
            JFileChooser picchooser = new JFileChooser();
        picchooser.showOpenDialog(null);
        File pic = picchooser.getSelectedFile();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.iamges","png","jpg");
        picchooser.addChoosableFileFilter(filter);
        path = pic.getAbsolutePath();
        BufferedImage img;
        img = ImageIO.read(picchooser.getSelectedFile());
        ImageIcon imageIcon = new ImageIcon( new ImageIcon(img).getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT));
       PhotoEmp.setIcon(imageIcon);
        
            File image = new File(path);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];
            
            for(int readNum;(readNum=fis.read(buff)) != -1; )
            {
                baos.write(buff,0,readNum);
            }
            imageuser = baos.toByteArray();
        
        }
        catch (IOException ex) {
            Logger.getLogger(Create_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UploadPhotoActionPerformed

    private void CancelCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelCreateEmployeeActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(this,"Do you want to close create new employee session ?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if(res == JOptionPane.YES_OPTION){
           // closing the system
           this.hide();
       } else if(res == JOptionPane.NO_OPTION || res == JOptionPane.CLOSED_OPTION){
           return;
       }
    }//GEN-LAST:event_CancelCreateEmployeeActionPerformed

    private void CreateEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateEmployeeButtonActionPerformed
        // TODO add your handling code here:
               
       String empEmail = EmpEmail.getText();
        String empuser = EmpUsername.getText();
        String empPasswrd = EmpPassword.getText();
        
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            String query = "insert into employeedatabase  values(?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
            pst = con.prepareStatement(query);
           
            pst.setString(1, empEmail);
            pst.setString(2, empuser);
            pst.setString(3, empPasswrd);
            pst.setBytes(4, imageuser);
            
            pst.executeUpdate(); 
            
            
            JOptionPane.showMessageDialog(null,empEmail + " has been added successfully");
            
                EmpEmail.setText("");
                EmpUsername.setText("");
                EmpPassword.setText("");
                PhotoEmp.setText("");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Add_Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Add_Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CreateEmployeeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelCreateEmployee;
    private javax.swing.JButton CreateEmployeeButton;
    private javax.swing.JTextField EmpEmail;
    private javax.swing.JPasswordField EmpPassword;
    private javax.swing.JTextField EmpUsername;
    private javax.swing.JLabel PhotoEmp;
    private javax.swing.JButton UploadPhoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}