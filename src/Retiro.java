import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class Retiro extends javax.swing.JFrame {
    int TC, TCs,verificador;
    String nom;
    Float scorr,sahorr;
    char accion;
    int resto;
    long dpd;
    
    public Retiro(int t,String c,Float scorr, Float sahorr, long dpds) {
        super("Simulador Cajero Automatico");
        this.sahorr=sahorr;
        this.scorr=scorr;
        this.TC=t;
        this.TCs=0;
        this.nom=c;
        this.resto=0;
        this.verificador=0;
        this.dpd=dpds;
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Retiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Retiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Retiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Retiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        this.jLretirado.setText(String.valueOf(dpd));
        this.jLNom.setText(nom);
                         
        
        if (TC==2)
        {
        jCahorro.setEnabled(false);
        jCcorriente.setSelected(true);
        this.jLsaldoactual.setText(String.valueOf(scorr));
        }
        
         if (TC==1)
        {
        jCcorriente.setEnabled(false);
        jCahorro.setSelected(true);
        this.jLsaldoactual.setText(String.valueOf(sahorr));
        }

        buttonGroup1.add(jR10);
        buttonGroup1.add(jR20);
        buttonGroup1.add(jR50);
        buttonGroup1.add(jR100);
        buttonGroup1.add(jR200);
        buttonGroup1.add(jRotros);
        
        this.jLNom.setText(nom);
                         
        
        if (TC==2)
        {
        jCahorro.setEnabled(false);
        jCcorriente.setSelected(true);
        this.jLsaldoactual.setText(String.valueOf(scorr));
        }
        
         if (TC==1)
        {
        jCcorriente.setEnabled(false);
        jCahorro.setSelected(true);
        this.jLsaldoactual.setText(String.valueOf(sahorr));
        }
         
         
        buttonGroup2.add(jCahorro);
        buttonGroup2.add(jCcorriente);
        
        java.util.Date utilDate = new java.util.Date(); //fecha actual
        long lnMilisegundos = utilDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);  //fecha actual
        java.sql.Time sqlTime = new java.sql.Time(lnMilisegundos);  //retorna la hora
        this.jLfecha.setText(sqlDate+"");  

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLnombre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBcancelar = new javax.swing.JButton();
        jBvolver = new javax.swing.JButton();
        jBaceptar = new javax.swing.JButton();
        jLfecha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jR10 = new javax.swing.JRadioButton();
        jR20 = new javax.swing.JRadioButton();
        jR50 = new javax.swing.JRadioButton();
        jR100 = new javax.swing.JRadioButton();
        jR200 = new javax.swing.JRadioButton();
        jRotros = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jCahorro = new javax.swing.JCheckBox();
        jCcorriente = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLsaldoactual = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jDescuento = new javax.swing.JLabel();
        jLNom = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLretirado = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLnombre.setText(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        jBcancelar.setFont(new java.awt.Font("Arial Black", 0, 18));
        jBcancelar.setText("Cancelar");
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });

        jBvolver.setFont(new java.awt.Font("Arial Black", 0, 18));
        jBvolver.setText("Volver");
        jBvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvolverActionPerformed(evt);
            }
        });

        jBaceptar.setFont(new java.awt.Font("Arial Black", 0, 18));
        jBaceptar.setText("Aceptar");
        jBaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaceptarActionPerformed(evt);
            }
        });

        jLfecha.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLfecha.setText("2010/14/02   12:60");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setText("Fecha.-");

        jR10.setFont(new java.awt.Font("Arial Black", 1, 18));
        jR10.setText("10");
        jR10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR10ActionPerformed(evt);
            }
        });

        jR20.setFont(new java.awt.Font("Arial Black", 1, 18));
        jR20.setText("20");
        jR20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR20ActionPerformed(evt);
            }
        });

        jR50.setFont(new java.awt.Font("Arial Black", 0, 18));
        jR50.setText("50");
        jR50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR50ActionPerformed(evt);
            }
        });

        jR100.setFont(new java.awt.Font("Arial Black", 1, 18));
        jR100.setText("100");
        jR100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR100ActionPerformed(evt);
            }
        });

        jR200.setFont(new java.awt.Font("Arial Black", 1, 18));
        jR200.setText("200");
        jR200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR200ActionPerformed(evt);
            }
        });

        jRotros.setFont(new java.awt.Font("Arial Black", 1, 18));
        jRotros.setText("Otros");
        jRotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRotrosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("Seleccione la Cuenta:");

        jCahorro.setFont(new java.awt.Font("Arial", 1, 18));
        jCahorro.setText(" Ahorros ");
        jCahorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCahorroActionPerformed(evt);
            }
        });

        jCcorriente.setFont(new java.awt.Font("Arial", 1, 18));
        jCcorriente.setText("Corriente");
        jCcorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCcorrienteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setText("Seleccione la Cantidad:");

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 20));
        jLabel3.setText("<< Retiro >>");

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24));
        jLabel1.setText("Banco del Pichincha");

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 18));
        jLabel2.setText("Cliente:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Saldo Actual.-");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Saldo Descontado.-");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel11.setText("Actualizaciones:");

        jLsaldoactual.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLsaldoactual.setText("0000000");

        jDescuento.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jDescuento.setText("<sin descuento>");

        jLNom.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLNom.setText("<Administrado>");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Saldo Retirado HOY.-");

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel10.setText("$US");

        jLretirado.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLretirado.setText("000");

        jLabel14.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel14.setText("$US");

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel15.setText("$US");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jR50)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRotros))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jR10)
                                                .addGap(18, 18, 18)
                                                .addComponent(jR100))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jR20)
                                                .addGap(18, 18, 18)
                                                .addComponent(jR200)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCcorriente)
                                            .addComponent(jLabel6)
                                            .addComponent(jCahorro)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jBaceptar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBvolver))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLsaldoactual))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLretirado)
                                            .addComponent(jDescuento))))
                                .addGap(84, 84, 84))
                            .addComponent(jBcancelar)
                            .addComponent(jLabel11))
                        .addGap(94, 94, 94))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLNom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 575, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(260, 260, 260))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLfecha))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLNom))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jR10)
                            .addComponent(jR100)
                            .addComponent(jCahorro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jR20)
                            .addComponent(jR200)
                            .addComponent(jCcorriente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jR50)
                            .addComponent(jRotros)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15)
                            .addComponent(jLsaldoactual))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14)
                            .addComponent(jDescuento))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLretirado))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBaceptar)
                            .addComponent(jBvolver)
                            .addComponent(jBcancelar))
                        .addGap(85, 85, 85)
                        .addComponent(jLabel13)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLfecha))
                        .addGap(47, 47, 47))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvolverActionPerformed
            Opciones o=new Opciones(TC, nom, scorr,sahorr,dpd);
            setVisible(false);
            o.setVisible(true);
    }//GEN-LAST:event_jBvolverActionPerformed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        Inicio a=new Inicio("Banco del Pichincha");
        setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jR10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR10ActionPerformed
        this.resto=10;
        Float mostrar=Float.parseFloat(jLsaldoactual.getText())-10f;
        jDescuento.setText(String.valueOf(mostrar));
    }//GEN-LAST:event_jR10ActionPerformed

    private void jR100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR100ActionPerformed
        this.resto=100;
         Float mostrar=Float.parseFloat(jLsaldoactual.getText())-100f;
        jDescuento.setText(String.valueOf(mostrar));
    }//GEN-LAST:event_jR100ActionPerformed

    private void jR20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR20ActionPerformed
        this.resto=20;
        Float mostrar=Float.parseFloat(jLsaldoactual.getText())-20f;
        jDescuento.setText(String.valueOf(mostrar));
    }//GEN-LAST:event_jR20ActionPerformed

    private void jR200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR200ActionPerformed
        Float mostrar=Float.parseFloat(jLsaldoactual.getText())-200f;
        jDescuento.setText(String.valueOf(mostrar));
        this.resto=200;
    }//GEN-LAST:event_jR200ActionPerformed

    private void jR50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR50ActionPerformed
        this.resto=50;
        Float mostrar=Float.parseFloat(jLsaldoactual.getText())-50f;
        jDescuento.setText(String.valueOf(mostrar));
    }//GEN-LAST:event_jR50ActionPerformed

    private void jRotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRotrosActionPerformed
        Float mostrar=Float.parseFloat(jLsaldoactual.getText());
        jDescuento.setText(String.valueOf(mostrar));
        this.resto=-1;
    }//GEN-LAST:event_jRotrosActionPerformed

    private void jBaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaceptarActionPerformed
        
        if((verificador==1) || (TC==1))
        {
            TCs=1;
        }
        
        if((verificador==2) || (TC==2))
        {
            TCs=2;
        }
        
        if(TCs==0)
        {
               JOptionPane.showMessageDialog(this, "Seleccione una Cuenta","Error",JOptionPane.ERROR_MESSAGE); 
        }
        else{ if(resto==-1)
                {
                    accion='r';
                    if(TCs==0)
                    {
                        TCs=TC;
                    }
                    Otros o=new Otros(TC, nom, scorr,sahorr,accion,TCs,dpd);
                    setVisible(false);
                    o.setVisible(true);
                }
        else { if(resto==0)
                {
                    JOptionPane.showMessageDialog(this, "Seleccione una Cantidad","Error",JOptionPane.ERROR_MESSAGE); 
                } else 
                {   
                accion='r';
                if(TCs==0)
                    {
                        TCs=TC;
                    }
                if((resto>sahorr) && (TCs==1))
                    {
                    JOptionPane.showMessageDialog(this, "No tiene suficiente dinero para Retirar","Error",JOptionPane.ERROR_MESSAGE);
                    }else{
                        if((resto>scorr) && (TCs==2))
                            {
                            JOptionPane.showMessageDialog(this, "No tiene suficiente dinero para Retirar","Error",JOptionPane.ERROR_MESSAGE);
                            }else {
                                    long dpds=dpd+resto;
                                    if(dpds<=800)
                                  { 
                                    this.dpd+=resto;
                                    Factura f=new Factura(TC, nom, scorr,sahorr,resto,accion,TCs,dpd); 
                                    setVisible(false);
                                    f.setVisible(true);
                                  }else{
                                        JOptionPane.showMessageDialog(this, "Por Hoy Solo puede Retirar: "+(800-dpd),"Error",JOptionPane.ERROR_MESSAGE);
                                       }
                          }
                        }
                }
        }
        } 

    }//GEN-LAST:event_jBaceptarActionPerformed

    private void jCahorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCahorroActionPerformed
                this.jLsaldoactual.setText(String.valueOf(sahorr));
                Float mostrar=Float.parseFloat(jLsaldoactual.getText())-resto;
                jDescuento.setText(String.valueOf(mostrar));
                this.verificador=1;
    }//GEN-LAST:event_jCahorroActionPerformed

    private void jCcorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCcorrienteActionPerformed
                this.jLsaldoactual.setText(String.valueOf(scorr));
                Float mostrar=Float.parseFloat(jLsaldoactual.getText())-resto;
                jDescuento.setText(String.valueOf(mostrar));
                this.verificador=2;
    }//GEN-LAST:event_jCcorrienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBaceptar;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBvolver;
    private javax.swing.JCheckBox jCahorro;
    private javax.swing.JCheckBox jCcorriente;
    private javax.swing.JLabel jDescuento;
    private javax.swing.JLabel jLNom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLfecha;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLretirado;
    private javax.swing.JLabel jLsaldoactual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jR10;
    private javax.swing.JRadioButton jR100;
    private javax.swing.JRadioButton jR20;
    private javax.swing.JRadioButton jR200;
    private javax.swing.JRadioButton jR50;
    private javax.swing.JRadioButton jRotros;
    // End of variables declaration//GEN-END:variables
}
