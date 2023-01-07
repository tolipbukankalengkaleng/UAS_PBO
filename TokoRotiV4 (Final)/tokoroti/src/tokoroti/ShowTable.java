/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tokoroti;
import java.text.DecimalFormat;
import rotimanis.*;
import rotitawar.*;
import pizza.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class ShowTable extends javax.swing.JFrame {

    /**
     * Creates new form ShowTable
     */
    public ShowTable() {
        initComponents();
        populateTable();
    }
    
    public String Change(double x){
        DecimalFormat df = new DecimalFormat("#.#");
        if(x >= 1000){
            String kasil = df.format(x/1000) +" kilogram";
            return kasil;
        }else{
            String kasil = df.format(x) + " gram";
            return kasil;
        }
    }
    
    public String Harga(double x){
        DecimalFormat df = new DecimalFormat("#");
        String harga = "Rp " + df.format(x);
        return harga;
    }
    
    public String jumlah(int x){
        String jumlah = "" + x;
        return jumlah;
    }
    
    public void populateTable(){
    
        //      INSTANTIASI PRODUK

        RotiManisV1 rm1 = new RotiManisV1();
        RotiManisV2 rm2 = new RotiManisV2();
        RotiManisV3 rm3 = new RotiManisV3();
        RotiTawarV1 rt1 = new RotiTawarV1();
        RotiTawarV2 rt2 = new RotiTawarV2();
        PizzaV1 p1  = new PizzaV1(); 
      
//      VARIABEL JUMLAH PESANAN TIAP PRODUK      

        rm1.pesanan = 50;
        rm2.pesanan = 100;
        rm3.pesanan = 70;
        rt1.pesanan = 20;
        rt2.pesanan = 15;
        p1.pesanan = 10;
        
               
//      HITUNG KEBUTUHAN TIAP BAHAN   
     
        double kebutuhanTepung = rm1.hitungTerigu() + rm2.hitungTerigu() + rm3.hitungTerigu() + rt1.hitungTerigu() + rt2.hitungTerigu() + p1.hitungTerigu();
        double kebutuhanGula = rm1.hitungGula () + rm2.hitungGula() + rm3.hitungGula() + rt1.hitungGula() + rt2.hitungGula() + p1.hitungGula();
        double kebutuhanButter = rm1.hitungButter () + rm2.hitungButter() + rm3.hitungButter() + rt1.hitungButter() + rt2.hitungButter() + p1.hitungButter();
        double kebutuhanRagi = rm1.hitungRagi() + rm2.hitungRagi() + rm3.hitungRagi() + rt1.hitungRagi() + rt2.hitungRagi() + p1.hitungRagi();
        double kebutuhanSusuBubuk = rm1.hitungSusuBubuk() + rm2.hitungSusuBubuk() + rm3.hitungSusuBubuk() + rt1.hitungSusuBubuk() + rt2.hitungSusuBubuk() + p1.hitungSusuBubuk();
        double kebutuhanSusuCair = rm1.hitungSusuCair() + rm2.hitungSusuCair() + rm3.hitungSusuCair() + rt1.hitungSusuCair() + rt2.hitungSusuCair() + p1.hitungSusuCair();
        double kebutuhanTelur = rm1.hitungTelur() + rm2.hitungTelur() + rm3.hitungTelur() + rt1.hitungTelur() + rt2.hitungTelur() + p1.hitungTelur();
        double kebutuhanEs = rm1.hitungEs() + rm2.hitungEs() + rm3.hitungEs() + rt1.hitungEs() + rt2.hitungEs() + p1.hitungEs();
        double kebutuhanCoklat = rm1.hitungCoklat() + rt1.hitungCoklat();
        double kebutuhanKeju = rm1.hitungKeju() + rm3.hitungKeju() + rt2.hitungKeju() + p1.hitungKeju();
        double kebutuhanRedBean = rm2.hitungRedBean();
        double kebutuhanKrimVanilla = rm2.hitungKrimVanilla();
        double kebutuhanSosis = rm3.hitungSosis() + p1.hitungSosis();
        double kebutuhanBeef = p1.hitungBeef();
        double kebutuhanBawang = p1.hitungBawang();
        
        
//      DATA TABEL UNTUK KEBUTUHAN BAHAN
        
        String columns [] = {"Bahan","Kebutuhan"};
        String rows[][] = {{"Tepung",Change(kebutuhanTepung)},{"Gula",Change(kebutuhanGula)},{"Butter",Change(kebutuhanButter)},
            {"Ragi",Change(kebutuhanRagi)},{"Susu Bubuk",Change(kebutuhanSusuBubuk)},{"Susu Cair",Change(kebutuhanSusuCair)}
            ,{"Telur",Change(kebutuhanTelur)},{"Es Batu",Change(kebutuhanEs)},{"Coklat",Change(kebutuhanCoklat)},{"Keju",Change(kebutuhanKeju)},
            {"Selai Red Bean",Change(kebutuhanRedBean)},{"Krim Vanilla",Change(kebutuhanKrimVanilla)},{"Sosis",Change(kebutuhanSosis)},{"Somked Beef",Change(kebutuhanBeef)},{"Bawang Bombay",Change(kebutuhanBawang)}
        };
        
        
//      DATA TABEL UNTUK HARGA PRODUK PER PCS
        
        String kolom [] = {"Produk" , "Harga per pcs"};
        String row [][] = {{"Roti Manis Varian 1",Harga(rm1.hargaVarian())},{"Roti Manis Varian 2",Harga(rm2.hargaVarian())},
            {"Roti Manis Varian 3",Harga(rm3.hargaVarian())},{"Roti Tawar Varian 1",Harga(rt1.hargaVarian())},
            {"Roti Tawar Varian 2",Harga(rt2.hargaVarian())},{"Pizza",Harga(p1.hargaVarian())}
        };
        
//      DATA TABEL RINCIAN PESANAN

        String col [] = {"Produk","Jumlah Pesanan"};
        String rowe [][] = {{"Roti Manis Varian 1",jumlah(rm1.pesanan)},{"Roti Manis Varian 2",jumlah(rm2.pesanan)}
                ,{"Roti Manis Varian 3",jumlah(rm3.pesanan)},{"Roti Tawar Varian 1",jumlah(rt1.pesanan)},
                {"Roti Tawar Varian 2",jumlah(rt2.pesanan)},{"Pizza",jumlah(p1.pesanan)}    
        };       
        
//      INISIASI TABEL
        
        DefaultTableModel bahan= new DefaultTableModel(rows,columns);
        DefaultTableModel produk = new DefaultTableModel(row,kolom);
        DefaultTableModel pesanan = new DefaultTableModel (rowe,col);
        jTable1.setModel(bahan);
        jTable2.setModel(produk);
        jTable3.setModel(pesanan);
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(255, 204, 255));
        jTable1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
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
        jTable1.setRowHeight(25);
        jTable1.setShowGrid(true);
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setBackground(new java.awt.Color(255, 204, 255));
        jTable2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
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
        jTable2.setRowHeight(25);
        jTable2.setRowMargin(5);
        jTable2.setShowGrid(true);
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel1.setText("Kebutuhan Bahan");

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel2.setText("Harga Produk");

        jTable3.setBackground(new java.awt.Color(255, 204, 255));
        jTable3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jTable3.setForeground(new java.awt.Color(0, 0, 0));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.setRowHeight(25);
        jTable3.setShowGrid(true);
        jTable3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable3PropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setText("Rincian Pesanan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(138, 138, 138)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(474, 474, 474))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane1))
                                .addGap(300, 300, 300))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(460, 460, 460))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1PropertyChange

    private void jTable3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable3PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3PropertyChange

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
            java.util.logging.Logger.getLogger(ShowTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ShowTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

}
