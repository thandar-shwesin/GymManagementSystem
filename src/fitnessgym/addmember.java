/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessgym;


import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TSS
 */
public class addmember extends javax.swing.JFrame implements CommonFunc {

    /**
     * Creates new form addmember
     */
    public addmember() {
        this.setUndecorated(true);
        this.setVisible(true);
        initComponents();
        
         cbnTrainer.setRenderer(new DefaultListCellRenderer(){

            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int i, boolean bin, boolean bin1) {
                if(value instanceof Trainerdata)
                {
                    Trainerdata tc=(Trainerdata) value;
                     return super.getListCellRendererComponent(list, tc.getName(), i, bin, bin1); //To change body of generated methods, choose Tools | Templates.
                }
                return super.getListCellRendererComponent(list, value, i, bin, bin1); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
         
         cbnFacility.setRenderer(new DefaultListCellRenderer(){

            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int i, boolean bin, boolean bin1) {
                if(value instanceof Facilitydata)
                {
                    Facilitydata tc=(Facilitydata) value;
                     return super.getListCellRendererComponent(list, tc.getType(), i, bin, bin1); //To change body of generated methods, choose Tools | Templates.
                }
                return super.getListCellRendererComponent(list, value, i, bin, bin1); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
       /* Toolkit tk=Toolkit.getDefaultToolkit();
        int xsize=(int)tk.getScreenSize().getWidth();
        int ysize=(int)tk.getScreenSize().getHeight();
        this.setSize(xsize,ysize);*/
    }
   
   
//private static String memName,contactNo,memAddress;
private static String name,birth,contact, address,gender, fbAcc , subscription,amtstatus,startD,endD,facility,mID,trainer;
    private static int amount,tolamt,pendamt;
//private static Date startD,endD,birth;

    
    @Override
     public void clearFields(){
      txtName.setText("");
      birthDateChooser.setDate(null);
      txtContact.setText("");
      txtFbacc.setText("");
      txtArea.setText("");
      txtamount.setText("");
      cbnamtstatus.setSelectedIndex(0);
      txtTotal.setText("");
      startDatechooser.setDate(null);
      endDatechooser.setDate(null);
      cbnpaymentplan.setSelectedIndex(0);
      cbnTrainer.setSelectedIndex(0);
      cbnFacility.setSelectedIndex(0);
      cbnGender.setSelectedIndex(0);
      txtpendamt.setText("0");
      txtmemberID.setText(null);
      
  }
    
public boolean checkIsEmpty(){
   String n  = txtName.getText();
   Date bd = birthDateChooser.getDate();
   String c = txtContact.getText();
   String f = txtFbacc.getText();
   int a = Integer.parseInt(txtamount.getText());
   int amt = Integer.parseInt(txtTotal.getText());
   int amtsta=cbnamtstatus.getSelectedIndex();
   int pamt=Integer.parseInt(txtpendamt.getText());
   String tolAmt=txtTotal.getText();
   int p=cbnpaymentplan.getSelectedIndex();
   int fac=cbnTrainer.getSelectedIndex();
   int g=cbnGender.getSelectedIndex();
   String tol=txtTotal.getText();
   Date sD=startDatechooser.getDate();
   Date ed=endDatechooser.getDate();
   String m=txtmemberID.getText();
   
   String [] xxx = {n,f,tolAmt,tol,m,c};
   Date [] d={bd,sD,ed};
   int [] num={a,amt,amtsta,pamt,p,fac,g};
   for(int i = 0; i<xxx.length;i++){
       if ("".equals(xxx[i])){
           JOptionPane.showMessageDialog(null, "Please fill your data completely!!");
           
       if(d[i]==null)
           JOptionPane.showMessageDialog(null, "Please choose date!!");
           
       if(num[i]==0)
           JOptionPane.showMessageDialog(null, "Please fill your data completely!!");
           
       return true;
           
       }
        break;
   }
    
    
    
 return false;   
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        FitnessGymPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("FitnessGymPU").createEntityManager();
        trainerdataQuery = java.beans.Beans.isDesignTime() ? null : FitnessGymPUEntityManager.createQuery("SELECT t FROM Trainerdata t");
        trainerdataList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : trainerdataQuery.getResultList();
        facilitydataQuery = java.beans.Beans.isDesignTime() ? null : FitnessGymPUEntityManager.createQuery("SELECT f FROM Facilitydata f");
        facilitydataList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : facilitydataQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblBirthDate = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblFbacc = new javax.swing.JLabel();
        txtFbacc = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        cbnGender = new javax.swing.JComboBox();
        birthDateChooser = new com.toedter.calendar.JDateChooser();
        lblMemberID = new javax.swing.JLabel();
        txtmemberID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cbnpaymentplan = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        cbnFacility = new javax.swing.JComboBox();
        cbnTrainer = new javax.swing.JComboBox();
        startDatechooser = new com.toedter.calendar.JDateChooser();
        endDatechooser = new com.toedter.calendar.JDateChooser();
        btntotalBill = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtpendamt = new javax.swing.JTextField();
        cbnamtstatus = new javax.swing.JComboBox();
        addDB = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/fitnessgym/new1.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 204, 0), null, null), "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vani", 0, 14), new java.awt.Color(255, 204, 0))); // NOI18N

        lblName.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");

        lblBirthDate.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblBirthDate.setForeground(new java.awt.Color(255, 255, 255));
        lblBirthDate.setText("Date of Birth:");

        lblContact.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblContact.setForeground(new java.awt.Color(255, 255, 255));
        lblContact.setText("Contact Number:");

        lblAddress.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address:");

        lblFbacc.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblFbacc.setForeground(new java.awt.Color(255, 255, 255));
        lblFbacc.setText("Facebook acc:");

        txtFbacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFbaccActionPerformed(evt);
            }
        });

        lblGender.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setText("Gender:");

        cbnGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        birthDateChooser.setDateFormatString("yyyy-MM-dd");

        lblMemberID.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblMemberID.setForeground(new java.awt.Color(255, 255, 255));
        lblMemberID.setText("Member ID:");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblName)
                        .addGap(35, 35, 35)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblBirthDate)
                        .addGap(35, 35, 35)
                        .addComponent(birthDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblContact)
                        .addGap(34, 34, 34)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lblGender)
                        .addGap(34, 34, 34)
                        .addComponent(cbnGender, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblFbacc)
                        .addGap(34, 34, 34)
                        .addComponent(txtFbacc, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblMemberID)
                        .addGap(34, 34, 34)
                        .addComponent(txtmemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblAddress)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblName))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBirthDate)
                    .addComponent(birthDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContact)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblAddress)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblGender))
                    .addComponent(cbnGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblFbacc))
                    .addComponent(txtFbacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblMemberID))
                    .addComponent(txtmemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBackground(new java.awt.Color(51, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 204, 0), null, null), "Gym Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vani", 0, 14), new java.awt.Color(255, 204, 0))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Subscription:");

        cbnpaymentplan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "choose your pay plan", "12 months(1 year)", "6 months", "3 months", "2 months", "1 month" }));

        jLabel1.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Amount:");

        jLabel3.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Facility:");

        jLabel5.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("End Date:");

        jLabel6.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Start Date:");

        jLabel7.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Personal Trainer:");

        txtamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamountActionPerformed(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotal.setEnabled(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, facilitydataList, cbnFacility);
        bindingGroup.addBinding(jComboBoxBinding);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, trainerdataList, cbnTrainer);
        bindingGroup.addBinding(jComboBoxBinding);

        startDatechooser.setDateFormatString("yyyy-MM-dd");

        endDatechooser.setDateFormatString("yyyy-MM-dd");

        btntotalBill.setText("Total Bill:");
        btntotalBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalBillActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AmountStatus:");

        jLabel8.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pending amount:");

        txtpendamt.setText("0");
        txtpendamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpendamtActionPerformed(evt);
            }
        });

        cbnamtstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Paid", "Balance" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel14)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btntotalBill)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtamount)
                    .addComponent(txtTotal)
                    .addComponent(cbnpaymentplan, 0, 146, Short.MAX_VALUE)
                    .addComponent(cbnFacility, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(startDatechooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(endDatechooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbnTrainer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpendamt)
                    .addComponent(cbnamtstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbnpaymentplan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbnamtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtpendamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startDatechooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endDatechooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbnTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbnFacility, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntotalBill))
                .addGap(38, 38, 38))
        );

        addDB.setBackground(new java.awt.Color(255, 255, 204));
        addDB.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        addDB.setText("Add Member");
        addDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDBActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(255, 255, 204));
        btnClose.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        btnClose.setText("Close");
        btnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 255, 204));
        btnClear.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        btnClear.setText("Clear ALL");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessgym/noBG.png"))); // NOI18N

        jLabel16.setBackground(new java.awt.Color(0, 51, 51));
        jLabel16.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 231, 57));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Welcome new Members");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(129, 129, 129)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addDB, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(btnClear)
                        .addGap(56, 56, 56)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(addDB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(383, 383, 383))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void addDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDBActionPerformed
        // TODO add your handling code here:
        boolean dd = checkIsEmpty();
        AddMemberFunc add = new AddMemberFunc();
        name=txtName.getText();
        birth=((JTextField)birthDateChooser.getDateEditor().getUiComponent()).getText();
        contact=txtContact.getText();
        address=txtArea.getText();
        gender=cbnGender.getSelectedItem().toString();
        fbAcc=txtFbacc.getText();
        subscription=cbnpaymentplan.getSelectedItem().toString();
        amount=Integer.parseInt(txtamount.getText());
        amtstatus=cbnamtstatus.getSelectedItem().toString();
        pendamt=Integer.parseInt(txtpendamt.getText());
        txtpendamt.setText("0");
        tolamt=Integer.parseInt(txtTotal.getText());
        startD=((JTextField)startDatechooser.getDateEditor().getUiComponent()).getText();
        endD=((JTextField)endDatechooser.getDateEditor().getUiComponent()).getText();
        facility=cbnFacility.getSelectedItem().toString();
        mID=txtmemberID.getText();
        trainer=cbnTrainer.getSelectedItem().toString();
                
        //System.out.println(birth+"\n"+startD+"\n"+endD);
        //add.addToMemberDetails(memName,contactNo,memAddress);
        //NIC,emailAddress,emContact, gender,remarks MemberCat , ReciptNo , payments;
        //add.getMemberId(name);
        add.addMemDetails(name,birth,contact, address, gender, fbAcc,subscription,amount,amtstatus,
            pendamt,startD,endD,facility,tolamt,mID,trainer);
        
        Home h;
        
            h = new Home();
            // System.out.println(subscription+"ssssssssuuuuuuuuuuuubbbbbbbbbbbbb");
        h.setInfosforPay(name, facility, subscription, amount, pendamt, tolamt);
       
        h.setVisible(true);
        this.setVisible(false);
        
        
         
       
        // add.addToPictures(ImgPath);
        DefaultTableModel dm=new refreshFun().getData();
        
        
    }//GEN-LAST:event_addDBActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
         clearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtFbaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFbaccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFbaccActionPerformed

    private void txtamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtamountActionPerformed

    private void btntotalBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalBillActionPerformed
        // TODO add your handling code here:
        int a=Integer.parseInt(txtamount.getText());
        int p=Integer.parseInt(txtpendamt.getText());
        int i=cbnpaymentplan.getSelectedIndex();
        int total=0;
        switch(i)
        {
            case 1:total=(a*12)-p;break;
            case 2:total=(a*6)-p;break;
            case 3:total=(a*3)-p;break;
            case 4:total=(a*2)-p;break;
            case 5:total=a-p;break; 
        }
        String t=Integer.toString(total);
        txtTotal.setText(t);
    }//GEN-LAST:event_btntotalBillActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        addmember.this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtpendamtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpendamtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpendamtActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
        //txtTotal.set
    }//GEN-LAST:event_txtTotalActionPerformed

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
            java.util.logging.Logger.getLogger(addmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addmember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addmember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager FitnessGymPUEntityManager;
    private javax.swing.JButton addDB;
    private com.toedter.calendar.JDateChooser birthDateChooser;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btntotalBill;
    private javax.swing.JComboBox cbnFacility;
    private javax.swing.JComboBox cbnGender;
    private javax.swing.JComboBox cbnTrainer;
    private javax.swing.JComboBox cbnamtstatus;
    private javax.swing.JComboBox cbnpaymentplan;
    private com.toedter.calendar.JDateChooser endDatechooser;
    private java.util.List<fitnessgym.Facilitydata> facilitydataList;
    private javax.persistence.Query facilitydataQuery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblFbacc;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblMemberID;
    private javax.swing.JLabel lblName;
    private com.toedter.calendar.JDateChooser startDatechooser;
    private java.util.List<fitnessgym.Trainerdata> trainerdataList;
    private javax.persistence.Query trainerdataQuery;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtFbacc;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtmemberID;
    private javax.swing.JTextField txtpendamt;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
