
package System;

import java.sql.ResultSet;
import SQL.Connect;
import java.awt.Toolkit;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Access extends javax.swing.JFrame {
    
    DefaultTableModel att,em,aem,emu,ema,attend,add,leav;
    String query,adate;
    ResultSet result,r1;
    PreparedStatement ps;
  
    Connect c = new Connect();
     
    public Access() {
        initComponents();
        
        setIcon();
        
        setVisible(true);
             
        try
        {     
            c.stm = c.con.createStatement();
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
        
       
        JComboBox<String> cb = new JComboBox<>();     //adding combo box to table morning
        cb.addItem("Present");
        cb.addItem("Absent");
        attendence.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(cb));
        
        JComboBox<String> cb1 = new JComboBox<>();   // adding combo box to evening table
        cb1.addItem("Yes");
        cb1.addItem("No");
        left.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(cb1));
                
    }
    
    void setIcon() throws NullPointerException
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("image/logoo.png")));  // applying logo icon
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addEmployee = new javax.swing.JButton();
        update = new javax.swing.JButton();
        generateSalary = new javax.swing.JButton();
        showEmployeeData = new javax.swing.JButton();
        enterAttendence = new javax.swing.JButton();
        addAdvance = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        start = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        Attendence = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        submit = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        attendence = new javax.swing.JTable();
        date = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        left = new javax.swing.JTable();
        submitLeave = new javax.swing.JButton();
        date1 = new javax.swing.JLabel();
        employee = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        eId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        eGender = new javax.swing.JComboBox<>();
        addemployee = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        temployee = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        eCategory = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        eSalary = new javax.swing.JTextField();
        Update = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        uId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        uName = new javax.swing.JTextField();
        updateData = new javax.swing.JButton();
        deleteData = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        eupdate = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        uAdvance = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        uSalary = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        aName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        aDate = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        uAtten = new javax.swing.JComboBox<>();
        attendenceUpdate = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        eattendence = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        iId = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        aau = new javax.swing.JTextField();
        salary = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        salaryGeneration = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        SGenerated = new javax.swing.JLabel();
        category = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        from = new javax.swing.JTextField();
        to = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        sId = new javax.swing.JTextField();
        data = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        showEmployee = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        searchtext = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showAttendence = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        advance = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        sName = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        adSalary = new javax.swing.JTextField();
        addAdvanceSalary = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        ad = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        aId = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPasswordField1.setText("jPasswordField1");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable2);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane10.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nikita Enterprises");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        addEmployee.setBackground(new java.awt.Color(0, 0, 0));
        addEmployee.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        addEmployee.setForeground(new java.awt.Color(255, 255, 255));
        addEmployee.setText("Enter Employee");
        addEmployee.setBorder(null);
        addEmployee.setBorderPainted(false);
        addEmployee.setContentAreaFilled(false);
        addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(0, 0, 0));
        update.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update ");
        update.setBorder(null);
        update.setBorderPainted(false);
        update.setContentAreaFilled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        generateSalary.setBackground(new java.awt.Color(0, 0, 0));
        generateSalary.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        generateSalary.setForeground(new java.awt.Color(255, 255, 255));
        generateSalary.setText("Generate Salary");
        generateSalary.setBorder(null);
        generateSalary.setBorderPainted(false);
        generateSalary.setContentAreaFilled(false);
        generateSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateSalaryActionPerformed(evt);
            }
        });

        showEmployeeData.setBackground(new java.awt.Color(0, 0, 0));
        showEmployeeData.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        showEmployeeData.setForeground(new java.awt.Color(255, 255, 255));
        showEmployeeData.setText("Show Employee Data");
        showEmployeeData.setBorder(null);
        showEmployeeData.setBorderPainted(false);
        showEmployeeData.setContentAreaFilled(false);
        showEmployeeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEmployeeDataActionPerformed(evt);
            }
        });

        enterAttendence.setBackground(new java.awt.Color(0, 0, 0));
        enterAttendence.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        enterAttendence.setForeground(new java.awt.Color(255, 255, 255));
        enterAttendence.setText("Enter Attendence");
        enterAttendence.setBorder(null);
        enterAttendence.setBorderPainted(false);
        enterAttendence.setContentAreaFilled(false);
        enterAttendence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterAttendenceActionPerformed(evt);
            }
        });

        addAdvance.setBackground(new java.awt.Color(0, 0, 0));
        addAdvance.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        addAdvance.setForeground(new java.awt.Color(255, 255, 255));
        addAdvance.setText("Add Advance Salary");
        addAdvance.setBorderPainted(false);
        addAdvance.setContentAreaFilled(false);
        addAdvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdvanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterAttendence)
                            .addComponent(addEmployee)))
                    .addComponent(addAdvance)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(generateSalary))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(showEmployeeData))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(update)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(enterAttendence)
                .addGap(18, 18, 18)
                .addComponent(addEmployee)
                .addGap(18, 18, 18)
                .addComponent(addAdvance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update)
                .addGap(18, 18, 18)
                .addComponent(generateSalary)
                .addGap(18, 18, 18)
                .addComponent(showEmployeeData)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.CardLayout());

        start.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel33.setText("Welcome !");

        javax.swing.GroupLayout startLayout = new javax.swing.GroupLayout(start);
        start.setLayout(startLayout);
        startLayout.setHorizontalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel33)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        startLayout.setVerticalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel33)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(start, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel12, "card7");

        Attendence.setBackground(new java.awt.Color(255, 255, 255));
        Attendence.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Attendence");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane2.setForeground(new java.awt.Color(0, 0, 153));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        jPanel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.setToolTipText("");
        jPanel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N

        submit.setBackground(new java.awt.Color(204, 0, 0));
        submit.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submit.setBorderPainted(false);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        attendence.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        attendence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Present/Absent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(attendence);
        if (attendence.getColumnModel().getColumnCount() > 0) {
            attendence.getColumnModel().getColumn(0).setResizable(false);
            attendence.getColumnModel().getColumn(1).setResizable(false);
        }

        date.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(date)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(date)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Morning", jPanel15);

        jPanel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N

        left.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        left.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Leave"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(left);
        if (left.getColumnModel().getColumnCount() > 0) {
            left.getColumnModel().getColumn(0).setResizable(false);
            left.getColumnModel().getColumn(1).setResizable(false);
        }

        submitLeave.setBackground(new java.awt.Color(204, 0, 0));
        submitLeave.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        submitLeave.setForeground(new java.awt.Color(255, 255, 255));
        submitLeave.setText("Submit");
        submitLeave.setBorder(null);
        submitLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitLeaveActionPerformed(evt);
            }
        });

        date1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        date1.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(date1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(date1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(submitLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jTabbedPane2.addTab("Evening", jPanel16);

        javax.swing.GroupLayout AttendenceLayout = new javax.swing.GroupLayout(Attendence);
        Attendence.setLayout(AttendenceLayout);
        AttendenceLayout.setHorizontalGroup(
            AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane2)
        );
        AttendenceLayout.setVerticalGroup(
            AttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendenceLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(Attendence, "card2");

        employee.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Add Employee");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("Name");

        eName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setText("                      ID");

        eId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setText("Gender");

        eGender.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        eGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        addemployee.setBackground(new java.awt.Color(153, 0, 0));
        addemployee.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        addemployee.setForeground(new java.awt.Color(255, 255, 255));
        addemployee.setText("Add");
        addemployee.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addemployee.setBorderPainted(false);
        addemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addemployeeActionPerformed(evt);
            }
        });

        temployee.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        temployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Category", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(temployee);
        if (temployee.getColumnModel().getColumnCount() > 0) {
            temployee.getColumnModel().getColumn(0).setResizable(false);
            temployee.getColumnModel().getColumn(1).setResizable(false);
            temployee.getColumnModel().getColumn(2).setResizable(false);
            temployee.getColumnModel().getColumn(3).setResizable(false);
            temployee.getColumnModel().getColumn(4).setResizable(false);
        }

        jScrollPane3.setViewportView(jScrollPane2);

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel12.setText("Category");

        eCategory.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        eCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Worker" }));

        jLabel28.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel28.setText("Salary");

        eSalary.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        javax.swing.GroupLayout employeeLayout = new javax.swing.GroupLayout(employee);
        employee.setLayout(employeeLayout);
        employeeLayout.setHorizontalGroup(
            employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(employeeLayout.createSequentialGroup()
                .addGroup(employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(employeeLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12)
                            .addComponent(jLabel28))
                        .addGap(37, 37, 37)
                        .addGroup(employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eName)
                            .addComponent(eId, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(addemployee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eSalary)))
                    .addGroup(employeeLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        employeeLayout.setVerticalGroup(
            employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(eName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(eId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(eGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(eCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(eSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addemployee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel3.add(employee, "card3");

        Update.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Update Data");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(261, 261, 261))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 153));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setText("Employee Data");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel10.setText("              Name");

        uId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        uId.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel11.setText("ID");

        uName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        uName.setEnabled(false);

        updateData.setBackground(new java.awt.Color(153, 0, 0));
        updateData.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        updateData.setForeground(new java.awt.Color(255, 255, 255));
        updateData.setText("Update");
        updateData.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateData.setBorderPainted(false);
        updateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDataActionPerformed(evt);
            }
        });

        deleteData.setBackground(new java.awt.Color(153, 0, 0));
        deleteData.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        deleteData.setForeground(new java.awt.Color(255, 255, 255));
        deleteData.setText("Delete");
        deleteData.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteData.setBorderPainted(false);
        deleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDataActionPerformed(evt);
            }
        });

        eupdate.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        eupdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Advance Salary", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eupdateMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(eupdate);
        if (eupdate.getColumnModel().getColumnCount() > 0) {
            eupdate.getColumnModel().getColumn(0).setResizable(false);
            eupdate.getColumnModel().getColumn(1).setResizable(false);
            eupdate.getColumnModel().getColumn(2).setResizable(false);
            eupdate.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel25.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel25.setText("Advance Salary");

        uAdvance.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel29.setText("Salary");

        uSalary.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(updateData, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(deleteData, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 137, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(33, 33, 33)
                        .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel29))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uId)
                            .addComponent(uAdvance, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(uSalary))))
                .addGap(63, 63, 63))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(uId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(uAdvance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(uSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateData, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteData, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Employee Data", jPanel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setText("Attendence Update");

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel14.setText("Name");

        aName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        aName.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel15.setText("Date");

        aDate.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel16.setText("Attendence");

        uAtten.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        uAtten.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        attendenceUpdate.setBackground(new java.awt.Color(153, 0, 0));
        attendenceUpdate.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        attendenceUpdate.setForeground(new java.awt.Color(255, 255, 255));
        attendenceUpdate.setText("Update");
        attendenceUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        attendenceUpdate.setBorderPainted(false);
        attendenceUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendenceUpdateActionPerformed(evt);
            }
        });

        eattendence.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        eattendence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date", "Arrived/Departure", "Attendence"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eattendence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eattendenceMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(eattendence);
        if (eattendence.getColumnModel().getColumnCount() > 0) {
            eattendence.getColumnModel().getColumn(0).setPreferredWidth(10);
            eattendence.getColumnModel().getColumn(2).setPreferredWidth(90);
        }

        jLabel34.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel34.setText("ID");

        iId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        iId.setEnabled(false);

        jLabel35.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel35.setText("Arrived/Departure");

        aau.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        aau.setEnabled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel9))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(attendenceUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(aName)
                                    .addComponent(aDate, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(uAtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(iId)
                                    .addComponent(aau))))))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(iId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(aName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(aDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(aau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(uAtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(attendenceUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jTabbedPane1.addTab("Employee Attendence", jPanel9);

        javax.swing.GroupLayout UpdateLayout = new javax.swing.GroupLayout(Update);
        Update.setLayout(UpdateLayout);
        UpdateLayout.setHorizontalGroup(
            UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        UpdateLayout.setVerticalGroup(
            UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1))
        );

        jPanel3.add(Update, "card4");

        salary.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Salary Generation");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(228, 228, 228))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel17)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel18.setText("Name");

        name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel19.setText("Category");

        salaryGeneration.setBackground(new java.awt.Color(153, 0, 0));
        salaryGeneration.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        salaryGeneration.setForeground(new java.awt.Color(255, 255, 255));
        salaryGeneration.setText("Generate");
        salaryGeneration.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salaryGeneration.setBorderPainted(false);
        salaryGeneration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryGenerationActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel20.setText("Salary");

        SGenerated.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        SGenerated.setForeground(new java.awt.Color(204, 0, 0));
        SGenerated.setText("Rs.");

        category.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Worker" }));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel13.setText("Date");

        from.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        to.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel26.setText("From");

        jLabel27.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel27.setText("To");

        jLabel36.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel36.setText("ID");

        sId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        javax.swing.GroupLayout salaryLayout = new javax.swing.GroupLayout(salary);
        salary.setLayout(salaryLayout);
        salaryLayout.setHorizontalGroup(
            salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salaryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(salaryLayout.createSequentialGroup()
                        .addGroup(salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel13)
                            .addGroup(salaryLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(1, 1, 1))
                            .addComponent(jLabel36))
                        .addGap(45, 45, 45))
                    .addGroup(salaryLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SGenerated)
                    .addGroup(salaryLayout.createSequentialGroup()
                        .addGroup(salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(from, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(category, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(salaryLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(salaryGeneration, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sId, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                .addGap(174, 174, 174))
        );
        salaryLayout.setVerticalGroup(
            salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salaryLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(sId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(8, 8, 8)
                .addGroup(salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(salaryGeneration, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(SGenerated))
                .addGap(132, 132, 132))
        );

        jPanel3.add(salary, "card5");

        data.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Employee Data");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel22)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        showEmployee.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        showEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(showEmployee);
        if (showEmployee.getColumnModel().getColumnCount() > 0) {
            showEmployee.getColumnModel().getColumn(0).setResizable(false);
            showEmployee.getColumnModel().getColumn(1).setResizable(false);
            showEmployee.getColumnModel().getColumn(2).setResizable(false);
            showEmployee.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel23.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel23.setText("Search");

        searchtext.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        search.setBackground(new java.awt.Color(153, 0, 0));
        search.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search.setBorderPainted(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        showAttendence.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        showAttendence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date", "Arrived/Departure", "Attendence"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(showAttendence);
        if (showAttendence.getColumnModel().getColumnCount() > 0) {
            showAttendence.getColumnModel().getColumn(0).setResizable(false);
            showAttendence.getColumnModel().getColumn(1).setResizable(false);
            showAttendence.getColumnModel().getColumn(3).setResizable(false);
            showAttendence.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setText("Attendence :");

        jLabel24.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel24.setText("Employee:");

        javax.swing.GroupLayout dataLayout = new javax.swing.GroupLayout(data);
        data.setLayout(dataLayout);
        dataLayout.setHorizontalGroup(
            dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dataLayout.createSequentialGroup()
                .addGroup(dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(searchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dataLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel24))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dataLayout.setVerticalGroup(
            dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(searchtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(data, "card6");

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));

        jLabel30.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Advance Salary");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel30)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel31.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel31.setText("Name");

        sName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel32.setText("Advance");

        adSalary.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        addAdvanceSalary.setBackground(new java.awt.Color(204, 0, 0));
        addAdvanceSalary.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        addAdvanceSalary.setForeground(new java.awt.Color(255, 255, 255));
        addAdvanceSalary.setText("Submit");
        addAdvanceSalary.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addAdvanceSalary.setBorderPainted(false);
        addAdvanceSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdvanceSalaryActionPerformed(evt);
            }
        });

        ad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Advance", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(ad);
        if (ad.getColumnModel().getColumnCount() > 0) {
            ad.getColumnModel().getColumn(0).setResizable(false);
            ad.getColumnModel().getColumn(1).setResizable(false);
            ad.getColumnModel().getColumn(2).setResizable(false);
            ad.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel21.setText("ID");

        aId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addAdvanceSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel21))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sName)
                            .addComponent(adSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(aId))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(aId, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(adSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(addAdvanceSalary)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout advanceLayout = new javax.swing.GroupLayout(advance);
        advance.setLayout(advanceLayout);
        advanceLayout.setHorizontalGroup(
            advanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        advanceLayout.setVerticalGroup(
            advanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(advance, "card8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // action performed click update in side bar
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        
        jPanel3.add(Update);
        jPanel3.repaint();
        jPanel3.revalidate();
        
        update.setEnabled(false);
        addEmployee.setEnabled(true);
        generateSalary.setEnabled(true);
        showEmployeeData.setEnabled(true);
        enterAttendence.setEnabled(true);
        addAdvance.setEnabled(true);
        
        updateShow();    
        
        updateAttendenceShow();  
        
    }//GEN-LAST:event_updateActionPerformed

    // action performed when generate salary button is clicked
    private void generateSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateSalaryActionPerformed
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        
        jPanel3.add(salary);
        jPanel3.repaint();
        jPanel3.revalidate();
        
        generateSalary.setEnabled(false);
        addEmployee.setEnabled(true);
        update.setEnabled(true);
        showEmployeeData.setEnabled(true);
        enterAttendence.setEnabled(true);
        addAdvance.setEnabled(true);
        
    }//GEN-LAST:event_generateSalaryActionPerformed

    // action performed when enter attendence button is clicked
    private void enterAttendenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterAttendenceActionPerformed
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        
        jPanel3.add(Attendence);
        jPanel3.repaint();
        jPanel3.revalidate();
        
        enterAttendence.setEnabled(false);
        addEmployee.setEnabled(true);
        generateSalary.setEnabled(true);
        showEmployeeData.setEnabled(true);
        update.setEnabled(true);
        addAdvance.setEnabled(true);
            
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date dat = new Date();  
        String s = (formatter.format(dat));  
        date.setText(s);
        date1.setText(s);
        
        if(attendence.getRowCount() != 0 || left.getRowCount() != 0)   // removing existing rows in table
        {
            attend.setRowCount(0);
            leav.setRowCount(0);
        }
        
        query = "select Name,Em_Id from employee";   // fetching and adding data into table
        try
        {
            
            result = c.stm.executeQuery(query);
            while(result.next())
            {
                String name = result.getString("Name");
                String id = result.getString("Em_Id");
                                
                String data[] = {id,name,"Absent"};
                String data1[] = {id,name,"No"};
                attend = (DefaultTableModel)attendence.getModel();
                leav = (DefaultTableModel)left.getModel();
                attend.addRow(data);
                leav.addRow(data1);
                                
        }
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_enterAttendenceActionPerformed

    // action performed on add employee button in side bar
    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        
        jPanel3.add(employee);
        jPanel3.repaint();
        jPanel3.revalidate();
        
        addEmployee.setEnabled(false);
        showEmployeeData.setEnabled(true);
        update.setEnabled(true);
        generateSalary.setEnabled(true);
        enterAttendence.setEnabled(true);
        addAdvance.setEnabled(true);
        
       employeeshow();
        
    }//GEN-LAST:event_addEmployeeActionPerformed

    // action performed on show employee button
    private void showEmployeeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEmployeeDataActionPerformed
        
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        
        jPanel3.add(data);
        jPanel3.repaint();
        jPanel3.revalidate();
        
        showEmployeeData.setEnabled(false);
        addEmployee.setEnabled(true);
        update.setEnabled(true);
        generateSalary.setEnabled(true);
        enterAttendence.setEnabled(true);
        addAdvance.setEnabled(true);
        
        // empty existing values in table
        if(showEmployee.getRowCount() != 0)
        {
            em.setRowCount(0);
        }
        
        if(showAttendence.getRowCount() != 0)
        {
            att.setRowCount(0);
        }
          
        //feching and adding new data to first table
        query = "Select employee.Name,employee.Em_Id,employee.Category,salary.Total from employee left join salary on employee.Em_Id = salary.Em_Id";
        
        try 
        {
            result = c.stm.executeQuery(query);
            while(result.next())
            {
                String name = result.getString("Name");
                String id = result.getString("Em_Id");
                int cat = result.getInt("Category");
                int sal = result.getInt("Total");
                String salary = Integer.toString(sal);
                
                String cate;
                if(cat == 1)
                {
                    cate = "Employee";
                }
                else
                {
                    cate = "Worker";
                }
                
                String data[] = {id,name,cate,salary};
                
                em = (DefaultTableModel)showEmployee.getModel();
                em.addRow(data);
                
            }
            
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
        
        // fetching and adding values in second table
        query = "Select employee.Em_Id,employee.Name,attend.A_L,attend.DDate,attend.Attendence from employee left join attend on employee.Em_Id=attend.Em_Id";
        
        try 
        {
            
            result = c.stm.executeQuery(query);
            while(result.next())
            {
                String id = result.getString("Em_Id");
                String name = result.getString("Name");
                String date = result.getString("DDate");
                int Atten = result.getInt("Attendence");
                int i = result.getInt("A_L");
                
                String a="",y;
                                
                if(i == 1)
                {
                    y = "Arrived";
                    
                    if(Atten == 1)
                    {
                        a = "Present";
                    }
                    else
                    {
                        a = "Absent";
                    }
                    
                }
                else
                {
                    y = "Departure";
                    
                    if(Atten == 1)
                    {
                        a = "Yes";
                    }
                    
                }
                               
                String data[] = {id,name,date,y,a};
                
                att = (DefaultTableModel)showAttendence.getModel();
                att.addRow(data);
                
            }
            
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_showEmployeeDataActionPerformed

    // searching action performed when search button is clicked
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       
        TableRowSorter  asorter = new TableRowSorter<>(att);
        TableRowSorter  esorter = new TableRowSorter<>(em);
        showEmployee.setRowSorter(esorter);
        showAttendence.setRowSorter(asorter);
        
        if(searchtext.getText().length() == 0 )
        {
            asorter.setRowFilter(null);
            esorter.setRowFilter(null);
        }
        else
        {
            asorter.setRowFilter(RowFilter.regexFilter(searchtext.getText()));
            esorter.setRowFilter(RowFilter.regexFilter(searchtext.getText()));
        }
        
        searchtext.setText(null);
        
    }//GEN-LAST:event_searchActionPerformed

    // action performed when clicking on add employee button
    private void addemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addemployeeActionPerformed
        
        //getting values from components
        query = "Select Name from employee where Em_Id='"+eId.getText()+"'";
        try 
        {
            result = c.stm.executeQuery(query);
            if(result.next())  // checking for duplicate entries
            {
                JOptionPane.showMessageDialog(this,"Duplicate Entry Entered","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
          
                int gender,cat;
        
                if(eGender.getSelectedItem() == "Male")
                {
                    gender = 1;
                }
                else
                {
                    gender = 0;
                }
                if(eCategory.getSelectedItem() == "Employee")
                {
                    cat = 1;
                }
                else
                {
                    cat = 0;
                }
         
                //inserting into employee table
                query ="insert into employee" + "(Name,Em_Id,Gender,Category) values(?,?,?,?)";
                try 
                {
                    ps = c.con.prepareStatement(query);
                    ps.setString(1, eName.getText());
                    ps.setString(2, eId.getText());
                    ps.setInt(3, gender);
                    ps.setInt(4,cat);
                    ps.executeUpdate();                      
                } 
                catch (SQLException ex) 
                {
                    ex.printStackTrace();
                }
        
                //inserting salary into salary table
                query ="insert into salary" + "(Em_Id,Total) values((select Em_Id from employee where Em_Id='"+eId.getText()+"'),?)";
                try 
                {
                    ps = c.con.prepareStatement(query);
                    ps.setInt(1,Integer.valueOf(eSalary.getText()));
                    ps.executeUpdate();
                 } 
                catch (SQLException ex) 
                {
                    ex.printStackTrace();
                }
        
                JOptionPane.showMessageDialog(this,"Successfully added","Success",JOptionPane.INFORMATION_MESSAGE);
        
                eName.setText("");
                eId.setText("");
                eSalary.setText("");
        
                employeeshow();
        
          }
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
        
                 
    }//GEN-LAST:event_addemployeeActionPerformed

    // action performed when updating attendence
    private void attendenceUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendenceUpdateActionPerformed
        
        // fetching values from components
        int i=0,a=0;
        if(uAtten.getSelectedItem() == "Yes")
        {
            i=1;
        }
        if(uAtten.getSelectedItem() == "No")
        {
            i=0;
        }
        
        if(aau.getText().equals("Arrived"))
        {
            a = 1;
        }
        if(aau.getText().equals("Departure"))
        {
            a = 0;
        }
        
     
        if(adate != aDate.getText())
        {
            
        query = "update attend set DDate='"+aDate.getText()+"' where Em_Id='" + iId.getText() +"' and DDate='"+adate+"'";
        
         try 
        {
            c.stm.executeUpdate(query);
        }
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
        
        }
            
        // updating into table
        query = "update attend set Attendence=" + i + " where Em_Id='" + iId.getText() +"' and A_L=" + a + " and DDate='" + aDate.getText() + "'";
        try 
        {
            c.stm.executeUpdate(query);
        }
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
        
               
        JOptionPane.showMessageDialog(this, "Successfully update", "Success",JOptionPane.INFORMATION_MESSAGE);
        
        aName.setText("");
        aDate.setText("");
        iId.setText("");
        aau.setText("");
               
       updateAttendenceShow();    
        
    }//GEN-LAST:event_attendenceUpdateActionPerformed

    // mouse click event when update attendence is clicked
    private void eattendenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eattendenceMouseClicked
        
        int select = eattendence.getSelectedRow();
        
        iId.setText(ema.getValueAt(select,0).toString());
        aName.setText(ema.getValueAt(select,1).toString());
        aDate.setText(ema.getValueAt(select,2).toString());
        aau.setText(ema.getValueAt(select,3).toString());
        
        adate = ema.getValueAt(select,2).toString();
        
        if(aau.getText().equals("Departure"))
        {
            uAtten.setEnabled(false);
        }
        
    }//GEN-LAST:event_eattendenceMouseClicked

    // mouse click event when update employee is clicked
    private void eupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eupdateMouseClicked
        
        int select = eupdate.getSelectedRow();
        
        uName.setText(emu.getValueAt(select,0).toString());
        uId.setText(emu.getValueAt(select,1).toString());
        uAdvance.setText(emu.getValueAt(select,2).toString());
        uSalary.setText(emu.getValueAt(select,3).toString());
        
    }//GEN-LAST:event_eupdateMouseClicked

    // action performed when update client button is clicked
    private void updateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDataActionPerformed
        
             
        query = "update salary set Total=" + Integer.valueOf(uSalary.getText()) +" where Em_Id='" + uId.getText() +"'";
        try 
        { 
            c.stm.executeUpdate(query);
        } 
        catch (SQLException ex) 
        {
             ex.printStackTrace();
        }
        
        query = "update advance set Advance_salary=" + Integer.valueOf(uAdvance.getText())+" where Em_Id='" + uId.getText() +"'";
        try 
        { 
            c.stm.executeUpdate(query);
        } 
        catch (SQLException ex) 
        {
             ex.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(this,"Successfully updated","Success",JOptionPane.INFORMATION_MESSAGE);
        
        uName.setText("");
        uId.setText("");
        uAdvance.setText("");
        uSalary.setText("");
        
        updateShow();
       
        
    }//GEN-LAST:event_updateDataActionPerformed

    // action performed when deleting data
    private void deleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDataActionPerformed
        
        query = "delete from employee where Em_Id='" + uId.getText() +"'";
        try 
        {
            c.stm.executeUpdate(query);
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(this,"Deleted Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        
        uName.setText("");
        uId.setText("");
        uAdvance.setText("");
        uSalary.setText("");
        
        updateShow();
               
    }//GEN-LAST:event_deleteDataActionPerformed

    //action performed when clicking on advance salary button
    private void addAdvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdvanceActionPerformed
        
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        
        jPanel3.add(advance);
        jPanel3.repaint();
        jPanel3.revalidate();
        
        addAdvance.setEnabled(false);
        showEmployeeData.setEnabled(true);
        addEmployee.setEnabled(true);
        update.setEnabled(true);
        generateSalary.setEnabled(true);
        enterAttendence.setEnabled(true);
        
        addAdSalary();
                
    }//GEN-LAST:event_addAdvanceActionPerformed

    // adding advance salary of user
    private void addAdvanceSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdvanceSalaryActionPerformed
       
        query = "select Name,Em_Id from employee where Name='"+sName.getText()+"' and Em_Id='"+aId.getText()+"'";
        
       try 
        {
            result = c.stm.executeQuery(query);
            if(!(result.next()))  //checking for user
            {
                JOptionPane.showMessageDialog(this,"Wrong Name or Id Entered","Error",JOptionPane.ERROR_MESSAGE);
            }
        
            else
            {
                //adding advance salary
                Date d = new Date();
                java.sql.Timestamp date = new java.sql.Timestamp (d.getTime());
        
                query = "insert into advance(Em_Id,Advance_salary,DDate) values"
                        + "(?,?,?)";
        
        
                    ps = c.con.prepareStatement(query);
                    ps.setString(1,aId.getText());
                    ps.setInt(2,Integer.valueOf(adSalary.getText()));
                    ps.setTimestamp(3,date);
                    ps.executeUpdate();                
            
                JOptionPane.showMessageDialog(this,"Successfully added","Success",JOptionPane.INFORMATION_MESSAGE);
        
                addAdSalary();
        
            }
        }
       
        catch(Exception e)
        {
            e.printStackTrace();
        }           
                 
    }//GEN-LAST:event_addAdvanceSalaryActionPerformed

    //generating salary on submit button
    private void salaryGenerationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryGenerationActionPerformed
          
        int sal=0, asum=0, ad=0, adeduct=0;
        
        SGenerated.setText("Rs.");
        
        String regex = "\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])*"; 
        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher((CharSequence)from.getText());
        Matcher match = pattern.matcher((CharSequence)to.getText());
        
        
        if(!matcher.matches() && !match.matches())  // checking for date format that is entered by user
        {
            JOptionPane.showMessageDialog(this,"Please enter date in YYYY-MM-DD format","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
                    
            try 
            {

    //            ps = c.con.prepareStatement("select count(Attendence) as aten from attend where Date(DDate) between'" + from.getText() + "' and '" + to.getText() +"'" );
    //            result = ps.executeQuery();
    //            if(result.next())
    //            {
    //            acount = result.getInt("aten");
    //            }

                // getting total attendence
                ps = c.con.prepareStatement("select sum(attendence) as satt from attend where Em_Id='" + sId.getText() +"' and A_L = 1 and Date(DDate) between'" + from.getText() + "' and '" + to.getText() +"'" );
                result = ps.executeQuery();
                if(result.next())
                {
                asum = result.getInt("satt");
                }
                
                // getting total salary deducted due to late arrival
                ps = c.con.prepareStatement("select sum(Deduct) as deduc from deduct where Em_Id='" + sId.getText() +"' and Date(DDate) between'" + from.getText() + "' and '" + to.getText() +"'" );
                result = ps.executeQuery();
                if(result.next())
                {
                adeduct = result.getInt("deduc");
                }
                
                // total advance salary
                ps = c.con.prepareStatement("select sum(Advance_salary) as ass from advance where Em_Id='" + sId.getText() + "' and Date(DDate) between'" + from.getText() + "' and '" + to.getText() +"'" );
                result = ps.executeQuery();
                if(result.next())
                {
                    ad = result.getInt("ass");
                }

    //            ps = c.con.prepareStatement("Select distinct(DDate) from attend where Date(DDate) between'" + from.getText() + "' and '" +  to.getText() +"'");
    //            result = ps.executeQuery();
    //            
    //            while(result.next())
    //            {
    //                String dat = result.getString(1);
    //                
    //                ps = c.con.prepareStatement("select Em_Id, work_dt," +
    //                            "SEC_TO_TIME(sum(TIMESTAMPDIFF(Second,login,logout))) as time_worked " +   
    //                            "from (select Em_Id, date(DDate) as work_dt, DDate as login, coalesce((select min(DDate) from attend as b " +
    //                            "where a.Em_Id = b.Em_Id"+
    //                            " and b.DDate >= a.DDate"+ 
    //                            " and b.A_L = 0" +
    //                            "), now()) as logout " +
    //                            "from attend as a where a.A_L = 1 and a.Em_Id = "+sId.getText()+" and a.DDate = '"+dat+"') as t group by Em_Id, work_dt");
    //                r1 = ps.executeQuery();
    //                if(r1.next())
    //                {
    //                    
    //                    int i = r1.getInt(1);
    //                    String d = r1.getString(2);
    //                    LocalTime t = r1.getTime(3).toLocalTime();
    //                    
    //                    System.out.println(i);
    //                    System.out.println(d);
    //                    System.out.println(t);
    //                                       
    //                }
    //                
    //            }

            } 
            catch (SQLException ex) 
            {
               ex.printStackTrace();
            }

             // fetching total salary
             query = "select Total from salary where Em_Id='" + sId.getText() +"'";
                try 
                {

                    result = c.stm.executeQuery(query);
                    while(result.next())
                    {
                        sal = result.getInt("Total");                                                                                      
                    }

                 } 
                catch (SQLException ex) 
                {
                    ex.printStackTrace();
                } 

                // calculating salary of empployee
                if(category.getSelectedItem() == "Employee")
                {

                    int absent = 30 - asum;

                    if(absent <= 3)
                    {
                        if((sal-ad) < 0)
                        {
                            JOptionPane.showMessageDialog(this,"Salary generated is in negative value,Salary or Advance have wrong value","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        else
                        {
                            SGenerated.setText("Rs." + Integer.toString(sal-ad-adeduct));
                        }
                    }
                    else   // salary for employee is holidays are more then 3
                    {            
                        int one_day = sal/30;
                        int total = one_day * asum;
                        int left = total - ad - adeduct;

                        if((left) < 0)
                        {
                            JOptionPane.showMessageDialog(this,"Salary generated is in negative value,Salary or Advance have wrong value","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        else
                        {
                            SGenerated.setText("Rs." + Integer.toString(left));
                        }

                    }
                }
                else  // salary for workers
                {

                    int one_day = sal/30;
                    int total = one_day * asum;
                    int left = total - ad - adeduct;

                    if(left < 0)
                    {
                        JOptionPane.showMessageDialog(this,"Salary generated is in negative value,Salary or Advance have wrong value","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        SGenerated.setText("Rs." + Integer.toString(left));
                    }

                  }
        }
        
    }//GEN-LAST:event_salaryGenerationActionPerformed

    // adding attendence of user
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        String value;
        int n,j=1;
        Date d = new Date();
        Timestamp ts1 = Timestamp.valueOf(LocalDate.now() + " 08:00:00");
        Timestamp ts2 = Timestamp.valueOf(LocalDateTime.now());
        java.sql.Timestamp date = new java.sql.Timestamp (d.getTime());

        for(int i=0; i<attendence.getRowCount(); i++)
        {
            value=attendence.getModel().getValueAt(i,2).toString();

            if(value == "Present")
            {
                n=1;
            }
            else
            {
                n=0;
            }

            query = "insert into attend(DDate,A_L,Attendence,Em_Id) values(?,?,?,(select Em_Id from employee where Em_Id='"+ attendence.getModel().getValueAt(i,0).toString()+"'))";

            try
            {
                ps = c.con.prepareStatement(query);
                ps.setTimestamp(1,date);
                ps.setInt(2,j);
                ps.setInt(3, n);
                ps.executeUpdate();

            }
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
            
            // comparing timing and deducting salary if less
            int b = ts1.compareTo(ts2);  
                
                if(b < 0)
                {
                    query = "insert into deduct(Deduct,DDate,Em_Id) value(?,?,(select Em_Id from employee where Em_Id='"+ attendence.getModel().getValueAt(i,0).toString()+"'))";
                    int less = 50;
                    
                    try
                    {
                        ps = c.con.prepareStatement(query);
                        ps.setInt(1,less);
                        ps.setTimestamp(2,date);
                        ps.executeUpdate();

                    }
                    catch (SQLException ex)
                    {
                        ex.printStackTrace();
                    }
                }

        }
        JOptionPane.showMessageDialog(this,"Successfully added","Success",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_submitActionPerformed

    //adding leaving time of staff
    private void submitLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitLeaveActionPerformed
        
        String value;
        int n=0,j=0;
        Date d = new Date();
        Timestamp ts1 = Timestamp.valueOf(LocalDate.now() + " 06:00:00");
        Timestamp ts2 = Timestamp.valueOf(LocalDateTime.now());
        java.sql.Timestamp date = new java.sql.Timestamp (d.getTime());

        for(int i=0; i<left.getRowCount(); i++)
        {
            value=left.getModel().getValueAt(i,2).toString();

            if(value == "Yes")
            {
                    n=1;

                query = "insert into attend(DDate,A_L,Attendence,Em_Id) values(?,?,?,(select Em_Id from employee where Em_Id='"+ attendence.getModel().getValueAt(i,0).toString()+"'))";

                try
                {
                    ps = c.con.prepareStatement(query);
                    ps.setTimestamp(1,date);
                    ps.setInt(2,j);
                    ps.setInt(3, n);
                    ps.executeUpdate();

                }
                catch (SQLException ex)
                {
                    ex.printStackTrace();
                }
                
                //deducting salary if left soon
                int b = ts1.compareTo(ts2);  
                
                if(b > 0)
                {
                    query = "insert into deduct(Deduct,DDate,Em_Id) value(?,?,(select Em_Id from employee where Em_Id='"+ attendence.getModel().getValueAt(i,0).toString()+"'))";
                    int less = 50;
                    
                    try
                    {
                        ps = c.con.prepareStatement(query);
                        ps.setInt(1,less);
                        ps.setTimestamp(2,date);
                        ps.executeUpdate();

                    }
                    catch (SQLException ex)
                    {
                        ex.printStackTrace();
                    }
                }

            }
        }
          JOptionPane.showMessageDialog(this,"Successfully added","Success",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_submitLeaveActionPerformed

    //adding advance salary
    void addAdSalary()
    {
         if(ad.getRowCount() != 0)
            {
                add.setRowCount(0);
            }
            
            query = "Select employee.Name,employee.Em_Id,advance.Advance_salary,advance.DDate from employee left join advance on employee.Em_Id=advance.Em_Id";
        
        try 
        {
            
            result = c.stm.executeQuery(query);
            while(result.next())
            {
                String name = result.getString("Name");
                String id = result.getString("Em_Id");
                int advance = result.getInt("Advance_salary");
                String d = result.getString("DDate");
                
                String a[] = d.split("\\s+");
                                            
                String data[] = {id,name,Integer.toString(advance),a[0]};
                
                add = (DefaultTableModel)ad.getModel();
                add.addRow(data);
                                
            }
            
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }    
    }
    
    //updating table view on update panel
    void updateShow()
        {
            if(eupdate.getRowCount() != 0)
            {
                emu.setRowCount(0);
            }
            
            query = "Select employee.Name,employee.Em_Id,advance.Advance_salary,salary.Total from employee left join salary on employee.Em_Id=salary.Em_Id left join advance on employee.Em_Id=advance.Em_Id";
        
        try 
        {
            
            result = c.stm.executeQuery(query);
            while(result.next())
            {
                String name = result.getString("Name");
                String id = result.getString("Em_Id");
                int advance = result.getInt("Advance_salary");
                int salary = result.getInt("Total");
                                            
                String data[] = {id,name,Integer.toString(advance),Integer.toString(salary)};
                
                emu = (DefaultTableModel)eupdate.getModel();
                emu.addRow(data);
                                
            }
            
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }    
        }
    
    // updating attendence show table
    void updateAttendenceShow()
    {
         if(eattendence.getRowCount() != 0)
            {
                ema.setRowCount(0);
            }
        
         query = "Select employee.Em_Id,employee.Name,attend.A_L,attend.DDate,attend.Attendence from employee left join attend on employee.Em_Id=attend.Em_Id";
        
        try 
        {
            
            result = c.stm.executeQuery(query);
            while(result.next())
            {
                String id = result.getString("Em_Id");
                String name = result.getString("Name");
                int al = result.getInt("A_L");
                String date = result.getString("DDate");
                int att = result.getInt("Attendence");
                
                String a,y = "";
                
                if(al == 1)
                {
                    a = "Arrived";
                    
                    if(att == 1)
                    {
                        y = "Present";
                    }
                    else
                    {
                        y = "Absent";
                    }
                  
                }
                else
                {
                    a = "Departure";
                    
                    if(att == 1)
                    {
                        y = "Yes";
                    }
                
                }
                                           
                String data[] = {id,name,date,a,y};
                
                ema = (DefaultTableModel)eattendence.getModel();
                ema.addRow(data);
                                
            }
            
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }   
    }
    
    // updating employee show table in add employee
    void employeeshow()
    {
        if(temployee.getRowCount() != 0)
        {
            aem.setRowCount(0);
        }
        
        query = "Select employee.Name,employee.Gender,employee.Em_Id,employee.Category,salary.Total from employee left join salary on employee.Em_Id=salary.Em_Id";
        
        try 
        {
            
            result = c.stm.executeQuery(query);
            while(result.next())
            {
                String name = result.getString("Name");
                String id = result.getString("Em_Id");
                int gender = result.getInt("Gender");
                int cat = result.getInt("Category");
                int salary = result. getInt("Total");
                               
                String gen,cate;
                if(gender == 1)
                {
                    gen = "Male";
                }
                else
                {
                    gen = "Female";
                }
                
                if(cat == 1)
                {
                    cate = "Employee";
                }
                else
                {
                    cate = "Worker";
                }
                
                String data[] = {id,name,gen,cate,Integer.toString(salary)};
                
                aem = (DefaultTableModel)temployee.getModel();
                aem.addRow(data);
                                
            }
            
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Attendence;
    private javax.swing.JLabel SGenerated;
    private javax.swing.JPanel Update;
    private javax.swing.JTextField aDate;
    private javax.swing.JTextField aId;
    private javax.swing.JTextField aName;
    private javax.swing.JTextField aau;
    private javax.swing.JTable ad;
    private javax.swing.JTextField adSalary;
    private javax.swing.JButton addAdvance;
    private javax.swing.JButton addAdvanceSalary;
    private javax.swing.JButton addEmployee;
    private javax.swing.JButton addemployee;
    private javax.swing.JPanel advance;
    private javax.swing.JTable attendence;
    private javax.swing.JButton attendenceUpdate;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JPanel data;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JButton deleteData;
    private javax.swing.JComboBox<String> eCategory;
    private javax.swing.JComboBox<String> eGender;
    private javax.swing.JTextField eId;
    private javax.swing.JTextField eName;
    private javax.swing.JTextField eSalary;
    private javax.swing.JTable eattendence;
    private javax.swing.JPanel employee;
    private javax.swing.JButton enterAttendence;
    private javax.swing.JTable eupdate;
    private javax.swing.JTextField from;
    private javax.swing.JButton generateSalary;
    private javax.swing.JTextField iId;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTable left;
    private javax.swing.JTextField name;
    private javax.swing.JTextField sId;
    private javax.swing.JTextField sName;
    private javax.swing.JPanel salary;
    private javax.swing.JButton salaryGeneration;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchtext;
    private javax.swing.JTable showAttendence;
    private javax.swing.JTable showEmployee;
    private javax.swing.JButton showEmployeeData;
    private javax.swing.JPanel start;
    private javax.swing.JButton submit;
    private javax.swing.JButton submitLeave;
    private javax.swing.JTable temployee;
    private javax.swing.JTextField to;
    private javax.swing.JTextField uAdvance;
    private javax.swing.JComboBox<String> uAtten;
    private javax.swing.JTextField uId;
    private javax.swing.JTextField uName;
    private javax.swing.JTextField uSalary;
    private javax.swing.JButton update;
    private javax.swing.JButton updateData;
    // End of variables declaration//GEN-END:variables
}
