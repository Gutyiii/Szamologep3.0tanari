package szamologep3tanari;

public class szamologepe extends javax.swing.JFrame {

    public szamologepe() {
        initComponents();
    }

    private void osztas() {
        lblFeladat.setText("12 : 3 =");
    }

    private void osztasEllenorzes() {
        int szam = Integer.parseInt(txtEredmeny.getText());
        btnEllenorzes.setEnabled(true);
        if (!(szam == 4)) {
            lblValasz.setText("Rossz válasz");
            txtEredmeny.setText("");
        } else if (txtEredmeny.getText().equals("")) {
            lblValasz.setText("Írj be valamit");
            txtEredmeny.setText("");
        } else {
            lblValasz.setText("Jó válasz");
            btnEllenorzes.setEnabled(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btnUj = new javax.swing.JButton();
        btnMegoldas = new javax.swing.JButton();
        pnlGyakorlas = new javax.swing.JPanel();
        btnEllenorzes = new javax.swing.JButton();
        txtEredmeny = new javax.swing.JTextField();
        lblFeladat = new javax.swing.JLabel();
        lblValasz = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblOsszKerdes = new javax.swing.JLabel();
        lblKivonasKerdes = new javax.swing.JLabel();
        lblOsszeadKerdes = new javax.swing.JLabel();
        lblSzorzasKerdes = new javax.swing.JLabel();
        lblOszasKerdes = new javax.swing.JLabel();
        lblEredmeny = new javax.swing.JLabel();
        lblOsszProba = new javax.swing.JLabel();
        lblOsszeadProba = new javax.swing.JLabel();
        lblKivonasProba = new javax.swing.JLabel();
        lblSzorzasProba = new javax.swing.JLabel();
        lblOsztasProba = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFajl = new javax.swing.JMenu();
        mnuFajlUj = new javax.swing.JMenuItem();
        mnuFajlMegnyit = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuFajlKilep = new javax.swing.JMenuItem();
        mnuMuveletek = new javax.swing.JMenu();
        mnuMuveletekOsszeadas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletekKivonas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletekSzorzas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletekOsztas = new javax.swing.JRadioButtonMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUj.setText("Új feladat");

        btnMegoldas.setText("Megoldás");

        pnlGyakorlas.setBackground(new java.awt.Color(204, 204, 204));
        pnlGyakorlas.setBorder(javax.swing.BorderFactory.createTitledBorder("Gyakorlas"));

        btnEllenorzes.setText("Ellenőrzés");
        btnEllenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEllenorzesActionPerformed(evt);
            }
        });

        txtEredmeny.setText("Válasz");

        lblFeladat.setText("12 + 5 =");

        lblValasz.setText("visszajelezes");

        javax.swing.GroupLayout pnlGyakorlasLayout = new javax.swing.GroupLayout(pnlGyakorlas);
        pnlGyakorlas.setLayout(pnlGyakorlasLayout);
        pnlGyakorlasLayout.setHorizontalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addComponent(lblValasz)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addComponent(lblFeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEllenorzes)
                        .addGap(22, 22, 22))))
        );
        pnlGyakorlasLayout.setVerticalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEllenorzes)
                    .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValasz)
                .addGap(17, 17, 17))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Statisztika"));

        lblOsszKerdes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblOsszKerdes.setText("Össz. kérdések száma:");

        lblKivonasKerdes.setText("Kivonás: 0");

        lblOsszeadKerdes.setText("Összeadás: 1");

        lblSzorzasKerdes.setText("Szorzás: 0");

        lblOszasKerdes.setText("Osztás: 0");

        lblEredmeny.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEredmeny.setText("Eredmény: 0%");

        lblOsszProba.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblOsszProba.setText("Össz. próbálkozások száma:");

        lblOsszeadProba.setText("Összeadás: 1");

        lblKivonasProba.setText("Kivonás: 0");

        lblSzorzasProba.setText("Szorzás: 0");

        lblOsztasProba.setText("Osztás: 1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszeadKerdes)
                            .addComponent(lblOsszKerdes)
                            .addComponent(lblKivonasKerdes)
                            .addComponent(lblSzorzasKerdes)
                            .addComponent(lblOszasKerdes))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszProba)
                            .addComponent(lblOsszeadProba)
                            .addComponent(lblKivonasProba)
                            .addComponent(lblSzorzasProba)
                            .addComponent(lblOsztasProba)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsszKerdes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOsszProba))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsszeadKerdes)
                    .addComponent(lblOsszeadProba))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKivonasKerdes)
                    .addComponent(lblKivonasProba))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSzorzasKerdes)
                    .addComponent(lblSzorzasProba))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOszasKerdes)
                    .addComponent(lblOsztasProba))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        mnuFajl.setText("Fájl");

        mnuFajlUj.setText("Új...");
        mnuFajl.add(mnuFajlUj);

        mnuFajlMegnyit.setText("Megnyitás");
        mnuFajl.add(mnuFajlMegnyit);
        mnuFajl.add(jSeparator1);

        mnuFajlKilep.setText("Kilépés");
        mnuFajl.add(mnuFajlKilep);

        jMenuBar1.add(mnuFajl);

        mnuMuveletek.setText("Műveletek");

        mnuMuveletekOsszeadas.setText("Összeadás");
        mnuMuveletek.add(mnuMuveletekOsszeadas);

        mnuMuveletekKivonas.setText("Kivonás");
        mnuMuveletek.add(mnuMuveletekKivonas);

        mnuMuveletekSzorzas.setText("Szorzás");
        mnuMuveletek.add(mnuMuveletekSzorzas);

        mnuMuveletekOsztas.setText("Osztás");
        mnuMuveletekOsztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletekOsztasActionPerformed(evt);
            }
        });
        mnuMuveletek.add(mnuMuveletekOsztas);

        jMenuBar1.add(mnuMuveletek);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMegoldas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUj, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMegoldas))
                    .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuMuveletekOsztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletekOsztasActionPerformed
        osztas();
    }//GEN-LAST:event_mnuMuveletekOsztasActionPerformed

    private void btnEllenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEllenorzesActionPerformed
        osztasEllenorzes();
    }//GEN-LAST:event_btnEllenorzesActionPerformed

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
            java.util.logging.Logger.getLogger(szamologepe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(szamologepe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(szamologepe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(szamologepe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new szamologepe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEllenorzes;
    private javax.swing.JButton btnMegoldas;
    private javax.swing.JButton btnUj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblEredmeny;
    private javax.swing.JLabel lblFeladat;
    private javax.swing.JLabel lblKivonasKerdes;
    private javax.swing.JLabel lblKivonasProba;
    private javax.swing.JLabel lblOsszKerdes;
    private javax.swing.JLabel lblOsszProba;
    private javax.swing.JLabel lblOsszeadKerdes;
    private javax.swing.JLabel lblOsszeadProba;
    private javax.swing.JLabel lblOszasKerdes;
    private javax.swing.JLabel lblOsztasProba;
    private javax.swing.JLabel lblSzorzasKerdes;
    private javax.swing.JLabel lblSzorzasProba;
    private javax.swing.JLabel lblValasz;
    private javax.swing.JMenu mnuFajl;
    private javax.swing.JMenuItem mnuFajlKilep;
    private javax.swing.JMenuItem mnuFajlMegnyit;
    private javax.swing.JMenuItem mnuFajlUj;
    private javax.swing.JMenu mnuMuveletek;
    private javax.swing.JRadioButtonMenuItem mnuMuveletekKivonas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletekOsszeadas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletekOsztas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletekSzorzas;
    private javax.swing.JPanel pnlGyakorlas;
    private javax.swing.JTextField txtEredmeny;
    // End of variables declaration//GEN-END:variables
}
