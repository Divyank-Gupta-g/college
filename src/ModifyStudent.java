
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.sql.*;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;

public class ModifyStudent extends javax.swing.JFrame {

    ResultSet rs;
    /**
     * Creates new form AddStudent
     */
    public ModifyStudent() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 3, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Student Record");
        jLabel1.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(134, 160));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1683, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1683, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 650));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modify Student Details...");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 300, 50));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pin Code");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 150, 50));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date of Birth");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 150, 50));

        jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Father's Name");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 150, 50));

        jLabel12.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Mother's Name");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 160, 50));

        jLabel13.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Gender");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 150, 50));

        jLabel14.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Category");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 150, 50));

        jLabel15.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Mobile No.");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 150, 50));

        jLabel16.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Highest qualification");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 220, 50));

        jLabel17.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("E-mail add.");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 150, 50));

        jLabel18.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Set Password");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 150, 50));

        jLabel19.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Address");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 150, 50));

        jLabel20.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Course");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 150, 50));

        jTextField1.setBackground(new java.awt.Color(0, 51, 51));
        jTextField1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.setMaximumSize(new java.awt.Dimension(149, 36));
        jTextField1.setMinimumSize(new java.awt.Dimension(149, 36));
        jTextField1.setOpaque(true);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 360, 40));

        jTextField2.setBackground(new java.awt.Color(0, 51, 51));
        jTextField2.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        jTextField2.setMaximumSize(new java.awt.Dimension(149, 36));
        jTextField2.setMinimumSize(new java.awt.Dimension(149, 36));
        jTextField2.setOpaque(true);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 220, 360, 40));

        jTextField3.setBackground(new java.awt.Color(0, 51, 51));
        jTextField3.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);
        jTextField3.setMaximumSize(new java.awt.Dimension(149, 36));
        jTextField3.setMinimumSize(new java.awt.Dimension(149, 36));
        jTextField3.setOpaque(true);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 360, 40));

        jTextField4.setBackground(new java.awt.Color(0, 51, 51));
        jTextField4.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(null);
        jTextField4.setMaximumSize(new java.awt.Dimension(149, 36));
        jTextField4.setMinimumSize(new java.awt.Dimension(149, 36));
        jTextField4.setOpaque(true);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 340, 360, 40));

        jTextField6.setBackground(new java.awt.Color(0, 51, 51));
        jTextField6.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setBorder(null);
        jTextField6.setMaximumSize(new java.awt.Dimension(149, 36));
        jTextField6.setMinimumSize(new java.awt.Dimension(149, 36));
        jTextField6.setOpaque(true);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 360, 40));

        jTextField7.setBackground(new java.awt.Color(0, 51, 51));
        jTextField7.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setBorder(null);
        jTextField7.setMaximumSize(new java.awt.Dimension(149, 36));
        jTextField7.setMinimumSize(new java.awt.Dimension(149, 36));
        jTextField7.setOpaque(true);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 360, 40));

        jTextField8.setBackground(new java.awt.Color(0, 51, 51));
        jTextField8.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setBorder(null);
        jTextField8.setMaximumSize(new java.awt.Dimension(149, 36));
        jTextField8.setMinimumSize(new java.awt.Dimension(149, 36));
        jTextField8.setOpaque(true);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 400, 360, 40));

        jTextField9.setBackground(new java.awt.Color(0, 51, 51));
        jTextField9.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setBorder(null);
        jTextField9.setMaximumSize(new java.awt.Dimension(149, 36));
        jTextField9.setMinimumSize(new java.awt.Dimension(149, 36));
        jTextField9.setOpaque(true);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 360, 40));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("*All the fields are mandatory.");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 40, 250, 50));

        jButton1.setBackground(new java.awt.Color(0, 133, 147));
        jButton1.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 610, 150, 40));

        jButton2.setBackground(new java.awt.Color(0, 133, 147));
        jButton2.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, 150, 40));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter Student's User ID");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 260, 40));

        jTextField10.setBackground(new java.awt.Color(0, 204, 204));
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 320, 40));

        jTextField11.setBackground(new java.awt.Color(0, 51, 51));
        jTextField11.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setBorder(null);
        jTextField11.setMaximumSize(new java.awt.Dimension(149, 36));
        jTextField11.setMinimumSize(new java.awt.Dimension(149, 36));
        jTextField11.setOpaque(true);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 360, 40));

        jTextField12.setBackground(new java.awt.Color(0, 51, 51));
        jTextField12.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setBorder(null);
        jTextField12.setMaximumSize(new java.awt.Dimension(149, 36));
        jTextField12.setMinimumSize(new java.awt.Dimension(149, 36));
        jTextField12.setOpaque(true);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 360, 40));

        jTextField13.setBackground(new java.awt.Color(0, 51, 51));
        jTextField13.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setBorder(null);
        jTextField13.setMaximumSize(new java.awt.Dimension(149, 36));
        jTextField13.setMinimumSize(new java.awt.Dimension(149, 36));
        jTextField13.setOpaque(true);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 460, 350, 40));

        jTextField14.setBackground(new java.awt.Color(0, 51, 51));
        jTextField14.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setBorder(null);
        jTextField14.setMaximumSize(new java.awt.Dimension(149, 36));
        jTextField14.setMinimumSize(new java.awt.Dimension(149, 36));
        jTextField14.setOpaque(true);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 360, 40));

        jTextField5.setBackground(new java.awt.Color(0, 51, 51));
        jTextField5.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(null);
        jTextField5.setMaximumSize(new java.awt.Dimension(149, 36));
        jTextField5.setMinimumSize(new java.awt.Dimension(149, 36));
        jTextField5.setOpaque(true);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 160, 360, 40));

        jLabel10.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Student Name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 150, 50));

        jButton3.setBackground(new java.awt.Color(0, 133, 147));
        jButton3.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 610, 150, 40));

        jLabel4.setBackground(new java.awt.Color(0, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/collegemanagement/green 1 (1).jpg"))); // NOI18N
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1640, 856));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 102, 1683, 861));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminPage ad = new AdminPage();
        ad.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: 
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/clgmgmt?useSSL=false&allowPublicKeyRetrievel=true","root","Divyank@123"); 
                
                PreparedStatement p1 = null;
                PreparedStatement p2 = null;   
                PreparedStatement p3 = null;
                PreparedStatement p4 = null;
//                PreparedStatement p5 = null;
                PreparedStatement p6 = null;
                PreparedStatement p7 = null;
                PreparedStatement p8 = null;
                PreparedStatement p9 = null;
                PreparedStatement p10 = null;
                PreparedStatement p11 = null;
                PreparedStatement p12 = null;
                p1 = con.prepareStatement("UPDATE student SET name=? WHERE userId='"+jTextField10.getText()+"'"); 
                    p1.setString(1, jTextField9.getText());
                    
                p2 = con.prepareStatement("UPDATE student SET father=? WHERE userId='"+jTextField10.getText()+"'"); 
                    p2.setString(1, jTextField14.getText());
                    
                p3 = con.prepareStatement("UPDATE student SET mother=? WHERE userId='"+jTextField10.getText()+"'"); 
                    p3.setString(1, jTextField2.getText());
                    
                p4 = con.prepareStatement("UPDATE student SET pass=? WHERE userId='"+jTextField10.getText()+"'"); 
                    p4.setString(1, jTextField6.getText());
                    
//                p5 = con.prepareStatement("UPDATE student SET DOB=? WHERE userId='"+jTextField10.getText()+"'"); 
//                    java.util.Date date = new java.util.Date(jTextField5.getText());
//                    var sqldate = new java.sql.Date(date.getTime());
//                    p5.setDate(1, sqldate);
                    
                p6 = con.prepareStatement("UPDATE student SET gender=? WHERE userId='"+jTextField10.getText()+"'"); 
                    p6.setString(1, jTextField11.getText());
                    
                p7 = con.prepareStatement("UPDATE student SET category=? WHERE userId='"+jTextField10.getText()+"'"); 
                    p7.setString(1, jTextField12.getText());
                    
                p8 = con.prepareStatement("UPDATE student SET qualification=? WHERE userId='"+jTextField10.getText()+"'"); 
                    p8.setString(1, jTextField13.getText());
                    
                p9 = con.prepareStatement("UPDATE student SET mobile=? WHERE userId='"+jTextField10.getText()+"'"); 
                    p9.setString(1, jTextField3.getText());
                    
                p10 = con.prepareStatement("UPDATE student SET email=? WHERE userId='"+jTextField10.getText()+"'"); 
                    p10.setString(1, jTextField4.getText());
                    
                p11 = con.prepareStatement("UPDATE student SET address=? WHERE userId='"+jTextField10.getText()+"'");
                    p11.setString(1, jTextField7.getText());
                    
                p12 = con.prepareStatement("UPDATE student SET pin=? WHERE userId='"+jTextField10.getText()+"'"); 
                    p12.setInt(1, Integer.parseInt(jTextField8.getText()));
                    //
                    //
                    //
                    //
                    //
                    //
                    //p.
                    //p.setString(12, jTextField3.getText());
                    //p.
                    //p.
                    //p. 
                    p1.execute();
                    p2.execute();
                    p3.execute();
                    p4.execute();
//                    p5.execute();
                    p6.execute();
                    p7.execute();
                    p8.execute();
                    p9.execute();
                    p10.execute();
                    p11.execute();
                    p12.execute();
                    JOptionPane.showMessageDialog(rootPane, "Record is succesfully updated..."); 
                
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/clgmgmt?useSSL=false&allowPublicKeyRetrievel=true","root","Divyank@123"); 
                
                PreparedStatement p = con.prepareStatement("SELECT * FROM student where userId='"+jTextField10.getText()+"'");
                ResultSet rs=p.executeQuery();
                while(rs.next()){
                    jTextField1.setText(rs.getString(9));
                    jTextField2.setText(rs.getString(4));
                    jTextField3.setText(rs.getString(12));
                    jTextField4.setText(rs.getString(13));
                    jTextField6.setText(rs.getString(5));
                    jTextField7.setText(rs.getString(14));
                    jTextField8.setText(rs.getString(15));
                    jTextField9.setText(rs.getString(2));
                    jTextField11.setText(rs.getString(7));
                    jTextField12.setText(rs.getString(8));
                    jTextField13.setText(rs.getString(11));
                    jTextField14.setText(rs.getString(3));
                    jTextField5.setText(rs.getString(6));
                }    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/clgmgmt?useSSL=false&allowPublicKeyRetrievel=true","root","Divyank@123"); 
                
                PreparedStatement p = con.prepareStatement("delete from student where userId='"+jTextField10.getText()+"'");
                
                p.executeUpdate();
                JOptionPane.showConfirmDialog(rootPane,"Are you sure, you want to delete this data??");
                
                new ModifyStudent().setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        } 
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private Object SimpleDateFormat(String ddMMyyyy) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
