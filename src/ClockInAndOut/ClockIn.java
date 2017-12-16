package clockinandout;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author End User
 */
public final class ClockIn extends javax.swing.JFrame {

 
  private List<Employee> employeeList = new ArrayList<>();
  
  
String empID2;
  public ClockIn() {
   
            initComponents();
   
  }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jButtonClockIn = new javax.swing.JButton();
        jButtonClockOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfEmployeeID = new javax.swing.JTextField();
        jButtonDisplay = new javax.swing.JButton();
        lblDisplayMessage = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableHidden = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCheckName = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonClockIn.setText("Clock in");
        jButtonClockIn.setEnabled(false);
        jButtonClockIn.setToolTipText("");
        jButtonClockIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClockInActionPerformed(evt);
            }
        });
        jButtonClockIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonClockInKeyPressed(evt);
            }
        });

        jButtonClockOut.setText("Clock Out");
        jButtonClockOut.setEnabled(false);
        jButtonClockOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClockOutActionPerformed(evt);
            }
        });

        jLabel2.setText("Employee ID    :");

        jLabel3.setText("Time :");

        jLabel4.setText("Date :");

        jtfEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmployeeIDActionPerformed(evt);
            }
        });

        jButtonDisplay.setText("Display employee records");
        jButtonDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisplayActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "Status", "Time"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTableHidden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"S1000", "Dc CHen"},
                {"S1001", "kah sheng"},
                {"S1002", "Edison kah"},
                {"S1003", "Elynn"},
                {"S1004", "Lambert"}
            },
            new String [] {
                "Deliveryman ID", "Deliveryman Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableHidden);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));

        jTableCheckName.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name"
            }
        ));
        jScrollPane1.setViewportView(jTableCheckName);

        jButton2.setText("Enable Clock Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(lblDisplayMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(369, 369, 369)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonClockOut, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonClockIn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jButton2)))
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButtonClockIn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonClockOut, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButtonDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(199, 199, 199)
                .addComponent(lblDisplayMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClockOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClockOutActionPerformed
        jButtonClockOut.setEnabled(false);
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year= cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        jLabel6.setText(day +":" + (month+1)+":"+year);
              
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        
        String empID = jtfEmployeeID.getText();
        TableModel model = (TableModel) jTableHidden.getModel();
        DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
        String date = jLabel5.getText();
        String status = "Clock Out";

        int nRow = model.getRowCount(), nCol = model.getColumnCount();

        if (!jtfEmployeeID.getText().trim().equals("")) {
            for (int i = 0; i < nRow; i++) {
                empID2 = model.getValueAt(i, 0).toString();
                String Name = model.getValueAt(i, 1).toString();
                if (empID.equals(empID2)) {
                    model2.addRow(new Object[]{empID, Name, status, date});
                }
            }
        jLabel5.setText(hour +":" + (minute)+":"+second);
        lblDisplayMessage.setText("You have checked out.");
        
        }
        else {
            JOptionPane.showMessageDialog(null, "ID should not leave it blank!", "Message", JOptionPane.ERROR_MESSAGE);
        }
        
        
        //String name = jtfName.getText();
        //Employee employee = new Employee(name);
        //employeeList.add(employee);
        jtfEmployeeID.setText("");
        jTableCheckName.setModel(new DefaultTableModel(null,new String[]{"Name"}));
        jtfEmployeeID.grabFocus();
        
        
    }//GEN-LAST:event_jButtonClockOutActionPerformed

    private void jButtonClockInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClockInActionPerformed
        
        
        jButtonClockIn.setEnabled(false);
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year= cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        jLabel6.setText(day +":" + (month+1)+":"+year);
              
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        jLabel5.setText(hour +":" + (minute)+":"+second);
        String empID = jtfEmployeeID.getText();
        TableModel model = (TableModel) jTableHidden.getModel();
        DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
        String date = jLabel5.getText();
        String status = "Clock In";
        
        int nRow = model.getRowCount(), nCol = model.getColumnCount();

        if (!jtfEmployeeID.getText().trim().equals("")) {
            for (int i = 0; i < nRow; i++) {
                empID2 = model.getValueAt(i, 0).toString();
                String Name = model.getValueAt(i, 1).toString();
                if (empID.equals(empID2)) {
                    model2.addRow(new Object[]{empID, Name, status, date});
                    lblDisplayMessage.setText("You have checked in.");
                }
            }
            jLabel5.setText(hour +":" + (minute)+":"+second);
        
        
        } else {
            JOptionPane.showMessageDialog(null, "ID should not leave it blank!", "Message", JOptionPane.ERROR_MESSAGE);
        }
        //String name = jtfName.getText();
        //Employee employee = new Employee(name);
        //employeeList.add(employee);
        jtfEmployeeID.setText("");
        jTableCheckName.setModel(new DefaultTableModel(null,new String[]{"Name"}));
        jtfEmployeeID.grabFocus();
        
        
        
       
    }//GEN-LAST:event_jButtonClockInActionPerformed

    private void jtfEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmployeeIDActionPerformed
        
    }//GEN-LAST:event_jtfEmployeeIDActionPerformed

    private void jButtonDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisplayActionPerformed
        
    }//GEN-LAST:event_jButtonDisplayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTableCheckName.setModel(new DefaultTableModel(null,new String[]{"Name"}));
        String empID = jtfEmployeeID.getText();
        TableModel model = (TableModel) jTableHidden.getModel();
        DefaultTableModel model2 = (DefaultTableModel) jTableCheckName.getModel();
        
         
        int nRow = model.getRowCount(), nCol = model.getColumnCount();
                
            for (int i = 0; i < nRow; i++) {
                empID2 = model.getValueAt(i, 0).toString();
                String Name = model.getValueAt(i, 1).toString();
                if (empID.equals(empID2)) {
                    model2.addRow(new Object[]{Name});
                }
            }
        
        int YesOrNo = JOptionPane.showConfirmDialog(null, "is it your name?","is it your name?",JOptionPane.YES_NO_OPTION);
        
        if(YesOrNo == 0)
        {
                jLabel1.setText("");
                jButtonClockIn.setEnabled(true);
                jButtonClockOut.setEnabled(false);
                
        }
        else{
                
                jtfEmployeeID.setText("");
                jLabel1.setText(" **     Retype to Try again~");
                jTableCheckName.setModel(new DefaultTableModel(null,new String[]{"Name"}));
        }
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonClockInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonClockInKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClockInKeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex =jTable1.getSelectedRow();
        jtfEmployeeID.setText(model.getValueAt(selectedRowIndex,0).toString());
        jButtonClockOut.setEnabled(true);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTable1.setEnabled(true);
         jTableCheckName.setModel(new DefaultTableModel(null,new String[]{"Name"}));
    }//GEN-LAST:event_jButton2ActionPerformed
    
        
        
        

        
     
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
            java.util.logging.Logger.getLogger(ClockIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClockIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClockIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClockIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClockIn().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonClockIn;
    private javax.swing.JButton jButtonClockOut;
    private javax.swing.JButton jButtonDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableCheckName;
    private static javax.swing.JTable jTableHidden;
    private javax.swing.JTextField jtfEmployeeID;
    private java.awt.Label lblDisplayMessage;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables

   
}
