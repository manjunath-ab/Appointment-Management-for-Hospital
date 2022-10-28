/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.Doctor;
import model.Hospital;
import model.Patient;
import static ui.MainJFrame.splitPane;

/**
 *
 * @author Admin
 */
public class SelectPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SelectPatientJPanel
     */
    Doctor d;
    public SelectPatientJPanel(Doctor d) {
        initComponents();
        this.d=d;
        populateTable();
    }
    
    private void populateTable(){
        
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for (Patient e : d.getPatientList()){
            
            Object[] row = new Object[100];//2 members for now
            //row[0]=e.getName();
            row[0]=e;//1st column stores object names so..they get deleted
            
            
            model.addRow(row);
            
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
        jTable1 = new javax.swing.JTable();
        btnDiagnose = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 0, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Patients"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnDiagnose.setText("Diagnose");
        btnDiagnose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnoseActionPerformed(evt);
            }
        });

        btnLog.setText("Logout");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnLog)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(btnDiagnose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnLog))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addComponent(btnDiagnose)
                .addContainerGap(173, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDiagnoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnoseActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a Hospital");
            return;
        }
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        //getting the whole object to manipulate
        Patient selectedPatient= (Patient) model.getValueAt(selectedRowIndex,0);
        DiagnoseJPanel diagnosePanel=new DiagnoseJPanel(selectedPatient);
        splitPane.setRightComponent(diagnosePanel);
    }//GEN-LAST:event_btnDiagnoseActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        // TODO add your handling code here:

        MainJFrame.splitPane.setRightComponent(MainJFrame.workPanel);
    }//GEN-LAST:event_btnLogActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiagnose;
    private javax.swing.JButton btnLog;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
