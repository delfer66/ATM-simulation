import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class Factura extends javax.swing.JFrame {
    int TC, TCs;
    char accion;
    String nom;
    Float scorr,sahorr;
    long R1D;
    long dpd;
    
    public Factura(int t,String c,Float scorr, Float sahorr,long restdepo,char acc, int TipodeCuentausar,long dpds) {
        super("Simulador Cajero Automatico");
        this.sahorr=sahorr;
        this.scorr=scorr;
        this.TC=t;
        this.nom=c;
        this.accion=acc;
        this.R1D=restdepo;
        this.TCs=TipodeCuentausar;
        this.dpd=dpds;
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        initComponents();
        setResizable(false);
        this.jLNom.setText(nom);
        this.jLretirado.setText(String.valueOf(dpd));
        java.util.Date utilDate = new java.util.Date(); //fecha actual
        long lnMilisegundos = utilDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);
        java.sql.Time sqlTime = new java.sql.Time(lnMilisegundos);  //retorna la hora
        this.jLfecha.setText(sqlDate+"");
        this.jLhora.setText(sqlTime+"");
        
        if(accion=='r')
        {
        this.jLACCI.setText("Retiro de:");
        this.jLaccion.setText(String.valueOf(R1D));
        }
        
        if(accion=='d')
        {
        this.jLACCI.setText("Deposito de:");
        this.jLaccion.setText(String.valueOf(R1D));
        }
        
        if(TCs==1) 
        {
        this.jLcuenta.setText("De Ahorros");
        this.jLsaldo.setText(String.valueOf(sahorr));
        }
        
        if(TCs==2) 
        {
        this.jLcuenta.setText("Corriente");
        this.jLsaldo.setText(String.valueOf(scorr));
        }
        
        if((TCs==1) && (accion=='r'))
        {   
        this.jLsaldoactual.setText(String.valueOf(sahorr-R1D));
        }
        if((TCs==2) && (accion=='r'))
        {
        this.jLsaldoactual.setText(String.valueOf(scorr-R1D));
        }    
        if((TCs==1) && (accion=='d'))
        {
        this.jLsaldoactual.setText(String.valueOf(sahorr+R1D));
        }    
            
        if((TCs==2) && (accion=='d'))    
        {
        this.jLsaldoactual.setText(String.valueOf(scorr+R1D));
        }    
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLNom = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLcuenta = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLsaldo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLACCI = new javax.swing.JLabel();
        jLaccion = new javax.swing.JLabel();
        jLsaldoactual = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLfecha = new javax.swing.JLabel();
        jLhora = new javax.swing.JLabel();
        jBcontinuar = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLfecha1 = new javax.swing.JLabel();
        jLretirado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setText("Banco del Pichincha");

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel2.setText("<< Factura >>");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cliente.-");

        jLNom.setText("<Adminstrador>");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cuenta.-");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Password.-");

        jLcuenta.setText("<No Mostrada por Seguradad>");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Saldo Anterior.-");

        jLsaldo.setText("0000000");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Saldo Actual.-");

        jLACCI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLACCI.setText("Dep/Retiro");

        jLaccion.setText("<valor>");

        jLsaldoactual.setText("0000000");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Dinero Retirado.-");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Hora de la Emision.-");

        jLfecha.setText("0000/00/00");

        jLhora.setText("00:00");

        jBcontinuar.setBackground(new java.awt.Color(0, 0, 0));
        jBcontinuar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBcontinuar.setForeground(new java.awt.Color(255, 255, 255));
        jBcontinuar.setText("Continuar");
        jBcontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcontinuarActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(0, 0, 0));
        Exit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("  Finalizar ");
        Exit.setActionCommand("  Finalizar  ");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel4.setText("$US");

        jLabel7.setText("$US");

        jLabel9.setText("$US");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("**********");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Fecha de la Emision.-");

        jLfecha1.setText("$US");

        jLretirado.setText("000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLACCI)
                            .addComponent(jLabel10)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNom)
                            .addComponent(jLhora)
                            .addComponent(jLfecha)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLsaldo))
                            .addComponent(jLcuenta)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLsaldoactual))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLaccion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLfecha1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLretirado))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jBcontinuar)
                        .addGap(32, 32, 32)
                        .addComponent(Exit)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLcuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLsaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLACCI)
                    .addComponent(jLabel7)
                    .addComponent(jLaccion))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLsaldoactual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLfecha1)
                    .addComponent(jLabel14)
                    .addComponent(jLretirado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLfecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLhora))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcontinuar)
                    .addComponent(Exit))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcontinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcontinuarActionPerformed
            
            if(TCs==1)
            {
            Float saldoactual=Float.parseFloat(this.jLsaldoactual.getText());
            Opciones o=new Opciones(TC, nom, scorr,saldoactual,dpd);
            o.setVisible(true);
            }
            if(TCs==2)
            {
            Float saldoactual=Float.parseFloat(this.jLsaldoactual.getText());
            Opciones o=new Opciones(TC, nom, saldoactual,sahorr,dpd);
            o.setVisible(true);
            }
            setVisible(false);
            
    }//GEN-LAST:event_jBcontinuarActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
            JOptionPane.showMessageDialog(null, "Gracias por Preferirnos","Banco del Pichincha",JOptionPane.NO_OPTION);
            System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton jBcontinuar;
    private javax.swing.JLabel jLACCI;
    private javax.swing.JLabel jLNom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLaccion;
    private javax.swing.JLabel jLcuenta;
    private javax.swing.JLabel jLfecha;
    private javax.swing.JLabel jLfecha1;
    private javax.swing.JLabel jLhora;
    private javax.swing.JLabel jLretirado;
    private javax.swing.JLabel jLsaldo;
    private javax.swing.JLabel jLsaldoactual;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
