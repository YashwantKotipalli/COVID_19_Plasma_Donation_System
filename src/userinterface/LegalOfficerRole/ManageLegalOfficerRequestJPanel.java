/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LegalOfficerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LegalOfficerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import HomePages.TableFormat;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Akshay
 */
public class ManageLegalOfficerRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageLegalOfficerRequestJPanel
     */
    private EcoSystem system;
    private UserAccount userAccount;
    private LegalOfficerOrganization legalofficerorganization;
    private Enterprise enterprise;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
    public ManageLegalOfficerRequestJPanel(EcoSystem system, UserAccount userAccount, LegalOfficerOrganization legalofficerorganization, Enterprise enterprise) {
        initComponents();
        this.system = system;
        this.userAccount = userAccount;
        this.legalofficerorganization = legalofficerorganization;
        this.enterprise = enterprise;
        
        tblLegalOrganisation.getTableHeader().setDefaultRenderer(new TableFormat());
        tblLegalOfficer.getTableHeader().setDefaultRenderer(new TableFormat());
        populateOrganisationpatientTable();
        populateLegalPatientTable();
        
    }

    public void populateOrganisationpatientTable(){
        DefaultTableModel model = (DefaultTableModel)tblLegalOrganisation.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : legalofficerorganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSummary();
            row[2] = request.getPatient();
            row[3] = request.getPatient().getName();
            row[4] = request.getPatient().getEmailID();
            row[5] = request.getStatus();
            
            model.addRow(row);
        }
    }
    
  
     public void populateLegalPatientTable(){
        DefaultTableModel model = (DefaultTableModel)tblLegalOfficer.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getPatient();
            row[2] = request.getPatient().getName();
            row[3] = request.getPatient().getEmailID();
            row[4] = request.getUserAccount().getUsername();
            row[5] = request.getStatus();
             
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

        btnAssign = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLegalOrganisation = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLegalOfficer = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        messageTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        toTextField = new javax.swing.JTextField();
        fromTextField = new javax.swing.JTextField();
        subjectTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(208, 93, 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAssign.setBackground(new java.awt.Color(31, 31, 31));
        btnAssign.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Assign to me");
        btnAssign.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 140, 40));

        tblLegalOrganisation.setBackground(new java.awt.Color(0, 0, 0));
        tblLegalOrganisation.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblLegalOrganisation.setForeground(new java.awt.Color(255, 255, 255));
        tblLegalOrganisation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Summary", "Patient UID", "Patient Name", "Email", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLegalOrganisation.setGridColor(new java.awt.Color(0, 0, 0));
        tblLegalOrganisation.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblLegalOrganisation.setRowHeight(30);
        tblLegalOrganisation.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tblLegalOrganisation);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 1280, 190));

        tblLegalOfficer.setBackground(new java.awt.Color(0, 0, 0));
        tblLegalOfficer.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblLegalOfficer.setForeground(new java.awt.Color(255, 255, 255));
        tblLegalOfficer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Patient UID", "Patient Name", "Email", "Assigned to", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLegalOfficer.setGridColor(new java.awt.Color(0, 0, 0));
        tblLegalOfficer.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblLegalOfficer.setRowHeight(30);
        tblLegalOfficer.setShowVerticalLines(false);
        jScrollPane4.setViewportView(tblLegalOfficer);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 1280, 190));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Treatment Consent Request");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1556, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1580, -1));

        messageTextField.setBackground(new java.awt.Color(0, 0, 0));
        messageTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        messageTextField.setForeground(new java.awt.Color(255, 255, 255));
        add(messageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 680, 320, 130));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("To:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("From:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Subject:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 640, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Message: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 700, -1, -1));

        jButton1.setBackground(new java.awt.Color(31, 31, 31));
        jButton1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Send Consent Form On email");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 760, 290, 40));

        toTextField.setBackground(new java.awt.Color(0, 0, 0));
        toTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        toTextField.setForeground(new java.awt.Color(255, 255, 255));
        add(toTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 320, -1));

        fromTextField.setBackground(new java.awt.Color(0, 0, 0));
        fromTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        fromTextField.setForeground(new java.awt.Color(255, 255, 255));
        fromTextField.setText("aedprojecttitans@gmail.com");
        add(fromTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 600, 320, -1));

        subjectTextField.setBackground(new java.awt.Color(0, 0, 0));
        subjectTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        subjectTextField.setForeground(new java.awt.Color(255, 255, 255));
        add(subjectTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 320, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/legal-paper.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 130, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/letter.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 580, 130, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
       int selectedRow = tblLegalOrganisation.getSelectedRow();
        
        if (selectedRow < 0){
           //JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
           JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        else{
            WorkRequest request = (WorkRequest)tblLegalOrganisation.getValueAt(selectedRow, 0);    
           
            if(request.getStatus().equals("Assigned to Legal Pool"))
            {
            request.setStatus("Assign to LegalOfficer" + userAccount.getUsername());
            request.setUserAccount(userAccount);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
            else{
            //JOptionPane.showMessageDialog(null, "Work Request is already assigned!" );
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
             
            }
            dB4OUtil.storeSystem(system);
            populateOrganisationpatientTable();
            populateLegalPatientTable();
        }
        
    }//GEN-LAST:event_btnAssignActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if(toTextField.getText().equals("") || subjectTextField.getText().equals("") ||  messageTextField.getText().equals("")){

            JOptionPane.showMessageDialog(null,new JLabel("<html><h2><I>All fields are</I><font color='red'> mandatory</font>!</h2></html>"), "Error", JOptionPane.ERROR_MESSAGE);
       
            //JOptionPane.showMessageDialog(null, "Please fill all the fields!" );
        }
        else{
        String toEmail = toTextField.getText();
        //       String toEmail = "yashwant7kotipalli@gmail.com";
        //       final String fromEmail = "yashwant7kotipalli@gmail.com";
        final String fromEmail = fromTextField.getText();
        final String fromEmailPassword = "teamtitans"; //your email password
        String subject = subjectTextField.getText();

        Properties properties = new Properties();
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.EnableSSL.enable","true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.debug", "true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.setProperty("mail.smtp.socketFactory.fallback", "false");
        properties.setProperty("mail.smtp.port", "465");
        properties.setProperty("mail.smtp.socketFactory.port", "465");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, fromEmailPassword);
            }
        });

        try{
            MimeMessage message = new  MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(subject);
            message.setText(messageTextField.getText());
            Transport.send(message);
        }
        catch(MessagingException ex){
            System.out.println(""+ex);
        }

        
      //
      //
        int selectedRow = tblLegalOfficer.getSelectedRow();
       
        if(selectedRow <0){
        //JOptionPane.showMessageDialog(null,"Please select a row");
        JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
        else{
        WorkRequest request = (WorkRequest)tblLegalOfficer.getValueAt(selectedRow, 0);
       
            request.setStatus("Consent form sent");
            //request.setUserAccount(userAccount);
        //userAccount.getWorkQueue().getWorkRequestList().add(request);
        
        dB4OUtil.storeSystem(system);
        
        populateOrganisationpatientTable();
        populateLegalPatientTable();
        
        JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Consent Form<font color='green'> sent</font> successfully!</I></font></h2></html>"),"Info", JOptionPane.INFORMATION_MESSAGE);
      
        //JOptionPane.showMessageDialog(null,"Consent Form Sent Successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JTextField fromTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JTextField subjectTextField;
    private javax.swing.JTable tblLegalOfficer;
    private javax.swing.JTable tblLegalOrganisation;
    private javax.swing.JTextField toTextField;
    // End of variables declaration//GEN-END:variables
}
