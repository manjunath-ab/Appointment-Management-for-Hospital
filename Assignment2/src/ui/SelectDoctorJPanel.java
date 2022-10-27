/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.Hospital;
import model.Patient;
import static ui.MainJFrame.patientDirectory;
import static ui.MainJFrame.doctorDirectory;

/**
 *
 * @author Admin
 */
public class SelectDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SelectDoctorJPanel
     */
    Hospital hospital;
    public SelectDoctorJPanel(Hospital hospital) {
        initComponents();
        this.hospital=hospital;
        populateTable();
    }
    private void populateTable(){
        
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for (Doctor e : hospital.getDoctorDirectory()){
            
            Object[] row = new Object[100];//2 members for now
            //row[0]=e.getName();
            row[0]=e;//1st column stores object names so..they get deleted
            row[1]=e.getSpecial();
            
            
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
        btnConsult = new javax.swing.JButton();
        txtPatientID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Doctor Name", "Specialization"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnConsult.setText("Consult");
        btnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultActionPerformed(evt);
            }
        });

        txtPatientID.setText("jTextField1");
        txtPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIDActionPerformed(evt);
            }
        });

        jLabel1.setText("Confirm Patient ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsult))
                .addGap(279, 279, 279))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addComponent(btnConsult)
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultActionPerformed
        // TODO add your handling code here:
        //select the right hospital directory
        //extract object..access hospita; directory and 
        int selectedRowIndex = jTable1.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a Doctor");
            return;
        }
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        //getting the whole object to manipulate
        Doctor selectedDoctor= (Doctor) model.getValueAt(selectedRowIndex,0);
        //testcases
        //System.out.print(selectedCommunity.getCommunityName());
        //System.out.print(selectedCommunity.getHospitalDirectory().get(0).getHospitalName());
        //get patient object:
        //bug fix
        for(Patient p: patientDirectory.getPatientDirectory()){
            
            if(p.getPatientID().equals(txtPatientID.getText())){
                for (Doctor e : doctorDirectory.getDoctorDirectory()){
                    if(e.getDocID().equals(selectedDoctor.getDocID())){
                        e.getPatientList().add(p);
                    }
                    
                }
            
                      
            }
            
            
        }
        
        
        //set the same values in doctor directory:
        
        /*for (Doctor e : DoctorDirectory.doctorDirectory){
            
            if(e.getDocID().equals(selectedDoctor.getDocID())){
                e.getPatientarr().add(txtPatientID.getText());
            }
            
        }*/
        
        
        //MainJFrame.splitPane.setRightComponent(searchDoctorPanel);
        //get community name and display list of hospitals in the next panel
        
    }//GEN-LAST:event_btnConsultActionPerformed

    private void txtPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtPatientID;
    // End of variables declaration//GEN-END:variables
}