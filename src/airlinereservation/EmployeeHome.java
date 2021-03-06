/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservation;

import javax.swing.JOptionPane;

/**
 *
 * @author CHARIF
 */
public class EmployeeHome extends javax.swing.JFrame {

    /**
     * Creates new form Homepage2
     */
    public EmployeeHome() {
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

        jDesktopPanel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        AddCustomerPart = new javax.swing.JMenuItem();
        ViewCustomerMenu = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        TickReservation = new javax.swing.JMenuItem();
        EnquiryTickets = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        FlightList = new javax.swing.JMenuItem();
        RegistrationList = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\CHARIF\\Downloads\\HOMEBLACK.jpg")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1368, 700));

        jDesktopPanel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1198, Short.MAX_VALUE)
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(274, 34));

        jMenu1.setText("Airline Reservation System");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        AddCustomerPart.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        AddCustomerPart.setForeground(new java.awt.Color(144, 181, 211));
        AddCustomerPart.setText("Add Customer");
        AddCustomerPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomerPartActionPerformed(evt);
            }
        });
        jMenu1.add(AddCustomerPart);

        ViewCustomerMenu.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ViewCustomerMenu.setForeground(new java.awt.Color(144, 181, 211));
        ViewCustomerMenu.setText("View Customer");
        ViewCustomerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCustomerMenuActionPerformed(evt);
            }
        });
        jMenu1.add(ViewCustomerMenu);

        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jMenuItem13.setForeground(new java.awt.Color(144, 181, 211));
        jMenuItem13.setText("Flights Info");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tickets");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        TickReservation.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        TickReservation.setForeground(new java.awt.Color(144, 181, 211));
        TickReservation.setText("Tickets Reservation ");
        TickReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TickReservationActionPerformed(evt);
            }
        });
        jMenu2.add(TickReservation);

        EnquiryTickets.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        EnquiryTickets.setForeground(new java.awt.Color(144, 181, 211));
        EnquiryTickets.setText("Tickets Enquiry");
        EnquiryTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnquiryTicketsActionPerformed(evt);
            }
        });
        jMenu2.add(EnquiryTickets);

        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(144, 181, 211));
        jMenuItem10.setText("Cancel Seat");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("List");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        FlightList.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        FlightList.setForeground(new java.awt.Color(144, 181, 211));
        FlightList.setText("Flights List");
        FlightList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightListActionPerformed(evt);
            }
        });
        jMenu3.add(FlightList);

        RegistrationList.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        RegistrationList.setForeground(new java.awt.Color(144, 181, 211));
        RegistrationList.setText("Customers List");
        RegistrationList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationListActionPerformed(evt);
            }
        });
        jMenu3.add(RegistrationList);

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(144, 181, 211));
        jMenuItem5.setText("Booking List");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(144, 181, 211));
        jMenuItem6.setText("Flight List By Departure Date");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(144, 181, 211));
        jMenuItem7.setText("Booking List By Departure Date");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Other");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(144, 181, 211));
        jMenuItem1.setText("Change Password");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(144, 181, 211));
        jMenuItem2.setText("Log Out");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
         Cancel_seat addflight=new  Cancel_seat();
        jDesktopPanel.add(addflight);
      addflight.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void FlightListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightListActionPerformed
        // TODO add your handling code here:
        Flights_List li=new   Flights_List();
        jDesktopPanel.add(li);
      li.setVisible(true);
    }//GEN-LAST:event_FlightListActionPerformed

    private void RegistrationListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationListActionPerformed
        // TODO add your handling code here:
        Customer_registration cusreg=new  Customer_registration();
        jDesktopPanel.add(cusreg);
        cusreg.setVisible(true);
    }//GEN-LAST:event_RegistrationListActionPerformed

    private void AddCustomerPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerPartActionPerformed
        // TODO add your handling code here:
        Add_Customer cus = new Add_Customer();
        jDesktopPanel.add(cus);
        cus.setVisible(true);
        
    }//GEN-LAST:event_AddCustomerPartActionPerformed

    private void ViewCustomerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCustomerMenuActionPerformed
        // TODO add your handling code here:
        ViewCustomer vcus = new ViewCustomer();
        jDesktopPanel.add(vcus);
        vcus.setVisible(true);
    }//GEN-LAST:event_ViewCustomerMenuActionPerformed

    private void TickReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TickReservationActionPerformed
        // TODO add your handling code here:
        Ticket_reservation res = new Ticket_reservation();
        jDesktopPanel.add(res);
        res.setVisible(true);
    }//GEN-LAST:event_TickReservationActionPerformed

    private void EnquiryTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnquiryTicketsActionPerformed
        // TODO add your handling code here:
        Enquiry_Tickets Tres = new Enquiry_Tickets();
        jDesktopPanel.add(Tres);
        Tres.setVisible(true);
    }//GEN-LAST:event_EnquiryTicketsActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         this.dispose();
      LOGIN obj=new LOGIN();
      obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         Change_Password chPass=new  Change_Password();
        jDesktopPanel.add(chPass);
    chPass.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        BookingLists chPass=new  BookingLists();
        jDesktopPanel.add(chPass);
       chPass.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        FlightByDate Datlist=new  FlightByDate();
        jDesktopPanel.add(Datlist);
        Datlist.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        BookingListByDate bkl = new BookingListByDate();
       jDesktopPanel.add(bkl);
        bkl.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        ViewFkightInfo vw = new ViewFkightInfo();
        jDesktopPanel.add(vw);
        vw.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddCustomerPart;
    private javax.swing.JMenuItem EnquiryTickets;
    private javax.swing.JMenuItem FlightList;
    private javax.swing.JMenuItem RegistrationList;
    private javax.swing.JMenuItem TickReservation;
    private javax.swing.JMenuItem ViewCustomerMenu;
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
}
