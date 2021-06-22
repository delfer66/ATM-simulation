/**
 *
 * @author Administrator
 */
public class Opciones extends javax.swing.JFrame {

    int TC;
    String nom;
    Float scorr,sahorr;
    long dpd;
    
    
    public Opciones(int t,String c,Float scor, Float sahor,long dpds) {
        super("Simulador Cajero Automatico");
        this.sahorr=sahor;
        this.scorr=scor;
        this.TC=t;
        this.nom=c;
        this.dpd=dpds;
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        initComponents();
        setResizable(false);
        this.jLNom.setText(nom);
                         
        if(dpd==800)
        {
            jRretiro.setEnabled(false);
        }
  
        java.util.Date utilDate = new java.util.Date(); //fecha actual
        long lnMilisegundos = utilDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);
        java.sql.Time sqlTime = new java.sql.Time(lnMilisegundos);  //retorna la hora
        this.jLfecha.setText(sqlDate+"");       
    
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
        jLNom = new javax.swing.JLabel();
        jRretiro = new javax.swing.JRadioButton();
        jRdep = new javax.swing.JRadioButton();
        jRcons = new javax.swing.JRadioButton();
        jBcancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLfecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setText("Banco del Pichincha");

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel2.setText("Bienvenido.-");

        jLNom.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLNom.setText("Administrador");

        jRretiro.setBackground(new java.awt.Color(255, 255, 255));
        jRretiro.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jRretiro.setText("Retiro");
        jRretiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRretiroActionPerformed(evt);
            }
        });

        jRdep.setBackground(new java.awt.Color(255, 255, 255));
        jRdep.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jRdep.setText("Deposito");
        jRdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdepActionPerformed(evt);
            }
        });

        jRcons.setBackground(new java.awt.Color(255, 255, 255));
        jRcons.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jRcons.setText("Consulta");
        jRcons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRconsActionPerformed(evt);
            }
        });

        jBcancel.setBackground(new java.awt.Color(0, 0, 0));
        jBcancel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jBcancel.setForeground(new java.awt.Color(255, 255, 255));
        jBcancel.setText("Cancelar");
        jBcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel4.setText("Fecha.-");

        jLfecha.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLfecha.setText("2000/00/00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLNom)
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLfecha)
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRretiro)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jRdep)
                            .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jRcons)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                            .addComponent(jBcancel)
                            .addGap(18, 18, 18)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNom)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jRretiro)
                        .addGap(18, 18, 18)
                        .addComponent(jRdep)
                        .addGap(18, 18, 18)
                        .addComponent(jRcons)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLfecha))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBcancel)
                        .addGap(52, 52, 52))))
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

    private void jRretiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRretiroActionPerformed
        Retiro r=new Retiro(TC, nom, scorr,sahorr,dpd);
        r.setVisible(true);
        setVisible(false);  
    }//GEN-LAST:event_jRretiroActionPerformed

    private void jRdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdepActionPerformed
        Deposito d=new Deposito(TC, nom, scorr,sahorr,dpd);
        d.setVisible(true);
        setVisible(false);   
    }//GEN-LAST:event_jRdepActionPerformed

    private void jRconsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRconsActionPerformed
        Consulta a=new Consulta(TC, nom, scorr,sahorr,dpd);
        a.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jRconsActionPerformed

    private void jBcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelActionPerformed
        Inicio a=new Inicio("Simulador Cajero Automatico");
        setVisible(false);
    }//GEN-LAST:event_jBcancelActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcancel;
    private javax.swing.JLabel jLNom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLfecha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRcons;
    private javax.swing.JRadioButton jRdep;
    private javax.swing.JRadioButton jRretiro;
    // End of variables declaration//GEN-END:variables
}