
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Otros.java
 *
 * Created on ene 25, 2012, 7:54:07 p.m.
 */
/**
 *
 * @author Administrator
 */
public class Otros extends javax.swing.JFrame {
    
    int TC, TCs,verificador;
    String nom;
    Float scorr,sahorr;
    char accion;
    long resto;
    long dpd;
    
    public Otros(int t,String c,Float scorr, Float sahorr,char accion, int Tipocuentausar, long dpd) {
        super("Simulador Cajero Automatico");
        
        this.sahorr=sahorr;
        this.scorr=scorr;
        this.TC=t;
        this.TCs=Tipocuentausar;
        this.nom=c;
        this.resto=0;
        this.verificador=0;
        this.accion=accion;
        this.dpd=dpd;
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
            java.util.logging.Logger.getLogger(Otros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Otros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Otros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Otros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        setResizable(false);
        
        java.util.Date utilDate = new java.util.Date(); //fecha actual
        long lnMilisegundos = utilDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);
        java.sql.Time sqlTime = new java.sql.Time(lnMilisegundos);  //retorna la hora
        this.jLfecha.setText(sqlDate+"");  
        
        
        this.jLNom.setText(nom);
        this.jLretirado.setText(String.valueOf(dpd));
        
        if (TCs==2)
        {
        this.jLsaldo.setText(String.valueOf(scorr));
        this.jLACCI.setText("Corriente");
        }
        
         if (TCs==1)
        {
        this.jLsaldo.setText(String.valueOf(sahorr));
        this.jLACCI.setText("de Ahorros");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTdinero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBcancelar = new javax.swing.JButton();
        salida = new javax.swing.JLabel();
        jLsaldo = new javax.swing.JLabel();
        jLACCI = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLfecha = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLNom = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLretirado = new javax.swing.JLabel();
        jBaceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24));
        jLabel1.setText("Banco del Pichincha");

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 18));
        jLabel2.setText("Ingrese la cantidad.-");

        jTdinero.setFont(new java.awt.Font("Tahoma", 0, 14));
        jTdinero.setText("<$US>");
        jTdinero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTdineroMouseClicked(evt);
            }
        });
        jTdinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTdineroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTdineroKeyReleased(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Atencion: No puede retirar mas de $US 800 por dia");

        jLabel4.setFont(new java.awt.Font("Constantia", 0, 18));
        jLabel4.setText("<< Otros Valores >>");

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 18));
        jLabel5.setText("Tipo de Cuenta.-");

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 18));
        jLabel6.setText("Saldo Descontado.-");

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 18));
        jLabel8.setText("Saldo Actual.-");

        jBcancelar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jBcancelar.setText("Cancelar");
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });

        salida.setFont(new java.awt.Font("Tahoma", 0, 14));
        salida.setText("<$US>");

        jLsaldo.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLsaldo.setText("<$US>");

        jLACCI.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLACCI.setText("tipo");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel11.setText("Fecha:");

        jLfecha.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLfecha.setText("0000/00/00");

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 18));
        jLabel12.setText("Cliente.-");

        jLNom.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLNom.setText("<Administrador>");

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 18));
        jLabel7.setText("Dinero Retirado.-");

        jLretirado.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLretirado.setText("<$US>");

        jBaceptar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jBaceptar.setText(" Aceptar ");
        jBaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBaceptar)
                                            .addComponent(jLfecha))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLretirado)
                                    .addComponent(salida)
                                    .addComponent(jLsaldo)
                                    .addComponent(jLACCI)
                                    .addComponent(jLNom)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBcancelar)
                                        .addComponent(jTdinero, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel4)
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel3)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLNom))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLACCI)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jTdinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLsaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(salida))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLretirado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcancelar)
                    .addComponent(jBaceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLfecha)
                    .addComponent(jLabel11))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
        
    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        Retiro r=new Retiro(TC, nom, scorr,sahorr,dpd);
        setVisible(false);
        r.setVisible(true);
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jTdineroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdineroKeyPressed

    }//GEN-LAST:event_jTdineroKeyPressed

    private void jTdineroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdineroKeyReleased
        {
        try{
        Long a=Long.parseLong(jTdinero.getText());
        if((a<=800) && (a>=5))
        {
            if(TCs==1)
        {
        salida.setText(String.valueOf(sahorr-a));
        } 
            if(TCs==2)
        {
        salida.setText(String.valueOf(scorr-a));
        }
        } else
            {
              salida.setText("Error");  
            }
        }
        catch(Exception err)
        {
            salida.setText("<desconocido>");
        }
        }
    }//GEN-LAST:event_jTdineroKeyReleased

    private void jTdineroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTdineroMouseClicked
                if(jTdinero.getText().equalsIgnoreCase("<$US>"))
                {
                jTdinero.setText("");           
                }
                    try{
                    Long a=Long.parseLong(jTdinero.getText());
                    if((a<=800) && (a>=5))
                    {
                    if(TCs==1)
                    {
                    salida.setText(String.valueOf(sahorr-a));
                    } 
                    if(TCs==2)
                    {
                    salida.setText(String.valueOf(scorr-a));
                    }
                    } else
                        {
                          salida.setText("Error");  
                        }
                    }
                    catch(Exception err)
                    {
                        salida.setText("<desconocido>");
                    }
    }//GEN-LAST:event_jTdineroMouseClicked

    private void jBaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaceptarActionPerformed
        if(jTdinero.getText().equalsIgnoreCase("<$US>") || jTdinero.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Ingrese su Dinero","Error",JOptionPane.ERROR_MESSAGE);
        }else {              
        try{
        Float.parseFloat(jTdinero.getText());

        try{
            this.resto=Long.parseLong(jTdinero.getText());
            if(resto<5)
            {
               JOptionPane.showMessageDialog(null, "Solo puede Depositar Cantidades Mayores a US$ 5","Error",JOptionPane.ERROR_MESSAGE);
            }
            else 
                {
                accion='r';
                if(TCs==0)
                    {
                        TCs=TC;
                    }
                    if(dpd<=800)
                                  {
                    if((resto>sahorr) && (TCs==1))
                    {
                    JOptionPane.showMessageDialog(this, "No tiene suficiente dinero para Retirar","Error",JOptionPane.ERROR_MESSAGE);
                    }else{
                        if((resto>scorr) && (TCs==2))
                            {
                            JOptionPane.showMessageDialog(this, "No tiene suficiente dinero para Retirar","Error",JOptionPane.ERROR_MESSAGE);
                            }else{
                                    long dpds=0;
                                    dpds=dpd+resto;
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
                                  }else{
                                        JOptionPane.showMessageDialog(this, "Ya a Retirado el Limite de $US 800 Diarios","Error",JOptionPane.ERROR_MESSAGE);
                                       }
                }
        }
        catch(Exception err)
        {
            JOptionPane.showMessageDialog(null, "No se Puede Ingresar Monedas","Error",JOptionPane.ERROR_MESSAGE);
            jTdinero.setText("");
        }
        
        }catch(Exception err)
            {
                JOptionPane.showMessageDialog(null, "No Ingrese Billetes Extranjeros","Error",JOptionPane.ERROR_MESSAGE);
                jTdinero.setText("");
            }  
        }
    }//GEN-LAST:event_jBaceptarActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBaceptar;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JLabel jLACCI;
    private javax.swing.JLabel jLNom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLfecha;
    private javax.swing.JLabel jLretirado;
    private javax.swing.JLabel jLsaldo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTdinero;
    private javax.swing.JLabel salida;
    // End of variables declaration//GEN-END:variables
}
