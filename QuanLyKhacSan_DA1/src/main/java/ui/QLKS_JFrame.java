/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import utils.Auth;
import utils.MsgBox;
import utils.XImage;

/**
 *
 * @author DEMO
 */
public class QLKS_JFrame extends javax.swing.JFrame {

    int lblTextleght = 0;
    Timer tm;
    int counter = 0;

    /**
     * Creates new form NewJFrame
     */
    public QLKS_JFrame() {
        initComponents();
        init();
    }

    void init() {
        setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        setTitle("Quan ly khach san");

        this.openWelcome();
        this.openLogin();

        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss a");

            @Override
            public void actionPerformed(ActionEvent e) {
                lblDongHo.setText(format.format(new Date()));
            }
        }).start();

        lblUsername.setText("Xin chào:    " + Auth.user.getTenNV());
        lblVT.setText(Auth.user.isChucVu() ? "Quan Ly" : "Nhan Vien");

    }

    public void textmove() {
        String txt = lblTrangThai.getText();
        lblTextleght = txt.length();
        tm = new Timer(250, e -> {
            counter++;
            if (counter > lblTextleght) {
                lblTrangThai.setText("");
                counter = 0;
            } else {
                lblTrangThai.setText(txt.substring(0, counter));
                lblTrangThai.setForeground(Color.BLACK);
            }
        });
        tm.start();
    }

    void openWelcome() {
        new ChaoJDialog(this, true).setVisible(true);
    }

    void openLogin() {
        new DangNhapJDialog(this, true).setVisible(true);
        lblUsername.setText(Auth.user.getTenNV());
        lblVT.setText(Auth.user.isChucVu() ? "Quan Ly" : "Nhan Vien");
    }
    
    void openQLPhong() {
        if (Auth.isLogin()) {
            new QLPhongJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui long đăng nhập");
        }
    }

    void openQLKH() {

        QLKHJDialog qlkh = new QLKHJDialog(this, true);
        qlkh.setVisible(true);
        qlkh.setLocationRelativeTo(null);

        this.setVisible(false);

    }

    void openThongKe(int index) {
        if (Auth.isLogin()) {
            if (index == 2 && !Auth.isManager() && index == 1 && index == 0) {
                MsgBox.alert(this, "Bạn ko có quyền xem thông tin doanh thu");
                return;
            }
            ThongKeJDialog tk = new ThongKeJDialog(this, true);
            tk.selectTab(index);
            tk.setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập");
        }
    }

    void openQLNV() {
        if (Auth.isLogin()) {
            if (!Auth.isManager()) {
                MsgBox.alert(this, "Bạn ko có quyền xem thông tin nhân viên");
                return;
            }
            QLNV qlnv = new QLNV();
            qlnv.setVisible(true);
            qlnv.setLocationRelativeTo(null);

            this.setVisible(false);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập");
        }
    }

    void openSDPhong() {
//        RoomMapJDialog sdp = new RoomMapJDialog(this, true);
        RoomMapJFrame sdp = new RoomMapJFrame();
        sdp.setVisible(true);
        sdp.setLocationRelativeTo(null);

        this.setVisible(false);
    }

    void openQLDP() {
        if (Auth.isLogin()) {
            new QLDatPhongJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui long đăng nhập");
        }
    }

    void openQLTP() {
        if (Auth.isLogin()) {
            new TraPhongJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui long đăng nhập");
        }
    }

    void dangXuat() {
        Auth.clear();;
        lblUsername.setText("");
        lblVT.setText("");
    }

    void ketThuc() {
        if (MsgBox.confirm(this, "Bạn muốn thoát ứng dụng?")) {
            System.exit(0);
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

        jPanel1 = new javax.swing.JPanel();
        lblTrangThai = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        lblVT = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblQLPhong = new javax.swing.JLabel();
        lblSoDoPhong = new javax.swing.JLabel();
        lblQLKH = new javax.swing.JLabel();
        lblTrogiup = new javax.swing.JLabel();
        lblDangXuat = new javax.swing.JLabel();
        lblQLNV = new javax.swing.JLabel();
        lblQLDP = new javax.swing.JLabel();
        lblQLTP = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        mniExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniQLKH = new javax.swing.JMenuItem();
        mniQLNV = new javax.swing.JMenuItem();
        mniSDP = new javax.swing.JMenuItem();
        mniQLP = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mniTKNgay = new javax.swing.JMenuItem();
        mniTKThang = new javax.swing.JMenuItem();
        mniTKNam = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mniHDSD = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniGTSP = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/info-button.png"))); // NOI18N
        lblTrangThai.setText("IT18103_Nhom2");
        lblTrangThai.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblTrangThaiAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/timer.png"))); // NOI18N
        lblDongHo.setText("00:00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrangThai)
                    .addComponent(lblDongHo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblHome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHome.setText("HOTEL");
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });

        lblUsername.setText("Xin chào");

        b.setText("Vai trò:");

        lblVT.setText("Vai trò");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVT, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b)
                    .addComponent(lblVT))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/anh-chao-mung-nen-toi.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        lblQLPhong.setBackground(new java.awt.Color(204, 255, 204));
        lblQLPhong.setText("Quản lý phòng");
        lblQLPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLPhongMouseClicked(evt);
            }
        });

        lblSoDoPhong.setBackground(new java.awt.Color(204, 255, 204));
        lblSoDoPhong.setText("Sơ đồ phòng");
        lblSoDoPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSoDoPhongMouseClicked(evt);
            }
        });

        lblQLKH.setBackground(new java.awt.Color(204, 255, 204));
        lblQLKH.setText("Quản lý khách hàng");
        lblQLKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLKHMouseClicked(evt);
            }
        });

        lblTrogiup.setBackground(new java.awt.Color(204, 255, 204));
        lblTrogiup.setText("Trợ giúp");

        lblDangXuat.setBackground(new java.awt.Color(204, 255, 204));
        lblDangXuat.setText("Đăng xuất");
        lblDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseClicked(evt);
            }
        });

        lblQLNV.setBackground(new java.awt.Color(204, 255, 204));
        lblQLNV.setText("Quản lý nhân viên");
        lblQLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLNVMouseClicked(evt);
            }
        });

        lblQLDP.setBackground(new java.awt.Color(204, 255, 204));
        lblQLDP.setText("Quản lý đặt phòng");
        lblQLDP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLDPMouseClicked(evt);
            }
        });

        lblQLTP.setBackground(new java.awt.Color(204, 255, 204));
        lblQLTP.setText("Quản lý trả phòng");
        lblQLTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLTPMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQLPhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(lblTrogiup, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(lblSoDoPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(lblQLKH, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(lblQLNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(lblQLDP, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(lblQLTP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblQLPhong)
                .addGap(18, 18, 18)
                .addComponent(lblSoDoPhong)
                .addGap(18, 18, 18)
                .addComponent(lblQLDP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQLTP)
                .addGap(14, 14, 14)
                .addComponent(lblQLKH)
                .addGap(18, 18, 18)
                .addComponent(lblQLNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTrogiup)
                .addGap(18, 18, 18)
                .addComponent(lblDangXuat)
                .addContainerGap())
        );

        jMenu1.setText("Hệ thống");

        jMenuItem1.setText("Đăng Nhập");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        jMenu1.add(mniDangXuat);

        mniExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reject.png"))); // NOI18N
        mniExit.setText("Thoát");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        jMenu1.add(mniExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        mniQLKH.setText("Quản lý khách hàng");
        mniQLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLKHActionPerformed(evt);
            }
        });
        jMenu2.add(mniQLKH);

        mniQLNV.setText("Quản lý nhân viên");
        mniQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLNVActionPerformed(evt);
            }
        });
        jMenu2.add(mniQLNV);

        mniSDP.setText("Sơ đồ phòng");
        mniSDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSDPActionPerformed(evt);
            }
        });
        jMenu2.add(mniSDP);

        mniQLP.setText("Quản lý phòng");
        mniQLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLPActionPerformed(evt);
            }
        });
        jMenu2.add(mniQLP);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thống kê");

        mniTKNgay.setText("Doanh thu theo ngày");
        mniTKNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTKNgayActionPerformed(evt);
            }
        });
        jMenu3.add(mniTKNgay);

        mniTKThang.setText("Doanh thu theo tháng");
        mniTKThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTKThangActionPerformed(evt);
            }
        });
        jMenu3.add(mniTKThang);

        mniTKNam.setText("Doanh thu theo năm");
        mniTKNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTKNamActionPerformed(evt);
            }
        });
        jMenu3.add(mniTKNam);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Trợ giúp");

        mniHDSD.setText("Hướng dẫn sử dụng");
        jMenu4.add(mniHDSD);
        jMenu4.add(jSeparator1);

        mniGTSP.setText("Giới thiệu sản phẩm");
        jMenu4.add(mniGTSP);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        openLogin();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        // TODO add your handling code here:
        dangXuat();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        // TODO add your handling code here:
        ketThuc();
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniQLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLKHActionPerformed
        // TODO add your handling code here:
        openQLKH();
    }//GEN-LAST:event_mniQLKHActionPerformed

    private void mniQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLNVActionPerformed
        // TODO add your handling code here:
        openQLNV();
    }//GEN-LAST:event_mniQLNVActionPerformed

    private void mniSDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSDPActionPerformed
        // TODO add your handling code here:
        openSDPhong();
    }//GEN-LAST:event_mniSDPActionPerformed

    private void mniQLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLPActionPerformed
        // TODO add your handling code here:
        openQLPhong();
    }//GEN-LAST:event_mniQLPActionPerformed

    private void mniTKNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTKNgayActionPerformed
        // TODO add your handling code here:
        openThongKe(0);
    }//GEN-LAST:event_mniTKNgayActionPerformed

    private void mniTKThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTKThangActionPerformed
        // TODO add your handling code here:
        openThongKe(1);
    }//GEN-LAST:event_mniTKThangActionPerformed

    private void mniTKNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTKNamActionPerformed
        // TODO add your handling code here:
        openThongKe(2);
    }//GEN-LAST:event_mniTKNamActionPerformed

    private void lblTrangThaiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblTrangThaiAncestorAdded
        // TODO add your handling code here:
        textmove();
    }//GEN-LAST:event_lblTrangThaiAncestorAdded

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        // TODO add your handling code here:
        new QLKS_JFrame().setVisible(true);
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblQLPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLPhongMouseClicked
        // TODO add your handling code here:
        openQLPhong();
    }//GEN-LAST:event_lblQLPhongMouseClicked

    private void lblSoDoPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSoDoPhongMouseClicked
        // TODO add your handling code here:
        openSDPhong();
    }//GEN-LAST:event_lblSoDoPhongMouseClicked

    private void lblQLKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLKHMouseClicked
        // TODO add your handling code here:
        openQLKH();
    }//GEN-LAST:event_lblQLKHMouseClicked

    private void lblDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseClicked
        // TODO add your handling code here:
        dangXuat();
    }//GEN-LAST:event_lblDangXuatMouseClicked

    private void lblQLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLNVMouseClicked
        // TODO add your handling code here:
        openQLNV();
    }//GEN-LAST:event_lblQLNVMouseClicked

    private void lblQLDPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLDPMouseClicked
        // TODO add your handling code here:
        openQLDP();
    }//GEN-LAST:event_lblQLDPMouseClicked

    private void lblQLTPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLTPMouseClicked
        // TODO add your handling code here:
        openQLTP();
    }//GEN-LAST:event_lblQLTPMouseClicked

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
            java.util.logging.Logger.getLogger(QLKS_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKS_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKS_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKS_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLKS_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblQLDP;
    private javax.swing.JLabel lblQLKH;
    private javax.swing.JLabel lblQLNV;
    private javax.swing.JLabel lblQLPhong;
    private javax.swing.JLabel lblQLTP;
    private javax.swing.JLabel lblSoDoPhong;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JLabel lblTrogiup;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblVT;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniGTSP;
    private javax.swing.JMenuItem mniHDSD;
    private javax.swing.JMenuItem mniQLKH;
    private javax.swing.JMenuItem mniQLNV;
    private javax.swing.JMenuItem mniQLP;
    private javax.swing.JMenuItem mniSDP;
    private javax.swing.JMenuItem mniTKNam;
    private javax.swing.JMenuItem mniTKNgay;
    private javax.swing.JMenuItem mniTKThang;
    // End of variables declaration//GEN-END:variables
}
