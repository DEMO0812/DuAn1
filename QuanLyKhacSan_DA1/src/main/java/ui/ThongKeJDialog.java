
package ui;

//import dao.KhoaHocDAO;

import dao.ThongKeDao;
import java.text.DecimalFormat;

import entity.DatPhong;
import entity.Phong;
import entity.ThongKeNam;
import entity.ThongKeNgay;
import entity.ThongKeThang;
import utils.Auth;
import utils.XImage;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import utils.MsgBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

/**
 *
 * @author DEMO
 */
public class ThongKeJDialog extends javax.swing.JDialog {

    ThongKeDao daoTK = new ThongKeDao();
   
    

    /**
     * Creates new form ThongKeJDialog
     */
    public ThongKeJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setResizable(false);
        initComponents();
        init();
    }

    void init() {
        setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        setTitle("Thong Ke Doanh Thu");
        fillTablengay();
        fillcboThang();
        fillTablethang();
        fillcbonam();
        fillTablenam();
    }
    public void fillcboThang() {
    	cboTKThang.addItem("");
		for (int i = 1; i <= 12; i++) {
			if(i<10) {
				cboTKThang.addItem(i+"");
			}else {
				cboTKThang.addItem(i+"");
			}
			
				
			
		}
	}
    public void fillcbonam() {
    	cboNam.addItem("");
    	 try {
             
             for (ThongKeNam p : daoTK.selectAllTKN()) {
            	 cboNam.addItem(p.getThang());
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
	}
    
    public void fillTablengay() {
      DefaultTableModel modeltblngay = (DefaultTableModel) tblTKNgay.getModel();
      modeltblngay.setRowCount(0);
        try {
            
            for (ThongKeNgay p : daoTK.selectAll()) {
                Object[] row = {
                  p.getMadp(),
                  p.getNgaytra(),
                  p.getDoanhthu()
                };
                modeltblngay.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
            MsgBox.alert(this, "Lỗi truy vẫn data!");
        }
        
        String DESC=daoTK.selectAllDESC()+"";
        String ASC=daoTK.selectAllASC()+"";
        lblTK.setText("Doanh thu cao nhat: "+DESC
                + "\n Doanh thu thap nhat: "+ASC);
        
        
    }
    
    public void fillTablethang() {
     DefaultTableModel modeltblnthang = (DefaultTableModel) tblTKThang.getModel();
     modeltblnthang.setRowCount(0);
        try {
            for (ThongKeThang p : daoTK.selectAllTKT()) {
            	DecimalFormat df1 = new DecimalFormat("##0.####");
                Object[] row = {
                  p.getThang(),
                  df1.format(p.getDoanhthu())
                };
                modeltblnthang.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
            MsgBox.alert(this, "Lỗi truy vẫn data!");
        }
    }
    public void FindTKThang(String t) {
    	DefaultTableModel modeltblnthang= (DefaultTableModel) tblTKThang.getModel();
    	modeltblnthang.setRowCount(0);
		
		 try {
	            for (ThongKeThang p : daoTK.selectAllFindTKT(t)) {
	             
	            	DecimalFormat df1 = new DecimalFormat("##0.####");
	                Object[] row = {
	                  p.getThang(),
	                  df1.format(p.getDoanhthu())
	                };
	                modeltblnthang.addRow(row);
	               
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println(e);
	            MsgBox.alert(this, "Lỗi truy vẫn data!");
	        }
	}
    public void fillTablenam() {
        DefaultTableModel modeltblnam = (DefaultTableModel) tblTKNam.getModel();
        modeltblnam.setRowCount(0);
           try {
               for (ThongKeNam p : daoTK.selectAllTKN()) {
               	DecimalFormat df1 = new DecimalFormat("##0.####");
                   Object[] row = {
                     p.getThang(),
                     df1.format(p.getDoanhthu())
                   };
                   modeltblnam.addRow(row);
               }
           } catch (Exception e) {
               e.printStackTrace();
               System.out.println(e);
               MsgBox.alert(this, "Lỗi truy vẫn data!");
           }
       }
       public void FindTKNam(String t) {
    	   DefaultTableModel modeltblnam = (DefaultTableModel) tblTKNam.getModel();
           modeltblnam.setRowCount(0);
              try {
                  for (ThongKeNam p : daoTK.selectAllFindTKN(t)) {
                  	DecimalFormat df1 = new DecimalFormat("##0.####");
                      Object[] row = {
                        p.getThang(),
                        df1.format(p.getDoanhthu())
                      };
                      modeltblnam.addRow(row);
                  }
              } catch (Exception e) {
                  e.printStackTrace();
                  System.out.println(e);
                  MsgBox.alert(this, "Lỗi truy vẫn data!");
              }
   	}
//    public void fillTableDTTheoNgay() {
//        DefaultTableModel model = (DefaultTableModel) tblBangDiem.getModel();
//        model.setRowCount(0);
//
//        DatPhong kh = (DatPhong) cboKthang.getSelectedItem();
//        List<Object[]> list = dao.getDatPhong(kh.getMaKH());
//        for (Object[] row : list) {
//            double diem = (double) row[2];
//            model.addRow(new Object[]{row[0], row[1],diem,getXepLoai(diem)});
//        }
//    }
//    
     
     
     
     
     public void selectTab(int index){
         tabs.setSelectedIndex(index);
     }
     
    
    

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTKNgay = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lblTK = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTKThang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cboTKThang = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTKNam = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("THỐNG KÊ DOANH THU");

        tblTKNgay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaDP", "Ngày", "Doanh thu"
            }
        ));
        tblTKNgay.setShowGrid(true);
        jScrollPane1.setViewportView(tblTKNgay);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        jScrollPane5.setViewportView(lblTK);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        tabs.addTab("Doanh thu Theo Ngay", jPanel2);

        tblTKThang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tháng", "Doanh Thu"
            }
        ));
        tblTKThang.setShowGrid(true);
        jScrollPane2.setViewportView(tblTKThang);

        jLabel2.setText("Tháng");

        cboTKThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTKThangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboTKThang, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 123, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(cboTKThang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Doanh thu theo tháng", jPanel1);

        tblTKNam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tháng", "CAO NHẤT", "THẤP NHẤT"
            }
        ));
        tblTKNam.setShowGrid(true);
        jScrollPane3.setViewportView(tblTKNam);

        jLabel4.setText("NĂM");

        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(cboNam, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );

        tabs.addTab("Doanh thu theo nam", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNamActionPerformed

    private void cboTKThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTKThangActionPerformed
        // TODO add your handling code here:
//        fillTableBangDiem();
    }//GEN-LAST:event_cboTKThangActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongKeJDialog dialog = new ThongKeJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboTKThang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane lblTK;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblTKNam;
    private javax.swing.JTable tblTKNgay;
    private javax.swing.JTable tblTKThang;
    // End of variables declaration//GEN-END:variables

}
