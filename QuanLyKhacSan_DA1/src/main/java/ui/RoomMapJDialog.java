package ui;

import dao.PhongDAO;
import entity.Phong;
import java.awt.Frame;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import utils.Auth;
import utils.MsgBox;
import utils.XImage;

public class RoomMapJDialog extends javax.swing.JDialog {
    JFileChooser fileChooser = new JFileChooser();
    int row = 0;
    PhongDAO daoP = new PhongDAO();
   
    
    void init() {
        setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        setTitle("Sơ Đồ Phòng");
        fillTable();
    }
    
    public RoomMapJDialog(java.awt.Frame parent, boolean model) {
        super(parent, model);
        initComponents();
        init();
    }

    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblRoom.getModel();
        model.setRowCount(0);
        try {
            List<Phong> list = daoP.selectAll();
            for (Phong p : list) {
                Object[] row = {
                    p.getMaPhong(),
                    p.getLoaiPhong(),
                    p.getGiaTien(),
                    p.getHinh()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
            MsgBox.alert(this, "Lỗi truy vẫn data!");
        }
        
        lblStaInf.setText("- 2 người lớn \n - Bãi đỗ xe \n - Wifi miễn phí");
        lblSupInf.setText("- 2 người lớn \n - Có ăn sáng \n - Bãi đỗ xe \n - Wifi miễn phí");
        lblDeInf.setText("- 2 người lớn \n - Có ăn sáng \n - Bãi đỗ xe \n - Wifi miễn phí \n - Có phòng tập \n - Hỗ trợ nhận phòng nhanh");
        
    }
    
    
  void openQLDatPhong() {
        if (Auth.isLogin()) {
          
        } else {
            MsgBox.alert(this, "Vui long đăng nhập");
        }
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RoomMap = new javax.swing.JTabbedPane();
        Standard = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblStaInf = new javax.swing.JTextPane();
        lblSta = new javax.swing.JLabel();
        btn101 = new javax.swing.JButton();
        btn201 = new javax.swing.JButton();
        btn301 = new javax.swing.JButton();
        lblPicSta = new javax.swing.JLabel();
        Superior = new javax.swing.JPanel();
        Standard1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lblSupInf = new javax.swing.JTextPane();
        jLabelSup = new javax.swing.JLabel();
        btn102 = new javax.swing.JButton();
        btn202 = new javax.swing.JButton();
        btn302 = new javax.swing.JButton();
        jLabelPicSup = new javax.swing.JLabel();
        Suite = new javax.swing.JPanel();
        Standard2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        lblDeInf = new javax.swing.JTextPane();
        jLabelD = new javax.swing.JLabel();
        btn103 = new javax.swing.JButton();
        btn203 = new javax.swing.JButton();
        btn303 = new javax.swing.JButton();
        jLabelPicD = new javax.swing.JLabel();
        Other = new javax.swing.JPanel();
        Standard3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        lblSuiInf = new javax.swing.JTextPane();
        jLabelSui = new javax.swing.JLabel();
        btn104 = new javax.swing.JButton();
        btn204 = new javax.swing.JButton();
        btn304 = new javax.swing.JButton();
        jLabelPicSui = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Deleuxe = new javax.swing.JPanel();
        Standard4 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        lblOtherInf = new javax.swing.JTextPane();
        jLabelO = new javax.swing.JLabel();
        btn401 = new javax.swing.JButton();
        btn402 = new javax.swing.JButton();
        btn403 = new javax.swing.JButton();
        jLabelPicO = new javax.swing.JLabel();
        btn404 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRoom = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lblStaInf);

        lblSta.setText("jLabelSta");

        btn101.setText("101");
        btn101.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn101MouseDragged(evt);
            }
        });
        btn101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn101ActionPerformed(evt);
            }
        });

        btn201.setText("201");
        btn201.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn201MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn201MouseMoved(evt);
            }
        });

        btn301.setText("301");

        lblPicSta.setText("jLabelPicSta");

        javax.swing.GroupLayout StandardLayout = new javax.swing.GroupLayout(Standard);
        Standard.setLayout(StandardLayout);
        StandardLayout.setHorizontalGroup(
            StandardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StandardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StandardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(StandardLayout.createSequentialGroup()
                        .addComponent(lblPicSta, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(StandardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn201, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn301, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn101, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        StandardLayout.setVerticalGroup(
            StandardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StandardLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(StandardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(StandardLayout.createSequentialGroup()
                        .addComponent(btn101, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn201, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(btn301, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPicSta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(lblSta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        RoomMap.addTab("Standard", Standard);

        jScrollPane6.setViewportView(lblSupInf);

        jLabelSup.setText("jLabelSup");

        btn102.setText("102");
        btn102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn102ActionPerformed(evt);
            }
        });

        btn202.setText("202");
        btn202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn202ActionPerformed(evt);
            }
        });

        btn302.setText("302");

        jLabelPicSup.setText("jLabelPicSup");

        javax.swing.GroupLayout Standard1Layout = new javax.swing.GroupLayout(Standard1);
        Standard1.setLayout(Standard1Layout);
        Standard1Layout.setHorizontalGroup(
            Standard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Standard1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPicSup, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(Standard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn202, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn302, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn102, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabelSup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Standard1Layout.setVerticalGroup(
            Standard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Standard1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(Standard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6)
                    .addGroup(Standard1Layout.createSequentialGroup()
                        .addComponent(btn102, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn202, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(btn302, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPicSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabelSup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SuperiorLayout = new javax.swing.GroupLayout(Superior);
        Superior.setLayout(SuperiorLayout);
        SuperiorLayout.setHorizontalGroup(
            SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
            .addGroup(SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SuperiorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Standard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        SuperiorLayout.setVerticalGroup(
            SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SuperiorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Standard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        RoomMap.addTab("Superior", Superior);

        jScrollPane7.setViewportView(lblDeInf);

        jLabelD.setText("jLabelD");

        btn103.setText("103");
        btn103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn103ActionPerformed(evt);
            }
        });

        btn203.setText("203");

        btn303.setText("303");

        jLabelPicD.setText("jLabelPicD");

        javax.swing.GroupLayout Standard2Layout = new javax.swing.GroupLayout(Standard2);
        Standard2.setLayout(Standard2Layout);
        Standard2Layout.setHorizontalGroup(
            Standard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Standard2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Standard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Standard2Layout.createSequentialGroup()
                        .addComponent(jLabelPicD, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(Standard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn203, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn303, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn103, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Standard2Layout.setVerticalGroup(
            Standard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Standard2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(Standard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7)
                    .addGroup(Standard2Layout.createSequentialGroup()
                        .addComponent(btn103, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn203, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(btn303, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPicD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jLabelD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SuiteLayout = new javax.swing.GroupLayout(Suite);
        Suite.setLayout(SuiteLayout);
        SuiteLayout.setHorizontalGroup(
            SuiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
            .addGroup(SuiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SuiteLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Standard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        SuiteLayout.setVerticalGroup(
            SuiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
            .addGroup(SuiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SuiteLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Standard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        RoomMap.addTab("Deleuxe", Suite);

        jScrollPane8.setViewportView(lblSuiInf);

        jLabelSui.setText("jLabelSui");

        btn104.setText("104");
        btn104.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn104MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn104MouseMoved(evt);
            }
        });
        btn104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn104ActionPerformed(evt);
            }
        });

        btn204.setText("204");
        btn204.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn204MouseMoved(evt);
            }
        });

        btn304.setText("304");
        btn304.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn304MouseMoved(evt);
            }
        });

        jLabelPicSui.setText("jLabelPicSui");

        javax.swing.GroupLayout Standard3Layout = new javax.swing.GroupLayout(Standard3);
        Standard3.setLayout(Standard3Layout);
        Standard3Layout.setHorizontalGroup(
            Standard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Standard3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Standard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Standard3Layout.createSequentialGroup()
                        .addComponent(jLabelPicSui, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(Standard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn204, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn304, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn104, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelSui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        Standard3Layout.setVerticalGroup(
            Standard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Standard3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Standard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8)
                    .addGroup(Standard3Layout.createSequentialGroup()
                        .addComponent(btn104, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn204, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(btn304, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPicSui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabelSui, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout OtherLayout = new javax.swing.GroupLayout(Other);
        Other.setLayout(OtherLayout);
        OtherLayout.setHorizontalGroup(
            OtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
            .addGroup(OtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(OtherLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Standard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        OtherLayout.setVerticalGroup(
            OtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
            .addGroup(OtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(OtherLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Standard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        RoomMap.addTab("Suite", Other);

        jScrollPane9.setViewportView(lblOtherInf);

        jLabelO.setText("jLabelO");

        btn401.setText("401");
        btn401.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn401MouseMoved(evt);
            }
        });
        btn401.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn401ActionPerformed(evt);
            }
        });

        btn402.setText("402");
        btn402.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn402MouseMoved(evt);
            }
        });

        btn403.setText("403");
        btn403.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn403MouseMoved(evt);
            }
        });

        jLabelPicO.setText("jLabelPicO");

        btn404.setText("404");
        btn404.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn404MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout Standard4Layout = new javax.swing.GroupLayout(Standard4);
        Standard4.setLayout(Standard4Layout);
        Standard4Layout.setHorizontalGroup(
            Standard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Standard4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Standard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Standard4Layout.createSequentialGroup()
                        .addComponent(jLabelO, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn404, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Standard4Layout.createSequentialGroup()
                        .addComponent(jLabelPicO, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(Standard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn402, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn403, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn401, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Standard4Layout.setVerticalGroup(
            Standard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Standard4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(Standard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9)
                    .addGroup(Standard4Layout.createSequentialGroup()
                        .addComponent(btn401, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn402, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(btn403, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPicO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(Standard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn404, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DeleuxeLayout = new javax.swing.GroupLayout(Deleuxe);
        Deleuxe.setLayout(DeleuxeLayout);
        DeleuxeLayout.setHorizontalGroup(
            DeleuxeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
            .addGroup(DeleuxeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DeleuxeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Standard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        DeleuxeLayout.setVerticalGroup(
            DeleuxeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
            .addGroup(DeleuxeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DeleuxeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Standard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        RoomMap.addTab("Other", Deleuxe);

        tblRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaPhong", "LoaiPhong", "GiaTien", "Hinh"
            }
        ));
        tblRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblRoomMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblRoom);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RoomMap.addTab("List", jPanel1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Sơ Đồ Phòng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomMap, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RoomMap, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn101ActionPerformed

        openQLDatPhong();
    }//GEN-LAST:event_btn101ActionPerformed

    private void btn102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn102ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn102ActionPerformed

    private void btn103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn103ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn103ActionPerformed

    private void btn104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn104ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn104ActionPerformed

    private void btn401ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn401ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn401ActionPerformed

    private void btn202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn202ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn202ActionPerformed

    private void tblRoomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRoomMousePressed
        // TODO add your handling code here:
//        if (evt.getClickCount() == 2) {
//            this.row = tblRoom.rowAtPoint(evt.getPoint());
//            edit();
//        }
    }//GEN-LAST:event_tblRoomMousePressed

    private void btn104MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn104MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_btn104MouseDragged

    private void btn101MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn101MouseDragged
    
    }//GEN-LAST:event_btn101MouseDragged

    private void btn201MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn201MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_btn201MouseDragged

    private void btn201MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn201MouseMoved
        lblStaInf.setText("- 2 người lớn \n - Bãi đỗ xe \n - Wifi miễn phí");
    }//GEN-LAST:event_btn201MouseMoved

    private void btn401MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn401MouseMoved
        lblOtherInf.setText("- Connecting Room \n - Có ăn sáng \n - Bãi đỗ xe \n - Wifi miễn phí \n - Có phòng tập \n - Hồ bơi miễn phí \n - Hỗ trợ nhận phòng nhanh");
    }//GEN-LAST:event_btn401MouseMoved

    private void btn402MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn402MouseMoved
        lblOtherInf.setText("- 1 người lớn \n - Bãi đỗ xe \n - Wifi miễn phí");
    }//GEN-LAST:event_btn402MouseMoved

    private void btn403MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn403MouseMoved
        lblOtherInf.setText("- 2 giường đơn \n - Hỗ trợ ghép giường \n - Bãi đỗ xe \n - Wifi miễn phí");
    }//GEN-LAST:event_btn403MouseMoved

    private void btn404MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn404MouseMoved
        lblOtherInf.setText("- 3 người lớn  \n - Hỗ trợ ghép giường \n - Bãi đỗ xe \n - Wifi miễn phí");
    }//GEN-LAST:event_btn404MouseMoved

    private void btn104MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn104MouseMoved
       lblSuiInf.setText("- 2 người lớn \n - Có ăn sáng \n - Bãi đỗ xe \n - Wifi miễn phí \n - Có phòng tập \n - Hồ bơi miễn phí \n - Hỗ trợ nhận phòng nhanh");
    }//GEN-LAST:event_btn104MouseMoved

    private void btn204MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn204MouseMoved
        lblSuiInf.setText("- 2 người lớn \n - Có ăn sáng \n - Bãi đỗ xe \n - Wifi miễn phí \n - Có phòng tập \n - Hồ bơi miễn phí \n - Hỗ trợ nhận phòng nhanh");
    }//GEN-LAST:event_btn204MouseMoved

    private void btn304MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn304MouseMoved
        lblSuiInf.setText("- 2 người lớn \n - Có ăn sáng \n - Bãi đỗ xe \n - Wifi miễn phí \n - Có phòng tập \n - Hồ bơi miễn phí \n - Hỗ trợ nhận phòng nhanh");
    }//GEN-LAST:event_btn304MouseMoved

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
            java.util.logging.Logger.getLogger(RoomMapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomMapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomMapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomMapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RoomMapJDialog dialog = new RoomMapJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Deleuxe;
    private javax.swing.JPanel Other;
    private javax.swing.JTabbedPane RoomMap;
    private javax.swing.JPanel Standard;
    private javax.swing.JPanel Standard1;
    private javax.swing.JPanel Standard2;
    private javax.swing.JPanel Standard3;
    private javax.swing.JPanel Standard4;
    private javax.swing.JPanel Suite;
    private javax.swing.JPanel Superior;
    private javax.swing.JButton btn101;
    private javax.swing.JButton btn102;
    private javax.swing.JButton btn103;
    private javax.swing.JButton btn104;
    private javax.swing.JButton btn201;
    private javax.swing.JButton btn202;
    private javax.swing.JButton btn203;
    private javax.swing.JButton btn204;
    private javax.swing.JButton btn301;
    private javax.swing.JButton btn302;
    private javax.swing.JButton btn303;
    private javax.swing.JButton btn304;
    private javax.swing.JButton btn401;
    private javax.swing.JButton btn402;
    private javax.swing.JButton btn403;
    private javax.swing.JButton btn404;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelD;
    private javax.swing.JLabel jLabelO;
    private javax.swing.JLabel jLabelPicD;
    private javax.swing.JLabel jLabelPicO;
    private javax.swing.JLabel jLabelPicSui;
    private javax.swing.JLabel jLabelPicSup;
    private javax.swing.JLabel jLabelSui;
    private javax.swing.JLabel jLabelSup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane lblDeInf;
    private javax.swing.JTextPane lblOtherInf;
    private javax.swing.JLabel lblPicSta;
    private javax.swing.JLabel lblSta;
    private javax.swing.JTextPane lblStaInf;
    private javax.swing.JTextPane lblSuiInf;
    private javax.swing.JTextPane lblSupInf;
    private javax.swing.JTable tblRoom;
    // End of variables declaration//GEN-END:variables
}
