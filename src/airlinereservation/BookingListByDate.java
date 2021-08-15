package airlinereservation;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHARIF
 */
public class BookingListByDate extends javax.swing.JInternalFrame {

    /**
     * Creates new form BookingListByDate
     */
    public BookingListByDate() {
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButtonShowing = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("BOOKING LIST BY DATE");
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
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(590, 50, 190, 30);
        jPanel1.add(jDateChooser2);
        jDateChooser2.setBounds(170, 50, 190, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DEPARTURE DATE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(430, 50, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DEPARTURE DATE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 50, 150, 30);

        ButtonShowing.setBackground(new java.awt.Color(51, 51, 255));
        ButtonShowing.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        ButtonShowing.setText("SHOW");
        ButtonShowing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonShowing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonShowingActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonShowing);
        ButtonShowing.setBounds(800, 50, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TO");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(380, 54, 40, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticke ID", "CUSTOMER ID", "CUSTOMER NAME", "FLIGHT ID", "FLIGHT NAME", "FLIGHT CHARGES", "FLIGHT CLASS", "SEAT", "AMOUNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 150, 990, 390);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\CHARIF\\Downloads\\phoyoprojectjava\\bydate.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-6, 4, 1000, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonShowingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShowingActionPerformed
        // TODO add your handling code here:
         try
            {
                
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
                
                try
                {
                    String q="select * from tickets where depDate between ? and ?";
                    pst=con.prepareStatement(q);
                    SimpleDateFormat myformat=new SimpleDateFormat("dd-MM-yyyy");
                   String doj1=myformat.format(jDateChooser1.getDate());
                         String doj2=myformat.format(jDateChooser2.getDate());
                         pst.setString(1,doj1);
                          pst.setString(2,doj2);
            DefaultTableModel mymodel=(DefaultTableModel) jTable1.getModel();
            mymodel.setNumRows(0);
                    ResultSet myresult=pst.executeQuery();
                     if(myresult.next())
                    {
                           jScrollPane1.setVisible(true);
                     getContentPane().validate();
                        do
                        {
                  
                        String tno=myresult.getString("Ticket_Id");
                          String custid=myresult.getString("Cust_ID");
                          String custname=myresult.getString("CustName");
                          String fId = myresult.getString("FlightID");
                          String flName = myresult.getString("FlightName");
                          String fcha = myresult.getString("flightCharge");
                          String fclass = myresult.getString("flightClass");
                          String fseat = myresult.getString("seats");
                          String famount = myresult.getString("amount");
                          mymodel.addRow(new Object[]{tno,custid,custname,fId,flName,fcha,fclass,fseat,famount});
                    }
                        while(myresult.next());
                    }
                  else
                     {
                         jScrollPane1.setVisible(false);
                     getContentPane().validate();
                        JOptionPane.showMessageDialog(rootPane, "No Records ", "Error",JOptionPane.ERROR_MESSAGE); 
                     }       
                       
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
    }//GEN-LAST:event_ButtonShowingActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
         try
            {
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
                
                try
                {
                  jScrollPane1.setVisible(true);
                  getContentPane().validate();
                     
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
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonShowing;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}