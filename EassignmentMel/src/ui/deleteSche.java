/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import DA.scheOrderDA;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author walauahahaha
 */
public class deleteSche extends javax.swing.JFrame {
private static List<scheOrderDA> scheOrderLIST = new ArrayList<>();
        
        

   
    /**
     * Creates new form deleteSche
     */
    public deleteSche() {
        scheOrderDA[] ScheDA = {
            new scheOrderDA("sc001", "Jess Wong", "James Fool", "Chicken Chop Set", "Day", "", "17/11/17", "17/11/18", "1 year", "Evening(5pm)", "1"),
            new scheOrderDA("sc002", "Tan Kar Kheng", "James Fool", "Salad Set", "Week", "Monday, Wednesday, Friday", "21/11/17", "21/02/18", "3 months", "Dinner(6pm)", "2"),
            new scheOrderDA("sc003", "Look Chee Thong", "Hello&Co", "Sirloin Steak Set", "Week", "Friday", "18/11/17", "18/02/18", "3 months", "Night(7pm)", "2"),
            new scheOrderDA("sc004", "Tan Cheng Look", "Kim Gari", "HK Lunch Set", "Week", "Monday, Tuesday, Wednesday, Thursday, Saturday", "10/09/2017", "10/12/2017", "3 months", "Afternoon(1pm)", "5")};
        for (int i = 0; i < ScheDA.length; i++) {
            scheOrderLIST.add(ScheDA[i]);
        }
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
        jSeparator1 = new javax.swing.JSeparator();
        timeL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        retrieveBut = new javax.swing.JButton();
        clearBut = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        dayRadio = new javax.swing.JRadioButton();
        weekRadio = new javax.swing.JRadioButton();
        monCheck = new javax.swing.JCheckBox();
        tueCheck = new javax.swing.JCheckBox();
        wedCheck = new javax.swing.JCheckBox();
        thurCheck = new javax.swing.JCheckBox();
        friCheck = new javax.swing.JCheckBox();
        satCheck = new javax.swing.JCheckBox();
        sunCheck = new javax.swing.JCheckBox();
        idText = new javax.swing.JTextField();
        dateFText = new javax.swing.JTextField();
        durText = new javax.swing.JTextField();
        dateTText = new javax.swing.JTextField();
        sesText = new javax.swing.JTextField();
        restText = new javax.swing.JTextField();
        fbText = new javax.swing.JTextField();
        quanText = new javax.swing.JTextField();
        deleteBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Delete Scheduled Order");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Schedule Order ID :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("To:");

        retrieveBut.setText("Retrieve");
        retrieveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveButActionPerformed(evt);
            }
        });

        clearBut.setText("Clear");
        clearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Session :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Time Duration :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Every :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Restaurant :");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Food and Beverage :");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("set(s)");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Date From :");

        dayRadio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dayRadio.setText("Day");
        dayRadio.setEnabled(false);

        weekRadio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        weekRadio.setText("Week");
        weekRadio.setEnabled(false);

        monCheck.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        monCheck.setText("Monday");
        monCheck.setEnabled(false);

        tueCheck.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tueCheck.setText("Tuesday");
        tueCheck.setEnabled(false);

        wedCheck.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        wedCheck.setText("Wednesday");
        wedCheck.setEnabled(false);

        thurCheck.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        thurCheck.setText("Thursday");
        thurCheck.setEnabled(false);

        friCheck.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        friCheck.setText("Friday");
        friCheck.setEnabled(false);

        satCheck.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        satCheck.setText("Saturday");
        satCheck.setEnabled(false);

        sunCheck.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sunCheck.setText("Sunday");
        sunCheck.setEnabled(false);

        idText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        dateFText.setEditable(false);
        dateFText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        durText.setEditable(false);
        durText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        dateTText.setEditable(false);
        dateTText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        sesText.setEditable(false);
        sesText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        restText.setEditable(false);
        restText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        fbText.setEditable(false);
        fbText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        quanText.setEditable(false);
        quanText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        deleteBut.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteBut.setText("Delete");
        deleteBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(durText, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(dateFText)
                                    .addComponent(idText))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(retrieveBut)
                                        .addGap(18, 18, 18)
                                        .addComponent(clearBut))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateTText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sesText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(timeL)
                        .addGap(110, 110, 110))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(weekRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thurCheck)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(monCheck)
                                    .addComponent(tueCheck)
                                    .addComponent(wedCheck))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sunCheck)
                                    .addComponent(friCheck)
                                    .addComponent(satCheck))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dayRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(restText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fbText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteBut)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quanText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(timeL, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(retrieveBut)
                    .addComponent(clearBut)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(dateFText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(durText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(dayRadio)
                    .addComponent(restText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(weekRadio)
                    .addComponent(fbText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quanText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monCheck)
                            .addComponent(friCheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tueCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(satCheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wedCheck)
                            .addComponent(sunCheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(thurCheck)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBut)
                        .addContainerGap())))
        );

        timeL.getAccessibleContext().setAccessibleName("");
        jLabel2.getAccessibleContext().setAccessibleName("Schedule Order ID :");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retrieveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveButActionPerformed
        scheOrderDA SO = null;
        String searchID = idText.getText();
        for (int i = 0; i < scheOrderLIST.size(); i++) {
            if (searchID.equals( scheOrderLIST.get(i).getScheID())) {
                SO = scheOrderLIST.get(i);
            }
        }
        if (SO != null) {
            
            dateFText.setText(SO.getDateF());
            dateTText.setText(SO.getDateT());
            restText.setText(SO.getRest());
            sesText.setText(SO.getSes());
            durText.setText(SO.gettDur());
            fbText.setText(SO.getFb());
            quanText.setText(SO.getQuant());
            if (SO.getDayWeek().equalsIgnoreCase("Day")) {
                dayRadio.setSelected(true);
                weekRadio.setSelected(false);
            } else {
                dayRadio.setSelected(false);
                weekRadio.setSelected(true);
                String[] days=SO.getPeriod().split("[, ]");
                for(int i=0;i<days.length;i++){
                    if(days[i].equalsIgnoreCase("monday")){
                        monCheck.setSelected(true);
                    }else if(days[i].equalsIgnoreCase("tueday")){
                        tueCheck.setSelected(true);
                    }else if(days[i].equalsIgnoreCase("wednesday")){
                        wedCheck.setSelected(true);
                    }else if(days[i].equalsIgnoreCase("thursday")){
                        thurCheck.setSelected(true);
                    }else if(days[i].equalsIgnoreCase("friday")){
                        friCheck.setSelected(true);
                    }else if(days[i].equalsIgnoreCase("saturday")){
                        satCheck.setSelected(true);
                    }else if(days[i].equalsIgnoreCase("sunday")){
                        sunCheck.setSelected(true);
                    }
                }
            }
        }else{
        JOptionPane.showMessageDialog(null, "Incorrect schedule order ID", "Error", JOptionPane.ERROR_MESSAGE);
        clear();
    }
    }//GEN-LAST:event_retrieveButActionPerformed

    public void clear(){
         idText.setText("");
        dateFText.setText("");
        dateTText.setText("");
        quanText.setText("");
        sesText.setText("");
        restText.setText("");
        fbText.setText("");
        durText.setText("");

        dayRadio.setSelected(false);
        weekRadio.setSelected(false);
        monCheck.setSelected(false);
        tueCheck.setSelected(false);
        wedCheck.setSelected(false);
        thurCheck.setSelected(false);
        friCheck.setSelected(false);
        satCheck.setSelected(false);
        sunCheck.setSelected(false);
        retrieveBut.setEnabled(true);
    }
    private void clearButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButActionPerformed
         clear();
    }//GEN-LAST:event_clearButActionPerformed

    private void deleteButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButActionPerformed
       int a = JOptionPane.showConfirmDialog(null, "Are you sure?", "Message", JOptionPane.YES_NO_OPTION);
        if(a == JOptionPane.YES_OPTION){
        String scheOID = idText.getText();
        for (int i = 0; i < scheOrderLIST.size(); i++){
            {
                final scheOrderDA s = scheOrderLIST.get(i);
               // if (f.scheOID.equals(scheID)) {
                if (scheOID.equals( s.getScheID())){
                    scheOrderLIST.remove(i);

                    JOptionPane.showMessageDialog(null, "Deleted successful", "Message", JOptionPane.INFORMATION_MESSAGE);
            clear();
                }
            }
        }
        }else{
            JOptionPane.showMessageDialog(null, "Delete unsuccessful", "Message", JOptionPane.INFORMATION_MESSAGE);
            clear();
        }
        
    }//GEN-LAST:event_deleteButActionPerformed

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
            java.util.logging.Logger.getLogger(deleteSche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteSche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteSche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteSche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {               
                new deleteSche().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBut;
    private javax.swing.JTextField dateFText;
    private javax.swing.JTextField dateTText;
    private javax.swing.JRadioButton dayRadio;
    private javax.swing.JButton deleteBut;
    private javax.swing.JTextField durText;
    private javax.swing.JTextField fbText;
    private javax.swing.JCheckBox friCheck;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JCheckBox monCheck;
    private javax.swing.JTextField quanText;
    private javax.swing.JTextField restText;
    private javax.swing.JButton retrieveBut;
    private javax.swing.JCheckBox satCheck;
    private javax.swing.JTextField sesText;
    private javax.swing.JCheckBox sunCheck;
    private javax.swing.JCheckBox thurCheck;
    private javax.swing.JLabel timeL;
    private javax.swing.JCheckBox tueCheck;
    private javax.swing.JCheckBox wedCheck;
    private javax.swing.JRadioButton weekRadio;
    // End of variables declaration//GEN-END:variables
}