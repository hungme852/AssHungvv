/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hungvvpk00504_Assignment;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Windows 10 Version 2
 */
public class frmQLTK extends javax.swing.JFrame {
    

    /**
     * Creates new form frmLoaiSanPham
     */
    public frmQLTK() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblFormTitle = new javax.swing.JLabel();
        pnlFunction = new javax.swing.JPanel();
        lblMaLoai = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTaoMoi = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        lblName2 = new javax.swing.JLabel();
        cbbQuyen = new javax.swing.JComboBox();
        lblName3 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDSUsers = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblFormTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFormTitle.setForeground(new java.awt.Color(255, 153, 51));
        lblFormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFormTitle.setText("QUẢN LÝ TÀI KHOẢN");

        pnlFunction.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));

        lblMaLoai.setText("ID:");

        txtID.setEditable(false);

        lblName.setText("Username:");

        lblName1.setText("Password:");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTaoMoi.setText("Tạo mới");
        btnTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoiActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        lblName2.setText("Quyền quản lý:");

        cbbQuyen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblName3.setText("Họ và tên:");

        jButton1.setText("Đăng xuất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFunctionLayout = new javax.swing.GroupLayout(pnlFunction);
        pnlFunction.setLayout(pnlFunctionLayout);
        pnlFunctionLayout.setHorizontalGroup(
            pnlFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFunctionLayout.createSequentialGroup()
                .addGroup(pnlFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFunctionLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(pnlFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFunctionLayout.createSequentialGroup()
                                .addGroup(pnlFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName1)
                                    .addComponent(lblName2)
                                    .addComponent(lblName)
                                    .addComponent(lblMaLoai)
                                    .addComponent(lblName3))
                                .addGroup(pnlFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFunctionLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlFunctionLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbbQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(pnlFunctionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnTaoMoi)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFunctionLayout.setVerticalGroup(
            pnlFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFunctionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaLoai)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName1)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName2)
                    .addComponent(cbbQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName3))
                .addGap(46, 46, 46)
                .addGroup(pnlFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnTaoMoi)
                    .addComponent(jButton1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tblDSUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã loại", "Tên", "Mô tả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSUsersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDSUsers);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(pnlFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFormTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblFormTitle)
                .addGap(18, 18, 18)
                .addComponent(pnlFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        
        String username, password,roleID, fullName;
        username = txtUsername.getText();
        password = txtPassword.getText();
        fullName = txtFullName.getText();
        
        
        
        Object[] obj = cbbQuyen.getSelectedObjects();
        DisplayValueModel item = (DisplayValueModel) obj[0];
        roleID = item.DisplayValue.toString();
        
        String cautruyvan = "insert into Users(UserName,Password,RoleID,Fullname) "
        + "values('"+username+"','"+password+"','"+roleID+"',N'"+fullName+"')" ;
        if(!username.equals("")&& !password.equals("") && !roleID.equals("") &&!fullName.equals("") ){
            Hungvvpk00504_Assignment.connection.ExcuteQueryUpdateDB(cautruyvan);
        }else{
            System.out.println("Bạn Chưa Nhập Dữ liệu");
        }
        LayDuLieu();
    }//GEN-LAST:event_btnThemActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LayDuLieu();
        LayDuLieuQuyen();
        
    }//GEN-LAST:event_formWindowOpened

    private void tblDSUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSUsersMouseClicked
        int viTriDongVuaBam = tblDSUsers.getSelectedRow();        
        txtID.setText(tblDSUsers.getValueAt(viTriDongVuaBam,1).toString());
        txtUsername.setText(tblDSUsers.getValueAt(viTriDongVuaBam,2).toString());
        txtPassword.setText(tblDSUsers.getValueAt(viTriDongVuaBam,3).toString());
        txtFullName.setText(tblDSUsers.getValueAt(viTriDongVuaBam, 4).toString());
        String TenRole = tblDSUsers.getValueAt(viTriDongVuaBam, 5).toString();
        setSelectedCombobox(TenRole);
        
        
    }//GEN-LAST:event_tblDSUsersMouseClicked

    private void setSelectedCombobox(String TenRole){

               //Vong lap lay tat cả loại sp trong combobox
               for(int i = 0; i < cbbQuyen.getItemCount(); i++){
                   // Lấy từng giá Element trong Combobox và gán vào 1 biến Object
                   //Vì Combobox kiểu Object
                   Object obj = cbbQuyen.getItemAt(i);

                   if(obj != null){
                       //Ép kiểu Obj về kiểu DisplayValueModel
                       DisplayValueModel m = (DisplayValueModel)obj;
                       //Nếu tên loại bằng với DisplayMember của obj thì chọn lại combobox
                       if(TenRole.equals(m.DisplayMember)){
                           //cbbMaLoai.setSelectedItem(m);//Chọn lịa cbb theo vị trí
                           cbbQuyen.setSelectedItem(m);//Chọn lịa cbb theo Element
                       }
                   }
               }
           }
    
    
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String ID,username, password,roleID, fullName;
        ID = txtID.getText();
        username = txtUsername.getText();
        password = txtPassword.getText();
        fullName = txtFullName.getText();
        
        Object[] obj = cbbQuyen.getSelectedObjects();
        DisplayValueModel item = (DisplayValueModel) obj[0];
        roleID = item.DisplayValue.toString();
        
        String cautruyvan = "update Users "
        + "set UserName = '" + username + "', Password='"+password+"',RoleID='"+roleID+"',Fullname=N'"+fullName+"'"
        + " where ID = "+ID;
        Hungvvpk00504_Assignment.connection.ExcuteQueryUpdateDB(cautruyvan);
        LayDuLieu();
        
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
//        String maLoaiCanXoa = txtMaLoai.getText();
//        String cautruyvan = "delete from LoaiSanPham where MaLoai ="+maLoaiCanXoa;                                     
//        try{
//        BaiTapBuoi1.connection.ExcuteQueryUpdateDB(cautruyvan);         
//        LayDuLieu();
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(new JFrame(), e.toString());
//        }
        int[] mangViTriDuocChon = tblDSUsers.getSelectedRows();         
        for(int i = 0 ; i< mangViTriDuocChon.length ; i++ ){
           
           String ID = tblDSUsers.getValueAt(mangViTriDuocChon[i],1).toString();           
           String cautruyvan = "delete from Users where ID = "+ID;            
           Hungvvpk00504_Assignment.connection.ExcuteQueryUpdateDB(cautruyvan);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoiActionPerformed
        txtID.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtFullName.setText("");
        
    }//GEN-LAST:event_btnTaoMoiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frmQLNV frm1 = new frmQLNV();
        frm1.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void LayDuLieuQuyen(){
        try {
            String cauTruyVan = "select * from Roles";
            
            ResultSet rs = Hungvvpk00504_Assignment.connection.ExcuteQueryGetTable(cauTruyVan);
            
            DefaultComboBoxModel cbbModel = new DefaultComboBoxModel();
            
            while(rs.next()){             
                DisplayValueModel valueModel = 
                new DisplayValueModel(rs.getString("TenRole"), rs.getInt("RoleID"));
                
                cbbModel.addElement(valueModel);
                
            }
            cbbQuyen.setModel(cbbModel);
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
    }
    private String GetQuyenDuaVaoMaQuyen(String roleID){
        String tenRole = "";
        
        String cauTruyVan = "select TenRole from Roles where RoleID = "+roleID;
        ResultSet rs = Hungvvpk00504_Assignment.connection.ExcuteQueryGetTable(cauTruyVan);
        try {
            while(rs.next()){
                tenRole = rs.getString("TenRole");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return tenRole;
    }
    
    private void LayDuLieu(){
        String cautruyvan = "select *from Users";
        ResultSet rs = Hungvvpk00504_Assignment.connection.ExcuteQueryGetTable(cautruyvan);
        
        Object[] obj = new Object[] {"STT","ID","Tên đăng nhập","Mật khẩu","Họ và tên","Quyền quản trị"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblDSUsers.setModel(tableModel);
        
        
        try {
            while(rs.next()){
                Object[] item = new Object[6];  
                item[0]=tblDSUsers.getRowCount() + 1;
                item[1]=rs.getInt("ID");
                item[2]=rs.getString("UserName");
                item[3]= rs.getString("Password");
                item[4]= rs.getString("Fullname");
                String roleID = rs.getString("RoleID");
                item[5]= GetQuyenDuaVaoMaQuyen(roleID);
             
                tableModel.addRow(item);

            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
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
            java.util.logging.Logger.getLogger(frmQLTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQLTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQLTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQLTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQLTK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox cbbQuyen;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFormTitle;
    private javax.swing.JLabel lblMaLoai;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JPanel pnlFunction;
    private javax.swing.JTable tblDSUsers;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
