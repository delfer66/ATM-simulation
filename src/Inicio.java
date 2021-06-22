import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

/**
 * @author Fernando Munoz
 */
public class Inicio extends JFrame{
    
    JTextField TFu,TFc;
    JButton ba,bb,bo,bs;
    InfoMovimientos im;
    JTable tm;
    JLabel jlu, jlc, jlut;
    Font d,tit,ent,bot;
    int intentos=2;
    long dpd=0;
    
    public Inicio(final String principal){
    super(principal);
    d=new Font("Algerian",Font.PLAIN,24);
    tit=new Font("Constantia",Font.BOLD,18);
    ent=new Font("Tahoma",Font.PLAIN,15);
    bot=new Font("Arial Black",Font.PLAIN,18);
    
    JPanel tt=new  JPanel(new FlowLayout(FlowLayout.CENTER));
    tt.setLayout(new FlowLayout(FlowLayout.CENTER));
    tt.add(jlut=new JLabel("Banco del Pichincha"));
    jlut.setFont(d); 
    tt.setBackground(new java.awt.Color(255, 204, 0));
    
    
    JPanel pc=new  JPanel(new FlowLayout(FlowLayout.LEFT));
    pc.setLayout(new FlowLayout(FlowLayout.LEFT));
    pc.add(jlu=new JLabel("Usuario.-        "));
    jlu.setFont(tit);
    pc.add(TFu=new JTextField(20));
    TFu.setForeground(Color.GRAY);
 //   TFu.setText("<Ejemplo: cglopez>");//***********************************
    TFu.setText("fernando");//***********Prueba*************
    pc.setBackground(new java.awt.Color(255, 204, 0)); 
    TFu.setFont(ent); 
    TFu.addMouseListener(new MouseAdapter()
       {
            @Override
            public void mousePressed(MouseEvent e) {
            if(TFu.getText().equals("<Ejemplo: cglopez>"))    
            TFu.setText("");
            TFu.setForeground(Color.BLACK);
            }

       });
    
    
    JPanel pt=new JPanel();
    pt.setLayout(new FlowLayout(FlowLayout.LEFT));
    pt.add(jlc=new JLabel("Contrasena.-"));
    jlc.setFont(tit);
    pt.add(TFc=new JPasswordField(20));
    TFc.setForeground(Color.GRAY);
    TFc.setFont(ent);
  //  TFc.setText("aaaa111111");//*************************************
    TFc.setText("aaaa123456");//***********Prueba*************
    pt.setBackground(new java.awt.Color(255, 204, 0));
    TFc.addMouseListener(new MouseAdapter()
       {
            @Override
            public void mousePressed(MouseEvent e) {
            if(TFc.getText().equals("aaaa111111"))    
            TFc.setText("");
            TFc.setForeground(Color.BLACK);
            }

       });
   
   
    JPanel pb=new JPanel(new FlowLayout(FlowLayout.CENTER));
    pb.add(ba= new JButton("Aceptar"));
    ba.setFont(bot);
    ba.setBackground(Color.BLACK);
    ba.setForeground(Color.WHITE);
    //bc.addActionListener(new BotonCrearActionListener());
    ba.addActionListener(new ActionListener()
       {
            @Override
         public void actionPerformed (ActionEvent e)
         {
         
            if(TFu.getText().equals("<Ejemplo: cglopez>") || TFu.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese un Usuario","Error",JOptionPane.ERROR_MESSAGE);
          //  return false;
            } else if(TFc.getText().equals("aaaa111111") || TFc.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese alguna Contrasena","Error",JOptionPane.ERROR_MESSAGE);
             //   return false;
            }else if(verificarIntentos(intentos))
            {   if(validarDatos())
                    {
                    if(buscarDatos()){ 
                            setVisible(false);
                    } else
                    {
                    intentos=descontarIntentos(intentos);
                    JOptionPane.showMessageDialog(null, "Tiene: "+(intentos+1)+" intentos mas",principal,JOptionPane.OK_OPTION);
                    TFc.setText("");
                    }
                    }    
                else 
                {
                    intentos=descontarIntentos(intentos);
                    JOptionPane.showMessageDialog(null, "Tiene: "+(intentos+1)+" intentos mas",principal,JOptionPane.OK_OPTION);
                    borrarDatos();
                }
            } else {
               JOptionPane.showMessageDialog(null, "Termino sus Opciones Acuda a uno de nuestros Directivos",principal,JOptionPane.NO_OPTION);
               System.exit(0);
            }      
         }
       });    

    
    pb.add(bs=new JButton("   Salir    "));
    pb.setBackground(new java.awt.Color(255, 204, 0));
    bs.setFont(bot);
    bs.setBackground(Color.BLACK);
    bs.setForeground(Color.WHITE);
    bs.addActionListener(new ActionListener()
            
       {
            @Override
         public void actionPerformed (ActionEvent e)
         {
            JOptionPane.showMessageDialog(null, "Gracias por Preferirnos",principal,JOptionPane.NO_OPTION);
            System.exit(0);
         }
       });
    
    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    add(tt);
    add(pc);
    add(pt);
    add(pb);
    pack();
    
    setResizable(false);
    setDefaultCloseOperation(Inicio.EXIT_ON_CLOSE);
    setVisible(true);

    
    
    }
   
   
    public boolean verificarIntentos(int intento) 
    {
        if (intento==0)
            return false;
        else
            return true;
    }
    
    
    
    public boolean validarDatos() 
    {   
        int tamanou=TFu.getText().length();
        int tamano=TFc.getText().length();
                
        for(int i=0;i<tamanou;i++) 
                {
                if(TFu.getText().charAt(i)>=48 && TFu.getText().charAt(i)<=58) {
                    JOptionPane.showMessageDialog(this, "Su Nombre de Usuario no puede contener numeros","Error",JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                } 
     
        if(tamano>10 || tamano<10)
        {
            JOptionPane.showMessageDialog(null, "Su Contrasena debe tener 10 Digitos Exactamente","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }        
        else {
            for(int i=0;i<4;i++)
            {
                if(TFc.getText().charAt(i)>=48 && TFc.getText().charAt(i)<=58)
                {
                    JOptionPane.showMessageDialog(this, "Las Primeras 4 letras de su Contrasena no deben ser numeros","Error",JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                //codigo ASCII 48-58
            } 
            }
       return true;      
    }
    
    
    
    
    //////////////////////
    
    
    
    
    
    public boolean buscarDatos() 
    {
        String nom="";
        Float sa=0f,sc=0f;   
        
        cuentaAhorros ca=new cuentaAhorros();
        String[] CA=ca.buscarCuentaA(TFu.getText(),TFc.getText());
        
        cuentaCorriente cc=new cuentaCorriente();
        String[] CC=cc.buscarCuentaC(TFu.getText(),TFc.getText());  
        
        
        int Ncuenta=0;
        if (!CA[2].equals(""))
        {
            Ncuenta=Ncuenta+1;
            System.out.println("1 "+Ncuenta);
        }
        if (!CC[2].equals(""))
        {
            Ncuenta=Ncuenta+2;
            System.out.println("2 "+Ncuenta);
        }
        if (!CA[2].equals(""))
        {
            nom=CA[2];
            System.out.println("non1 "+nom);
        }
        if (!CC[2].equals(""))
        {
            nom=CC[2];
            System.out.println("non1 "+nom);
        }
        System.out.println(nom);
        System.out.println(Ncuenta);


        if((Ncuenta==1) || (Ncuenta==2) || (Ncuenta==3))
        {
            Float SAhorr=AFloat(CA[3]);
            Float SCorri=AFloat(CC[3]);
            Opciones o=new Opciones(Ncuenta ,nom ,SCorri,SAhorr,dpd);
            o.setVisible(true);
            return true;
        } else{
           
            JOptionPane.showMessageDialog(this, "No se Encontro el Usuario","Error",JOptionPane.ERROR_MESSAGE); 
            return false;
        }
    }
    
    public int descontarIntentos(int intento) 
    {
            intento=intento-1;
            System.out.println(intento);
            return intento;
    }
    
    
    private Float AFloat(String saldostring)
    {
        Float flo=0f;
        try
        {
            flo=Float.parseFloat(saldostring);
        }
        catch(Exception err)
        {
            flo=0f;
        }
    return flo;
    }
    
    
    public void borrarDatos() {
    TFu.setText("");
    TFc.setText("");
    }
};
