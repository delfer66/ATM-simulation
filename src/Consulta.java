/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Consulta.java
 *
 * Created on ene 24, 2012, 9:38:03 p.m.
 */
/**
 *
 * @author Administrator
 */
public class Consulta extends javax.swing.JFrame {
    int TC;
    String nom;
    Float scorr,sahorr;
    long dpd;

    public Consulta(int t,String c,Float scorr, Float sahorr, long dpd) {
        super("Simulador Cajero Automatico");
        this.sahorr=sahorr;
        this.scorr=scorr;
        this.TC=t;
        this.nom=c;
        this.dpd=dpd;

        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        
        if(TC==1)
        {
        this.jLCA.setText("Propietario");
        this.jLCA.setText("Ninguna");
        this.jLCAs.setText("$US "+String.valueOf(sahorr));
        }
        if(TC==2)
        {
        this.jLCC.setText("Propietario");
        this.jLCCs.setText("$US "+String.valueOf(scorr));
        this.jLCA.setText("Ninguna");
        }
        if(TC==3)
        {
        this.jLCA.setText("Propietario");
        this.jLCC.setText("Propietario");
        this.jLCAs.setText("$US "+String.valueOf(sahorr));
        this.jLCCs.setText("$US "+String.valueOf(scorr));
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        aceptas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLNom = new javax.swing.JLabel();
        jLCA = new javax.swing.JLabel();
        jLCAs = new javax.swing.JLabel();
        jLCC = new javax.swing.JLabel();
        jLCCs = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLfecha = new javax.swing.JLabel();
        jLhora = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLretirado = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setText("Banco del Pichincha");

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("    Salir    ");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        aceptas.setBackground(new java.awt.Color(0, 0, 0));
        aceptas.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        aceptas.setForeground(new java.awt.Color(255, 255, 255));
        aceptas.setText("Aceptar");
        aceptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel2.setText("<< Resumen >>");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Cliente.-");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Cuenta de Ahorro.-");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Saldo.-");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Cuenta Corriente.-");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("Saldo.-");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Fecha.-");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Dinero Retirado");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Hora.-");

        jLNom.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLNom.setText("<Administrador>");

        jLCA.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLCA.setText("<Administrador>");

        jLCAs.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLCAs.setText("$US 0");

        jLCC.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLCC.setText("<Administrador>");

        jLCCs.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLCCs.setText("$US 0");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel16.setText("$ US");

        jLfecha.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLfecha.setText("<Administrador>");

        jLhora.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLhora.setText("<Administrador>");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Password.-");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel17.setText("**********");

        jLretirado.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLretirado.setText("000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(aceptas)
                .addGap(18, 18, 18)
                .addComponent(salir)
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel2)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(78, 78, 78)
                        .addComponent(jLNom))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5))
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLretirado))
                            .addComponent(jLhora)
                            .addComponent(jLCC)
                            .addComponent(jLCAs)
                            .addComponent(jLCA)
                            .addComponent(jLCCs)
                            .addComponent(jLfecha))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLCA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCAs)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLCC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLCCs))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16)
                    .addComponent(jLretirado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLfecha)
                    .addComponent(jLabel8))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLhora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(aceptas))
                .addContainerGap())
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

    private void aceptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptasActionPerformed
        Opciones o=new Opciones(TC, nom, scorr,sahorr,dpd);
        setVisible(false);
        o.setVisible(true);
    }//GEN-LAST:event_aceptasActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Inicio a=new Inicio("Simulador Cajero Automatico");
        setVisible(false);        
        a.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptas;
    private javax.swing.JLabel jLCA;
    private javax.swing.JLabel jLCAs;
    private javax.swing.JLabel jLCC;
    private javax.swing.JLabel jLCCs;
    private javax.swing.JLabel jLNom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLfecha;
    private javax.swing.JLabel jLhora;
    private javax.swing.JLabel jLretirado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
