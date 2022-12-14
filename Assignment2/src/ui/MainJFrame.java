/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import model.City;
import model.Patient;
import model.PatientDirectory;
import model.Doctor;
import model.DoctorDirectory;
import model.UserLogin;
import model.UserLoginList;


/**
 *
 * @author Admin
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    static PatientDirectory patientDirectory;
    static DoctorDirectory doctorDirectory;
    static City commList;
    static UserLogin user;
    static UserLoginList userLoginList;
    public MainJFrame() {
        initComponents();
        commList= new City();
        user= new UserLogin();
        userLoginList=new UserLoginList();
        patientDirectory=new PatientDirectory();
        doctorDirectory=new DoctorDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnPatient = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        btnCommAdmin = new javax.swing.JButton();
        btnSysAdmin = new javax.swing.JButton();
        btnHosAdmin = new javax.swing.JButton();
        workPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlPanel.setBackground(new java.awt.Color(255, 102, 102));

        btnPatient.setBackground(new java.awt.Color(0, 0, 0));
        btnPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnPatient.setText("Patient Login");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnDoctor.setBackground(new java.awt.Color(0, 0, 0));
        btnDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnDoctor.setText("Doctor Login");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        btnCommAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnCommAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnCommAdmin.setText("Comm Admin Login");
        btnCommAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommAdminActionPerformed(evt);
            }
        });

        btnSysAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnSysAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnSysAdmin.setText("Sys Admin Login");
        btnSysAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSysAdminActionPerformed(evt);
            }
        });

        btnHosAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnHosAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnHosAdmin.setText("Hospital Admin Login");
        btnHosAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPatient, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDoctor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCommAdmin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSysAdmin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHosAdmin, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCommAdmin, btnDoctor, btnHosAdmin, btnPatient, btnSysAdmin});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnPatient)
                .addGap(30, 30, 30)
                .addComponent(btnDoctor)
                .addGap(35, 35, 35)
                .addComponent(btnCommAdmin)
                .addGap(37, 37, 37)
                .addComponent(btnSysAdmin)
                .addGap(35, 35, 35)
                .addComponent(btnHosAdmin)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        workPanel.setBackground(new java.awt.Color(102, 0, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Assignment 2");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome to my application,");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Please select an option on the left panel accordingly to access our services");

        javax.swing.GroupLayout workPanelLayout = new javax.swing.GroupLayout(workPanel);
        workPanel.setLayout(workPanelLayout);
        workPanelLayout.setHorizontalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(315, 315, 315))
        );
        workPanelLayout.setVerticalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(79, 79, 79)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(workPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
        PatientLoginJPanel loginPanel=new PatientLoginJPanel();
        
        splitPane.setRightComponent(loginPanel);
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        // TODO add your handling code here:
        /*ViewJPanel viewPanel = new ViewJPanel(history);
        splitPane.setRightComponent(viewPanel);*/
        //SearchJPanel searchPanel = new SearchJPanel(history);
        //splitPane.setRightComponent(searchPanel);
        DoctorLoginJPanel loginPanel=new DoctorLoginJPanel();
        
        splitPane.setRightComponent(loginPanel);
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnCommAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommAdminActionPerformed
        // TODO add your handling code here:
        CommLoginJPanel loginPanel=new CommLoginJPanel();
        
        splitPane.setRightComponent(loginPanel);
    }//GEN-LAST:event_btnCommAdminActionPerformed

    private void btnSysAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSysAdminActionPerformed
        // TODO add your handling code here:
        LoginJPanel loginPanel = new LoginJPanel();
        splitPane.setRightComponent(loginPanel);
        
    }//GEN-LAST:event_btnSysAdminActionPerformed

    private void btnHosAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosAdminActionPerformed
        // TODO add your handling code here:
        HospitalLoginJPanel loginPanel = new HospitalLoginJPanel();
        splitPane.setRightComponent(loginPanel);
    }//GEN-LAST:event_btnHosAdminActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
               
                
               
                user.setUserType("sysadmin");
                user.setUserName("SysAdmin");
                user.setPass("123");
                user.setUid(String.valueOf("S1"));
                userLoginList.getUserLoginList().add(user);
                
                //System.out.print(userLoginList.getUserLoginList());
                populatePreData();
                
            }
        });
    }
    
    public static void populatePreData(){
        UserLogin newUser=new UserLogin();//D1
        newUser.setUid("D1");
        newUser.setUserName("Doc1");
        newUser.setPass("123");
        newUser.setUserType("Doctor");
        UserLogin newUser1=new UserLogin();//D2
        newUser1.setUserName("Doc2");
        newUser1.setUid("D2");
        newUser1.setPass("123");
        newUser1.setUserType("Doctor");
        UserLogin newUser2=new UserLogin();//D3
        newUser2.setUserName("Doc3");
        newUser2.setUid("D3");
        newUser2.setPass("123");
        newUser2.setUserType("Doctor");
        UserLogin newUser3=new UserLogin();//D4
        newUser3.setUserName("Doc4");
        newUser3.setUid("D4");
        newUser3.setPass("123");
        newUser3.setUserType("Doctor");
        UserLogin newUser4=new UserLogin();//D5
        newUser4.setUserName("Doc5");
        newUser4.setUid("D5");
        newUser4.setPass("123");
        newUser4.setUserType("Doctor");
        UserLogin newUser5=new UserLogin();//D6
        newUser5.setUserName("Doc6");
        newUser5.setUid("D6");
        newUser5.setPass("123");
        newUser5.setUserType("Doctor");
        UserLogin newUser6=new UserLogin();//D7
        newUser6.setUserName("Doc7");
        newUser6.setUid("D7");
        newUser6.setPass("123");
        newUser6.setUserType("Doctor");
        UserLogin newUser7=new UserLogin();//D8
        newUser7.setUserName("Doc8");
        newUser7.setUid("D8");
        newUser7.setPass("123");
        newUser7.setUserType("Doctor");
        userLoginList.getUserLoginList().add(newUser);
        userLoginList.getUserLoginList().add(newUser1);
        userLoginList.getUserLoginList().add(newUser2);
        userLoginList.getUserLoginList().add(newUser3);
        userLoginList.getUserLoginList().add(newUser4);
        userLoginList.getUserLoginList().add(newUser5);
        userLoginList.getUserLoginList().add(newUser6);
        userLoginList.getUserLoginList().add(newUser7);
        doctorDirectory.getDoctorDirectory().add(new Doctor("Doc1","D1",1,"",1234567890,"fdsa","Cardiology"));
        doctorDirectory.getDoctorDirectory().add(new Doctor("Doc2","D2",1,"",1234567890,"","Neurology"));
        doctorDirectory.getDoctorDirectory().add(new Doctor("Doc3","D3",1,"",1234567890,"","Cardiology"));
        doctorDirectory.getDoctorDirectory().add(new Doctor("Doc4","D4",1,"",1234567890,"","Urology"));
        doctorDirectory.getDoctorDirectory().add(new Doctor("Doc5","D5",1,"",1234567890,"","Dermatology"));
        doctorDirectory.getDoctorDirectory().add(new Doctor("Doc6","D6",2,"",1234567890,"","Neurology"));
        doctorDirectory.getDoctorDirectory().add(new Doctor("Doc7","D7",1,"",1234567890,"","Urology"));
        doctorDirectory.getDoctorDirectory().add(new Doctor("Doc8","D8",1,"",1234567890,"","Dermatology"));
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommAdmin;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnHosAdmin;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnSysAdmin;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JSplitPane splitPane;
    public static javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
}
