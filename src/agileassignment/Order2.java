package agileassignment;

import static agileassignment.Order.model;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Damon
 */
public class Order2 extends javax.swing.JFrame {
        static DefaultTableModel model1;
        static String total1;
    /**
     * Creates new form Order2
     */
    public Order2() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_List = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Label_TotalPrice = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pizza"));

        jButton2.setText("Chicken Mushroom Pizza");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Beef Mushroom Pizza");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Onions and Pepper Pizza");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton11.setText("Chicken Pizza");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Beverage"));

        jButton5.setText("Coca-Cola");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("Sprite");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("Lemon Tea");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("Ice Latte");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Salad"));

        jButton9.setText("Thousand Island Salad");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton10.setText("Lady's Choice Salad");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton12.setText("English Salad");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable_List.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Quantitiy", "Total(RM)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_List);
        if (jTable_List.getColumnModel().getColumnCount() > 0) {
            jTable_List.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable_List.getColumnModel().getColumn(1).setPreferredWidth(5);
            jTable_List.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        jLabel1.setText("Total (RM) :");

        Label_TotalPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label_TotalPrice.setText("0.00");

        jLabel2.setText("Restaurant :");

        jLabel3.setText("jLabel3");

        jButton15.setText("Submit");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Label_TotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton15)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_TotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15)
                    .addComponent(jButton1))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        model1 = (DefaultTableModel) jTable_List.getModel(); 
       this.setVisible(false);
       new AgileInterface2().setVisible(true);
       total1 = Label_TotalPrice.getText(); 
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int confirm =JOptionPane.showConfirmDialog(null, "Confirm?","Do you want to cancel your purchase?",JOptionPane.YES_NO_OPTION);
       if(confirm == JOptionPane.YES_OPTION){
           JOptionPane.showMessageDialog(null, "Thank you for your petronage");
           this.setVisible(false); 
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
               DefaultTableModel Model = (DefaultTableModel)this.jTable_List.getModel();
        Double TotalPrice =Double.parseDouble(Label_TotalPrice.getText().trim());
        
        if(CheckPackageAvailable("Chicken Pizza") == true){
            Integer PackageIndex = CheckPackageIndex("Chicken Pizza");
            Integer PackageCount = (Integer) Model.getValueAt(PackageIndex,1);
            Double PackagePrice = (Double) Model.getValueAt(PackageIndex,2);
            
            PackageCount += 1;
            PackagePrice += 15.00;
            TotalPrice += 15.00;
            Model.setValueAt(PackageCount,PackageIndex,1);
            Model.setValueAt(PackagePrice,PackageIndex,2);
            Label_TotalPrice.setText(TotalPrice.toString());
        }
        else{
            Integer PackageIndex = CheckPackageIndex("Chicken Pizza");
            String PackageName = "Chicken Pizza";
            Integer PackageCount = 1;
            Double PackagePrice = 15.00;
            TotalPrice += 15.00;
            Object[] row = {PackageName , PackageCount, PackagePrice };
            Model.addRow(row);
            Label_TotalPrice.setText(TotalPrice.toString());
        }
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
               DefaultTableModel Model = (DefaultTableModel)this.jTable_List.getModel();
        Double TotalPrice =Double.parseDouble(Label_TotalPrice.getText().trim());
        
        if(CheckPackageAvailable("Chicken Mushroom Pizza") == true){
            Integer PackageIndex = CheckPackageIndex("Chicken Mushroom Pizza");
            Integer PackageCount = (Integer) Model.getValueAt(PackageIndex,1);
            Double PackagePrice = (Double) Model.getValueAt(PackageIndex,2);
            
            PackageCount += 1;
            PackagePrice += 16.50;
            TotalPrice += 16.50;
            Model.setValueAt(PackageCount,PackageIndex,1);
            Model.setValueAt(PackagePrice,PackageIndex,2);
            Label_TotalPrice.setText(TotalPrice.toString());
        }
        else{
            Integer PackageIndex = CheckPackageIndex("Chicken Mushroom Pizza");
            String PackageName = "Chicken Mushroom Pizza";
            Integer PackageCount = 1;
            Double PackagePrice = 16.50;
            TotalPrice += 16.50;
            Object[] row = {PackageName , PackageCount, PackagePrice };
            Model.addRow(row);
            Label_TotalPrice.setText(TotalPrice.toString());
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        DefaultTableModel Model = (DefaultTableModel)this.jTable_List.getModel();
        Double TotalPrice =Double.parseDouble(Label_TotalPrice.getText().trim());
        
        if(CheckPackageAvailable("Beef Mushroom Pizza") == true){
            Integer PackageIndex = CheckPackageIndex("Beef Mushroom Pizza");
            Integer PackageCount = (Integer) Model.getValueAt(PackageIndex,1);
            Double PackagePrice = (Double) Model.getValueAt(PackageIndex,2);
            
            PackageCount += 1;
            PackagePrice += 18.50;
            TotalPrice += 18.50;
            Model.setValueAt(PackageCount,PackageIndex,1);
            Model.setValueAt(PackagePrice,PackageIndex,2);
            Label_TotalPrice.setText(TotalPrice.toString());
        }
        else{
            Integer PackageIndex = CheckPackageIndex("Beefn Mushroom Pizza");
            String PackageName = "Beef Mushroom Pizza";
            Integer PackageCount = 1;
            Double PackagePrice = 18.50;
            TotalPrice += 18.50;
            Object[] row = {PackageName , PackageCount, PackagePrice };
            Model.addRow(row);
            Label_TotalPrice.setText(TotalPrice.toString());
        }       
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        DefaultTableModel Model = (DefaultTableModel)this.jTable_List.getModel();
        Double TotalPrice =Double.parseDouble(Label_TotalPrice.getText().trim());
        
        if(CheckPackageAvailable("Onion Pepper Pizza") == true){
            Integer PackageIndex = CheckPackageIndex("Onion Pepper Pizza");
            Integer PackageCount = (Integer) Model.getValueAt(PackageIndex,1);
            Double PackagePrice = (Double) Model.getValueAt(PackageIndex,2);
            
            PackageCount += 1;
            PackagePrice += 12.50;
            TotalPrice += 12.50;
            Model.setValueAt(PackageCount,PackageIndex,1);
            Model.setValueAt(PackagePrice,PackageIndex,2);
            Label_TotalPrice.setText(TotalPrice.toString());
        }
        else{
            Integer PackageIndex = CheckPackageIndex("Onion Pepper Pizza");
            String PackageName = "Onion Pepper Pizza";
            Integer PackageCount = 1;
            Double PackagePrice = 12.50;
            TotalPrice += 12.50;
            Object[] row = {PackageName , PackageCount, PackagePrice };
            Model.addRow(row);
            Label_TotalPrice.setText(TotalPrice.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        DefaultTableModel Model = (DefaultTableModel)this.jTable_List.getModel();
        Double TotalPrice =Double.parseDouble(Label_TotalPrice.getText().trim());
        
        if(CheckPackageAvailable("Coca-Cola") == true){
            Integer PackageIndex = CheckPackageIndex("Coca-Cola");
            Integer PackageCount = (Integer) Model.getValueAt(PackageIndex,1);
            Double PackagePrice = (Double) Model.getValueAt(PackageIndex,2);
            
            PackageCount += 1;
            PackagePrice += 2.50;
            TotalPrice += 2.50;
            Model.setValueAt(PackageCount,PackageIndex,1);
            Model.setValueAt(PackagePrice,PackageIndex,2);
            Label_TotalPrice.setText(TotalPrice.toString());
        }
        else{
            Integer PackageIndex = CheckPackageIndex("Coca-Cola");
            String PackageName = "Coca-Cola";
            Integer PackageCount = 1;
            Double PackagePrice = 2.50;
            TotalPrice += 2.50;
            Object[] row = {PackageName , PackageCount, PackagePrice };
            Model.addRow(row);
            Label_TotalPrice.setText(TotalPrice.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        DefaultTableModel Model = (DefaultTableModel)this.jTable_List.getModel();
        Double TotalPrice =Double.parseDouble(Label_TotalPrice.getText().trim());
        
        if(CheckPackageAvailable("Sprite") == true){
            Integer PackageIndex = CheckPackageIndex("Sprite");
            Integer PackageCount = (Integer) Model.getValueAt(PackageIndex,1);
            Double PackagePrice = (Double) Model.getValueAt(PackageIndex,2);
            
            PackageCount += 1;
            PackagePrice += 2.50;
            TotalPrice += 2.50;
            Model.setValueAt(PackageCount,PackageIndex,1);
            Model.setValueAt(PackagePrice,PackageIndex,2);
            Label_TotalPrice.setText(TotalPrice.toString());
        }
        else{
            Integer PackageIndex = CheckPackageIndex("Sprite");
            String PackageName = "Sprite";
            Integer PackageCount = 1;
            Double PackagePrice = 2.50;
            TotalPrice += 2.50;
            Object[] row = {PackageName , PackageCount, PackagePrice };
            Model.addRow(row);
            Label_TotalPrice.setText(TotalPrice.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        DefaultTableModel Model = (DefaultTableModel)this.jTable_List.getModel();
        Double TotalPrice =Double.parseDouble(Label_TotalPrice.getText().trim());
        
        if(CheckPackageAvailable("Lemon Tea") == true){
            Integer PackageIndex = CheckPackageIndex("Lemon Tea");
            Integer PackageCount = (Integer) Model.getValueAt(PackageIndex,1);
            Double PackagePrice = (Double) Model.getValueAt(PackageIndex,2);
            
            PackageCount += 1;
            PackagePrice += 3.50;
            TotalPrice += 3.50;
            Model.setValueAt(PackageCount,PackageIndex,1);
            Model.setValueAt(PackagePrice,PackageIndex,2);
            Label_TotalPrice.setText(TotalPrice.toString());
        }
        else{
            Integer PackageIndex = CheckPackageIndex("Lemon Tea");
            String PackageName = "Lemon Tea";
            Integer PackageCount = 1;
            Double PackagePrice = 3.50;
            TotalPrice += 3.50;
            Object[] row = {PackageName , PackageCount, PackagePrice };
            Model.addRow(row);
            Label_TotalPrice.setText(TotalPrice.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        DefaultTableModel Model = (DefaultTableModel)this.jTable_List.getModel();
        Double TotalPrice =Double.parseDouble(Label_TotalPrice.getText().trim());
        
        if(CheckPackageAvailable("Ice Latte") == true){
            Integer PackageIndex = CheckPackageIndex("Ice Latte");
            Integer PackageCount = (Integer) Model.getValueAt(PackageIndex,1);
            Double PackagePrice = (Double) Model.getValueAt(PackageIndex,2);
            
            PackageCount += 1;
            PackagePrice += 4.50;
            TotalPrice += 4.50;
            Model.setValueAt(PackageCount,PackageIndex,1);
            Model.setValueAt(PackagePrice,PackageIndex,2);
            Label_TotalPrice.setText(TotalPrice.toString());
        }
        else{
            Integer PackageIndex = CheckPackageIndex("Ice Latte");
            String PackageName = "Ice Latte";
            Integer PackageCount = 1;
            Double PackagePrice = 4.50;
            TotalPrice += 4.50;
            Object[] row = {PackageName , PackageCount, PackagePrice };
            Model.addRow(row);
            Label_TotalPrice.setText(TotalPrice.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        DefaultTableModel Model = (DefaultTableModel)this.jTable_List.getModel();
        Double TotalPrice =Double.parseDouble(Label_TotalPrice.getText().trim());
        
        if(CheckPackageAvailable("Thousand Island Salad") == true){
            Integer PackageIndex = CheckPackageIndex("Thousand Island Salad");
            Integer PackageCount = (Integer) Model.getValueAt(PackageIndex,1);
            Double PackagePrice = (Double) Model.getValueAt(PackageIndex,2);
            
            PackageCount += 1;
            PackagePrice += 6.50;
            TotalPrice += 6.50;
            Model.setValueAt(PackageCount,PackageIndex,1);
            Model.setValueAt(PackagePrice,PackageIndex,2);
            Label_TotalPrice.setText(TotalPrice.toString());
        }
        else{
            Integer PackageIndex = CheckPackageIndex("Thousand Island Salad");
            String PackageName = "Thousand Island Salad";
            Integer PackageCount = 1;
            Double PackagePrice = 6.50;
            TotalPrice += 6.50;
            Object[] row = {PackageName , PackageCount, PackagePrice };
            Model.addRow(row);
            Label_TotalPrice.setText(TotalPrice.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        DefaultTableModel Model = (DefaultTableModel)this.jTable_List.getModel();
        Double TotalPrice =Double.parseDouble(Label_TotalPrice.getText().trim());
        
        if(CheckPackageAvailable("Lady's Choice Salad") == true){
            Integer PackageIndex = CheckPackageIndex("Lady's Choice Salad");
            Integer PackageCount = (Integer) Model.getValueAt(PackageIndex,1);
            Double PackagePrice = (Double) Model.getValueAt(PackageIndex,2);
            
            PackageCount += 1;
            PackagePrice += 4.50;
            TotalPrice += 4.50;
            Model.setValueAt(PackageCount,PackageIndex,1);
            Model.setValueAt(PackagePrice,PackageIndex,2);
            Label_TotalPrice.setText(TotalPrice.toString());
        }
        else{
            Integer PackageIndex = CheckPackageIndex("Lady's Choice Salad");
            String PackageName = "Lady's Choice Salad";
            Integer PackageCount = 1;
            Double PackagePrice = 4.50;
            TotalPrice += 4.50;
            Object[] row = {PackageName , PackageCount, PackagePrice };
            Model.addRow(row);
            Label_TotalPrice.setText(TotalPrice.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        DefaultTableModel Model = (DefaultTableModel)this.jTable_List.getModel();
        Double TotalPrice =Double.parseDouble(Label_TotalPrice.getText().trim());
        
        if(CheckPackageAvailable("English Salad") == true){
            Integer PackageIndex = CheckPackageIndex("English Salad");
            Integer PackageCount = (Integer) Model.getValueAt(PackageIndex,1);
            Double PackagePrice = (Double) Model.getValueAt(PackageIndex,2);
            
            PackageCount += 1;
            PackagePrice += 5.50;
            TotalPrice += 5.50;
            Model.setValueAt(PackageCount,PackageIndex,1);
            Model.setValueAt(PackagePrice,PackageIndex,2);
            Label_TotalPrice.setText(TotalPrice.toString());
        }
        else{
            Integer PackageIndex = CheckPackageIndex("English Salad");
            String PackageName = "English Salad";
            Integer PackageCount = 1;
            Double PackagePrice = 5.50;
            TotalPrice += 5.50;
            Object[] row = {PackageName , PackageCount, PackagePrice };
            Model.addRow(row);
            Label_TotalPrice.setText(TotalPrice.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MouseClicked
   
 private Boolean CheckPackageAvailable(String PPackage){
        DefaultTableModel Model = (DefaultTableModel)this.jTable_List.getModel();
        Boolean Available = false;
            for (int count = 0; count < Model.getRowCount(); count++){
                if(Model.getValueAt(count, 0).toString().equals(PPackage)){
                    Available = true;   
                }
            }
        return Available;
     }
    
    private Integer CheckPackageIndex(String PPackage){
        DefaultTableModel Model = (DefaultTableModel)this.jTable_List.getModel();
        Integer PackgeIndex = 0;
            for (int count = 0; count < Model.getRowCount(); count++){
                if(Model.getValueAt(count, 0).toString().equals(PPackage)){
                    PackgeIndex = count;   
                }
            }
        return PackgeIndex;
     }     

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
            java.util.logging.Logger.getLogger(Order2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_TotalPrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_List;
    // End of variables declaration//GEN-END:variables
}